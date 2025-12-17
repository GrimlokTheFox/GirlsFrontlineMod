package net.grimlokfox.girlsfrontline.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CPUItem extends Item {
	public CPUItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}