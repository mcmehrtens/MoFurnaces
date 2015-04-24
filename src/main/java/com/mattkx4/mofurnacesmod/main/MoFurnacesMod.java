package com.mattkx4.mofurnacesmod.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mattkx4.mofurnacesmod.furnaces.FurnaceRegistry;
import com.mattkx4.mofurnacesmod.libs.ModVariables;

@Mod(modid = ModVariables.MODID, name = ModVariables.NAME, version = ModVariables.VERSION)
public class MoFurnacesMod {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Calls the registry methods
		FurnaceRegistry.mainRegistry();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	// Calls the secondary registry methods
    	FurnaceRegistry.secondaryRegistry();
    }
}
