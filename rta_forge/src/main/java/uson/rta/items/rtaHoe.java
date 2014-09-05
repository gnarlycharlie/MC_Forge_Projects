package uson.rta.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class rtaHoe extends ItemHoe{

	public rtaHoe(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("rta_" + materialName + "Hoe");
		setTextureName("rta:" + materialName + "Hoe");
		setCreativeTab(CreativeTabs.tabTools);
	}

}
