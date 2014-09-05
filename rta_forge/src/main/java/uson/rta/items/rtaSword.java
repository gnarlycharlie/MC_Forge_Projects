package uson.rta.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class rtaSword extends ItemSword {

	public rtaSword(ToolMaterial material, String materialName) {
		super(material);
		setUnlocalizedName("rta_" + materialName + "Sword");
		setTextureName("rta:" + materialName + "Sword");
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
