
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valentinesday.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.valentinesday.item.ValentineSwordItem;
import net.mcreator.valentinesday.item.ThankyouItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValentinesDayModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item THANKYOU = register(new ThankyouItem());
	public static final Item HEART = register(
			new SpawnEggItem(ValentinesDayModEntities.HEART, -65536, -10289152, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("heart_spawn_egg"));
	public static final Item VALENTINE_SWORD = register(new ValentineSwordItem());
	public static final Item MONSTERHEART = register(
			new SpawnEggItem(ValentinesDayModEntities.MONSTERHEART, -13434880, -65536, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("monsterheart_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
