package uson.ata.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ataItem extends Item{
	public ataItem(String name) {
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("ata_" + name);
		setTextureName("ata:" + name);
	}
}
