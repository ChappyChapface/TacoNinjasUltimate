
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class NubriumAxeItem extends AxeItem {
	public NubriumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2531;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.9f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("nubrium_axe");
	}
}
