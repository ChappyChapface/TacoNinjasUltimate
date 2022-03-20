
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class HamburgerItem extends Item {
	public HamburgerItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(20).saturationMod(2f)

						.meat().build()));
		setRegistryName("hamburger");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 64;
	}
}
