package com.mattkx4.mofurnacesmod.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.mattk4.mofurnacesmod.gui.handlers.GuiHandler;
import com.mattkx4.mofurnacesmod.furnaces.FurnaceRegistry;
import com.mattkx4.mofurnacesmod.libs.ModVariables;

@Mod(modid = ModVariables.MODID, name = ModVariables.NAME, version = ModVariables.VERSION)
public class MoFurnacesMod {
	// Local GUI Handler object
	private IGuiHandler guiHandler = new GuiHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Calls the registry methods
		FurnaceRegistry.mainRegistry();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	// Calls the secondary registry methods
    	FurnaceRegistry.secondaryRegistry();
    	
		// register items for rendering
		if (event.getSide() == Side.CLIENT) {
			FurnaceRegistry.doItemRegistry();
		}
		
		// Register GUI handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandler);
    }
}
