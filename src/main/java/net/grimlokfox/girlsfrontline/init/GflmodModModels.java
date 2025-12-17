/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.grimlokfox.girlsfrontline.client.model.Modelprowler;
import net.grimlokfox.girlsfrontline.client.model.ModelSFBullet;
import net.grimlokfox.girlsfrontline.client.model.ModelPistol;
import net.grimlokfox.girlsfrontline.client.model.ModelDinergate;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GflmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPistol.LAYER_LOCATION, ModelPistol::createBodyLayer);
		event.registerLayerDefinition(ModelSFBullet.LAYER_LOCATION, ModelSFBullet::createBodyLayer);
		event.registerLayerDefinition(ModelDinergate.LAYER_LOCATION, ModelDinergate::createBodyLayer);
		event.registerLayerDefinition(Modelprowler.LAYER_LOCATION, Modelprowler::createBodyLayer);
	}
}