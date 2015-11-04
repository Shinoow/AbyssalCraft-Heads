package com.shinoow.acheads.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.util.*;

import com.shinoow.acheads.AbyssalCraftHeads;

import cpw.mods.fml.relauncher.*;

public class ItemACHead extends Item {

	private static String[] names = {"abyssalzombie", "endabyssalzombie", "evilpig", "jzahar", "abyssalnitegolem",
		"dreadedabyssalnitegolem", "dreadguard", "spectraldragon", "asorah", "shadowcreature", "shadowmonster",
		"dreadling", "dreadspawn", "demonpig", "chagaroth", "chagarothfist", "shadowbeast", "sacthoth", "skeletongoliath",
		"chagarothspawn", "antiabyssalzombie", "antibat", "antichicken", "anticow", "anticreeper", "antighoul", "antipig",
		"antiplayer", "antiskeleton", "antispider", "antizombie", "omotholghoul", "remnant", "remnantbanker",
		"remnantblacksmith", "remnantbutcher", "remnantlibrarian", "remnantmasterblacksmith", "remnantpriest",
		"jzaharminion", "lessershoggoth", "abyssalshoggoth", "dreadedshoggoth", "omotholshoggoth", "shadowshoggoth",
		"evilcow", "evilchicken", "demoncow", "demonchicken"};

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public ItemACHead(){
		setMaxDamage(0);
		setUnlocalizedName("head");
		setTextureName("head");
		setHasSubtypes(true);
		setCreativeTab(AbyssalCraftHeads.tabACHeads);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int i)
	{
		int j = MathHelper.clamp_int(i, 0, names.length);
		return this.icons[j];
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1Item, CreativeTabs par2CreativeTab, List par3List){
		for(int i = 0; i < names.length; ++i)
			par3List.add(new ItemStack(par1Item, 1, i));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[names.length];
		for(int i = 0; i < names.length; i++)
			icons[i] = par1IconRegister.registerIcon(AbyssalCraftHeads.modid + ":" + getIconString() + "_" + names[i]);
	}

	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack) {
		return StatCollector.translateToLocal(getUnlocalizedName() + "." + names[par1ItemStack.getItemDamage()] + ".name");
	}
}