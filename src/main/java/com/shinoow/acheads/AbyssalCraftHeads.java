package com.shinoow.acheads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.logging.log4j.Level;

import com.shinoow.acheads.client.render.TileEntityHeadRenderer;
import com.shinoow.acheads.common.blocks.BlockHead;
import com.shinoow.acheads.common.blocks.tile.TileEntityHead;
import com.shinoow.acheads.common.items.ItemACHead;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = AbyssalCraftHeads.modid, name = AbyssalCraftHeads.name, version = AbyssalCraftHeads.version, dependencies = "required-after:forge@[forgeversion,);required-after:abyssalcraft@[1.9.4.9,]", useMetadata = false,
acceptedMinecraftVersions = "[1.12.2]", updateJSON = "https://raw.githubusercontent.com/Shinoow/AbyssalCraft-Heads/master/version.json", certificateFingerprint = "cert_fingerprint")
public class AbyssalCraftHeads {

	public static final String version = "ach_version";
	public static final String modid = "acheads";
	public static final String name = "AbyssalCraft Heads";

	@Metadata(AbyssalCraftHeads.modid)
	public static ModMetadata metadata;

	@Instance(AbyssalCraftHeads.modid)
	public static AbyssalCraftHeads instance = new AbyssalCraftHeads();

	public static Block head;

	public static final CreativeTabs tabACHeads = new CreativeTabs("acheads"){

		@Override
		public ItemStack getTabIconItem() {

			return new ItemStack(head);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		metadata = event.getModMetadata();
		metadata.description = metadata.description +"\n\n\u00a76Supporters: "+getSupporterList()+"\u00a7r";
		MinecraftForge.EVENT_BUS.register(this);

		instance = this;

		head = new BlockHead();

		GameRegistry.registerTileEntity(TileEntityHead.class, modid + ":head");

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
		FMLLog.log("AbyssalCraft Heads", Level.WARN, "Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been tampered with. This version will NOT be supported by the author!");
	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event){
		event.getRegistry().register(head.setRegistryName(new ResourceLocation(modid, "head")));
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event){
		event.getRegistry().register(new ItemACHead(head).setRegistryName(new ResourceLocation(modid, "head")));
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event){
		ResourceLocation[] res = new ResourceLocation[ItemACHead.names.length];
		for(int i = 0; i < ItemACHead.names.length; i++)
			res[i] = new ResourceLocation("acheads", "head_" + ItemACHead.names[i]);
		ModelBakery.registerItemVariants(Item.getItemFromBlock(AbyssalCraftHeads.head), res);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHead.class, new TileEntityHeadRenderer());
		ModelLoader.setCustomStateMapper(AbyssalCraftHeads.head, new StateMapperBase(){
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("acheads:head_"+ItemACHead.names[state.getValue(BlockHead.TYPE)], "normal");
			}});
		for(int i = 0; i < ItemACHead.names.length; i++)
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(AbyssalCraftHeads.head), i, new ModelResourceLocation("acheads:head_" + ItemACHead.names[i], "inventory"));
	}

	private String getSupporterList(){
		BufferedReader nameFile;
		String names = "";
		try {
			nameFile = new BufferedReader(new InputStreamReader(new URL("https://raw.githubusercontent.com/Shinoow/AbyssalCraft/master/supporters.txt").openStream()));

			names = nameFile.readLine();
			nameFile.close();

		} catch (IOException e) {
			FMLLog.log("AbyssalCraft Heads", Level.ERROR, "Failed to fetch supporter list, using local version!");
			names = "Enfalas, Saice Shoop";
		}

		return names;
	}
}