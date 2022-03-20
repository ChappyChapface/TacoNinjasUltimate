package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class DarkWarhammerRecoilProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.hurt(DamageSource.GENERIC, 4);
	}
}
