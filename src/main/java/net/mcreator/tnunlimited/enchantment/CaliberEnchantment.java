
package net.mcreator.tnunlimited.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class CaliberEnchantment extends Enchantment {
	public CaliberEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == TnunlimitedModItems.REVOLVER)
			return true;
		if (stack.getItem() == TnunlimitedModItems.BLUNDERBUSS)
			return true;
		if (stack.getItem() == TnunlimitedModItems.FLINTLOCK)
			return true;
		return false;
	}
}
