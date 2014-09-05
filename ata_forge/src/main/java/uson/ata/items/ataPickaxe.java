package uson.ata.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ataPickaxe extends ItemPickaxe{

	public ataPickaxe(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("ata_" + materialName + "Pickaxe");
		setTextureName("ata:" + materialName + "Pickaxe");
		setCreativeTab(CreativeTabs.tabTools);
	}

}
