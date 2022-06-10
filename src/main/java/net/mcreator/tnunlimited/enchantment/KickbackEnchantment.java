
package net.mcreator.tnunlimited.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class KickbackEnchantment extends Enchantment {
	public KickbackEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
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
