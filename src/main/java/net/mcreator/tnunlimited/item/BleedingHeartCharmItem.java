
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.tnunlimited.procedures.BleedingHeartCharmUseProcedure;

import java.util.List;

public class BleedingHeartCharmItem extends Item {
	public BleedingHeartCharmItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(50).rarity(Rarity.COMMON));
		setRegistryName("bleeding_heart_charm");
	}

	@Override
	public int getEnchantmentValue() {
		return 20;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7aAbility: Heals 7 HP upon use"));
		list.add(new TextComponent("\u00A7cCooldown: 30 Seconds"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BleedingHeartCharmUseProcedure.execute(entity, itemstack);
		return ar;
	}
}
