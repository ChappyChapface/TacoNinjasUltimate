
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ZincSheetItem extends Item {
	public ZincSheetItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("zinc_sheet");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
