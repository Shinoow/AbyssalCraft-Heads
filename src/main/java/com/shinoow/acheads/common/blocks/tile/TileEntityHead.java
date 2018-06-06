package com.shinoow.acheads.common.blocks.tile;

import com.shinoow.abyssalcraft.lib.tileentity.TEDirectional;

import net.minecraft.nbt.NBTTagCompound;

public class TileEntityHead extends TEDirectional {

	private int type;

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readFromNBT(nbttagcompound);

		type = nbttagcompound.getInteger("Type");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);

		nbttagcompound.setInteger("Type", type);

		return nbttagcompound;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
