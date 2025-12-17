package net.grimlokfox.girlsfrontline.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPistol<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("gflmod", "model_pistol"), "main");
	public final ModelPart Gun;

	public ModelPistol(ModelPart root) {
		this.Gun = root.getChild("Gun");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Gun = partdefinition.addOrReplaceChild("Gun",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-1.8F, -3.5F, 8.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-1.0F)).texOffs(0, 21)
						.addBox(-0.2F, -3.5F, 8.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-1.0F)).texOffs(0, 0).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(19, 24)
						.addBox(-2.5F, -1.0F, 5.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-3.0F)),
				PartPose.offset(0.0F, 20.0F, -5.0F));
		PartDefinition cube_r1 = Gun.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 1.0F, -1.0F, 4.0F, -1.0F, 3.0F, new CubeDeformation(-3.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 9.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Gun.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 21).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Gun.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(-0.4645F, -1.2426F, -0.5F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Gun.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}