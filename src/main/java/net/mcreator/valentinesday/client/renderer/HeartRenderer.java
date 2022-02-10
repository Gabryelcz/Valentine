package net.mcreator.valentinesday.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.valentinesday.entity.HeartEntity;
import net.mcreator.valentinesday.client.model.Modelheart;

public class HeartRenderer extends MobRenderer<HeartEntity, Modelheart<HeartEntity>> {
	public HeartRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelheart(context.bakeLayer(Modelheart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeartEntity entity) {
		return new ResourceLocation("valentines_day:textures/heart.png");
	}
}
