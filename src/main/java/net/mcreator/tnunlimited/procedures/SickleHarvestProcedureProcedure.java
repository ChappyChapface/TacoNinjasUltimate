package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;
import net.mcreator.tnunlimited.init.TnunlimitedModEnchantments;
import net.mcreator.tnunlimited.init.TnunlimitedModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SickleHarvestProcedureProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("forge:sickle")))) {
			if (blockstate.getBlock() == Blocks.CARROTS && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 7) {
				for (int index0 = 0; index0 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index0++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.CARROT));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.GRASS || blockstate.getBlock() == Blocks.TALL_GRASS) {
				for (int index1 = 0; index1 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index1++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.WHEAT_SEEDS));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.WHEAT && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 7) {
				for (int index2 = 0; index2 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index2++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.WHEAT));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.MELON) {
				for (int index3 = 0; index3 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index3++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.MELON_SLICE));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.SWEET_BERRY_BUSH && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 3) {
				for (int index4 = 0; index4 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index4++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.SWEET_BERRIES));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.BEETROOTS && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 3) {
				for (int index5 = 0; index5 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index5++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BEETROOT));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.NETHER_WART && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 3) {
				for (int index6 = 0; index6 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index6++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHER_WART));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.COCOA && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 2) {
				for (int index7 = 0; index7 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index7++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COCOA_BEANS));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == Blocks.POTATOES && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "age") == 7) {
				for (int index8 = 0; index8 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index8++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.POTATO));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (blockstate.getBlock() == TnunlimitedModBlocks.COFFEE_PLANT.get()) {
				for (int index9 = 0; index9 < (int) (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index9++) {
					if (Math.random() >= 0.9 - EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.HARVESTING.get(),
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) / 10) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TnunlimitedModItems.COFFEE_FRUIT.get()));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
