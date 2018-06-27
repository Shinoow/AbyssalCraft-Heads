package com.shinoow.acheads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.logging.log4j.Level;

import com.shinoow.abyssalcraft.lib.ACLoot;
import com.shinoow.acheads.client.render.TileEntityHeadRenderer;
import com.shinoow.acheads.common.blocks.BlockHead;
import com.shinoow.acheads.common.blocks.tile.TileEntityHead;
import com.shinoow.acheads.common.items.ItemACHead;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.KilledByPlayer;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.conditions.RandomChanceWithLooting;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetMetadata;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
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

@Mod(modid = AbyssalCraftHeads.modid, name = AbyssalCraftHeads.name, version = AbyssalCraftHeads.version, dependencies = "required-after:forge@[forgeversion,);required-after:abyssalcraft@[1.9.4.9,]", useMetadata = false,
acceptedMinecraftVersions = "[1.11.2]", updateJSON = "https://raw.githubusercontent.com/Shinoow/AbyssalCraft-Heads/master/version.json", certificateFingerprint = "cert_fingerprint")
public class AbyssalCraftHeads {

	public static final String version = "ach_version";
	public static final String modid = "acheads";
	public static final String name = "AbyssalCraft Heads";

	@Metadata(AbyssalCraftHeads.modid)
	public static ModMetadata metadata;

	@Instance(AbyssalCraftHeads.modid)
	public static AbyssalCraftHeads instance;

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

		head = new BlockHead();

		GameRegistry.register(head.setRegistryName(new ResourceLocation(modid, "head")));
		GameRegistry.register(new ItemACHead(head).setRegistryName(new ResourceLocation(modid, "head")));

		GameRegistry.registerTileEntity(TileEntityHead.class, modid + ":head");

