package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HeartcoreEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity.level, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (world.getDifficulty() == Difficulty.HARD && (((sourceentity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.HEARTCORE
				|| ((sourceentity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.HEARTCORE
				|| ((sourceentity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.HEARTCORE)) {
			if ((sourceentity instanceof LivingEntity _livEnt
					? _livEnt.getHealth()
					: -1) <= (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.2
					&& sourceentity.getPersistentData().getDouble("heartcoreCooldown") <= 0) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 120, 1));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 10));
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(TnunlimitedModItems.HEARTCORE, 36000);
				sourceentity.getPersistentData().putDouble("heartcoreCooldown", 36000);
			}
		}
	}
}
