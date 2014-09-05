package uson.ata.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ataHoe extends ItemHoe{

	public ataHoe(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("ata_" + materialName + "Hoe");
		setTextureName("ata:" + materialName + "Hoe");
		setCreativeTab(CreativeTabs.tabTools);
	}

}
