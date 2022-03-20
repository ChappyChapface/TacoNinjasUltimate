
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.tnunlimited.init.TnunlimitedModTabs;

import java.util.List;

public class HeartcoreItem extends Item {
	public HeartcoreItem() {
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("heartcore");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7aWhile Equipped: \u00A77"));
		list.add(new TextComponent("Will heal you before taking damage when below 20% HP"));
		list.add(new TextComponent("Also grants temporary Absorption"));
		list.add(new TextComponent("\u00A7cCooldown: \u00A7730 Minutes"));
	}
}
