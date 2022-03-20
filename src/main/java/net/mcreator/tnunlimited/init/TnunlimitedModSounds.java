
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("tnunlimited", "sunrise"), new SoundEvent(new ResourceLocation("tnunlimited", "sunrise")));
		REGISTRY.put(new ResourceLocation("tnunlimited", "revolver_reload"), new SoundEvent(new ResourceLocation("tnunlimited", "revolver_reload")));
		REGISTRY.put(new ResourceLocation("tnunlimited", "revolver_shoot"), new SoundEvent(new ResourceLocation("tnunlimited", "revolver_shoot")));
		REGISTRY.put(new ResourceLocation("tnunlimited", "revolver_last_shot"),
				new SoundEvent(new ResourceLocation("tnunlimited", "revolver_last_shot")));
		REGISTRY.put(new ResourceLocation("tnunlimited", "sunrise2"), new SoundEvent(new ResourceLocation("tnunlimited", "sunrise2")));
		REGISTRY.put(new ResourceLocation("tnunlimited", "blunderbuss_reload"),
				new SoundEvent(new ResourceLocation("tnunlimited", "blunderbuss_reload")));
		REGISTRY.put(new ResourceLocation("tnunlimited", "blunderbuss_shoot"),
				new SoundEvent(new ResourceLocation("tnunlimited", "blunderbuss_shoot")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
