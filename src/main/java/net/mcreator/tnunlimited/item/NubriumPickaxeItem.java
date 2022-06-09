
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.tnunlimited.procedures.NubriumSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class NubriumPickaxeItem extends PickaxeItem {
	public NubriumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2531;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TnunlimitedModItems.NUBRIUM.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		NubriumSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
