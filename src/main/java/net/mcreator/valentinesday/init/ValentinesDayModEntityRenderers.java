
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valentinesday.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.valentinesday.client.renderer.MonsterheartRenderer;
import net.mcreator.valentinesday.client.renderer.HeartRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ValentinesDayModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ValentinesDayModEntities.HEART, HeartRenderer::new);
		event.registerEntityRenderer(ValentinesDayModEntities.MONSTERHEART, MonsterheartRenderer::new);
	}
}
