package uson.ata.blocks;

import java.util.Random;

import uson.ata.items.ataItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ataBlockOre extends Block {

	public ataBlockOre(String name) {
		super(Material.rock);
		setBlockName("ata_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName("ata:" + name);
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundTypePiston);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		if(this == ataBlocks.garnetOre) {
			return ataItems.garnet;
		}
		else if (this == ataBlocks.malachiteOre) {
			return ataItems.malachite;
		}
		else if (this == ataBlocks.sodaliteOre) {
			return ataItems.sodalite;
		}
		return null;
	}
}
