package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.Entity;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DragonKillDetectProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(EnderDragon.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			TnunlimitedModVariables.MapVariables.get(world).dragon_killed = true;
			TnunlimitedModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
