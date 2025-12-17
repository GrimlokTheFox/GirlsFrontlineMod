/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.grimlokfox.girlsfrontline.GflmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GflmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GflmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> T_DOLLS = REGISTRY.register("t_dolls",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gflmod.t_dolls")).icon(() -> new ItemStack(GflmodModItems.MANPOWER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GflmodModItems.MANPOWER.get());
				tabData.accept(GflmodModItems.CPU.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> GFL = REGISTRY.register("gfl",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gflmod.gfl")).icon(() -> new ItemStack(GflmodModItems.PARTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GflmodModItems.DINERGATE_SPAWN_EGG.get());
				tabData.accept(GflmodModItems.ELID_INFECTED_SPAWN_EGG.get());
				tabData.accept(GflmodModItems.PARTS.get());
				tabData.accept(GflmodModItems.AMMO.get());
				tabData.accept(GflmodModItems.RATION.get());
				tabData.accept(GflmodModItems.PISTOL.get());
				tabData.accept(GflmodModBlocks.COLLAPSE_BLOCK.get().asItem());
				tabData.accept(GflmodModItems.PROWLER_SPAWN_EGG.get());
			}).withSearchBar().withTabsBefore(T_DOLLS.getId()).build());
	public static final RegistryObject<CreativeModeTab> SANGVIS_FERRI = REGISTRY.register("sangvis_ferri",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gflmod.sangvis_ferri")).icon(() -> new ItemStack(GflmodModItems.SANGVIS_TACTICAL_MODULE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GflmodModItems.SANGVIS_TACTICAL_MODULE.get());
				tabData.accept(GflmodModItems.CUSTOM_DINERGATE_SPAWNER.get());
			}).withSearchBar().withTabsBefore(GFL.getId()).build());
	public static final RegistryObject<CreativeModeTab> MERC = REGISTRY.register("merc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gflmod.merc")).icon(() -> new ItemStack(GflmodModItems.PISTOL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GflmodModItems.MERC_DINERGATE_SPAWNER.get());
			}).withSearchBar().withTabsBefore(SANGVIS_FERRI.getId()).build());
	public static final RegistryObject<CreativeModeTab> GRIFFINN_KRYUGER = REGISTRY.register("griffinn_kryuger",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gflmod.griffinn_kryuger")).icon(() -> new ItemStack(GflmodModItems.GRIFFIN_TOKEN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GflmodModItems.GN_K_DINERGATE_SPAWNER.get());
			}).withSearchBar().withTabsBefore(MERC.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GflmodModItems.PISTOL.get());
		}
	}
}