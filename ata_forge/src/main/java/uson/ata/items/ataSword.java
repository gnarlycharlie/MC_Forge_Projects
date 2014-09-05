package uson.ata.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ataSword extends ItemSword {

	public ataSword(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("ata_" + materialName + "Sword");
		setTextureName("ata:" + materialName + "Sword");
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
