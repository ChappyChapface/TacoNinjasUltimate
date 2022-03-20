
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tnunlimited.world.features.plants.CoffeePlantFeature;
import net.mcreator.tnunlimited.world.features.ores.ZincOreFeature;
import net.mcreator.tnunlimited.world.features.ores.ZincDeepslateOreFeature;
import net.mcreator.tnunlimited.world.features.ores.NubriumOreFeature;
import net.mcreator.tnunlimited.world.features.ores.LemonstoneFeature;
import net.mcreator.tnunlimited.world.features.ores.LeadOreFeature;
import net.mcreator.tnunlimited.world.features.ores.AardiumoreFeature;
import net.mcreator.tnunlimited.world.features.StrayStructureFeature;
import net.mcreator.tnunlimited.world.features.StoneThingFeature;
import net.mcreator.tnunlimited.world.features.SinChestStructureFeature;
import net.mcreator.tnunlimited.world.features.PirateShipFeature;
import net.mcreator.tnunlimited.world.features.NetherTowerLimitedFeature;
import net.mcreator.tnunlimited.world.features.NetherTowerFeature;
import net.mcreator.tnunlimited.world.features.AntlionStatueFeature;
import net.mcreator.tnunlimited.world.features.AncientRuinsFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(AardiumoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AardiumoreFeature.GENERATE_BIOMES,
				AardiumoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ZincOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZincOreFeature.GENERATE_BIOMES,
				ZincOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LeadOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES,
				LeadOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CoffeePlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				CoffeePlantFeature.GENERATE_BIOMES, CoffeePlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SinChestStructureFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				SinChestStructureFeature.GENERATE_BIOMES, SinChestStructureFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AncientRuinsFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				AncientRuinsFeature.GENERATE_BIOMES, AncientRuinsFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ZincDeepslateOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ZincDeepslateOreFeature.GENERATE_BIOMES, ZincDeepslateOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LemonstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LemonstoneFeature.GENERATE_BIOMES,
				LemonstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AntlionStatueFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AntlionStatueFeature.GENERATE_BIOMES, AntlionStatueFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherTowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				NetherTowerFeature.GENERATE_BIOMES, NetherTowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PirateShipFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PirateShipFeature.GENERATE_BIOMES, PirateShipFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StrayStructureFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				StrayStructureFeature.GENERATE_BIOMES, StrayStructureFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StoneThingFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				StoneThingFeature.GENERATE_BIOMES, StoneThingFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NubriumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NubriumOreFeature.GENERATE_BIOMES,
				NubriumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherTowerLimitedFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				NetherTowerLimitedFeature.GENERATE_BIOMES, NetherTowerLimitedFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
