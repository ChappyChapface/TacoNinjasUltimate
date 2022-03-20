
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.tnunlimited.procedures.NubriumSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class NubriumSwordItem extends SwordItem {
	public NubriumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2531;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TnunlimitedModItems.NUBRIUM));
			}
		}, 3, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("nubrium_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		NubriumSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
