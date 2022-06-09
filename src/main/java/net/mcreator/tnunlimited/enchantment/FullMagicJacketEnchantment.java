
package net.mcreator.tnunlimited.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class FullMagicJacketEnchantment extends Enchantment {
	public FullMagicJacketEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == TnunlimitedModItems.REVOLVER.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.BLUNDERBUSS.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.FLINTLOCK.get())
			return true;
		return false;
	}
}
