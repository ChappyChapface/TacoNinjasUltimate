
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.tnunlimited.init.TnunlimitedModTabs;

import java.util.List;

public class DecardialNecklaceItem extends Item {
	public DecardialNecklaceItem() {
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(1).rarity(Rarity.UNCOMMON));
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
<<<<<<< HEAD
		list.add(new TextComponent("\uFFFDaWhile Equipped: \uFFFD7"));
		list.add(new TextComponent("-80% Max HP"));
		list.add(new TextComponent("Grants strong Absorption that regenerates every morning"));
=======
		list.add(new TextComponent("\u00A7aWhile Equipped: \u00A77-80% Max HP"));
		list.add(new TextComponent("\u00A77Grants strong Absorption that regenerates every morning"));
>>>>>>> branch 'master' of https://github.com/ChappyChapface/TacoNinjasUltimate
	}
}
