package net.mcreator.valentinesday.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.valentinesday.entity.MonsterheartEntity;
import net.mcreator.valentinesday.client.model.Modelmonsterheart;

public class MonsterheartRenderer extends MobRenderer<MonsterheartEntity, Modelmonsterheart<MonsterheartEntity>> {
	public MonsterheartRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmonsterheart(context.bakeLayer(Modelmonsterheart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonsterheartEntity entity) {
		return new ResourceLocation("valentines_day:textures/monsterheart.png");
	}
}
