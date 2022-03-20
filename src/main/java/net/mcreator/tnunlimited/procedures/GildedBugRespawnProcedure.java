package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;

public class GildedBugRespawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& TnunlimitedModVariables.MapVariables.get(world).SessionLength >= 300) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL,
								new Vec3(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX()),
										((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY()),
										((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ())),
								Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						"effect clear @p tnunlimited:gilded_bug_buff");
		}
	}
}
