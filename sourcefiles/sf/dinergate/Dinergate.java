// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Dinergate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dinergate"), "main");
	private final ModelPart Body;
	private final ModelPart Gun;
	private final ModelPart Tail;
	private final ModelPart GunPart;
	private final ModelPart BackLegL;
	private final ModelPart BackLegR;
	private final ModelPart FrontLegL;
	private final ModelPart FrontLegR;

	public Dinergate(ModelPart root) {
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

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-2.0F, -1.0F, -0.9F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 29).addBox(-2.0F, -2.5F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 27).addBox(-3.5F, -3.9F, -1.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 21.0F, -3.0F));

		PartDefinition Gun = partdefinition.addOrReplaceChild("Gun", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Tail = Gun.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = Tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(17, 6).addBox(-2.5F, -6.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(1.0F, -5.0F, -1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition GunPart = Gun.addOrReplaceChild("GunPart", CubeListBuilder.create().texOffs(1, 17).addBox(-1.0F, -11.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(19, 16).addBox(-0.5F, -11.4F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 19).addBox(-0.5F, -9.6F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BackLegL = partdefinition.addOrReplaceChild("BackLegL", CubeListBuilder.create().texOffs(8, 24).addBox(1.0F, -4.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-1.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition jointL_r1 = BackLegL.addOrReplaceChild("jointL_r1", CubeListBuilder.create().texOffs(10, 17).addBox(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition BackLegR = partdefinition.addOrReplaceChild("BackLegR", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(-4.0F, -4.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-1.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition jointR_r1 = BackLegR.addOrReplaceChild("jointR_r1", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition FrontLegL = partdefinition.addOrReplaceChild("FrontLegL", CubeListBuilder.create().texOffs(13, 10).addBox(1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition FrontLegR = partdefinition.addOrReplaceChild("FrontLegR", CubeListBuilder.create().texOffs(13, 10).mirror().addBox(1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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
}