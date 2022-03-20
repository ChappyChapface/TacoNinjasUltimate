package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BulletProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity imediatesourceentity) {
		if (imediatesourceentity == null)
			return;
		imediatesourceentity.setDeltaMovement((imediatesourceentity.getDeltaMovement().x()), (imediatesourceentity.getDeltaMovement().y() + 1.2 / 20),
				(imediatesourceentity.getDeltaMovement().z()));
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() instanceof LiquidBlock) {
			if (!imediatesourceentity.level.isClientSide())
				imediatesourceentity.discard();
		}
	}
}
