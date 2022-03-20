package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class GamblersSwordEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.9) {
			entity.hurt(DamageSource.GENERIC, 4);
		}
	}
}
