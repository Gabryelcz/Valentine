// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmonsterheart<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "monsterheart"), "main");
	private final ModelPart Rightleg;
	private final ModelPart Leftleg;
	private final ModelPart Body;
	private final ModelPart Rightarm;
	private final ModelPart Leftarm;

	public Modelmonsterheart(ModelPart root) {
		this.Rightleg = root.getChild("Rightleg");
		this.Leftleg = root.getChild("Leftleg");
		this.Body = root.getChild("Body");
		this.Rightarm = root.getChild("Rightarm");
		this.Leftarm = root.getChild("Leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create().texOffs(20, 37)
				.addBox(-0.5F, -0.75F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 16.75F, -0.5F));

		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(16, 37)
				.addBox(-0.5F, -0.75F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 16.75F, -0.5F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, 0.0F, -2.0F, 10.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-4.0F, -1.0F, -3.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 5)
						.addBox(2.0F, 0.0F, -3.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 11)
						.addBox(-4.0F, 0.0F, -3.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 13)
						.addBox(-3.0F, 3.0F, -3.1F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 38)
						.addBox(-6.0F, -1.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 5)
						.addBox(4.0F, -1.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 23)
						.addBox(3.0F, -6.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 13)
						.addBox(-6.0F, -6.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
						.addBox(-7.0F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-3.0F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(2.0F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.0F, 6.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 15)
						.addBox(-8.0F, -4.0F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(1.0F, -4.0F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 29)
						.addBox(5.0F, 0.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 25)
						.addBox(-7.0F, 0.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 7)
						.addBox(-7.0F, -6.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 33)
						.addBox(-6.0F, -7.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 33)
						.addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(3.0F, -7.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 23)
						.addBox(2.0F, -6.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, 7.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, -0.5F));

		PartDefinition Rightarm = partdefinition.addOrReplaceChild("Rightarm", CubeListBuilder.create().texOffs(0, 33)
				.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.5F, 8.0F, -0.5F));

		PartDefinition Leftarm = partdefinition.addOrReplaceChild("Leftarm", CubeListBuilder.create().texOffs(24, 29)
				.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.5F, 8.0F, -0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Rightleg.render(poseStack, buffer, packedLight, packedOverlay);
		Leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Rightarm.render(poseStack, buffer, packedLight, packedOverlay);
		Leftarm.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}