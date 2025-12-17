package net.grimlokfox.girlsfrontline.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.grimlokfox.girlsfrontline.entity.ELIDInfectedEntity;

public class ELIDInfectedRenderer extends HumanoidMobRenderer<ELIDInfectedEntity, HumanoidModel<ELIDInfectedEntity>> {
	public ELIDInfectedRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ELIDInfectedEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ELIDInfectedEntity entity) {
		return ResourceLocation.parse("gflmod:textures/entities/elid_zombie_texture.png");
	}
}