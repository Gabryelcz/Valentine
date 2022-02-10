
package net.mcreator.valentinesday.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ThankyouItem extends ShearsItem {
	public ThankyouItem() {
		super(new Item.Properties().tab(null).durability(5).fireResistant());
		setRegistryName("thankyou");
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 0f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("how?!"));
	}
}
