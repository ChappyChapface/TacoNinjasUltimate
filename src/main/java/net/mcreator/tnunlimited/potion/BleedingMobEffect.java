
package net.mcreator.tnunlimited.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tnunlimited.procedures.BleedingEffectProcedure;
import net.mcreator.tnunlimited.procedures.BleedingActivationProcedure;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
		setRegistryName("bleeding");
	}

	@Override
	public String getDescriptionId() {
		return "effect.tnunlimited.bleeding";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BleedingEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return BleedingActivationProcedure.execute(amplifier, duration);
	}
}
