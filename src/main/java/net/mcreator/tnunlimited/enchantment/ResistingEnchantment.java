
package net.mcreator.tnunlimited.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class ResistingEnchantment extends Enchantment {
	public ResistingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEARABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.VANISHING_CURSE)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == TnunlimitedModItems.MIRACLE_RUNE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.PET_CACTUS.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.GOLDEN_CACTUS_PET.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.ENCHANTED_GOLDEN_CACTUS_PET.get())
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
