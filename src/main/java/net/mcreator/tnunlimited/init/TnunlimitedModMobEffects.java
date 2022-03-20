
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.tnunlimited.potion.GildedBugBuffMobEffect;
import net.mcreator.tnunlimited.potion.DrowsyMobEffect;
import net.mcreator.tnunlimited.potion.DecardialMobEffect;
import net.mcreator.tnunlimited.potion.BleedingMobEffect;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect DROWSY = register(new DrowsyMobEffect());
	public static final MobEffect BLEEDING = register(new BleedingMobEffect());
	public static final MobEffect GILDED_BUG_BUFF = register(new GildedBugBuffMobEffect());
	public static final MobEffect DECARDIAL = register(new DecardialMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
