package uson.ata.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ataShovel extends ItemSpade{

	public ataShovel(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("ata_" + materialName + "Shovel");
		setTextureName("ata:" + materialName + "Shovel");
		setCreativeTab(CreativeTabs.tabTools);
	}

}
