
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModEnchantments {
	private static final List<Enchantment> REGISTRY = new ArrayList<>();
	public static final Enchantment HARVESTING = register("tnunlimited:harvesting", new HarvestingEnchantment());
	public static final Enchantment LUNGING = register("tnunlimited:lunging", new LungingEnchantment());
	public static final Enchantment AERIAL_MOVEMENT = register("tnunlimited:aerial_movement", new AerialMovementEnchantment());
	public static final Enchantment CALIBER = register("tnunlimited:caliber", new CaliberEnchantment());
	public static final Enchantment SHARP_SHOOTER = register("tnunlimited:sharp_shooter", new SharpShooterEnchantment());
	public static final Enchantment FULL_MAGIC_JACKET = register("tnunlimited:full_magic_jacket", new FullMagicJacketEnchantment());
	public static final Enchantment TRIGGER_HAPPY = register("tnunlimited:trigger_happy", new TriggerHappyEnchantment());
	public static final Enchantment LEECHING = register("tnunlimited:leeching", new LeechingEnchantment());
	public static final Enchantment KICKBACK = register("tnunlimited:kickback", new KickbackEnchantment());
	public static final Enchantment BUFFING = register("tnunlimited:buffing", new BuffingEnchantment());
	public static final Enchantment RESISTING = register("tnunlimited:resisting", new ResistingEnchantment());

	private static Enchantment register(String registryname, Enchantment enchantment) {
		REGISTRY.add(enchantment.setRegistryName(registryname));
		return enchantment;
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Enchantment[0]));
	}
}
