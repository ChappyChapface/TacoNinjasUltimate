
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tnunlimited.item.ZincSheetItem;
import net.mcreator.tnunlimited.item.ZincIngotItem;
import net.mcreator.tnunlimited.item.WoodenSickleItem;
import net.mcreator.tnunlimited.item.SunriseItem;
import net.mcreator.tnunlimited.item.StoneSickleItem;
import net.mcreator.tnunlimited.item.ReforgedaardiumItem;
import net.mcreator.tnunlimited.item.RawLeadItem;
import net.mcreator.tnunlimited.item.RawAardiumItem;
import net.mcreator.tnunlimited.item.PirateItem;
import net.mcreator.tnunlimited.item.PepperoniIngotItem;
import net.mcreator.tnunlimited.item.PepperoniFoodItem;
import net.mcreator.tnunlimited.item.NubriumPickaxeItem;
import net.mcreator.tnunlimited.item.NubriumItem;
import net.mcreator.tnunlimited.item.NubriumArmourItem;
import net.mcreator.tnunlimited.item.NetheriteSickleItem;
import net.mcreator.tnunlimited.item.MugItem;
import net.mcreator.tnunlimited.item.LeadIngotItem;
import net.mcreator.tnunlimited.item.IronSickleItem;
import net.mcreator.tnunlimited.item.HamburgerItem;
import net.mcreator.tnunlimited.item.GoldenHamburgerItem;
import net.mcreator.tnunlimited.item.GoldSickleItem;
import net.mcreator.tnunlimited.item.GildedChainmailPickaxeItem;
import net.mcreator.tnunlimited.item.GalvanizedSwordItem;
import net.mcreator.tnunlimited.item.GalvanizedSickleItem;
import net.mcreator.tnunlimited.item.GalvanizedShovelItem;
import net.mcreator.tnunlimited.item.GalvanizedPickaxeItem;
import net.mcreator.tnunlimited.item.GalvanizedHoeItem;
import net.mcreator.tnunlimited.item.GalvanizedAxeItem;
import net.mcreator.tnunlimited.item.FrenchtoastItem;
import net.mcreator.tnunlimited.item.FlameringItem;
import net.mcreator.tnunlimited.item.DoneSwordItem;
import net.mcreator.tnunlimited.item.DoneShovelItem;
import net.mcreator.tnunlimited.item.DonePickaxeItem;
import net.mcreator.tnunlimited.item.DoneItem;
import net.mcreator.tnunlimited.item.DoneHoeItem;
import net.mcreator.tnunlimited.item.DoneAxeItem;
import net.mcreator.tnunlimited.item.DoneArmourItem;
import net.mcreator.tnunlimited.item.DiamondSickleItem;
import net.mcreator.tnunlimited.item.DesertIngotItem;
import net.mcreator.tnunlimited.item.DesertChitinItem;
import net.mcreator.tnunlimited.item.CutlassItem;
import net.mcreator.tnunlimited.item.CriticalSwordItem;
import net.mcreator.tnunlimited.item.CookedbaconItem;
import net.mcreator.tnunlimited.item.CookedEggItem;
import net.mcreator.tnunlimited.item.CoffeeFruitItem;
import net.mcreator.tnunlimited.item.CoffeeBeansItem;
import net.mcreator.tnunlimited.item.ChainmailPickaxeItem;
import net.mcreator.tnunlimited.item.CaptainsHatItem;
import net.mcreator.tnunlimited.item.BulletProjectileItem;
import net.mcreator.tnunlimited.item.BulletItem;
import net.mcreator.tnunlimited.item.BuckshotPelletProjectileItem;
import net.mcreator.tnunlimited.item.BomaindSickleItem;
import net.mcreator.tnunlimited.item.BaconItem;
import net.mcreator.tnunlimited.item.AntimonyItem;
import net.mcreator.tnunlimited.item.AntimonyArmorArmorItem;
import net.mcreator.tnunlimited.item.AarduimswordItem;
import net.mcreator.tnunlimited.item.AardiumpickaxeItem;
import net.mcreator.tnunlimited.item.AardiumingotItem;
import net.mcreator.tnunlimited.item.AardiumingoShovelItem;
import net.mcreator.tnunlimited.item.AardiumingoHoeItem;
import net.mcreator.tnunlimited.item.AardiumingoAxeItem;
import net.mcreator.tnunlimited.item.AardiumSickleItem;
import net.mcreator.tnunlimited.TnunlimitedMod;

