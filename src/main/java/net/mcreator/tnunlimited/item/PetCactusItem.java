
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.tnunlimited.procedures.PetCactusEntitySwingsItemProcedure;
import net.mcreator.tnunlimited.init.TnunlimitedModTabs;

import java.util.List;

public class PetCactusItem extends Item {
	public PetCactusItem() {
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("pet_cactus");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7aWhen Equipped:"));
		list.add(new TextComponent("\u00A77Attackers take 50% recoil damage"));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		PetCactusEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
