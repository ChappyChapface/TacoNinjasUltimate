
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

public class MiracleRuneItem extends Item {
	public MiracleRuneItem() {
<<<<<<< HEAD
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
=======
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
>>>>>>> branch 'master' of https://github.com/ChappyChapface/TacoNinjasUltimate
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
		list.add(new TextComponent("\uFFFDaWhen Equipped:"));
		list.add(new TextComponent("\uFFFD7Grants Resistance II while sneaking"));
		list.add(new TextComponent("\uFFFD7Also gives Slowness II and Weakness while sneaking"));
	}
}
