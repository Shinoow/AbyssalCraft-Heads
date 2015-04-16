package com.shinoow.acheads.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.shinoow.acheads.AbyssalCraftHeads;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabACHeads extends CreativeTabs {

	public TabACHeads(int id, String name) {
		super(id, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "itemgroup." + getTabLabel();
	}

	@Override
	public Item getTabIconItem() {
		return AbyssalCraftHeads.head;
	}

}