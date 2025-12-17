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
public class ModelDinergate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("gflmod", "model_dinergate"), "main");
	public final ModelPart Body;
	public final ModelPart Gun;
	public final ModelPart Tail;
	public final ModelPart GunPart;
	public final ModelPart BackLegL;
	public final ModelPart BackLegR;
	public final ModelPart FrontLegL;
	public final ModelPart FrontLegR;

	public ModelDinergate(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Gun = root.getChild("Gun");
		this.Tail = this.Gun.getChild("Tail");
		this.GunPart = this.Gun.getChild("GunPart");
		this.BackLegL = root.getChild("BackLegL");
		this.BackLegR = root.getChild("BackLegR");
		this.FrontLegL = root.getChild("FrontLegL");
		this.FrontLegR = root.getChild("FrontLegR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-2.0F, -1.0F, -0.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-2.0F, -2.5F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 27).addBox(-3.5F, -3.9F, -1.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 21.0F, -3.0F));
		PartDefinition Gun = partdefinition.addOrReplaceChild("Gun", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Tail = Gun.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tail_r1 = Tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(17, 6).addBox(-2.5F, -6.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(1.0F, -5.0F, -1.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition GunPart = Gun.addOrReplaceChild("GunPart", CubeListBuilder.create().texOffs(1, 17).addBox(-1.0F, -11.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 16)
				.addBox(-0.5F, -11.4F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 19).addBox(-0.5F, -9.6F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BackLegL = partdefinition.addOrReplaceChild("BackLegL", CubeListBuilder.create().texOffs(8, 24).addBox(1.0F, -4.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-1.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition jointL_r1 = BackLegL.addOrReplaceChild("jointL_r1", CubeListBuilder.create().texOffs(10, 17).addBox(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition BackLegR = partdefinition.addOrReplaceChild("BackLegR", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(-4.0F, -4.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-1.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition jointR_r1 = BackLegR.addOrReplaceChild("jointR_r1", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -2.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition FrontLegL = partdefinition.addOrReplaceChild("FrontLegL", CubeListBuilder.create().texOffs(13, 10).addBox(1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition FrontLegR = partdefinition.addOrReplaceChild("FrontLegR", CubeListBuilder.create().texOffs(13, 10).mirror().addBox(1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Gun.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}