
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class GalvanizedHoeItem extends HoeItem {
	public GalvanizedHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TnunlimitedModItems.ZINC_INGOT.get()));
			}
		}, 0, 0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
