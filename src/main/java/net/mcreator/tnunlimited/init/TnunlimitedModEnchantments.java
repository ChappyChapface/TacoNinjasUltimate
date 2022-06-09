
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.tnunlimited.enchantment.TriggerHappyEnchantment;
import net.mcreator.tnunlimited.enchantment.SharpShooterEnchantment;
import net.mcreator.tnunlimited.enchantment.ResistingEnchantment;
import net.mcreator.tnunlimited.enchantment.LungingEnchantment;
import net.mcreator.tnunlimited.enchantment.LeechingEnchantment;
import net.mcreator.tnunlimited.enchantment.KickbackEnchantment;
import net.mcreator.tnunlimited.enchantment.HarvestingEnchantment;
import net.mcreator.tnunlimited.enchantment.FullMagicJacketEnchantment;
import net.mcreator.tnunlimited.enchantment.CaliberEnchantment;
import net.mcreator.tnunlimited.enchantment.BuffingEnchantment;
import net.mcreator.tnunlimited.enchantment.AerialMovementEnchantment;
import net.mcreator.tnunlimited.TnunlimitedMod;

public class TnunlimitedModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TnunlimitedMod.MODID);
	public static final RegistryObject<Enchantment> HARVESTING = REGISTRY.register("harvesting", () -> new HarvestingEnchantment());
	public static final RegistryObject<Enchantment> LUNGING = REGISTRY.register("lunging", () -> new LungingEnchantment());
	public static final RegistryObject<Enchantment> AERIAL_MOVEMENT = REGISTRY.register("aerial_movement", () -> new AerialMovementEnchantment());
	public static final RegistryObject<Enchantment> CALIBER = REGISTRY.register("caliber", () -> new CaliberEnchantment());
	public static final RegistryObject<Enchantment> SHARP_SHOOTER = REGISTRY.register("sharp_shooter", () -> new SharpShooterEnchantment());
	public static final RegistryObject<Enchantment> FULL_MAGIC_JACKET = REGISTRY.register("full_magic_jacket",
			() -> new FullMagicJacketEnchantment());
	public static final RegistryObject<Enchantment> TRIGGER_HAPPY = REGISTRY.register("trigger_happy", () -> new TriggerHappyEnchantment());
	public static final RegistryObject<Enchantment> LEECHING = REGISTRY.register("leeching", () -> new LeechingEnchantment());
	public static final RegistryObject<Enchantment> KICKBACK = REGISTRY.register("kickback", () -> new KickbackEnchantment());
	public static final RegistryObject<Enchantment> BUFFING = REGISTRY.register("buffing", () -> new BuffingEnchantment());
	public static final RegistryObject<Enchantment> RESISTING = REGISTRY.register("resisting", () -> new ResistingEnchantment());
}
