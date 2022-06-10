
package net.mcreator.tnunlimited.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class HarvestingEnchantment extends Enchantment {
	public HarvestingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == TnunlimitedModItems.WOODEN_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.STONE_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.GOLD_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.IRON_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.DIAMOND_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.NETHERITE_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.GALVANIZED_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.AARDIUM_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.BOMAIND_SICKLE.get())
			return true;
		if (stack.getItem() == TnunlimitedModItems.LEAD_SICKLE.get())
			return true;
		return false;
	}
}
