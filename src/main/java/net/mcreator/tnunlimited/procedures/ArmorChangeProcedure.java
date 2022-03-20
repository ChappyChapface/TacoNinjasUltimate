package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;
import net.mcreator.tnunlimited.init.TnunlimitedModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ArmorChangeProcedure {
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
				capability.ArmorIncrease = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.RESISTING,
				((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00)) != 0) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorIncrease
						+ EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.RESISTING,
								((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc00))
								* 0.01;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ArmorIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.RESISTING,
				((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01)) != 0) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorIncrease
						+ EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.RESISTING,
								((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc01))
								* 0.01;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ArmorIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.RESISTING,
				((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02)) != 0) {
			{
				double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorIncrease
						+ EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.RESISTING,
								((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new TnunlimitedModVariables.PlayerVariables())).Acc02))
								* 0.01;
				entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ArmorIncrease = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			double _setval = (entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorIncrease;
			entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.armorMultDisplay = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"attribute @p minecraft:generic.armor modifier remove 5-4-4-6-9");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("attribute @p minecraft:generic.armor modifier add 5-4-4-6-9 Armor "
							+ ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorIncrease + " multiply")));
	}
}
