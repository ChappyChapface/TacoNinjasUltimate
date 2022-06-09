
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

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
import net.mcreator.tnunlimited.TnunlimitedMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class TnunlimitedModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TnunlimitedMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> AARDIUMORE = register("aardiumore", AardiumoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AardiumoreFeature.GENERATE_BIOMES, AardiumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZINC_ORE = register("zinc_ore", ZincOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZincOreFeature.GENERATE_BIOMES, ZincOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LEAD_ORE = register("lead_ore", LeadOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES, LeadOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COFFEE_PLANT = register("coffee_plant", CoffeePlantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CoffeePlantFeature.GENERATE_BIOMES, CoffeePlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SIN_CHEST_STRUCTURE = register("sin_chest_structure", SinChestStructureFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SinChestStructureFeature.GENERATE_BIOMES,
					SinChestStructureFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANCIENT_RUINS = register("ancient_ruins", AncientRuinsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, AncientRuinsFeature.GENERATE_BIOMES, AncientRuinsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZINC_DEEPSLATE_ORE = register("zinc_deepslate_ore", ZincDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZincDeepslateOreFeature.GENERATE_BIOMES,
					ZincDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LEMONSTONE = register("lemonstone", LemonstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LemonstoneFeature.GENERATE_BIOMES, LemonstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANTLION_STATUE = register("antlion_statue", AntlionStatueFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, AntlionStatueFeature.GENERATE_BIOMES, AntlionStatueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_TOWER = register("nether_tower", NetherTowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NetherTowerFeature.GENERATE_BIOMES, NetherTowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PIRATE_SHIP = register("pirate_ship", PirateShipFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, PirateShipFeature.GENERATE_BIOMES, PirateShipFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STRAY_STRUCTURE = register("stray_structure", StrayStructureFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, StrayStructureFeature.GENERATE_BIOMES,
					StrayStructureFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STONE_THING = register("stone_thing", StoneThingFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, StoneThingFeature.GENERATE_BIOMES, StoneThingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NUBRIUM_ORE = register("nubrium_ore", NubriumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NubriumOreFeature.GENERATE_BIOMES, NubriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_TOWER_LIMITED = register("nether_tower_limited", NetherTowerLimitedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NetherTowerLimitedFeature.GENERATE_BIOMES,
					NetherTowerLimitedFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
