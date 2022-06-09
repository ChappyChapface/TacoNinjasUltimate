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
public class ArmorSetBonusesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_CHESTPLATE.get()
				&& ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_LEGGINGS.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == TnunlimitedModItems.FANCY_PANTS_LEGGINGS.get())
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TnunlimitedModItems.DESERT_ROACH_ARMOR_BOOTS.get()) {
			if (TnunlimitedModVariables.MapVariables.get(world).SessionLength >= 300
					&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TnunlimitedModMobEffects.GILDED_BUG_BUFF.get()) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(TnunlimitedModMobEffects.GILDED_BUG_BUFF.get(), 999999, 0, (false), (false)));
			}
		} else {
			if (TnunlimitedModVariables.MapVariables.get(world).SessionLength >= 300
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TnunlimitedModMobEffects.GILDED_BUG_BUFF.get()) : false)) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"effect clear @p tnunlimited:gilded_bug_buff");
			}
		}
	}
}
