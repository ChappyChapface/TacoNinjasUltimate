package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
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
public class FamiliarDamageModifierProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(),
				event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			{
				double _setval = 0;
				(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
						.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.familiarStrengthIncrease = _setval;
							capability.syncPlayerVariables((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
						});
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _entGetArmor
					? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
					: ItemStack.EMPTY).getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_HELMET.get()) {
				{
					double _setval = ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease + 0.1;
					(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.familiarStrengthIncrease = _setval;
								capability.syncPlayerVariables((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
							});
				}
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _entGetArmor
					? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
					: ItemStack.EMPTY).getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_CHESTPLATE.get()) {
				{
					double _setval = ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease + 0.1;
					(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.familiarStrengthIncrease = _setval;
								capability.syncPlayerVariables((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
							});
				}
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _entGetArmor
					? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
					: ItemStack.EMPTY).getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_LEGGINGS.get()) {
				{
					double _setval = ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease + 0.1;
					(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.familiarStrengthIncrease = _setval;
								capability.syncPlayerVariables((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
							});
				}
			}
			if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _entGetArmor
					? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
					: ItemStack.EMPTY).getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_BOOTS.get()) {
				{
					double _setval = ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease + 0.1;
					(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.familiarStrengthIncrease = _setval;
								capability.syncPlayerVariables((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
							});
				}
			}
			if ((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
					.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00).getItem() == TnunlimitedModItems.HONEYBEE_IDOL.get()
					|| (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01).getItem() == TnunlimitedModItems.HONEYBEE_IDOL.get()
					|| (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
							.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02).getItem() == TnunlimitedModItems.HONEYBEE_IDOL.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 0, (false), (false)));
			}
			{
				double _setval = ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
						.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease;
				(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
						.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.familiarSTR = _setval;
							capability.syncPlayerVariables((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
						});
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"attribute @e[limit=1,distance=0..0.2] minecraft:generic.attack_damage modifier remove 1-3-4-7-5");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("attribute @e[limit=1,distance=0..0.2] minecraft:generic.attack_damage modifier add 1-3-4-7-5 Familar "
								+ ((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)
										.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease) + " multiply")));
		}
	}
}
