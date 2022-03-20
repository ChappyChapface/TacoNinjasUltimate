
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.tnunlimited.entity.WastelandishHopperEntity;
import net.mcreator.tnunlimited.entity.SnowgloveEntity;
import net.mcreator.tnunlimited.entity.RockEntity;
import net.mcreator.tnunlimited.entity.PirateDeadeyeEntity;
import net.mcreator.tnunlimited.entity.PirateCrewmanEntity;
import net.mcreator.tnunlimited.entity.PirateCaptainEntity;
import net.mcreator.tnunlimited.entity.PinacateBeetleEntity;
import net.mcreator.tnunlimited.entity.GildedBugEntity;
import net.mcreator.tnunlimited.entity.GalvanizedHarpoonEntity;
import net.mcreator.tnunlimited.entity.EnderProtectorEntity;
import net.mcreator.tnunlimited.entity.DuneSpiderEntity;
import net.mcreator.tnunlimited.entity.BulletProjectileEntity;
import net.mcreator.tnunlimited.entity.BuckshotPelletProjectileEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TnunlimitedModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<SnowgloveEntity> SNOWGLOVE = register("entitybulletsnowglove",
			EntityType.Builder.<SnowgloveEntity>of(SnowgloveEntity::new, MobCategory.MISC).setCustomClientFactory(SnowgloveEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BulletProjectileEntity> BULLET_PROJECTILE = register("entitybulletbullet_projectile",
			EntityType.Builder.<BulletProjectileEntity>of(BulletProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(BulletProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GalvanizedHarpoonEntity> GALVANIZED_HARPOON = register("entitybulletgalvanized_harpoon",
			EntityType.Builder.<GalvanizedHarpoonEntity>of(GalvanizedHarpoonEntity::new, MobCategory.MISC)
					.setCustomClientFactory(GalvanizedHarpoonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RockEntity> ROCK = register("entitybulletrock",
			EntityType.Builder.<RockEntity>of(RockEntity::new, MobCategory.MISC).setCustomClientFactory(RockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<DuneSpiderEntity> DUNE_SPIDER = register("dune_spider",
			EntityType.Builder.<DuneSpiderEntity>of(DuneSpiderEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DuneSpiderEntity::new).sized(1.6f, 1.05f));
	public static final EntityType<GildedBugEntity> GILDED_BUG = register("gilded_bug",
			EntityType.Builder.<GildedBugEntity>of(GildedBugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GildedBugEntity::new).fireImmune().sized(0.55f, 0.4f));
	public static final EntityType<WastelandishHopperEntity> WASTELANDISH_HOPPER = register("wastelandish_hopper",
			EntityType.Builder.<WastelandishHopperEntity>of(WastelandishHopperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(24).setUpdateInterval(3).setCustomClientFactory(WastelandishHopperEntity::new).sized(0.35f, 0.3f));
	public static final EntityType<PinacateBeetleEntity> PINACATE_BEETLE = register("pinacate_beetle",
			EntityType.Builder.<PinacateBeetleEntity>of(PinacateBeetleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinacateBeetleEntity::new).sized(1f, 0.69f));
	public static final EntityType<PirateCaptainEntity> PIRATE_CAPTAIN = register("pirate_captain",
			EntityType.Builder.<PirateCaptainEntity>of(PirateCaptainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PirateCaptainEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PirateCrewmanEntity> PIRATE_CREWMAN = register("pirate_crewman",
			EntityType.Builder.<PirateCrewmanEntity>of(PirateCrewmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PirateCrewmanEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<BuckshotPelletProjectileEntity> BUCKSHOT_PELLET_PROJECTILE = register("entitybulletbuckshot_pellet_projectile",
			EntityType.Builder.<BuckshotPelletProjectileEntity>of(BuckshotPelletProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(BuckshotPelletProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PirateDeadeyeEntity> PIRATE_DEADEYE = register("pirate_deadeye",
			EntityType.Builder.<PirateDeadeyeEntity>of(PirateDeadeyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PirateDeadeyeEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<EnderProtectorEntity> ENDER_PROTECTOR = register("ender_protector",
			EntityType.Builder.<EnderProtectorEntity>of(EnderProtectorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EnderProtectorEntity::new).fireImmune().sized(0.6f, 2.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DuneSpiderEntity.init();
			GildedBugEntity.init();
			WastelandishHopperEntity.init();
			PinacateBeetleEntity.init();
			PirateCaptainEntity.init();
			PirateCrewmanEntity.init();
			PirateDeadeyeEntity.init();
			EnderProtectorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DUNE_SPIDER, DuneSpiderEntity.createAttributes().build());
		event.put(GILDED_BUG, GildedBugEntity.createAttributes().build());
		event.put(WASTELANDISH_HOPPER, WastelandishHopperEntity.createAttributes().build());
		event.put(PINACATE_BEETLE, PinacateBeetleEntity.createAttributes().build());
		event.put(PIRATE_CAPTAIN, PirateCaptainEntity.createAttributes().build());
		event.put(PIRATE_CREWMAN, PirateCrewmanEntity.createAttributes().build());
		event.put(PIRATE_DEADEYE, PirateDeadeyeEntity.createAttributes().build());
		event.put(ENDER_PROTECTOR, EnderProtectorEntity.createAttributes().build());
	}
}
