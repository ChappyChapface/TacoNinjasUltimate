
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ChainmailPickaxeItem extends PickaxeItem {
	public ChainmailPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 150;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("chainmail_pickaxe");
	}
}
