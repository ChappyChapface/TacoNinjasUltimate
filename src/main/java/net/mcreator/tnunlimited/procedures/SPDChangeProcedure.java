package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SPDChangeProcedure {
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
				capability.movementSpeedIncrease = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.FLEUR_BAND
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.FLEUR_BAND
				|| ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.FLEUR_BAND) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + 0.05;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.AARDIUM_HELMET) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + 0.1;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.AARDIUM_CHESTPLATE) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + 0.1;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.AARDIUM_LEGGINGS) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + 0.1;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.AARDIUM_BOOTS) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + 0.1;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.NUBRIUM_ARMOUR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.NUBRIUM_ARMOUR_CHESTPLATE
				&& ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.NUBRIUM_ARMOUR_LEGGINGS
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == TnunlimitedModItems.FANCY_PANTS_LEGGINGS)
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.NUBRIUM_ARMOUR_BOOTS) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 220, 0, (false), (false)));
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + 0.2;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.DONE_ARMOUR_HELMET
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.DONE_ARMOUR_CHESTPLATE
				&& ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.DONE_ARMOUR_LEGGINGS
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == TnunlimitedModItems.FANCY_PANTS_LEGGINGS)
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.DONE_ARMOUR_BOOTS) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 0, (false), (false)));
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease - 0.2;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.movementSpeedIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease;
			entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.movementSPD = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"attribute @p minecraft:generic.movement_speed modifier remove 2-1-1-1-7");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("attribute @p minecraft:generic.movement_speed modifier add 2-1-1-1-7 MovementSpeed "
							+ ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease + " multiply")));
	}
}
