package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class LeadArmorHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(0);
		if (TnunlimitedModItems.LEAD_ARMOR_BOOTS == (entity instanceof LivingEntity _entGetArmor
				? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
				: ItemStack.EMPTY).getItem()
				&& TnunlimitedModItems.LEAD_ARMOR_LEGGINGS == (entity instanceof LivingEntity _entGetArmor
						? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
						: ItemStack.EMPTY).getItem()
				&& TnunlimitedModItems.LEAD_ARMOR_CHESTPLATE == (entity instanceof LivingEntity _entGetArmor
						? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
						: ItemStack.EMPTY).getItem()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 5) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 2, (true), (false)));
			}
		}
	}
}
