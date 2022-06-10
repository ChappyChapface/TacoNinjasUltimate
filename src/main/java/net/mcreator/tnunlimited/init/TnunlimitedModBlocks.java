
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tnunlimited.block.ZincOreBlock;
import net.mcreator.tnunlimited.block.ZincDeepslateOreBlock;
import net.mcreator.tnunlimited.block.ZincBlockBlock;
import net.mcreator.tnunlimited.block.PolishedLemonstoneStairsBlock;
import net.mcreator.tnunlimited.block.PolishedLemonstoneSlabBlock;
import net.mcreator.tnunlimited.block.PolishedLemonstoneBlock;
import net.mcreator.tnunlimited.block.NubriumOreBlock;
import net.mcreator.tnunlimited.block.LemonstoneStairsBlock;
import net.mcreator.tnunlimited.block.LemonstoneSlabBlock;
import net.mcreator.tnunlimited.block.LemonstoneBlock;
import net.mcreator.tnunlimited.block.LeadOreBlock;
import net.mcreator.tnunlimited.block.GlowingiceBlock;
import net.mcreator.tnunlimited.block.DoneBlockBlock;
import net.mcreator.tnunlimited.block.CookieBlockBlock;
import net.mcreator.tnunlimited.block.ChiseledLemonstoneBlock;
import net.mcreator.tnunlimited.block.BlockofrawleadBlock;
import net.mcreator.tnunlimited.block.BlockofAardiumBlock;
import net.mcreator.tnunlimited.block.BlockOfLeadBlock;
import net.mcreator.tnunlimited.block.AppleLeavesBlock;
import net.mcreator.tnunlimited.block.AardiumoreBlock;
import net.mcreator.tnunlimited.TnunlimitedMod;

public class TnunlimitedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TnunlimitedMod.MODID);
	public static final RegistryObject<Block> GLOWINGICE = REGISTRY.register("glowingice", () -> new GlowingiceBlock());
	public static final RegistryObject<Block> AARDIUMORE = REGISTRY.register("aardiumore", () -> new AardiumoreBlock());
	public static final RegistryObject<Block> ZINC_ORE = REGISTRY.register("zinc_ore", () -> new ZincOreBlock());
	public static final RegistryObject<Block> BLOCKOF_AARDIUM = REGISTRY.register("blockof_aardium", () -> new BlockofAardiumBlock());
	public static final RegistryObject<Block> DONE_BLOCK = REGISTRY.register("done_block", () -> new DoneBlockBlock());
	public static final RegistryObject<Block> ZINC_BLOCK = REGISTRY.register("zinc_block", () -> new ZincBlockBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> BLOCKOFRAWLEAD = REGISTRY.register("blockofrawlead", () -> new BlockofrawleadBlock());
	public static final RegistryObject<Block> BLOCK_OF_LEAD = REGISTRY.register("block_of_lead", () -> new BlockOfLeadBlock());
	public static final RegistryObject<Block> ZINC_DEEPSLATE_ORE = REGISTRY.register("zinc_deepslate_ore", () -> new ZincDeepslateOreBlock());
	public static final RegistryObject<Block> LEMONSTONE = REGISTRY.register("lemonstone", () -> new LemonstoneBlock());
	public static final RegistryObject<Block> POLISHED_LEMONSTONE = REGISTRY.register("polished_lemonstone", () -> new PolishedLemonstoneBlock());
	public static final RegistryObject<Block> CHISELED_LEMONSTONE = REGISTRY.register("chiseled_lemonstone", () -> new ChiseledLemonstoneBlock());
	public static final RegistryObject<Block> LEMONSTONE_SLAB = REGISTRY.register("lemonstone_slab", () -> new LemonstoneSlabBlock());
	public static final RegistryObject<Block> LEMONSTONE_STAIRS = REGISTRY.register("lemonstone_stairs", () -> new LemonstoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_LEMONSTONE_SLAB = REGISTRY.register("polished_lemonstone_slab",
			() -> new PolishedLemonstoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_LEMONSTONE_STAIRS = REGISTRY.register("polished_lemonstone_stairs",
			() -> new PolishedLemonstoneStairsBlock());
	public static final RegistryObject<Block> COOKIE_BLOCK = REGISTRY.register("cookie_block", () -> new CookieBlockBlock());
	public static final RegistryObject<Block> NUBRIUM_ORE = REGISTRY.register("nubrium_ore", () -> new NubriumOreBlock());
	public static final RegistryObject<Block> APPLE_LEAVES = REGISTRY.register("apple_leaves", () -> new AppleLeavesBlock());
}
