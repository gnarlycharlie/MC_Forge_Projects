package uson.rta;

import uson.rta.items.rtaItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="rta", name="Refined Tools and Armor", version="1.7.10")

public class rtaMain {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		rtaItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
