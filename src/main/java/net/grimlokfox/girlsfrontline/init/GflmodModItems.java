/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.grimlokfox.girlsfrontline.item.SangvisTacticalModuleItem;
import net.grimlokfox.girlsfrontline.item.RationItem;
import net.grimlokfox.girlsfrontline.item.PistolItem;
import net.grimlokfox.girlsfrontline.item.PartsItem;
import net.grimlokfox.girlsfrontline.item.MercDinergateSpawnerItem;
import net.grimlokfox.girlsfrontline.item.ManpowerItem;
import net.grimlokfox.girlsfrontline.item.GriffinTokenItem;
import net.grimlokfox.girlsfrontline.item.GnKDinergateSpawnerItem;
import net.grimlokfox.girlsfrontline.item.CustomDinergateSpawnerItem;
import net.grimlokfox.girlsfrontline.item.CPUItem;
import net.grimlokfox.girlsfrontline.item.BulletItem;
import net.grimlokfox.girlsfrontline.item.AmmoItem;
import net.grimlokfox.girlsfrontline.GflmodMod;

public class GflmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GflmodMod.MODID);
	public static final RegistryObject<Item> MANPOWER = REGISTRY.register("manpower", () -> new ManpowerItem());
	public static final RegistryObject<Item> DINERGATE_SPAWN_EGG = REGISTRY.register("dinergate_spawn_egg", () -> new ForgeSpawnEggItem(GflmodModEntities.DINERGATE, -13421773, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> ELID_INFECTED_SPAWN_EGG = REGISTRY.register("elid_infected_spawn_egg", () -> new ForgeSpawnEggItem(GflmodModEntities.ELID_INFECTED, -16737997, -2505559, new Item.Properties()));
	public static final RegistryObject<Item> PARTS = REGISTRY.register("parts", () -> new PartsItem());
	public static final RegistryObject<Item> AMMO = REGISTRY.register("ammo", () -> new AmmoItem());
	public static final RegistryObject<Item> RATION = REGISTRY.register("ration", () -> new RationItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> SANGVIS_TACTICAL_MODULE = REGISTRY.register("sangvis_tactical_module", () -> new SangvisTacticalModuleItem());
	public static final RegistryObject<Item> CUSTOM_DINERGATE_SPAWNER = REGISTRY.register("custom_dinergate_spawner", () -> new CustomDinergateSpawnerItem());
	public static final RegistryObject<Item> MERC_DINERGATE_SPAWNER = REGISTRY.register("merc_dinergate_spawner", () -> new MercDinergateSpawnerItem());
	public static final RegistryObject<Item> GN_K_DINERGATE_SPAWNER = REGISTRY.register("gn_k_dinergate_spawner", () -> new GnKDinergateSpawnerItem());
	public static final RegistryObject<Item> GRIFFIN_TOKEN = REGISTRY.register("griffin_token", () -> new GriffinTokenItem());
	public static final RegistryObject<Item> COLLAPSE_BLOCK = block(GflmodModBlocks.COLLAPSE_BLOCK, new Item.Properties().stacksTo(32).rarity(Rarity.RARE));
	public static final RegistryObject<Item> CPU = REGISTRY.register("cpu", () -> new CPUItem());
	public static final RegistryObject<Item> PROWLER_SPAWN_EGG = REGISTRY.register("prowler_spawn_egg", () -> new ForgeSpawnEggItem(GflmodModEntities.PROWLER, -13421773, -6750055, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}