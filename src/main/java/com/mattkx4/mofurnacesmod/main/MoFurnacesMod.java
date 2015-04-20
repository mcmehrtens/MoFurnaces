package com.mattkx4.mofurnacesmod.main;

import com.mattkx4.mofurnacesmod.libs.ModVariables;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModVariables.MODID, name = ModVariables.NAME, version = ModVariables.VERSION)
public class MoFurnacesMod {
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	// Log Initialization Event
        System.out.println("[" + ModVariables.MODID + "] Initalizing mod...");
    }
}
