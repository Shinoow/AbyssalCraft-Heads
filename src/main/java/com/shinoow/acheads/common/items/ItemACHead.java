package com.shinoow.acheads.common.items;

import java.util.List;

import com.shinoow.acheads.AbyssalCraftHeads;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemACHead extends ItemBlock {

	public static String[] names = {"abyssalzombie", "evilpig", "jzahar", "abyssalnitegolem",
			"dreadedabyssalnitegolem", "dreadguard", "spectraldragon", "asorah", "shadowcreature", "shadowmonster",
			"dreadling", "dreadspawn", "demonpig", "chagaroth", "chagarothfist", "shadowbeast", "sacthoth", "skeletongoliath",
			"chagarothspawn", "antiabyssalzombie", "antibat", "antichicken", "anticow", "anticreeper", "antighoul", "antipig",
			"antiplayer", "antiskeleton", "antispider", "antizombie", "omotholghoul", "remnant", "remnantbanker",
			"remnantblacksmith", "remnantbutcher", "remnantlibrarian", "remnantmasterblacksmith", "remnantpriest",
			"jzaharminion", "lessershoggoth", "abyssalshoggoth", "dreadedshoggoth", "omotholshoggoth", "shadowshoggoth",
			"evilcow", "evilchicken", "demoncow", "demonchicken", "evilsheep", "demonsheep", "coraliumsquid", "chagarothfistleft"};

	public ItemACHead(Block block){
		super(block);
		setMaxDamage(0);
		setUnlocalizedName("head");
		setHasSubtypes(true);
		setCreativeTab(AbyssalCraftHeads.tabACHeads);
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1Item, CreativeTabs par2CreativeTab, List par3List){
		for(int i = 0; i < names.length; ++i)
			par3List.add(new ItemStack(par1Item, 1, i));
	}

	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack) {
		return I18n.translateToLocal(getUnlocalizedName() + "." + names[par1ItemStack.getItemDamage()] + ".name");
	}
}