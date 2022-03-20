
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CoffeeBeansItem extends Item {
	public CoffeeBeansItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("coffee_beans");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
