package com.mattkx4.mofurnacesmod.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mattkx4.mofurnacesmod.libs.ModVariables;

@Mod(modid = ModVariables.MODID, name = ModVariables.NAME, version = ModVariables.VERSION)
public class MoFurnacesMod {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	// Log Initialization Event
        System.out.println("[" + ModVariables.MODID + "] Initalizing mod...");
    }
}
