package uson.rta.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class rtaPickaxe extends ItemPickaxe{

	public rtaPickaxe(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("rta_" + materialName + "Pickaxe");
		setTextureName("rta:" + materialName + "Pickaxe");
		setCreativeTab(CreativeTabs.tabTools);
	}
	

}
