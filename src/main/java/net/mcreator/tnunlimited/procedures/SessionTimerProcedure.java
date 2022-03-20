package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SessionTimerProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		TnunlimitedModVariables.MapVariables.get(world).SessionLength = TnunlimitedModVariables.MapVariables.get(world).SessionLength + 1;
		TnunlimitedModVariables.MapVariables.get(world).syncData(world);
	}
}
