package uson.ata.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public final class ataBlocks {
	public static ataBlockOre garnetOre;
	public static ataBlockOre malachiteOre;
	public static ataBlockOre sodaliteOre;
	public static ataBlockMass garnetBlock;
	public static ataBlockMass malachiteBlock;
	public static ataBlockMass sodaliteBlock;
	
	public static void init() {
		garnetOre = new ataBlockOre("garnetOre");
		malachiteOre = new ataBlockOre("malachiteOre");
		sodaliteOre = new ataBlockOre("sodaliteOre");
		garnetBlock = new ataBlockMass("garnetBlock");
		malachiteBlock = new ataBlockMass("malachiteBlock");
		sodaliteBlock = new ataBlockMass("sodaliteBlock");
		
		GameRegistry.registerBlock(garnetOre, "garnetOre");
		GameRegistry.registerBlock(malachiteOre, "malachiteOre");
		GameRegistry.registerBlock(sodaliteOre, "sodaliteOre");
		GameRegistry.registerBlock(garnetBlock, "garnetBlock");
		GameRegistry.registerBlock(malachiteBlock, "malachiteBlock");
		GameRegistry.registerBlock(sodaliteBlock, "sodaliteBlock");
		
		GameRegistry.registerWorldGenerator(new ataGenerator(), 0);
	}
}
