
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

public class CardialCharmItem extends Item {
	public CardialCharmItem() {
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
		list.add(new TextComponent("+20% Max HP"));
=======
		list.add(new TextComponent("\u00A7aWhile Equipped:"));
		list.add(new TextComponent("\u00A77+20% Max HP"));
>>>>>>> branch 'master' of https://github.com/ChappyChapface/TacoNinjasUltimate
	}
}
