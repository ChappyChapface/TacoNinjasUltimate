
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.tnunlimited.network.OpenStatSheetKeyMessage;
import net.mcreator.tnunlimited.network.OpenAccessoryMenuMessage;
import net.mcreator.tnunlimited.TnunlimitedMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TnunlimitedModKeyMappings {
	public static final KeyMapping OPEN_ACCESSORY_MENU = new KeyMapping("key.tnunlimited.open_accessory_menu", GLFW.GLFW_KEY_R, "key.categories.ui");
	public static final KeyMapping OPEN_STAT_SHEET_KEY = new KeyMapping("key.tnunlimited.open_stat_sheet_key", GLFW.GLFW_KEY_RIGHT_SHIFT,
			"key.categories.ui");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(OPEN_ACCESSORY_MENU);
		ClientRegistry.registerKeyBinding(OPEN_STAT_SHEET_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == OPEN_ACCESSORY_MENU.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TnunlimitedMod.PACKET_HANDLER.sendToServer(new OpenAccessoryMenuMessage(0, 0));
						OpenAccessoryMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == OPEN_STAT_SHEET_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TnunlimitedMod.PACKET_HANDLER.sendToServer(new OpenStatSheetKeyMessage(0, 0));
						OpenStatSheetKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
