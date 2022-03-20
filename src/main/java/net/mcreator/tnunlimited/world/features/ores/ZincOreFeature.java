
package net.mcreator.tnunlimited.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.tnunlimited.init.TnunlimitedModBlocks;

import java.util.Set;
import java.util.Random;

public class ZincOreFeature extends OreFeature {
	public static final ZincOreFeature FEATURE = (ZincOreFeature) new ZincOreFeature().setRegistryName("tnunlimited:zinc_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(ZincOreFeatureRuleTest.INSTANCE, TnunlimitedModBlocks.ZINC_ORE.defaultBlockState(), 6))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(50)))).squared().count(12);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("deep_cold_ocean"), new ResourceLocation("frozen_ocean"),
			new ResourceLocation("warm_ocean"), new ResourceLocation("deep_warm_ocean"), new ResourceLocation("lukewarm_ocean"),
			new ResourceLocation("ocean"), new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("cold_ocean"),
			new ResourceLocation("deep_ocean"), new ResourceLocation("deep_frozen_ocean"));

	public ZincOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class ZincOreFeatureRuleTest extends RuleTest {
		static final ZincOreFeatureRuleTest INSTANCE = new ZincOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<ZincOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<ZincOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("tnunlimited:zinc_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
