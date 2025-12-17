/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.grimlokfox.girlsfrontline.entity.ProwlerEntity;
import net.grimlokfox.girlsfrontline.entity.ProwlerBulletEntity;
import net.grimlokfox.girlsfrontline.entity.PistolBulletEntity;
import net.grimlokfox.girlsfrontline.entity.ELIDInfectedEntity;
import net.grimlokfox.girlsfrontline.entity.DinergateMercEntity;
import net.grimlokfox.girlsfrontline.entity.DinergateGnKEntity;
import net.grimlokfox.girlsfrontline.entity.DinergateEntity;
import net.grimlokfox.girlsfrontline.entity.DinergateCustomEntity;
import net.grimlokfox.girlsfrontline.GflmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GflmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GflmodMod.MODID);
	public static final RegistryObject<EntityType<DinergateEntity>> DINERGATE = register("dinergate",
			EntityType.Builder.<DinergateEntity>of(DinergateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DinergateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ELIDInfectedEntity>> ELID_INFECTED = register("elid_infected",
			EntityType.Builder.<ELIDInfectedEntity>of(ELIDInfectedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ELIDInfectedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DinergateCustomEntity>> DINERGATE_CUSTOM = register("dinergate_custom",
			EntityType.Builder.<DinergateCustomEntity>of(DinergateCustomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DinergateCustomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PistolBulletEntity>> PISTOL_BULLET = register("pistol_bullet",
			EntityType.Builder.<PistolBulletEntity>of(PistolBulletEntity::new, MobCategory.MISC).setCustomClientFactory(PistolBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DinergateMercEntity>> DINERGATE_MERC = register("dinergate_merc",
			EntityType.Builder.<DinergateMercEntity>of(DinergateMercEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DinergateMercEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DinergateGnKEntity>> DINERGATE_GN_K = register("dinergate_gn_k",
			EntityType.Builder.<DinergateGnKEntity>of(DinergateGnKEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DinergateGnKEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ProwlerEntity>> PROWLER = register("prowler",
			EntityType.Builder.<ProwlerEntity>of(ProwlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProwlerEntity::new)

					.sized(0.9f, 1.8f));
	public static final RegistryObject<EntityType<ProwlerBulletEntity>> PROWLER_BULLET = register("prowler_bullet",
			EntityType.Builder.<ProwlerBulletEntity>of(ProwlerBulletEntity::new, MobCategory.MISC).setCustomClientFactory(ProwlerBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DinergateEntity.init();
			ELIDInfectedEntity.init();
			DinergateCustomEntity.init();
			DinergateMercEntity.init();
			DinergateGnKEntity.init();
			ProwlerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DINERGATE.get(), DinergateEntity.createAttributes().build());
		event.put(ELID_INFECTED.get(), ELIDInfectedEntity.createAttributes().build());
		event.put(DINERGATE_CUSTOM.get(), DinergateCustomEntity.createAttributes().build());
		event.put(DINERGATE_MERC.get(), DinergateMercEntity.createAttributes().build());
		event.put(DINERGATE_GN_K.get(), DinergateGnKEntity.createAttributes().build());
		event.put(PROWLER.get(), ProwlerEntity.createAttributes().build());
	}
}