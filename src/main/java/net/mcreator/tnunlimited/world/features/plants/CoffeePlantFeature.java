
package net.mcreator.tnunlimited.world.features.plants;

import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HeightmapConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DefaultFlowerFeature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;

import net.mcreator.tnunlimited.init.TnunlimitedModBlocks;

import java.util.Set;

public class CoffeePlantFeature extends DefaultFlowerFeature {
	public static final CoffeePlantFeature FEATURE = (CoffeePlantFeature) new CoffeePlantFeature().setRegistryName("tnunlimited:coffee_plant");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(TnunlimitedModBlocks.COFFEE_PLANT.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(6)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(25);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("bamboo_jungle"),
			new ResourceLocation("bamboo_jungle_hills"), new ResourceLocation("jungle_edge"), new ResourceLocation("jungle_hills"),
			new ResourceLocation("modified_jungle"), new ResourceLocation("modified_jungle_edge"), new ResourceLocation("jungle"));

	public CoffeePlantFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}