		if(event.getSide().isClient()){
			ResourceLocation[] res = new ResourceLocation[ItemACHead.names.length];
			for(int i = 0; i < ItemACHead.names.length; i++)
				res[i] = new ResourceLocation("acheads", "head_" + ItemACHead.names[i]);
			ModelBakery.registerItemVariants(Item.getItemFromBlock(head), res);
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHead.class, new TileEntityHeadRenderer());
			ModelLoader.setCustomStateMapper(head, new StateMapperBase(){
				@Override
				protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
					return new ModelResourceLocation("acheads:head_"+ItemACHead.names[state.getValue(BlockHead.TYPE)], "normal");
				}});
		}
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		if(event.getSide().isClient()){
			RenderItem render = Minecraft.getMinecraft().getRenderItem();
			for(int i = 0; i < ItemACHead.names.length; i++)
				render.getItemModelMesher().register(Item.getItemFromBlock(head), i, new ModelResourceLocation("acheads:head_" + ItemACHead.names[i], "inventory"));
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
		FMLLog.log("AbyssalCraft Heads", Level.WARN, "Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been tampered with. This version will NOT be supported by the author!");
	}

	@SubscribeEvent
	public void lootLoad(LootTableLoadEvent event){
		LootCondition[] conditions = new LootCondition[]{new KilledByPlayer(false), new RandomChanceWithLooting(0.025f, 0.01f)};
		if(event.getName().equals(ACLoot.ENTITY_ABYSSAL_ZOMBIE))
			addLootEntry(event.getTable(), conditions, 5, "abyssal_zombie");
		if(event.getName().equals(ACLoot.ENTITY_EVIL_PIG))
			addLootEntry(event.getTable(), conditions, 2, "evil_pig");
		//J'zahar 2
		if(event.getName().equals(ACLoot.ENTITY_ABYSSALNITE_GOLEM))
			addLootEntry(event.getTable(), conditions, 3, "abyssalnite_golem");
		if(event.getName().equals(ACLoot.ENTITY_DREADED_ABYSSALNITE_GOLEM))
			addLootEntry(event.getTable(), conditions, 4, "dreaded_abyssalnite_golem");
		if(event.getName().equals(ACLoot.ENTITY_DREADGUARD))
			addLootEntry(event.getTable(), conditions, 5, "dreadguard");
		if(event.getName().equals(ACLoot.ENTITY_SPECTRAL_DRAGON))
			addLootEntry(event.getTable(), conditions, 6, "spectral_dragon");
		//Asorah 7
		if(event.getName().equals(ACLoot.ENTITY_SHADOW_CREATURE))
			addLootEntry(event.getTable(), conditions, 8, "shadow_creature");
		if(event.getName().equals(ACLoot.ENTITY_SHADOW_MONSTER))
			addLootEntry(event.getTable(), conditions, 9, "shadow_monster");
		if(event.getName().equals(ACLoot.ENTITY_DREADLING))
			addLootEntry(event.getTable(), conditions, 10, "dreadling");
		if(event.getName().equals(ACLoot.ENTITY_DREAD_SPAWN))
			addLootEntry(event.getTable(), conditions, 11, "dread_spawn");
		if(event.getName().equals(ACLoot.ENTITY_DEMON_PIG))
			addLootEntry(event.getTable(), conditions, 12, "demon_pig");
		//Cha'garoth 13
		if(event.getName().equals(ACLoot.ENTITY_FIST_OF_CHAGAROTH)){
			addLootEntry(event.getTable(), conditions, 14, "fist_of_chagaroth");
			addLootEntry(event.getTable(), conditions, 51, "fist_of_chagaroth_left");
		}
		if(event.getName().equals(ACLoot.ENTITY_SHADOW_BEAST))
			addLootEntry(event.getTable(), conditions, 15, "shadow_beast");
		//Sacthoth 16
		if(event.getName().equals(ACLoot.ENTITY_SKELETON_GOLIATH))
			addLootEntry(event.getTable(), conditions, 17, "skeleton_goliath");
		if(event.getName().equals(ACLoot.ENTITY_SPAWN_OF_CHAGAROTH))
			addLootEntry(event.getTable(), conditions, 18, "spawn_of_chagaroth");
		if(event.getName().equals(ACLoot.ENTITY_ABYSSAL_ANTI_ZOMBIE))
			addLootEntry(event.getTable(), conditions, 19, "abyssal_anti_zombie");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_BAT))
			addLootEntry(event.getTable(), conditions, 20, "anti_bat");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_CHICKEN))
			addLootEntry(event.getTable(), conditions, 21, "anti_chicken");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_COW))
			addLootEntry(event.getTable(), conditions, 22, "anti_cow");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_CREEPER))
			addLootEntry(event.getTable(), conditions, 23, "anti_creeper");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_GHOUL))
			addLootEntry(event.getTable(), conditions, 24, "anti_ghoul");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_PIG))
			addLootEntry(event.getTable(), conditions, 25, "anti_pig");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_PLAYER))
			addLootEntry(event.getTable(), conditions, 26, "anti_player");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_SKELETON))
			addLootEntry(event.getTable(), conditions, 27, "anti_skeleton");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_SPIDER))
			addLootEntry(event.getTable(), conditions, 28, "anti_spider");
		if(event.getName().equals(ACLoot.ENTITY_ANTI_ZOMBIE))
			addLootEntry(event.getTable(), conditions, 29, "anti_zombie");
		if(event.getName().equals(ACLoot.ENTITY_OMOTHOL_GHOUL))
			addLootEntry(event.getTable(), conditions, 30, "omothol_ghoul");
		//TODO individual remnant loot tables
		if(event.getName().equals(ACLoot.ENTITY_REMNANT)){
			addLootEntry(event.getTable(), conditions, 31, "remnant");
			addLootEntry(event.getTable(), conditions, 32, "remnant_banker");
			addLootEntry(event.getTable(), conditions, 33, "remnant_blacksmith");
			addLootEntry(event.getTable(), conditions, 34, "remnant_butcher");
			addLootEntry(event.getTable(), conditions, 35, "remnant_librarian");
			addLootEntry(event.getTable(), conditions, 36, "remnant_master_blacksmith");
			addLootEntry(event.getTable(), conditions, 37, "remnant_priest");
		}
		if(event.getName().equals(ACLoot.ENTITY_MINION_OF_THE_GATEKEEPER))
			addLootEntry(event.getTable(), conditions, 38, "minion_of_the_gatekeeper");
		if(event.getName().equals(ACLoot.ENTITY_LESSER_SHOGGOTH))
			addLootEntry(event.getTable(), conditions, 39, "lesser_shoggoth");
		if(event.getName().equals(ACLoot.ENTITY_LESSER_ABYSSAL_SHOGGOTH))
			addLootEntry(event.getTable(), conditions, 40, "lesser_abyssal_shoggoth");
		if(event.getName().equals(ACLoot.ENTITY_LESSER_DREADED_SHOGGOTH))
			addLootEntry(event.getTable(), conditions, 41, "lesser_dreaded_shoggoth");
		if(event.getName().equals(ACLoot.ENTITY_LESSER_OMOTHOL_SHOGGOTH))
			addLootEntry(event.getTable(), conditions, 42, "lesser_omothol_shoggoth");
		if(event.getName().equals(ACLoot.ENTITY_LESSER_SHADOW_SHOGGOTH))
			addLootEntry(event.getTable(), conditions, 43, "lesser_shadow_shoggoth");
		if(event.getName().equals(ACLoot.ENTITY_GREATER_DREAD_SPAWN))
			addLootEntry(event.getTable(), conditions, 11, "greater_dread_spawn");
		if(event.getName().equals(ACLoot.ENTITY_LESSER_DREADBEAST))
			addLootEntry(event.getTable(), conditions, 18, "lesser_dreadbeast");
		if(event.getName().equals(ACLoot.ENTITY_EVIL_COW))
			addLootEntry(event.getTable(), conditions, 44, "evil_cow");
		if(event.getName().equals(ACLoot.ENTITY_EVIL_CHICKEN))
			addLootEntry(event.getTable(), conditions, 45, "evil_chicken");
		if(event.getName().equals(ACLoot.ENTITY_DEMON_COW))
			addLootEntry(event.getTable(), conditions, 46, "demon_cow");
		if(event.getName().equals(ACLoot.ENTITY_DEMON_CHICKEN))
			addLootEntry(event.getTable(), conditions, 47, "demon_chicken");
		if(event.getName().equals(ACLoot.ENTITY_EVIL_SHEEP))
			addLootEntry(event.getTable(), conditions, 48, "evil_sheep");
		if(event.getName().equals(ACLoot.ENTITY_DEMON_SHEEP))
			addLootEntry(event.getTable(), conditions, 49, "demon_sheep");
	}

	private void addLootEntry(LootTable table, LootCondition[] conditions, int meta, String name) {
		LootPool pool = table.getPool("pool2");
		LootEntryItem loot = new LootEntryItem(Item.getItemFromBlock(head), 1, 0, new LootFunction[] {new SetMetadata(new LootCondition[0], new RandomValueRange(meta))}, new LootCondition[0], modid + ":head_"+name);
		if(pool != null)
			pool.addEntry(loot);
		else {
			pool = new LootPool(new LootEntry[] {loot}, conditions, new RandomValueRange(1), new RandomValueRange(0), "pool2");
			table.addPool(pool);
		}
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