
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

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
import net.mcreator.tnunlimited.block.CoffeePlantBlock;
import net.mcreator.tnunlimited.block.ChiseledLemonstoneBlock;
import net.mcreator.tnunlimited.block.BlockofrawleadBlock;
import net.mcreator.tnunlimited.block.BlockofAardiumBlock;
import net.mcreator.tnunlimited.block.BlockOfLeadBlock;
import net.mcreator.tnunlimited.block.AardiumoreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block GLOWINGICE = register(new GlowingiceBlock());
	public static final Block AARDIUMORE = register(new AardiumoreBlock());
	public static final Block ZINC_ORE = register(new ZincOreBlock());
	public static final Block BLOCKOF_AARDIUM = register(new BlockofAardiumBlock());
	public static final Block DONE_BLOCK = register(new DoneBlockBlock());
	public static final Block ZINC_BLOCK = register(new ZincBlockBlock());
	public static final Block LEAD_ORE = register(new LeadOreBlock());
	public static final Block COFFEE_PLANT = register(new CoffeePlantBlock());
	public static final Block BLOCKOFRAWLEAD = register(new BlockofrawleadBlock());
	public static final Block BLOCK_OF_LEAD = register(new BlockOfLeadBlock());
	public static final Block ZINC_DEEPSLATE_ORE = register(new ZincDeepslateOreBlock());
	public static final Block LEMONSTONE = register(new LemonstoneBlock());
	public static final Block POLISHED_LEMONSTONE = register(new PolishedLemonstoneBlock());
	public static final Block CHISELED_LEMONSTONE = register(new ChiseledLemonstoneBlock());
	public static final Block LEMONSTONE_SLAB = register(new LemonstoneSlabBlock());
	public static final Block LEMONSTONE_STAIRS = register(new LemonstoneStairsBlock());
	public static final Block POLISHED_LEMONSTONE_SLAB = register(new PolishedLemonstoneSlabBlock());
	public static final Block POLISHED_LEMONSTONE_STAIRS = register(new PolishedLemonstoneStairsBlock());
	public static final Block COOKIE_BLOCK = register(new CookieBlockBlock());
	public static final Block NUBRIUM_ORE = register(new NubriumOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CoffeePlantBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			CoffeePlantBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			CoffeePlantBlock.itemColorLoad(event);
		}
	}
}
