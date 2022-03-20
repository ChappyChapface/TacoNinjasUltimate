package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class EnderProtectorAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("NoAI") == 0) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"execute as @e[sort=nearest,limit=1] rotated as @s at @s run tp @s ~ ~ ~ facing entity @p[gamemode=!spectator]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"execute as @e[sort=nearest,limit=1] rotated as @s at @s if entity @p[gamemode=!spectator] run tp @s ^ ^ ^0.2");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"execute as @e[sort=nearest,limit=1] rotated as @s at @s if entity @p[gamemode=!spectator] run data merge entity @s {Invulnerable:1b}");
			if (!EnderProtectorSpawningConditionProcedure.execute(world, x, z)) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
