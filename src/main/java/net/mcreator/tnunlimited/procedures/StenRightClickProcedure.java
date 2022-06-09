package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.tnunlimited.init.TnunlimitedModParticleTypes;
import net.mcreator.tnunlimited.init.TnunlimitedModItems;
import net.mcreator.tnunlimited.init.TnunlimitedModEnchantments;
import net.mcreator.tnunlimited.entity.BulletProjectileEntity;

import java.util.Random;

public class StenRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean hit = false;
		double num = 0;
		double d = 0;
		double n = 0;
		if (itemstack.getOrCreateTag().getDouble("ammo") > 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMOKE, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 5, 0.2, 0.2, 0.2, 0.02);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (3
						/ (1 + EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.TRIGGER_HAPPY.get(), itemstack) * 0.25)));
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				BulletProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3,
						(float) (1 + 0.15 * EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.CALIBER.get(), itemstack)), 0);
			}
			if (itemstack.getOrCreateTag().getDouble("ammo") > 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_shoot")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_shoot")),
								SoundSource.PLAYERS, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_last_shot")), SoundSource.PLAYERS, 1,
								1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_last_shot")),
								SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
			if (0.1 < Math.random()
					/ (1 + EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.FULL_MAGIC_JACKET.get(), itemstack) + 0.25)) {
				itemstack.getOrCreateTag().putDouble("ammo", (itemstack.getOrCreateTag().getDouble("ammo") - 1));
			} else if (0 == EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.FULL_MAGIC_JACKET.get(), itemstack)) {
				itemstack.getOrCreateTag().putDouble("ammo", (itemstack.getOrCreateTag().getDouble("ammo") - 1));
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (TnunlimitedModParticleTypes.BULLET_SHELL.get()), (entity.getX()), (entity.getY() + 1),
						(entity.getZ()), 1, 0.2, 0.2, 0.2, 0.3);
			if (EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.KICKBACK.get(), itemstack) >= 1) {
				n = (((-2) * (1 + 0.25 * EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.CALIBER.get(), itemstack)))
						/ (1 + EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.SHARP_SHOOTER.get(), itemstack) * 0.25)) * 0.33;
				d = n * Math.sin((90 - entity.getXRot()) * (3.14159265 / 180));
				entity.setDeltaMovement(
						new Vec3((entity.getDeltaMovement().x() + 0.4 * d * Math.sin((90 - (entity.getYRot() + 90)) * (3.14159265 / 180))),
								(entity.getDeltaMovement().y() + 0.4 * ((n * Math.sin((entity.getXRot() + 180) * (3.14159265 / 180))) / 2)),
								(entity.getDeltaMovement().z() + 0.4 * d * Math.sin((entity.getYRot() + 90) * (3.14159265 / 180)))));
			} else {
				entity.getPersistentData().putDouble("yawrecoil",
						(((Math.random() * 7 - 2)
								* (1 + 0.25 * EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.CALIBER.get(), itemstack)))
								/ (1 + EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.SHARP_SHOOTER.get(), itemstack) * 0.25)));
				entity.getPersistentData().putDouble("pitchrecoil",
						(((Math.random() * 3 * (-1) + 1)
								* (1 + 0.25 * EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.CALIBER.get(), itemstack)))
								/ (1 + EnchantmentHelper.getItemEnchantmentLevel(TnunlimitedModEnchantments.SHARP_SHOOTER.get(), itemstack) * 0.25)));
			}
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		} else {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) && (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(TnunlimitedModItems.BULLET.get()))
					: false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				hit = true;
				num = 0;
				while (hit && num < 32) {
					if (entity instanceof Player _playerHasItem
							? _playerHasItem.getInventory().contains(new ItemStack(TnunlimitedModItems.BULLET.get()))
							: false) {
						num = num + 1;
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(TnunlimitedModItems.BULLET.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
					} else {
						hit = false;
					}
				}
				if (num >= 0) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_reload")), SoundSource.PLAYERS,
									1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_reload")),
									SoundSource.PLAYERS, 1, 1, false);
						}
					}
					itemstack.getOrCreateTag().putDouble("ammo", num);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 60);
				}
			} else if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
								.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_reload")), SoundSource.PLAYERS, 1,
								1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:revolver_reload")),
								SoundSource.PLAYERS, 1, 1, false);
					}
				}
				itemstack.getOrCreateTag().putDouble("ammo", 32);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			}
		}
	}
}
