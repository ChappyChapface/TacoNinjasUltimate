
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> NERFEDSHIELD = GameRules.register("nerfedShield", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(false));
}
