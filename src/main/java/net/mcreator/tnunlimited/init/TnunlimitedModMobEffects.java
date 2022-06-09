
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.tnunlimited.potion.GildedBugBuffMobEffect;
import net.mcreator.tnunlimited.potion.DrowsyMobEffect;
import net.mcreator.tnunlimited.potion.DecardialMobEffect;
import net.mcreator.tnunlimited.potion.BleedingMobEffect;
import net.mcreator.tnunlimited.TnunlimitedMod;

public class TnunlimitedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TnunlimitedMod.MODID);
	public static final RegistryObject<MobEffect> DROWSY = REGISTRY.register("drowsy", () -> new DrowsyMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> GILDED_BUG_BUFF = REGISTRY.register("gilded_bug_buff", () -> new GildedBugBuffMobEffect());
	public static final RegistryObject<MobEffect> DECARDIAL = REGISTRY.register("decardial", () -> new DecardialMobEffect());
}
