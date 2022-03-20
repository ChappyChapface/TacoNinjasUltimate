
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.tnunlimited.client.renderer.WastelandishHopperRenderer;
import net.mcreator.tnunlimited.client.renderer.PirateDeadeyeRenderer;
import net.mcreator.tnunlimited.client.renderer.PirateCrewmanRenderer;
import net.mcreator.tnunlimited.client.renderer.PirateCaptainRenderer;
import net.mcreator.tnunlimited.client.renderer.PinacateBeetleRenderer;
import net.mcreator.tnunlimited.client.renderer.GildedBugRenderer;
import net.mcreator.tnunlimited.client.renderer.GalvanizedHarpoonRenderer;
import net.mcreator.tnunlimited.client.renderer.EnderProtectorRenderer;
import net.mcreator.tnunlimited.client.renderer.DuneSpiderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TnunlimitedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TnunlimitedModEntities.SNOWGLOVE, ThrownItemRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.BULLET_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.GALVANIZED_HARPOON, GalvanizedHarpoonRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.ROCK, ThrownItemRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.DUNE_SPIDER, DuneSpiderRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.GILDED_BUG, GildedBugRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.WASTELANDISH_HOPPER, WastelandishHopperRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.PINACATE_BEETLE, PinacateBeetleRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.PIRATE_CAPTAIN, PirateCaptainRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.PIRATE_CREWMAN, PirateCrewmanRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.BUCKSHOT_PELLET_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.PIRATE_DEADEYE, PirateDeadeyeRenderer::new);
		event.registerEntityRenderer(TnunlimitedModEntities.ENDER_PROTECTOR, EnderProtectorRenderer::new);
	}
}
