
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DesertIngotItem extends Item {
	public DesertIngotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("desert_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}