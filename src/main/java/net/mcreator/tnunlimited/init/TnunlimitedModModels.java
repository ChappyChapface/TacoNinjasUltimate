
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.tnunlimited.client.model.Modelender_protector;
import net.mcreator.tnunlimited.client.model.Modelcustom_model;
import net.mcreator.tnunlimited.client.model.ModelWastelandish_Hopper;
import net.mcreator.tnunlimited.client.model.ModelRoachHelmet;
import net.mcreator.tnunlimited.client.model.ModelRoachChestplate;
import net.mcreator.tnunlimited.client.model.ModelPinacateBeetle;
import net.mcreator.tnunlimited.client.model.ModelGildedBug;
import net.mcreator.tnunlimited.client.model.ModelGalvanizedHarpoon;
import net.mcreator.tnunlimited.client.model.ModelDuneSpider;
import net.mcreator.tnunlimited.client.model.ModelCaptainHat;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TnunlimitedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGalvanizedHarpoon.LAYER_LOCATION, ModelGalvanizedHarpoon::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelRoachChestplate.LAYER_LOCATION, ModelRoachChestplate::createBodyLayer);
		event.registerLayerDefinition(ModelWastelandish_Hopper.LAYER_LOCATION, ModelWastelandish_Hopper::createBodyLayer);
		event.registerLayerDefinition(Modelender_protector.LAYER_LOCATION, Modelender_protector::createBodyLayer);
		event.registerLayerDefinition(ModelCaptainHat.LAYER_LOCATION, ModelCaptainHat::createBodyLayer);
		event.registerLayerDefinition(ModelRoachHelmet.LAYER_LOCATION, ModelRoachHelmet::createBodyLayer);
		event.registerLayerDefinition(ModelDuneSpider.LAYER_LOCATION, ModelDuneSpider::createBodyLayer);
		event.registerLayerDefinition(ModelGildedBug.LAYER_LOCATION, ModelGildedBug::createBodyLayer);
		event.registerLayerDefinition(ModelPinacateBeetle.LAYER_LOCATION, ModelPinacateBeetle::createBodyLayer);
	}
}
