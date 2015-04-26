package com.mattk4.mofurnacesmod.gui.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.mattk4.mofurnacesmod.gui.furnacecontainers.ContainerBrickFurnace;
import com.mattk4.mofurnacesmod.gui.furnaceguis.GuiBrickFurnace;
import com.mattkx4.mofurnacesmod.tileentities.TileEntityBrickFurnace;

public class GuiHandler implements IGuiHandler {
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
		switch (ID) {
			case GuiIds.BRICK_FURNACE_ID:
				if (entity instanceof TileEntityBrickFurnace) {
					return new ContainerBrickFurnace(player.inventory, (TileEntityBrickFurnace) entity);
				}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
		switch (ID) {
			case GuiIds.BRICK_FURNACE_ID:
				if (entity instanceof TileEntityBrickFurnace) {
					return new GuiBrickFurnace(player.inventory,
							(TileEntityBrickFurnace) entity);
				}
		}
		return null;
	}
}
