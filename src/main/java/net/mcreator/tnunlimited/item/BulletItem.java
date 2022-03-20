
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("bullet");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
