
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.tnunlimited.init.TnunlimitedModSounds;

public class SunriseItem extends RecordItem {
	public SunriseItem() {
		super(0, TnunlimitedModSounds.REGISTRY.get(new ResourceLocation("tnunlimited:sunrise2")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
