package uson.rta.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class rtaShovel extends ItemSpade{

	public rtaShovel(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("rta_" + materialName + "Shovel");
		setTextureName("rta:" + materialName + "Shovel");
		setCreativeTab(CreativeTabs.tabTools);
	}

}
