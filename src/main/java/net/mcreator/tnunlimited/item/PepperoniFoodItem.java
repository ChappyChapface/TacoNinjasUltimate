
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class PepperoniFoodItem extends Item {
	public PepperoniFoodItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.4f)

						.build()));
		setRegistryName("pepperoni_food");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 10;
	}
}
