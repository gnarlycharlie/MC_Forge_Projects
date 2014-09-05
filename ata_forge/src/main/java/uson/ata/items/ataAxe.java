package uson.ata.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemAxe;

public class ataAxe extends ItemAxe{

	public ataAxe(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("ata_" + materialName + "Axe");
		setTextureName("ata:" + materialName + "Axe");
		setCreativeTab(CreativeTabs.tabTools);
	}
}
