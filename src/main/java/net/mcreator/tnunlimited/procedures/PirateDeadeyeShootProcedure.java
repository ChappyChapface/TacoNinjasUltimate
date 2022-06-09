package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.tnunlimited.entity.PirateDeadeyeEntity;
import net.mcreator.tnunlimited.entity.BulletProjectileEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PirateDeadeyeShootProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingSetAttackTargetEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(),
				event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		boolean hit = false;
		double num = 0;
		if (sourceentity instanceof PirateDeadeyeEntity) {
			sourceentity.getPersistentData().putDouble("timer", (sourceentity.getPersistentData().getDouble("timer") + 1));
			if (sourceentity.getPersistentData().getDouble("timer") == 60) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_reload")), SoundSource.PLAYERS, 1,
								1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_reload")),
								SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (sourceentity.getPersistentData().getDouble("timer") >= 120) {
				if (world.getDifficulty() == Difficulty.EASY) {
					if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
						BulletProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, (float) 1.25, 0);
					}
				} else if (world.getDifficulty() == Difficulty.NORMAL) {
					if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
						BulletProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, (float) 2.5, 0);
					}
				} else if (world.getDifficulty() == Difficulty.HARD) {
					if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
						BulletProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, (float) 3.75, 0);
					}
				}
				if (sourceentity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, (sourceentity.getX()), (sourceentity.getY() + 1), (sourceentity.getZ()), 5, 0.2, 0.2,
							0.2, 0.02);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_last_shot")), SoundSource.PLAYERS, 1,
								1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_last_shot")),
								SoundSource.PLAYERS, 1, 1, false);
					}
				}
				sourceentity.getPersistentData().putDouble("timer", 0);
			}
		}
	}
}
