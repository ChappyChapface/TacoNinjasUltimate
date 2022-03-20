
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class AardiumingoAxeItem extends AxeItem {
	public AardiumingoAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TnunlimitedModItems.AARDIUMINGOT));
			}
		}, 1, -2.6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("aardiumingo_axe");
	}
}
