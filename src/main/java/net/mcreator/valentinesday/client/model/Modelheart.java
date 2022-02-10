package net.mcreator.valentinesday.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelheart<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("valentines_day", "modelheart"), "main");
	public final ModelPart Body;
	public final ModelPart Rightarm;
	public final ModelPart Leftarm;
	public final ModelPart Rightleg;
	public final ModelPart Leftleg;

	public Modelheart(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Rightarm = root.getChild("Rightarm");
		this.Leftarm = root.getChild("Leftarm");
		this.Rightleg = root.getChild("Rightleg");
		this.Leftleg = root.getChild("Leftleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(10, 17).addBox(-0.9375F, -3.3125F, 3.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 7)
						.addBox(-0.9375F, -4.3125F, 2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9375F, -4.3125F, 1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(0.0625F, -3.3125F, 2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 6)
						.addBox(0.0625F, -3.3125F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 12)
						.addBox(0.0625F, -2.3125F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-0.9375F, -3.3125F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 15)
						.addBox(-0.9375F, -3.3125F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 4)
						.addBox(0.0625F, -3.3125F, -3.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-0.9375F, -4.3125F, -3.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 13)
						.addBox(0.0625F, -3.3125F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-0.9375F, -4.3125F, -2.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(0.0625F, -2.3125F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 7)
						.addBox(-0.9375F, -3.3125F, -1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 10)
						.addBox(0.0625F, -1.3125F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-0.9375F, -2.3125F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0625F, 18.3125F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Rightarm = partdefinition.addOrReplaceChild("Rightarm",
				CubeListBuilder.create().texOffs(15, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 16.5F, 1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Leftarm = partdefinition.addOrReplaceChild("Leftarm", CubeListBuilder.create(), PartPose.offset(4.9F, 16.5F, 1.0F));
		PartDefinition cube_r1 = Leftarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(4, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Rightleg = partdefinition
				.addOrReplaceChild(
						"Rightleg", CubeListBuilder.create().texOffs(8, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(6, 0).addBox(-0.5F, 5.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-1.5F, 19.0F, 1.0F));
		PartDefinition Leftleg = partdefinition
				.addOrReplaceChild(
						"Leftleg", CubeListBuilder.create().texOffs(6, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(2, 0).addBox(-0.5F, 5.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(1.5F, 19.0F, 1.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Rightarm.render(poseStack, buffer, packedLight, packedOverlay);
		Leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		Rightleg.render(poseStack, buffer, packedLight, packedOverlay);
		Leftleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
