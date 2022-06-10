
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TnunlimitedModTabs {
	public static CreativeModeTab TAB_ACCESSORIES_TAB;

	public static void load() {
		TAB_ACCESSORIES_TAB = new CreativeModeTab("tabaccessories_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TnunlimitedModItems.PET_CACTUS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
