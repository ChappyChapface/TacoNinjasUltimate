
package net.mcreator.tnunlimited.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Collections;

public class PolishedLemonstoneStairsBlock extends StairBlock {
	public PolishedLemonstoneStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f, 10f).dynamicShape())
				.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f, 10f).dynamicShape());
		setRegistryName("polished_lemonstone_stairs");
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
