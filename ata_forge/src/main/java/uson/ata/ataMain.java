package uson.ata;

import uson.ata.blocks.ataBlocks;
import uson.ata.items.ataItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="ata", name="Additional Tools and Armor", version="1.7.10")

public class ataMain {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ataBlocks.init();
		ataItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
