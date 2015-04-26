package com.mattkx4.mofurnacesmod.furnaces;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mattkx4.mofurnacesmod.libs.ModVariables;
import com.mattkx4.mofurnacesmod.tileentities.TileEntityBrickFurnace;

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
	 * Calls the item registry so the furnaces will show-up in the item/invetory lists
	 */
	public static void doItemRegistry() {
		registerItems();
	}
	
	/**
	 * Initializes the furnaces and their specifications
	 */
	public static void initializeFurnace() {
		// Initialize the Brick Furnace
		BrickFurnaceIdle = new BrickFurnace(false).setHardness(3.5F).setStepSound(Block.soundTypePiston).setUnlocalizedName("brickfurnace_idle").setCreativeTab(CreativeTabs.tabDecorations);
		BrickFurnaceActive = new BrickFurnace(true).setHardness(3.5F).setStepSound(Block.soundTypePiston).setLightLevel(0.875F).setUnlocalizedName("brickfurnace_active");
		GameRegistry.registerBlock(BrickFurnaceIdle, "brickfurnace_idle");
        GameRegistry.registerBlock(BrickFurnaceActive, "brickfurnace_active");
	}
	
	/**
	 * Assigns TileEntities and crafting recipes
	 */
	public static void registerFurnace2() {
		// Initialize the Crafting Recipe and Tile Entity Registry for the Brick Furnace
		GameRegistry.registerTileEntity(TileEntityBrickFurnace.class, "brickfurnace_tileentity");
		GameRegistry.addRecipe(new ItemStack(BrickFurnaceIdle), new Object[] {
			"XXX", "X X", "XXX", 'X', Blocks.brick_block
		});
	}
	
	/*
	 * private method to register items
	 */
	private static void registerItems() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		// Add Brick Furnaces
		//
		ModelBakery.addVariantName(Item.getItemFromBlock(BrickFurnaceIdle), new String[] { ModVariables.MODID + ":" + "brickfurnace_idle" });
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(BrickFurnaceIdle), 0, new ModelResourceLocation(ModVariables.MODID + ":" + "brickfurnace_idle", "inventory"));		
		ModelBakery.addVariantName(Item.getItemFromBlock(BrickFurnaceActive), new String[] { ModVariables.MODID + ":" + "brickfurnace_active" });
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(BrickFurnaceActive), 0, new ModelResourceLocation(ModVariables.MODID + ":" + "brickfurnace_active", "inventory"));		
	}
}
