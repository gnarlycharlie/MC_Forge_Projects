package uson.ata.blocks;

import java.util.Random;

import uson.ata.items.ataItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ataBlockMass extends Block {

	public ataBlockMass(String name) {
		super(Material.iron);
		setBlockName("ata_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName("ata:" + name);
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(soundTypeMetal);
		setHarvestLevel("pickaxe", 1);
	}
}
