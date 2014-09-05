package uson.rta.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemAxe;

public class rtaAxe extends ItemAxe{

	public rtaAxe(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("rta_" + materialName + "Axe");
		setTextureName("rta:" + materialName + "Axe");
		setCreativeTab(CreativeTabs.tabTools);
	}
}
