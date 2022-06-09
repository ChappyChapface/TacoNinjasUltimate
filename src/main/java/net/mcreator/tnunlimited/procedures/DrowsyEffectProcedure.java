package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tnunlimited.init.TnunlimitedModMobEffects;

public class DrowsyEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TnunlimitedModMobEffects.DROWSY.get())
							? _livEnt.getEffect(TnunlimitedModMobEffects.DROWSY.get()).getAmplifier()
							: 0,
					(false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TnunlimitedModMobEffects.DROWSY.get())
							? _livEnt.getEffect(TnunlimitedModMobEffects.DROWSY.get()).getAmplifier()
							: 0,
					(false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 10,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TnunlimitedModMobEffects.DROWSY.get())
							? _livEnt.getEffect(TnunlimitedModMobEffects.DROWSY.get()).getAmplifier()
							: 0,
					(false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TnunlimitedModMobEffects.DROWSY.get())
							? _livEnt.getEffect(TnunlimitedModMobEffects.DROWSY.get()).getAmplifier()
							: 0,
					(false), (false)));
	}
}
