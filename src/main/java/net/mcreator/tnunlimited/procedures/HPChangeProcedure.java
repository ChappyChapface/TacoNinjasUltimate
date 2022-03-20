package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;
import net.mcreator.tnunlimited.init.TnunlimitedModMobEffects;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HPChangeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hpMult = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"attribute @p minecraft:generic.max_health modifier remove 2-4-6-1-7");
		if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.CONTRACT
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.CONTRACT
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.CONTRACT) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).hpMult - 0.2;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hpMult = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.CARDIAL_CHARM
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.CARDIAL_CHARM
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.CARDIAL_CHARM) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).hpMult + 0.2;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hpMult = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.DECARDIAL_NECKLACE
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.DECARDIAL_NECKLACE
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.DECARDIAL_NECKLACE) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).hpMult - 0.8;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hpMult = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= (entity instanceof LivingEntity _livEnt
					? _livEnt.getMaxHealth()
					: -1)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			}
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TnunlimitedModMobEffects.DECARDIAL) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 24000, 8));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(TnunlimitedModMobEffects.DECARDIAL, 24000, 0));
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TnunlimitedModMobEffects.DECARDIAL) : false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "effect clear @p absorption");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "effect clear @p tnunlimited:decardial");
		}
		{
			double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).hpMult;
			entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HPDisplay = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putDouble("heartcoreCooldown", (entity.getPersistentData().getDouble("heartcoreCooldown") - 1));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("attribute @p minecraft:generic.max_health modifier add 2-4-6-1-7 HPMult "
							+ ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new TnunlimitedModVariables.PlayerVariables())).hpMult + " multiply")));
	}
}
