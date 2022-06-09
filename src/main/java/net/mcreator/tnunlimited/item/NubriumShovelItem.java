
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.tnunlimited.procedures.NubriumSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;

import java.util.List;

public class NubriumShovelItem extends ShovelItem {
	public NubriumShovelItem() {
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

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\uFFFDaAbility: \uFFFD7Attacks inflict Slowness"));
	}
}
