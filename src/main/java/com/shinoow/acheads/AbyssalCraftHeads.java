package com.shinoow.acheads;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.shinoow.acheads.common.items.ItemACHead;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = AbyssalCraftHeads.modid, name = AbyssalCraftHeads.name, version = AbyssalCraftHeads.version, dependencies = "required-after:Forge@[forgeversion,);required-after:abyssalcraft", useMetadata = false)
public class AbyssalCraftHeads {

	public static final String version = "1.2.0";
	public static final String modid = "acheads";
	public static final String name = "AbyssalCraft Heads";

	@Metadata(AbyssalCraftHeads.modid)
	public static ModMetadata metadata;

	@Instance(AbyssalCraftHeads.modid)
	public static AbyssalCraftHeads intstance = new AbyssalCraftHeads();

	public static Item head;

	public static final CreativeTabs tabACHeads = new CreativeTabs("acheads"){

		@Override
		public Item getTabIconItem() {

			return head;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		metadata = event.getModMetadata();

		head = new ItemACHead();

		GameRegistry.registerItem(head, "head");
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}