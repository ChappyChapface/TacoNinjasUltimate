
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class AardiumingoShovelItem extends ShovelItem {
	public AardiumingoShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		setRegistryName("aardiumingo_shovel");
	}
}