public class TnunlimitedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TnunlimitedMod.MODID);
	public static final RegistryObject<Item> WOODEN_SICKLE = REGISTRY.register("wooden_sickle", () -> new WoodenSickleItem());
	public static final RegistryObject<Item> STONE_SICKLE = REGISTRY.register("stone_sickle", () -> new StoneSickleItem());
	public static final RegistryObject<Item> GOLD_SICKLE = REGISTRY.register("gold_sickle", () -> new GoldSickleItem());
	public static final RegistryObject<Item> IRON_SICKLE = REGISTRY.register("iron_sickle", () -> new IronSickleItem());
	public static final RegistryObject<Item> DIAMOND_SICKLE = REGISTRY.register("diamond_sickle", () -> new DiamondSickleItem());
	public static final RegistryObject<Item> NETHERITE_SICKLE = REGISTRY.register("netherite_sickle", () -> new NetheriteSickleItem());
	public static final RegistryObject<Item> GLOWINGICE = block(TnunlimitedModBlocks.GLOWINGICE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AARDIUMORE = block(TnunlimitedModBlocks.AARDIUMORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());
	public static final RegistryObject<Item> RAW_AARDIUM = REGISTRY.register("raw_aardium", () -> new RawAardiumItem());
	public static final RegistryObject<Item> ZINC_SHEET = REGISTRY.register("zinc_sheet", () -> new ZincSheetItem());
	public static final RegistryObject<Item> PEPPERONI_INGOT = REGISTRY.register("pepperoni_ingot", () -> new PepperoniIngotItem());
	public static final RegistryObject<Item> AARDIUMINGOT = REGISTRY.register("aardiumingot", () -> new AardiumingotItem());
	public static final RegistryObject<Item> ZINC_ORE = block(TnunlimitedModBlocks.ZINC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DONE_SWORD = REGISTRY.register("done_sword", () -> new DoneSwordItem());
	public static final RegistryObject<Item> BLOCKOF_AARDIUM = block(TnunlimitedModBlocks.BLOCKOF_AARDIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GALVANIZED_SICKLE = REGISTRY.register("galvanized_sickle", () -> new GalvanizedSickleItem());
	public static final RegistryObject<Item> GALVANIZED_SWORD = REGISTRY.register("galvanized_sword", () -> new GalvanizedSwordItem());
	public static final RegistryObject<Item> DONE_SHOVEL = REGISTRY.register("done_shovel", () -> new DoneShovelItem());
	public static final RegistryObject<Item> DONE_PICKAXE = REGISTRY.register("done_pickaxe", () -> new DonePickaxeItem());
	public static final RegistryObject<Item> GALVANIZED_PICKAXE = REGISTRY.register("galvanized_pickaxe", () -> new GalvanizedPickaxeItem());
	public static final RegistryObject<Item> DONE = REGISTRY.register("done", () -> new DoneItem());
	public static final RegistryObject<Item> GALVANIZED_AXE = REGISTRY.register("galvanized_axe", () -> new GalvanizedAxeItem());
	public static final RegistryObject<Item> GALVANIZED_HOE = REGISTRY.register("galvanized_hoe", () -> new GalvanizedHoeItem());
	public static final RegistryObject<Item> GALVANIZED_SHOVEL = REGISTRY.register("galvanized_shovel", () -> new GalvanizedShovelItem());
	public static final RegistryObject<Item> DONE_HOE = REGISTRY.register("done_hoe", () -> new DoneHoeItem());
	public static final RegistryObject<Item> DONE_AXE = REGISTRY.register("done_axe", () -> new DoneAxeItem());
	public static final RegistryObject<Item> DONE_BLOCK = block(TnunlimitedModBlocks.DONE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SUNRISE = REGISTRY.register("sunrise", () -> new SunriseItem());
	public static final RegistryObject<Item> ZINC_BLOCK = block(TnunlimitedModBlocks.ZINC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> MUG = REGISTRY.register("mug", () -> new MugItem());
	public static final RegistryObject<Item> DONE_ARMOUR_HELMET = REGISTRY.register("done_armour_helmet", () -> new DoneArmourItem.Helmet());
	public static final RegistryObject<Item> DONE_ARMOUR_CHESTPLATE = REGISTRY.register("done_armour_chestplate",
			() -> new DoneArmourItem.Chestplate());
	public static final RegistryObject<Item> DONE_ARMOUR_LEGGINGS = REGISTRY.register("done_armour_leggings", () -> new DoneArmourItem.Leggings());
	public static final RegistryObject<Item> DONE_ARMOUR_BOOTS = REGISTRY.register("done_armour_boots", () -> new DoneArmourItem.Boots());
	public static final RegistryObject<Item> AARDIUM_SICKLE = REGISTRY.register("aardium_sickle", () -> new AardiumSickleItem());
	public static final RegistryObject<Item> BULLET_PROJECTILE = REGISTRY.register("bullet_projectile", () -> new BulletProjectileItem());
	public static final RegistryObject<Item> LEAD_ORE = block(TnunlimitedModBlocks.LEAD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new RawLeadItem());
	public static final RegistryObject<Item> FLAMERING = REGISTRY.register("flamering", () -> new FlameringItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> COFFEE_BEANS = REGISTRY.register("coffee_beans", () -> new CoffeeBeansItem());
	public static final RegistryObject<Item> BLOCKOFRAWLEAD = block(TnunlimitedModBlocks.BLOCKOFRAWLEAD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOCK_OF_LEAD = block(TnunlimitedModBlocks.BLOCK_OF_LEAD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRITICAL_SWORD = REGISTRY.register("critical_sword", () -> new CriticalSwordItem());
	public static final RegistryObject<Item> AARDUIMSWORD = REGISTRY.register("aarduimsword", () -> new AarduimswordItem());
	public static final RegistryObject<Item> BOMAIND_SICKLE = REGISTRY.register("bomaind_sickle", () -> new BomaindSickleItem());
	public static final RegistryObject<Item> AARDIUMPICKAXE = REGISTRY.register("aardiumpickaxe", () -> new AardiumpickaxeItem());
	public static final RegistryObject<Item> ZINC_DEEPSLATE_ORE = block(TnunlimitedModBlocks.ZINC_DEEPSLATE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AARDIUMINGO_AXE = REGISTRY.register("aardiumingo_axe", () -> new AardiumingoAxeItem());
	public static final RegistryObject<Item> AARDIUMINGO_SHOVEL = REGISTRY.register("aardiumingo_shovel", () -> new AardiumingoShovelItem());
	public static final RegistryObject<Item> AARDIUMINGO_HOE = REGISTRY.register("aardiumingo_hoe", () -> new AardiumingoHoeItem());
	public static final RegistryObject<Item> LEMONSTONE = block(TnunlimitedModBlocks.LEMONSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_LEMONSTONE = block(TnunlimitedModBlocks.POLISHED_LEMONSTONE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHISELED_LEMONSTONE = block(TnunlimitedModBlocks.CHISELED_LEMONSTONE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LEMONSTONE_SLAB = block(TnunlimitedModBlocks.LEMONSTONE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LEMONSTONE_STAIRS = block(TnunlimitedModBlocks.LEMONSTONE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_LEMONSTONE_SLAB = block(TnunlimitedModBlocks.POLISHED_LEMONSTONE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_LEMONSTONE_STAIRS = block(TnunlimitedModBlocks.POLISHED_LEMONSTONE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHAINMAIL_PICKAXE = REGISTRY.register("chainmail_pickaxe", () -> new ChainmailPickaxeItem());
	public static final RegistryObject<Item> GILDED_CHAINMAIL_PICKAXE = REGISTRY.register("gilded_chainmail_pickaxe",
			() -> new GildedChainmailPickaxeItem());
	public static final RegistryObject<Item> DUNE_SPIDER = REGISTRY.register("dune_spider_spawn_egg",
			() -> new ForgeSpawnEggItem(TnunlimitedModEntities.DUNE_SPIDER, -8773888, -3127296, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DESERT_CHITIN = REGISTRY.register("desert_chitin", () -> new DesertChitinItem());
	public static final RegistryObject<Item> DESERT_INGOT = REGISTRY.register("desert_ingot", () -> new DesertIngotItem());
	public static final RegistryObject<Item> COOKIE_BLOCK = block(TnunlimitedModBlocks.COOKIE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANTIMONY = REGISTRY.register("antimony", () -> new AntimonyItem());
	public static final RegistryObject<Item> ANTIMONY_ARMOR_ARMOR_HELMET = REGISTRY.register("antimony_armor_armor_helmet",
			() -> new AntimonyArmorArmorItem.Helmet());
	public static final RegistryObject<Item> ANTIMONY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("antimony_armor_armor_chestplate",
			() -> new AntimonyArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> ANTIMONY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("antimony_armor_armor_leggings",
			() -> new AntimonyArmorArmorItem.Leggings());
	public static final RegistryObject<Item> ANTIMONY_ARMOR_ARMOR_BOOTS = REGISTRY.register("antimony_armor_armor_boots",
			() -> new AntimonyArmorArmorItem.Boots());
	public static final RegistryObject<Item> WASTELANDISH_HOPPER = REGISTRY.register("wastelandish_hopper_spawn_egg",
			() -> new ForgeSpawnEggItem(TnunlimitedModEntities.WASTELANDISH_HOPPER, -14739442, -12504291,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PINACATE_BEETLE = REGISTRY.register("pinacate_beetle_spawn_egg",
			() -> new ForgeSpawnEggItem(TnunlimitedModEntities.PINACATE_BEETLE, -14870249, -3441,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> REFORGEDAARDIUM = REGISTRY.register("reforgedaardium", () -> new ReforgedaardiumItem());
	public static final RegistryObject<Item> PIRATE_HELMET = REGISTRY.register("pirate_helmet", () -> new PirateItem.Helmet());
	public static final RegistryObject<Item> PIRATE_CHESTPLATE = REGISTRY.register("pirate_chestplate", () -> new PirateItem.Chestplate());
	public static final RegistryObject<Item> CAPTAINS_HAT_HELMET = REGISTRY.register("captains_hat_helmet", () -> new CaptainsHatItem.Helmet());
	public static final RegistryObject<Item> PIRATE_CAPTAIN = REGISTRY.register("pirate_captain_spawn_egg",
			() -> new ForgeSpawnEggItem(TnunlimitedModEntities.PIRATE_CAPTAIN, -15193325, -4512218,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PIRATE_CREWMAN = REGISTRY.register("pirate_crewman_spawn_egg",
			() -> new ForgeSpawnEggItem(TnunlimitedModEntities.PIRATE_CREWMAN, -10482419, -13482450,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BUCKSHOT_PELLET_PROJECTILE = REGISTRY.register("buckshot_pellet_projectile",
			() -> new BuckshotPelletProjectileItem());
	public static final RegistryObject<Item> CUTLASS = REGISTRY.register("cutlass", () -> new CutlassItem());
	public static final RegistryObject<Item> PIRATE_DEADEYE = REGISTRY.register("pirate_deadeye_spawn_egg",
			() -> new ForgeSpawnEggItem(TnunlimitedModEntities.PIRATE_DEADEYE, -10482419, -13482450,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NUBRIUM_ARMOUR_HELMET = REGISTRY.register("nubrium_armour_helmet", () -> new NubriumArmourItem.Helmet());
	public static final RegistryObject<Item> NUBRIUM_ARMOUR_CHESTPLATE = REGISTRY.register("nubrium_armour_chestplate",
			() -> new NubriumArmourItem.Chestplate());
	public static final RegistryObject<Item> NUBRIUM_ARMOUR_LEGGINGS = REGISTRY.register("nubrium_armour_leggings",
			() -> new NubriumArmourItem.Leggings());
	public static final RegistryObject<Item> NUBRIUM_ARMOUR_BOOTS = REGISTRY.register("nubrium_armour_boots", () -> new NubriumArmourItem.Boots());
	public static final RegistryObject<Item> NUBRIUM = REGISTRY.register("nubrium", () -> new NubriumItem());
	public static final RegistryObject<Item> NUBRIUM_PICKAXE = REGISTRY.register("nubrium_pickaxe", () -> new NubriumPickaxeItem());
	public static final RegistryObject<Item> NUBRIUM_ORE = block(TnunlimitedModBlocks.NUBRIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COFFEE_FRUIT = REGISTRY.register("coffee_fruit", () -> new CoffeeFruitItem());
	public static final RegistryObject<Item> PEPPERONI_FOOD = REGISTRY.register("pepperoni_food", () -> new PepperoniFoodItem());
	public static final RegistryObject<Item> HAMBURGER = REGISTRY.register("hamburger", () -> new HamburgerItem());
	public static final RegistryObject<Item> GOLDEN_HAMBURGER = REGISTRY.register("golden_hamburger", () -> new GoldenHamburgerItem());
	public static final RegistryObject<Item> FRENCHTOAST = REGISTRY.register("frenchtoast", () -> new FrenchtoastItem());
	public static final RegistryObject<Item> COOKED_EGG = REGISTRY.register("cooked_egg", () -> new CookedEggItem());
	public static final RegistryObject<Item> COOKEDBACON = REGISTRY.register("cookedbacon", () -> new CookedbaconItem());
	public static final RegistryObject<Item> BACON = REGISTRY.register("bacon", () -> new BaconItem());
	public static final RegistryObject<Item> APPLE_LEAVES = block(TnunlimitedModBlocks.APPLE_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
