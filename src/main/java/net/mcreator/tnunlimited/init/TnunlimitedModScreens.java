
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.tnunlimited.client.gui.StatSheetScreen;
import net.mcreator.tnunlimited.client.gui.AccessoriesScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TnunlimitedModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TnunlimitedModMenus.ACCESSORIES, AccessoriesScreen::new);
			MenuScreens.register(TnunlimitedModMenus.STAT_SHEET, StatSheetScreen::new);
		});
	}
}
