
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.tnunlimited.procedures.ContractEffectProcedure;
import net.mcreator.tnunlimited.init.TnunlimitedModTabs;

import java.util.List;

public class ContractItem extends Item {
	public ContractItem() {
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7aWhile Equipped:"));
		list.add(new TextComponent("\u00A77Gain Luck II"));
		list.add(new TextComponent("Reduced HP"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ContractEffectProcedure.execute(entity);
	}
}
