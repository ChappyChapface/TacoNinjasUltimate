
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.tnunlimited.TnunlimitedMod;

public class TnunlimitedModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TnunlimitedMod.MODID);
	public static final RegistryObject<ParticleType<?>> BULLET_SHELL = REGISTRY.register("bullet_shell", () -> new SimpleParticleType(false));
}
