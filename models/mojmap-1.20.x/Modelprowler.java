// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelprowler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "prowler"), "main");
	private final ModelPart Body;
	private final ModelPart HeadRotator;
	private final ModelPart HeadMain;
	private final ModelPart Gun;
	private final ModelPart Head;
	private final ModelPart Horn;
	private final ModelPart BodyHolder;
	private final ModelPart LegFL;
	private final ModelPart Holder;
	private final ModelPart LegPart1;
	private final ModelPart LegPart2;
	private final ModelPart Wheel;
	private final ModelPart MovingProtectors;
	private final ModelPart LegBR;
	private final ModelPart Holder2;
	private final ModelPart LegPart3;
	private final ModelPart LegPart4;
	private final ModelPart Wheel2;
	private final ModelPart MovingProtectors2;
	private final ModelPart LegFR;
	private final ModelPart Holder3;
	private final ModelPart LegPart5;
	private final ModelPart LegPart6;
	private final ModelPart Wheel3;
	private final ModelPart MovingProtectors3;
	private final ModelPart LegBL;
	private final ModelPart Holder4;
	private final ModelPart LegPart7;
	private final ModelPart LegPart8;
	private final ModelPart Wheel4;
	private final ModelPart MovingProtectors4;

	public Modelprowler(ModelPart root) {
		this.Body = root.getChild("Body");
		this.HeadRotator = this.Body.getChild("HeadRotator");
		this.HeadMain = this.HeadRotator.getChild("HeadMain");
		this.Gun = this.HeadMain.getChild("Gun");
		this.Head = this.HeadMain.getChild("Head");
		this.Horn = this.Head.getChild("Horn");
		this.BodyHolder = this.Body.getChild("BodyHolder");
		this.LegFL = this.BodyHolder.getChild("LegFL");
		this.Holder = this.LegFL.getChild("Holder");
		this.LegPart1 = this.LegFL.getChild("LegPart1");
		this.LegPart2 = this.LegFL.getChild("LegPart2");
		this.Wheel = this.LegPart2.getChild("Wheel");
		this.MovingProtectors = this.LegPart2.getChild("MovingProtectors");
		this.LegBR = this.BodyHolder.getChild("LegBR");
		this.Holder2 = this.LegBR.getChild("Holder2");
		this.LegPart3 = this.LegBR.getChild("LegPart3");
		this.LegPart4 = this.LegBR.getChild("LegPart4");
		this.Wheel2 = this.LegPart4.getChild("Wheel2");
		this.MovingProtectors2 = this.LegPart4.getChild("MovingProtectors2");
		this.LegFR = this.BodyHolder.getChild("LegFR");
		this.Holder3 = this.LegFR.getChild("Holder3");
		this.LegPart5 = this.LegFR.getChild("LegPart5");
		this.LegPart6 = this.LegFR.getChild("LegPart6");
		this.Wheel3 = this.LegPart6.getChild("Wheel3");
		this.MovingProtectors3 = this.LegPart6.getChild("MovingProtectors3");
		this.LegBL = this.BodyHolder.getChild("LegBL");
		this.Holder4 = this.LegBL.getChild("Holder4");
		this.LegPart7 = this.LegBL.getChild("LegPart7");
		this.LegPart8 = this.LegBL.getChild("LegPart8");
		this.Wheel4 = this.LegPart8.getChild("Wheel4");
		this.MovingProtectors4 = this.LegPart8.getChild("MovingProtectors4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition HeadRotator = Body.addOrReplaceChild("HeadRotator", CubeListBuilder.create(),
				PartPose.offset(0.1753F, -8.5F, 0.0197F));

		PartDefinition cube_r1 = HeadRotator
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(72, 59).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition HeadMain = HeadRotator.addOrReplaceChild("HeadMain", CubeListBuilder.create(),
				PartPose.offset(2.0F, -1.5F, -4.0F));

		PartDefinition Gun = HeadMain.addOrReplaceChild("Gun",
				CubeListBuilder.create().texOffs(0, 67)
						.addBox(-6.1F, -3.0F, -0.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 68)
						.addBox(-6.0F, -2.5F, -5.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -1.0F, 0.0F));

		PartDefinition Head = HeadMain.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 15)
						.addBox(-5.0F, -6.0F, 0.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(30, 68)
						.addBox(-4.5F, -6.0F, -1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 68)
						.addBox(1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 24)
						.addBox(-3.5F, 0.0F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 54)
						.addBox(-4.0F, -5.5F, -1.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 68)
						.addBox(-4.0F, -4.1F, 8.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(58, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Horn = Head.addOrReplaceChild("Horn", CubeListBuilder.create().texOffs(64, 68).addBox(-3.5F,
				-7.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Horn
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(78, 46).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, -7.0F, 1.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Horn
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(24, 45).addBox(0.5F, -7.0F, -1.0F, 1.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, -6.0F, 2.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition BodyHolder = Body.addOrReplaceChild("BodyHolder",
				CubeListBuilder.create().texOffs(58, 29)
						.addBox(-3.0F, -7.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 29)
						.addBox(3.0F, -7.5F, -5.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 43)
						.addBox(-4.0F, -7.5F, -5.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(64, 9)
						.addBox(-1.5F, -8.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LegFL = BodyHolder.addOrReplaceChild("LegFL", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Holder = LegFL.addOrReplaceChild("Holder", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Holder.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(24, 75).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LegPart1 = LegFL.addOrReplaceChild("LegPart1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LegPart1.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(58, 36).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -11.0F, -8.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition LegPart2 = LegFL.addOrReplaceChild("LegPart2", CubeListBuilder.create().texOffs(56, 80).addBox(
				7.1F, -4.0F, -13.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = LegPart2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, -13.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition cube_r8 = LegPart2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -4.0F, -12.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition Wheel = LegPart2.addOrReplaceChild("Wheel",
				CubeListBuilder.create().texOffs(72, 65)
						.addBox(-0.5F, -1.9086F, -0.4397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 63)
						.addBox(-0.5F, -0.4341F, 0.9114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 74)
						.addBox(-0.5F, -0.5574F, -1.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 70)
						.addBox(-0.5F, 0.9171F, -0.5631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 50)
						.addBox(-1.0F, -1.0341F, -0.9886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5F, -1.5659F, -12.9114F));

		PartDefinition cube_r9 = Wheel.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(72, 72).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.8952F, -0.5457F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Wheel.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(70, 77).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.5708F, -0.8084F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Wheel.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(74, 24).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.8112F, -0.5765F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Wheel.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(64, 72).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5485F, -0.9009F, -0.829F, 0.0F, 0.0F));

		PartDefinition MovingProtectors = LegPart2.addOrReplaceChild("MovingProtectors",
				CubeListBuilder.create().texOffs(64, 54)
						.addBox(6.1F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 80)
						.addBox(3.9F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LegBR = BodyHolder.addOrReplaceChild("LegBR", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Holder2 = LegBR.addOrReplaceChild("Holder2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Holder2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(40, 79).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LegPart3 = LegBR.addOrReplaceChild("LegPart3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = LegPart3.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(58, 45).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -11.0F, -8.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition LegPart4 = LegBR.addOrReplaceChild("LegPart4", CubeListBuilder.create().texOffs(52, 80).addBox(
				7.1F, -4.0F, -13.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = LegPart4.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, -13.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition cube_r16 = LegPart4.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -4.0F, -12.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition Wheel2 = LegPart4.addOrReplaceChild("Wheel2",
				CubeListBuilder.create().texOffs(78, 81)
						.addBox(-0.5F, -1.9086F, -0.4397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 23)
						.addBox(-0.5F, -0.4341F, 0.9114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 25)
						.addBox(-0.5F, -0.5574F, -1.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 27)
						.addBox(-0.5F, 0.9171F, -0.5631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 77)
						.addBox(-1.0F, -1.0341F, -0.9886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5F, -1.5659F, -12.9114F));

		PartDefinition cube_r17 = Wheel2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(46, 74).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.8952F, -0.5457F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Wheel2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(78, 9).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.5708F, -0.8084F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Wheel2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(38, 74).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.8112F, -0.5765F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Wheel2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(30, 74).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5485F, -0.9009F, -0.829F, 0.0F, 0.0F));

		PartDefinition MovingProtectors2 = LegPart4.addOrReplaceChild("MovingProtectors2",
				CubeListBuilder.create().texOffs(24, 54)
						.addBox(6.1F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 80)
						.addBox(3.9F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LegFR = BodyHolder.addOrReplaceChild("LegFR", CubeListBuilder.create(),
				PartPose.offset(-12.0F, 0.0F, 0.0F));

		PartDefinition Holder3 = LegFR.addOrReplaceChild("Holder3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Holder3.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(46, 79).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -6.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LegPart5 = LegFR.addOrReplaceChild("LegPart5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r22 = LegPart5.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(60, 15).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -11.0F, -8.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition LegPart6 = LegFR.addOrReplaceChild("LegPart6", CubeListBuilder.create().texOffs(80, 59).addBox(
				4.1F, -4.0F, -13.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r23 = LegPart6.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, -13.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition cube_r24 = LegPart6.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(24, 57).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -4.0F, -12.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition Wheel3 = LegPart6.addOrReplaceChild("Wheel3",
				CubeListBuilder.create().texOffs(82, 29)
						.addBox(-0.5F, -1.9086F, -0.4397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 31)
						.addBox(-0.5F, -0.4341F, 0.9114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 33)
						.addBox(-0.5F, -0.5574F, -1.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 54)
						.addBox(-0.5F, 0.9171F, -0.5631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 79)
						.addBox(-1.0F, -1.0341F, -0.9886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, -1.5659F, -12.9114F));

		PartDefinition cube_r25 = Wheel3.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(16, 75).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.8952F, -0.5457F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Wheel3.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(78, 36).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.5708F, -0.8084F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Wheel3.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(8, 75).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.8112F, -0.5765F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Wheel3.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5485F, -0.9009F, -0.829F, 0.0F, 0.0F));

		PartDefinition MovingProtectors3 = LegPart6.addOrReplaceChild("MovingProtectors3",
				CubeListBuilder.create().texOffs(80, 14)
						.addBox(6.1F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 17)
						.addBox(3.9F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LegBL = BodyHolder.addOrReplaceChild("LegBL", CubeListBuilder.create(),
				PartPose.offsetAndRotation(12.0F, 0.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Holder4 = LegBL.addOrReplaceChild("Holder4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Holder4.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -6.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LegPart7 = LegBL.addOrReplaceChild("LegPart7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r30 = LegPart7.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -11.0F, -8.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition LegPart8 = LegBL.addOrReplaceChild("LegPart8", CubeListBuilder.create().texOffs(80, 70).addBox(
				4.1F, -4.0F, -13.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r31 = LegPart8.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, -13.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition cube_r32 = LegPart8.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(48, 57).addBox(-1.0F, -1.0F, -1.6F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -4.0F, -12.0F, 1.0641F, 0.0F, 0.0F));

		PartDefinition Wheel4 = LegPart8.addOrReplaceChild("Wheel4",
				CubeListBuilder.create().texOffs(82, 56)
						.addBox(-0.5F, -1.9086F, -0.4397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 82)
						.addBox(-0.5F, -0.4341F, 0.9114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 82)
						.addBox(-0.5F, -0.5574F, -1.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 82)
						.addBox(-0.5F, 0.9171F, -0.5631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 79)
						.addBox(-1.0F, -1.0341F, -0.9886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, -1.5659F, -12.9114F));

		PartDefinition cube_r33 = Wheel4.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(62, 77).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.8952F, -0.5457F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Wheel4.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(78, 41).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.5708F, -0.8084F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Wheel4.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(76, 65).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.8112F, -0.5765F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Wheel4.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(54, 75).addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5485F, -0.9009F, -0.829F, 0.0F, 0.0F));

		PartDefinition MovingProtectors4 = LegPart8.addOrReplaceChild("MovingProtectors4",
				CubeListBuilder.create().texOffs(18, 80)
						.addBox(6.1F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 20)
						.addBox(3.9F, -4.0F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}