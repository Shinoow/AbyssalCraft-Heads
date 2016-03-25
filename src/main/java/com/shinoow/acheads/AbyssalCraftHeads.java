package com.shinoow.acheads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Level;

import com.shinoow.acheads.common.items.ItemACHead;

@Mod(modid = AbyssalCraftHeads.modid, name = AbyssalCraftHeads.name, version = AbyssalCraftHeads.version, dependencies = "required-after:Forge@[forgeversion,);required-after:abyssalcraft", useMetadata = false,
updateJSON = "https://raw.githubusercontent.com/Shinoow/AbyssalCraft-Heads/master/version.json")
public class AbyssalCraftHeads {

	public static final String version = "1.3.0";
	public static final String modid = "acheads";
	public static final String name = "AbyssalCraft Heads";

	@Metadata(AbyssalCraftHeads.modid)
	public static ModMetadata metadata;

	@Instance(AbyssalCraftHeads.modid)
	public static AbyssalCraftHeads instance = new AbyssalCraftHeads();

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
		metadata.description = metadata.description +"\n\n\u00a76Supporters: "+getSupporterList()+"\u00a7r";

		instance = this;

		head = new ItemACHead();

		GameRegistry.registerItem(head, "head");

		if(FMLCommonHandler.instance().getEffectiveSide().isClient()){
			ResourceLocation[] res = new ResourceLocation[ItemACHead.names.length];
			for(int i = 0; i < ItemACHead.names.length; i++)
				res[i] = new ResourceLocation("acheads", "head_" + ItemACHead.names[i]);
			ModelBakery.registerItemVariants(head, res);
		}
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		if(FMLCommonHandler.instance().getEffectiveSide().isClient()){
			RenderItem render = Minecraft.getMinecraft().getRenderItem();
			for(int i = 0; i < ItemACHead.names.length; i++){
				render.getItemModelMesher().register(head, i, new ModelResourceLocation("acheads:head_" + ItemACHead.names[i], "inventory"));
			}
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}

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