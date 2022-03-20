
package net.mcreator.tnunlimited.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tnunlimited.procedures.DrowsyEffectProcedure;

public class DrowsyMobEffect extends MobEffect {
	public DrowsyMobEffect() {
		super(MobEffectCategory.HARMFUL, -3276806);
		setRegistryName("drowsy");
	}

	@Override
	public String getDescriptionId() {
		return "effect.tnunlimited.drowsy";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DrowsyEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
