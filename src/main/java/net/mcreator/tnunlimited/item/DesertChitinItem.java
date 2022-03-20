
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DesertChitinItem extends Item {
	public DesertChitinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("desert_chitin");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
