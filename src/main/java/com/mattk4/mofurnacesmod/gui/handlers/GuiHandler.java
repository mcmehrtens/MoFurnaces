package com.mattk4.mofurnacesmod.gui.handlers;

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
		TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
		
		if (tileEntity != null) {
			switch(ID) {
			case 0: return new ContainerBrickFurnace(player.inventory, (TileEntityBrickFurnace)tileEntity);
			}
		}
		
		return null;
	}
	
	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (tileEntity != null) {
              switch(ID) {
              case 0: return new GuiBrickFurnace(player.inventory, (TileEntityBrickFurnace)tileEntity);
              }
        }

        return null;
    }
}
