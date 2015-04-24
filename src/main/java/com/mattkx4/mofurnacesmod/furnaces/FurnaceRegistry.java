package com.mattkx4.mofurnacesmod.furnaces;

import com.mattkx4.mofurnacesmod.tileentities.TileEntityBrickFurnace;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRegistry {
	// Active and Idle Furnace Variables
	public static Block BrickFurnaceIdle;
	public static Block BrickFurnaceActive;
	
	/**
	 * Calls the initialization methods for the furnaces in this mod
	 */
	public static void mainRegistry() {
		initializeFurnace();
	}
	
	/**
	 * Calls the secondary initialization methods for the furnaces in this mod
	 */
	public static void secondaryRegistry() {
		registerFurnace2();
	}
	
	/**
	 * Initializes the furnaces and their specifications
	 */
	public static void initializeFurnace() {
		// Initialize the Brick Furnace
		GameRegistry.registerBlock((new BrickFurnace(false)).setHardness(3.5F).setStepSound(Block.soundTypePiston).setUnlocalizedName("brickfurnace_idle").setCreativeTab(CreativeTabs.tabDecorations), "brickfurnace_idle");
        GameRegistry.registerBlock((new BrickFurnace(true)).setHardness(3.5F).setStepSound(Block.soundTypePiston).setLightLevel(0.875F).setUnlocalizedName("brickfurnace_active"), "brickfurnace_active");
	}
	
	/**
	 * Assigns TileEntities and crafting recipes
	 */
	public static void registerFurnace2() {
		// Initialize the Crafting Recipe and Tile Entity Registry for the Brick Furnace
		GameRegistry.registerTileEntity(TileEntityBrickFurnace.class, "brickfurnace");
		GameRegistry.addRecipe(new ItemStack(BrickFurnaceIdle), new Object[] {
			"XXX", "X X", "XXX", 'X', Blocks.brick_block
		});
	}
}
