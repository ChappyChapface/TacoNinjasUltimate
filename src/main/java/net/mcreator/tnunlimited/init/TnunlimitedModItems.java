
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tnunlimited.item.ZincSheetItem;
import net.mcreator.tnunlimited.item.ZincIngotItem;
import net.mcreator.tnunlimited.item.ZincArmorItem;
import net.mcreator.tnunlimited.item.WoodenSickleItem;
import net.mcreator.tnunlimited.item.TorchOfGuidanceItem;
import net.mcreator.tnunlimited.item.SunriseItem;
import net.mcreator.tnunlimited.item.StoneSickleItem;
import net.mcreator.tnunlimited.item.SnowgloveItem;
import net.mcreator.tnunlimited.item.SlothsPillowItem;
import net.mcreator.tnunlimited.item.SerenityItem;
import net.mcreator.tnunlimited.item.RockItem;
import net.mcreator.tnunlimited.item.RevolverItem;
import net.mcreator.tnunlimited.item.RepulsiveFlowerReplicaItem;
import net.mcreator.tnunlimited.item.ReforgedaardiumItem;
import net.mcreator.tnunlimited.item.RawLeadItem;
import net.mcreator.tnunlimited.item.RawAardiumItem;
import net.mcreator.tnunlimited.item.PirateItem;
import net.mcreator.tnunlimited.item.PickaxeOfLuminescenceItem;
import net.mcreator.tnunlimited.item.PetCactusItem;
import net.mcreator.tnunlimited.item.PepperoniIngotItem;
import net.mcreator.tnunlimited.item.PepperoniFoodItem;
import net.mcreator.tnunlimited.item.PepperoniArmourItem;
import net.mcreator.tnunlimited.item.NubriumSwordItem;
import net.mcreator.tnunlimited.item.NubriumSickleItem;
import net.mcreator.tnunlimited.item.NubriumShovelItem;
import net.mcreator.tnunlimited.item.NubriumPickaxeItem;
import net.mcreator.tnunlimited.item.NubriumItem;
import net.mcreator.tnunlimited.item.NubriumHoeItem;
import net.mcreator.tnunlimited.item.NubriumAxeItem;
import net.mcreator.tnunlimited.item.NubriumArmourItem;
import net.mcreator.tnunlimited.item.NetheriteSickleItem;
import net.mcreator.tnunlimited.item.MugItem;
import net.mcreator.tnunlimited.item.MochaItem;
import net.mcreator.tnunlimited.item.MiracleRuneItem;
import net.mcreator.tnunlimited.item.LeadSwordItem;
import net.mcreator.tnunlimited.item.LeadSickleItem;
import net.mcreator.tnunlimited.item.LeadShovelItem;
import net.mcreator.tnunlimited.item.LeadPickaxeItem;
import net.mcreator.tnunlimited.item.LeadIngotItem;
import net.mcreator.tnunlimited.item.LeadHoeItem;
import net.mcreator.tnunlimited.item.LeadAxeItem;
import net.mcreator.tnunlimited.item.LeadArmorItem;
import net.mcreator.tnunlimited.item.JarOfInfiniteJellybeansItem;
import net.mcreator.tnunlimited.item.IronSickleItem;
import net.mcreator.tnunlimited.item.IronBandItem;
import net.mcreator.tnunlimited.item.HotchocolateItem;
import net.mcreator.tnunlimited.item.HoneybeeIdolItem;
import net.mcreator.tnunlimited.item.HeatwaveItem;
import net.mcreator.tnunlimited.item.HeartcoreItem;
import net.mcreator.tnunlimited.item.HamburgerItem;
import net.mcreator.tnunlimited.item.GoldenHamburgerItem;
import net.mcreator.tnunlimited.item.GoldenCrownItem;
import net.mcreator.tnunlimited.item.GoldenCactusPetItem;
import net.mcreator.tnunlimited.item.GoldSickleItem;
import net.mcreator.tnunlimited.item.GlassSkullItem;
import net.mcreator.tnunlimited.item.GildedChainmailPickaxeItem;
import net.mcreator.tnunlimited.item.GalvanizedSwordItem;
import net.mcreator.tnunlimited.item.GalvanizedSickleItem;
import net.mcreator.tnunlimited.item.GalvanizedShovelItem;
import net.mcreator.tnunlimited.item.GalvanizedPickaxeItem;
import net.mcreator.tnunlimited.item.GalvanizedHoeItem;
import net.mcreator.tnunlimited.item.GalvanizedHarpoonItem;
import net.mcreator.tnunlimited.item.GalvanizedAxeItem;
import net.mcreator.tnunlimited.item.FrenchtoastItem;
import net.mcreator.tnunlimited.item.FlintlockItem;
import net.mcreator.tnunlimited.item.FleurBandItem;
import net.mcreator.tnunlimited.item.FlameringItem;
import net.mcreator.tnunlimited.item.FancyPantsItem;
import net.mcreator.tnunlimited.item.EnchantedGoldenCactusPetItem;
import net.mcreator.tnunlimited.item.DoneSwordItem;
import net.mcreator.tnunlimited.item.DoneShovelItem;
import net.mcreator.tnunlimited.item.DonePickaxeItem;
import net.mcreator.tnunlimited.item.DoneItem;
import net.mcreator.tnunlimited.item.DoneHoeItem;
import net.mcreator.tnunlimited.item.DoneAxeItem;
import net.mcreator.tnunlimited.item.DoneArmourItem;
import net.mcreator.tnunlimited.item.DiamondSickleItem;
import net.mcreator.tnunlimited.item.Desert_RoachArmorItem;
import net.mcreator.tnunlimited.item.DesertIngotItem;
import net.mcreator.tnunlimited.item.DesertChitinItem;
import net.mcreator.tnunlimited.item.DecardialNecklaceItem;
import net.mcreator.tnunlimited.item.DarkWarhammerItem;
import net.mcreator.tnunlimited.item.CutlassItem;
import net.mcreator.tnunlimited.item.CriticalSwordItem;
import net.mcreator.tnunlimited.item.CookedbaconItem;
import net.mcreator.tnunlimited.item.CookedEggItem;
import net.mcreator.tnunlimited.item.ContractItem;
import net.mcreator.tnunlimited.item.CoffeeItem;
import net.mcreator.tnunlimited.item.CoffeeFruitItem;
import net.mcreator.tnunlimited.item.CoffeeBeansItem;
import net.mcreator.tnunlimited.item.ChainmailPickaxeItem;
import net.mcreator.tnunlimited.item.CardialCharmItem;
import net.mcreator.tnunlimited.item.CaptainsHatItem;
import net.mcreator.tnunlimited.item.BulletProjectileItem;
import net.mcreator.tnunlimited.item.BulletItem;
import net.mcreator.tnunlimited.item.BuckshotPelletProjectileItem;
import net.mcreator.tnunlimited.item.BucklerItem;
import net.mcreator.tnunlimited.item.BomaindSickleItem;
import net.mcreator.tnunlimited.item.BlunderbussItem;
import net.mcreator.tnunlimited.item.BloodyRapierItem;
import net.mcreator.tnunlimited.item.BleedingHeartCharmItem;
import net.mcreator.tnunlimited.item.BaconItem;
import net.mcreator.tnunlimited.item.AntimonyStenItem;
import net.mcreator.tnunlimited.item.AntimonyItem;
import net.mcreator.tnunlimited.item.AntimonyArmorArmorItem;
import net.mcreator.tnunlimited.item.AarduimswordItem;
import net.mcreator.tnunlimited.item.AardiumpickaxeItem;
import net.mcreator.tnunlimited.item.AardiumingotItem;
import net.mcreator.tnunlimited.item.AardiumingoShovelItem;
import net.mcreator.tnunlimited.item.AardiumingoHoeItem;
import net.mcreator.tnunlimited.item.AardiumingoAxeItem;
import net.mcreator.tnunlimited.item.AardiumSickleItem;
import net.mcreator.tnunlimited.item.AardiumItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item WOODEN_SICKLE = register(new WoodenSickleItem());
	public static final Item STONE_SICKLE = register(new StoneSickleItem());
	public static final Item GOLD_SICKLE = register(new GoldSickleItem());
	public static final Item IRON_SICKLE = register(new IronSickleItem());
	public static final Item DIAMOND_SICKLE = register(new DiamondSickleItem());
	public static final Item NETHERITE_SICKLE = register(new NetheriteSickleItem());
	public static final Item BUCKLER = register(new BucklerItem());
	public static final Item GLOWINGICE = register(TnunlimitedModBlocks.GLOWINGICE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item AARDIUMORE = register(TnunlimitedModBlocks.AARDIUMORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ZINC_INGOT = register(new ZincIngotItem());
	public static final Item PEPPERONI_FOOD = register(new PepperoniFoodItem());
	public static final Item RAW_AARDIUM = register(new RawAardiumItem());
	public static final Item ZINC_SHEET = register(new ZincSheetItem());
	public static final Item PEPPERONI_INGOT = register(new PepperoniIngotItem());
	public static final Item AARDIUMINGOT = register(new AardiumingotItem());
	public static final Item ZINC_ORE = register(TnunlimitedModBlocks.ZINC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DONE_SWORD = register(new DoneSwordItem());
	public static final Item BLOCKOF_AARDIUM = register(TnunlimitedModBlocks.BLOCKOF_AARDIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GALVANIZED_SICKLE = register(new GalvanizedSickleItem());
	public static final Item GALVANIZED_SWORD = register(new GalvanizedSwordItem());
	public static final Item DONE_SHOVEL = register(new DoneShovelItem());
	public static final Item DONE_PICKAXE = register(new DonePickaxeItem());
	public static final Item GALVANIZED_PICKAXE = register(new GalvanizedPickaxeItem());
	public static final Item DONE = register(new DoneItem());
	public static final Item GALVANIZED_AXE = register(new GalvanizedAxeItem());
	public static final Item GALVANIZED_HOE = register(new GalvanizedHoeItem());
	public static final Item GALVANIZED_SHOVEL = register(new GalvanizedShovelItem());
	public static final Item DONE_HOE = register(new DoneHoeItem());
	public static final Item DONE_AXE = register(new DoneAxeItem());
	public static final Item DONE_BLOCK = register(TnunlimitedModBlocks.DONE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SUNRISE = register(new SunriseItem());
	public static final Item ZINC_BLOCK = register(TnunlimitedModBlocks.ZINC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BULLET = register(new BulletItem());
	public static final Item HOTCHOCOLATE = register(new HotchocolateItem());
	public static final Item REVOLVER = register(new RevolverItem());
	public static final Item MUG = register(new MugItem());
	public static final Item DONE_ARMOUR_HELMET = register(new DoneArmourItem.Helmet());
	public static final Item DONE_ARMOUR_CHESTPLATE = register(new DoneArmourItem.Chestplate());
	public static final Item DONE_ARMOUR_LEGGINGS = register(new DoneArmourItem.Leggings());
	public static final Item DONE_ARMOUR_BOOTS = register(new DoneArmourItem.Boots());
	public static final Item SNOWGLOVE = register(new SnowgloveItem());
	public static final Item PEPPERONI_ARMOUR_HELMET = register(new PepperoniArmourItem.Helmet());
	public static final Item AARDIUM_SICKLE = register(new AardiumSickleItem());
	public static final Item JAR_OF_INFINITE_JELLYBEANS = register(new JarOfInfiniteJellybeansItem());
	public static final Item BULLET_PROJECTILE = register(new BulletProjectileItem());
	public static final Item LEAD_ORE = register(TnunlimitedModBlocks.LEAD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GLASS_SKULL_HELMET = register(new GlassSkullItem.Helmet());
	public static final Item RAW_LEAD = register(new RawLeadItem());
	public static final Item FLAMERING = register(new FlameringItem());
	public static final Item LEAD_INGOT = register(new LeadIngotItem());
	public static final Item COFFEE_FRUIT = register(new CoffeeFruitItem());
	public static final Item COFFEE_PLANT = register(TnunlimitedModBlocks.COFFEE_PLANT, CreativeModeTab.TAB_DECORATIONS);
	public static final Item COFFEE_BEANS = register(new CoffeeBeansItem());
	public static final Item COFFEE = register(new CoffeeItem());
	public static final Item BLOCKOFRAWLEAD = register(TnunlimitedModBlocks.BLOCKOFRAWLEAD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLOCK_OF_LEAD = register(TnunlimitedModBlocks.BLOCK_OF_LEAD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SLOTHS_PILLOW = register(new SlothsPillowItem());
	public static final Item CONTRACT = register(new ContractItem());
	public static final Item LEAD_PICKAXE = register(new LeadPickaxeItem());
	public static final Item AARDIUM_HELMET = register(new AardiumItem.Helmet());
	public static final Item AARDIUM_CHESTPLATE = register(new AardiumItem.Chestplate());
	public static final Item AARDIUM_LEGGINGS = register(new AardiumItem.Leggings());
	public static final Item AARDIUM_BOOTS = register(new AardiumItem.Boots());
	public static final Item MOCHA = register(new MochaItem());
	public static final Item LEAD_AXE = register(new LeadAxeItem());
	public static final Item LEAD_SWORD = register(new LeadSwordItem());
	public static final Item LEAD_SHOVEL = register(new LeadShovelItem());
	public static final Item LEAD_HOE = register(new LeadHoeItem());
	public static final Item BLOODY_RAPIER = register(new BloodyRapierItem());
	public static final Item CRITICAL_SWORD = register(new CriticalSwordItem());
	public static final Item LEAD_SICKLE = register(new LeadSickleItem());
	public static final Item AARDUIMSWORD = register(new AarduimswordItem());
	public static final Item LEAD_ARMOR_HELMET = register(new LeadArmorItem.Helmet());
	public static final Item LEAD_ARMOR_CHESTPLATE = register(new LeadArmorItem.Chestplate());
	public static final Item LEAD_ARMOR_LEGGINGS = register(new LeadArmorItem.Leggings());
	public static final Item LEAD_ARMOR_BOOTS = register(new LeadArmorItem.Boots());
	public static final Item BOMAIND_SICKLE = register(new BomaindSickleItem());
	public static final Item ZINC_ARMOR_HELMET = register(new ZincArmorItem.Helmet());
	public static final Item ZINC_ARMOR_CHESTPLATE = register(new ZincArmorItem.Chestplate());
	public static final Item ZINC_ARMOR_LEGGINGS = register(new ZincArmorItem.Leggings());
	public static final Item ZINC_ARMOR_BOOTS = register(new ZincArmorItem.Boots());
	public static final Item AARDIUMPICKAXE = register(new AardiumpickaxeItem());
	public static final Item BLEEDING_HEART_CHARM = register(new BleedingHeartCharmItem());
	public static final Item ZINC_DEEPSLATE_ORE = register(TnunlimitedModBlocks.ZINC_DEEPSLATE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GALVANIZED_HARPOON = register(new GalvanizedHarpoonItem());
	public static final Item AARDIUMINGO_AXE = register(new AardiumingoAxeItem());
	public static final Item AARDIUMINGO_SHOVEL = register(new AardiumingoShovelItem());
	public static final Item DARK_WARHAMMER = register(new DarkWarhammerItem());
	public static final Item AARDIUMINGO_HOE = register(new AardiumingoHoeItem());
	public static final Item ROCK = register(new RockItem());
	public static final Item LEMONSTONE = register(TnunlimitedModBlocks.LEMONSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_LEMONSTONE = register(TnunlimitedModBlocks.POLISHED_LEMONSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHISELED_LEMONSTONE = register(TnunlimitedModBlocks.CHISELED_LEMONSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LEMONSTONE_SLAB = register(TnunlimitedModBlocks.LEMONSTONE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LEMONSTONE_STAIRS = register(TnunlimitedModBlocks.LEMONSTONE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_LEMONSTONE_SLAB = register(TnunlimitedModBlocks.POLISHED_LEMONSTONE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_LEMONSTONE_STAIRS = register(TnunlimitedModBlocks.POLISHED_LEMONSTONE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item HEATWAVE = register(new HeatwaveItem());
	public static final Item CHAINMAIL_PICKAXE = register(new ChainmailPickaxeItem());
	public static final Item GILDED_CHAINMAIL_PICKAXE = register(new GildedChainmailPickaxeItem());
	public static final Item DUNE_SPIDER = register(
			new SpawnEggItem(TnunlimitedModEntities.DUNE_SPIDER, -8773888, -3127296, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("dune_spider_spawn_egg"));
	public static final Item DESERT_CHITIN = register(new DesertChitinItem());
	public static final Item DESERT_INGOT = register(new DesertIngotItem());
	public static final Item PICKAXE_OF_LUMINESCENCE = register(new PickaxeOfLuminescenceItem());
	public static final Item SERENITY = register(new SerenityItem());
	public static final Item TORCH_OF_GUIDANCE = register(new TorchOfGuidanceItem());
	public static final Item MIRACLE_RUNE = register(new MiracleRuneItem());
	public static final Item COOKIE_BLOCK = register(TnunlimitedModBlocks.COOKIE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ANTIMONY = register(new AntimonyItem());
	public static final Item DESERT_ROACH_ARMOR_HELMET = register(new Desert_RoachArmorItem.Helmet());
	public static final Item DESERT_ROACH_ARMOR_CHESTPLATE = register(new Desert_RoachArmorItem.Chestplate());
	public static final Item DESERT_ROACH_ARMOR_LEGGINGS = register(new Desert_RoachArmorItem.Leggings());
	public static final Item DESERT_ROACH_ARMOR_BOOTS = register(new Desert_RoachArmorItem.Boots());
	public static final Item ANTIMONY_ARMOR_ARMOR_HELMET = register(new AntimonyArmorArmorItem.Helmet());
	public static final Item ANTIMONY_ARMOR_ARMOR_CHESTPLATE = register(new AntimonyArmorArmorItem.Chestplate());
	public static final Item ANTIMONY_ARMOR_ARMOR_LEGGINGS = register(new AntimonyArmorArmorItem.Leggings());
	public static final Item ANTIMONY_ARMOR_ARMOR_BOOTS = register(new AntimonyArmorArmorItem.Boots());
	public static final Item HAMBURGER = register(new HamburgerItem());
	public static final Item GOLDEN_HAMBURGER = register(new GoldenHamburgerItem());
	public static final Item WASTELANDISH_HOPPER = register(
			new SpawnEggItem(TnunlimitedModEntities.WASTELANDISH_HOPPER, -14739442, -12504291, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("wastelandish_hopper_spawn_egg"));
	public static final Item PET_CACTUS = register(new PetCactusItem());
	public static final Item GOLDEN_CROWN_HELMET = register(new GoldenCrownItem.Helmet());
	public static final Item PINACATE_BEETLE = register(
			new SpawnEggItem(TnunlimitedModEntities.PINACATE_BEETLE, -14870249, -3441, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("pinacate_beetle_spawn_egg"));
	public static final Item GOLDEN_CACTUS_PET = register(new GoldenCactusPetItem());
	public static final Item ENCHANTED_GOLDEN_CACTUS_PET = register(new EnchantedGoldenCactusPetItem());
	public static final Item REFORGEDAARDIUM = register(new ReforgedaardiumItem());
	public static final Item FRENCHTOAST = register(new FrenchtoastItem());
	public static final Item COOKED_EGG = register(new CookedEggItem());
	public static final Item PIRATE_HELMET = register(new PirateItem.Helmet());
	public static final Item PIRATE_CHESTPLATE = register(new PirateItem.Chestplate());
	public static final Item BLUNDERBUSS = register(new BlunderbussItem());
	public static final Item CAPTAINS_HAT_HELMET = register(new CaptainsHatItem.Helmet());
	public static final Item PIRATE_CAPTAIN = register(
			new SpawnEggItem(TnunlimitedModEntities.PIRATE_CAPTAIN, -15193325, -4512218, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("pirate_captain_spawn_egg"));
	public static final Item PIRATE_CREWMAN = register(
			new SpawnEggItem(TnunlimitedModEntities.PIRATE_CREWMAN, -10482419, -13482450, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("pirate_crewman_spawn_egg"));
	public static final Item BUCKSHOT_PELLET_PROJECTILE = register(new BuckshotPelletProjectileItem());
	public static final Item FLINTLOCK = register(new FlintlockItem());
	public static final Item CUTLASS = register(new CutlassItem());
	public static final Item PIRATE_DEADEYE = register(
			new SpawnEggItem(TnunlimitedModEntities.PIRATE_DEADEYE, -10482419, -13482450, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("pirate_deadeye_spawn_egg"));
	public static final Item BACON = register(new BaconItem());
	public static final Item NUBRIUM_ARMOUR_HELMET = register(new NubriumArmourItem.Helmet());
	public static final Item NUBRIUM_ARMOUR_CHESTPLATE = register(new NubriumArmourItem.Chestplate());
	public static final Item NUBRIUM_ARMOUR_LEGGINGS = register(new NubriumArmourItem.Leggings());
	public static final Item NUBRIUM_ARMOUR_BOOTS = register(new NubriumArmourItem.Boots());
	public static final Item COOKEDBACON = register(new CookedbaconItem());
	public static final Item NUBRIUM_SWORD = register(new NubriumSwordItem());
	public static final Item NUBRIUM = register(new NubriumItem());
	public static final Item NUBRIUM_PICKAXE = register(new NubriumPickaxeItem());
	public static final Item NUBRIUM_SHOVEL = register(new NubriumShovelItem());
	public static final Item NUBRIUM_AXE = register(new NubriumAxeItem());
	public static final Item NUBRIUM_HOE = register(new NubriumHoeItem());
	public static final Item ANTIMONY_STEN = register(new AntimonyStenItem());
	public static final Item FANCY_PANTS_LEGGINGS = register(new FancyPantsItem.Leggings());
	public static final Item FLEUR_BAND = register(new FleurBandItem());
	public static final Item REPULSIVE_FLOWER_REPLICA = register(new RepulsiveFlowerReplicaItem());
	public static final Item HONEYBEE_IDOL = register(new HoneybeeIdolItem());
	public static final Item NUBRIUM_ORE = register(TnunlimitedModBlocks.NUBRIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CARDIAL_CHARM = register(new CardialCharmItem());
	public static final Item HEARTCORE = register(new HeartcoreItem());
	public static final Item DECARDIAL_NECKLACE = register(new DecardialNecklaceItem());
	public static final Item IRON_BAND = register(new IronBandItem());
	public static final Item NUBRIUM_SICKLE = register(new NubriumSickleItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
