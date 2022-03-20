package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PetCactusEffectsProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity, event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, Entity sourceentity, double amount) {
		execute(null, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player) {
			if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.PET_CACTUS
					|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.PET_CACTUS
					|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.PET_CACTUS) {
				sourceentity.hurt(DamageSource.CACTUS, Math.round(amount / 2));
			}
			if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.GOLDEN_CACTUS_PET
					|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.GOLDEN_CACTUS_PET
					|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.GOLDEN_CACTUS_PET) {
				sourceentity.hurt(DamageSource.CACTUS, Math.round(amount));
			}
			if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.ENCHANTED_GOLDEN_CACTUS_PET
					|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01)
									.getItem() == TnunlimitedModItems.ENCHANTED_GOLDEN_CACTUS_PET
					|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02)
									.getItem() == TnunlimitedModItems.ENCHANTED_GOLDEN_CACTUS_PET) {
				sourceentity.hurt(DamageSource.CACTUS, Math.round(amount * 2));
			}
		}
	}
}
