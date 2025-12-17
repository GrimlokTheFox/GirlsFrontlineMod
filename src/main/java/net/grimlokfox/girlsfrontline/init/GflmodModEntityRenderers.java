/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.grimlokfox.girlsfrontline.client.renderer.ProwlerRenderer;
import net.grimlokfox.girlsfrontline.client.renderer.ProwlerBulletRenderer;
import net.grimlokfox.girlsfrontline.client.renderer.ELIDInfectedRenderer;
import net.grimlokfox.girlsfrontline.client.renderer.DinergateRenderer;
import net.grimlokfox.girlsfrontline.client.renderer.DinergateMercRenderer;
import net.grimlokfox.girlsfrontline.client.renderer.DinergateGnKRenderer;
import net.grimlokfox.girlsfrontline.client.renderer.DinergateCustomRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GflmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GflmodModEntities.DINERGATE.get(), DinergateRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.ELID_INFECTED.get(), ELIDInfectedRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.DINERGATE_CUSTOM.get(), DinergateCustomRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.PISTOL_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.DINERGATE_MERC.get(), DinergateMercRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.DINERGATE_GN_K.get(), DinergateGnKRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.PROWLER.get(), ProwlerRenderer::new);
		event.registerEntityRenderer(GflmodModEntities.PROWLER_BULLET.get(), ProwlerBulletRenderer::new);
	}
}