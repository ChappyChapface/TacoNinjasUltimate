
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class DoneAxeItem extends AxeItem {
	public DoneAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1240;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
