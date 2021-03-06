
package net.mcreator.tnunlimited.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

public class HeartcoreItem extends Item {
	public HeartcoreItem() {
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(1).rarity(Rarity.RARE));
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
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
<<<<<<< HEAD
		list.add(new TextComponent("\uFFFDaWhile Equipped: \uFFFD7"));
		list.add(new TextComponent("Will heal you before taking damage when below 20% HP"));
		list.add(new TextComponent("Also grants temporary Absorption"));
		list.add(new TextComponent("\uFFFDcCooldown: \uFFFD730 Minutes"));
=======
		list.add(new TextComponent("\u00A7aWhile Equipped:"));
		list.add(new TextComponent("\u00A77Will heal you before taking damage when below 20% HP"));
		list.add(new TextComponent("\u00A77Also grants temporary Absorption"));
		list.add(new TextComponent("\u00A7cCooldown: \u00A7730 Minutes"));
>>>>>>> branch 'master' of https://github.com/ChappyChapface/TacoNinjasUltimate
	}
}
