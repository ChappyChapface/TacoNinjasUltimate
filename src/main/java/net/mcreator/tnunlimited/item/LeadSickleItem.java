
package net.mcreator.tnunlimited.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.tnunlimited.procedures.LeadHitProcedure;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class LeadSickleItem extends Item {
	public LeadSickleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1441));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
		return List.of().contains(blockstate.getBlock()) ? 5f : 1;
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		itemstack.hurtAndBreak(1, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		return true;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		itemstack.hurtAndBreak(2, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		LeadHitProcedure.execute(entity);
		return true;
	}

	@Override
	public int getEnchantmentValue() {
		return 21;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE,
					new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 5f, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED,
					new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", 6, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\uFFFDaAbility: \uFFFD7Attacks inflict Wither"));
	}
}
