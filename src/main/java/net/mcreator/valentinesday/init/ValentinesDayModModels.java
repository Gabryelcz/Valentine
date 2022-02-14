
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valentinesday.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.valentinesday.client.model.Modelmonsterheart;
import net.mcreator.valentinesday.client.model.Modelheart;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ValentinesDayModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelheart.LAYER_LOCATION, Modelheart::createBodyLayer);
		event.registerLayerDefinition(Modelmonsterheart.LAYER_LOCATION, Modelmonsterheart::createBodyLayer);
	}
}
