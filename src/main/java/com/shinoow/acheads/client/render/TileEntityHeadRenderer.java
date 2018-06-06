package com.shinoow.acheads.client.render;

import java.util.List;

import com.google.common.collect.Lists;
import com.shinoow.abyssalcraft.client.model.block.ModelDGhead;
import com.shinoow.acheads.client.model.block.*;
import com.shinoow.acheads.common.blocks.tile.TileEntityHead;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class TileEntityHeadRenderer extends TileEntitySpecialRenderer<TileEntityHead> {

	private List<IRenderHandler> handlers = Lists.newArrayList();

	public TileEntityHeadRenderer() {
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ABYSSAL_ZOMBIE);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(PIG);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_PIG.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(JZAHAR);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_JHZAHAR.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ABYSSALNITE_GOLEM);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DREADED_ABYSSALNITE_GOLEM);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DREADGUARD);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_DREADGUARD.renderHead(0.0625F);
			bindTexture(DREADED_ABYSSALNITE_ARMOR);
			MODEL_DREADGUARD.renderHeadwear(0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SPECTRAL_DRAGON);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(0.6, 0.6, 0.6);
			GlStateManager.translate(0, 1, 0);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
			MODEL_DRAGON.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
			GlStateManager.disableBlend();
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ASORAH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_DRAGON.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SHADOW_CREATURE);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
			MODEL_SHADOW_CREATURE.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
			GlStateManager.disableBlend();
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SHADOW_MONSTER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
			MODEL_SHADOW_MONSTER.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
			GlStateManager.disableBlend();
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DREADLING);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DREADGUARD);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_DREAD_SPAWN.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DEMON_PIG);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_PIG.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(CHAGAROTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(2, 2, 2);
			GlStateManager.translate(0, -0.75, 0);
			MODEL_CHAGAROTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(FIST_OF_CHAGAROTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_CHAGAROTH_FIST.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SHADOW_BEAST);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
			MODEL_SHADOW_BEAST.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
			GlStateManager.disableBlend();
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SACTHOTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
			MODEL_SACTHOTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
			GlStateManager.disableBlend();
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SKELETON_GOLIATH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_SKELETON_GOLIATH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DREADGUARD);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_SPAWN_OF_CHAGAROTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ABYSSAL_ANTI_ZOMBIE);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_BAT);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_ANTI_BAT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_CHICKEN);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_CHICKEN.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_COW);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_COW.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_CREEPER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_DEPTHS_GHOUL);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_GHOUL.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_PIG);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_PIG.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_PLAYER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_SKELETON);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_BIPED.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_SPIDER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_SPIDER.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(ANTI_ZOMBIE);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_ZOMBIE.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(OMOTHOL_GHOUL);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.2, 1.2, 1.2);
			GlStateManager.translate(0, -0.25, 0);
			MODEL_GHOUL.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT_BANKER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT_BLACKSMITH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT_BUTCHER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT_LIBRARIAN);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT_MASTER_BLACKSMITH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(REMNANT_PRIEST);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_REMNANT.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(MINION_OF_THE_GATEKEEPER);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_MINION_OF_THE_GATEKEEPER.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(LESSER_SHOGGOTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_LESSER_SHOGGOTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(LESSER_ABYSSAL_SHOGGOTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_LESSER_SHOGGOTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(LESSER_DREADED_SHOGGOTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_LESSER_SHOGGOTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(LESSER_OMOTHOL_SHOGGOTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			MODEL_LESSER_SHOGGOTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(LESSER_SHADOW_SHOGGOTH);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			GlStateManager.scale(1.5, 1.5, 1.5);
			GlStateManager.translate(0, -0.5, 0);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
			MODEL_LESSER_SHOGGOTH.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
			GlStateManager.disableBlend();
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(COW);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_COW.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(CHICKEN);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_CHICKEN.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DEMON_COW);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_COW.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DEMON_CHICKEN);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_CHICKEN.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(SHEEP);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_SHEEP.renderHead(0.0625F);
			bindTexture(SHEEP_FUR);
			MODEL_SHEEP.renderWool(0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(DEMON_SHEEP);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_SHEEP.renderHead(0.0625F);
			bindTexture(DEMON_SHEEP_FUR);
			MODEL_SHEEP.renderWool(0.0625F);
		});
		handlers.add((rotation, x, y, z, partialTicks, destroyStage) -> {
			bindTexture(CORALIUM_INFESTED_SQUID);
			GlStateManager.rotate(rotation * 90, 0, 1, 0);
			MODEL_SQUID.render(null, 0, 0, -0.1F, 0, 0, 0.0625F);
		});
	}

	@Override
	public void renderTileEntityAt(TileEntityHead te, double x, double y, double z, float partialTicks, int destroyStage)
	{
		IRenderHandler handler = handlers.get(te.getType());

		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GlStateManager.pushMatrix();
		GlStateManager.rotate(180F, 0.0F, 0.0F, 1.0F);

		handler.renderModel(te.getDirection(), x, y, z, partialTicks, destroyStage);

		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
	}

	private final ResourceLocation ABYSSAL_ZOMBIE = new ResourceLocation("abyssalcraft:textures/model/abyssal_zombie.png");
	private final ResourceLocation PIG = new ResourceLocation("textures/entity/pig/pig.png");
	private final ResourceLocation JZAHAR = new ResourceLocation("abyssalcraft:textures/model/boss/J'zahar.png");
	private final ResourceLocation ABYSSALNITE_GOLEM = new ResourceLocation("abyssalcraft:textures/model/aby_warden.png");
	private final ResourceLocation DREADED_ABYSSALNITE_GOLEM = new ResourceLocation("abyssalcraft:textures/model/dread_warden.png");
	private final ResourceLocation DREADGUARD = new ResourceLocation("abyssalcraft:textures/model/elite/Dread_guard.png");
	private final ResourceLocation DREADED_ABYSSALNITE_ARMOR = new ResourceLocation("abyssalcraft:textures/armor/dread_1.png");
	private final ResourceLocation SPECTRAL_DRAGON = new ResourceLocation("abyssalcraft:textures/model/elite/dragonminion.png");
	private final ResourceLocation ASORAH = new ResourceLocation("abyssalcraft:textures/model/boss/dragonboss.png");
	private final ResourceLocation SHADOW_CREATURE = new ResourceLocation("abyssalcraft:textures/model/ShadowCreature.png");
	private final ResourceLocation SHADOW_MONSTER = new ResourceLocation("abyssalcraft:textures/model/ShadowMonster.png");
	private final ResourceLocation DREADLING = new ResourceLocation("abyssalcraft:textures/model/Dreadling.png");
	private final ResourceLocation DEMON_PIG = new ResourceLocation("abyssalcraft:textures/model/demon_pig.png");
	private final ResourceLocation CHAGAROTH = new ResourceLocation("abyssalcraft:textures/model/boss/Chagaroth.png");
	private final ResourceLocation FIST_OF_CHAGAROTH = new ResourceLocation("abyssalcraft:textures/model/ChagarothFist.png");
	private final ResourceLocation SHADOW_BEAST = new ResourceLocation("abyssalcraft:textures/model/elite/ShadowBeast.png");
	private final ResourceLocation SACTHOTH = new ResourceLocation("abyssalcraft:textures/model/boss/Sacthoth.png");
	private final ResourceLocation SKELETON_GOLIATH = new ResourceLocation("abyssalcraft:textures/model/elite/SkeletonGoliath.png");
	private final ResourceLocation ABYSSAL_ANTI_ZOMBIE = new ResourceLocation("abyssalcraft:textures/model/anti/abyssal_zombie.png");
	private final ResourceLocation ANTI_BAT = new ResourceLocation("abyssalcraft:textures/model/anti/bat.png");
	private final ResourceLocation ANTI_CHICKEN = new ResourceLocation("abyssalcraft:textures/model/anti/chicken.png");
	private final ResourceLocation ANTI_COW = new ResourceLocation("abyssalcraft:textures/model/anti/cow.png");
	private final ResourceLocation ANTI_CREEPER = new ResourceLocation("abyssalcraft:textures/model/anti/creeper.png");
	private final ResourceLocation ANTI_DEPTHS_GHOUL = new ResourceLocation("abyssalcraft:textures/model/anti/depths_ghoul.png");
	private final ResourceLocation ANTI_PIG = new ResourceLocation("abyssalcraft:textures/model/anti/pig.png");
	private final ResourceLocation ANTI_PLAYER = new ResourceLocation("abyssalcraft:textures/model/anti/steve.png");
	private final ResourceLocation ANTI_SKELETON = new ResourceLocation("abyssalcraft:textures/model/anti/skeleton.png");
	private final ResourceLocation ANTI_SPIDER = new ResourceLocation("abyssalcraft:textures/model/anti/spider.png");
	private final ResourceLocation ANTI_ZOMBIE = new ResourceLocation("abyssalcraft:textures/model/anti/zombie.png");
	private final ResourceLocation OMOTHOL_GHOUL = new ResourceLocation("abyssalcraft:textures/model/omothol_ghoul.png");
	private final ResourceLocation REMNANT = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant.png");
	private final ResourceLocation REMNANT_BANKER = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant_banker.png");
	private final ResourceLocation REMNANT_BLACKSMITH = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant_blacksmith.png");
	private final ResourceLocation REMNANT_BUTCHER = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant_butcher.png");
	private final ResourceLocation REMNANT_LIBRARIAN = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant_librarian.png");
	private final ResourceLocation REMNANT_MASTER_BLACKSMITH = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant_master_blacksmith.png");
	private final ResourceLocation REMNANT_PRIEST = new ResourceLocation("abyssalcraft:textures/model/remnant/Remnant_priest.png");
	private final ResourceLocation MINION_OF_THE_GATEKEEPER = new ResourceLocation("abyssalcraft:textures/model/elite/GatekeeperMinion.png");
	private final ResourceLocation LESSER_SHOGGOTH = new ResourceLocation("abyssalcraft:textures/model/shoggoth/LesserShoggoth.png");
	private final ResourceLocation LESSER_ABYSSAL_SHOGGOTH = new ResourceLocation("abyssalcraft:textures/model/shoggoth/AbyssalShoggoth.png");
	private final ResourceLocation LESSER_DREADED_SHOGGOTH = new ResourceLocation("abyssalcraft:textures/model/shoggoth/DreadedShoggoth.png");
	private final ResourceLocation LESSER_OMOTHOL_SHOGGOTH = new ResourceLocation("abyssalcraft:textures/model/shoggoth/OmotholShoggoth.png");
	private final ResourceLocation LESSER_SHADOW_SHOGGOTH = new ResourceLocation("abyssalcraft:textures/model/shoggoth/ShadowShoggoth.png");
	private final ResourceLocation COW = new ResourceLocation("textures/entity/cow/cow.png");
	private final ResourceLocation CHICKEN = new ResourceLocation("textures/entity/chicken.png");
	private final ResourceLocation DEMON_COW = new ResourceLocation("abyssalcraft:textures/model/demon_cow.png");
	private final ResourceLocation DEMON_CHICKEN = new ResourceLocation("abyssalcraft:textures/model/demon_chicken.png");
	private final ResourceLocation SHEEP = new ResourceLocation("textures/entity/sheep/sheep.png");
	private final ResourceLocation SHEEP_FUR = new ResourceLocation("textures/entity/sheep/sheep_fur.png");
	private final ResourceLocation DEMON_SHEEP = new ResourceLocation("abyssalcraft:textures/model/demon_sheep.png");
	private final ResourceLocation DEMON_SHEEP_FUR = new ResourceLocation("abyssalcraft:textures/model/demon_sheep_fur.png");
	private final ResourceLocation CORALIUM_INFESTED_SQUID = new ResourceLocation("abyssalcraft:textures/model/coraliumsquid.png");

	private ModelBipedHead MODEL_BIPED = new ModelBipedHead();
	private ModelPigHead MODEL_PIG = new ModelPigHead();
	private ModelJzaharHead MODEL_JHZAHAR = new ModelJzaharHead();
	private ModelBipedHead MODEL_DREADGUARD = new ModelBipedHead().offsetHeadwear(0, 0);
	private ModelDragonHead MODEL_DRAGON = new ModelDragonHead();
	private ModelShadowCreatureHead MODEL_SHADOW_CREATURE = new ModelShadowCreatureHead();
	private ModelShadowMonsterHead MODEL_SHADOW_MONSTER = new ModelShadowMonsterHead();
	private ModelDreadSpawnHead MODEL_DREAD_SPAWN = new ModelDreadSpawnHead();
	private ModelChagarothHead MODEL_CHAGAROTH = new ModelChagarothHead();
	private ModelChagarothFistHand MODEL_CHAGAROTH_FIST = new ModelChagarothFistHand();
	private ModelShadowBeastHead MODEL_SHADOW_BEAST = new ModelShadowBeastHead();
	private ModelSacthothHead MODEL_SACTHOTH = new ModelSacthothHead();
	private ModelSkeletonGoliathHead MODEL_SKELETON_GOLIATH = new ModelSkeletonGoliathHead();
	private ModelChagarothSpawnHead MODEL_SPAWN_OF_CHAGAROTH = new ModelChagarothSpawnHead();
	private ModelAntiBatHead MODEL_ANTI_BAT = new ModelAntiBatHead();
	private ModelChickenHead MODEL_CHICKEN = new ModelChickenHead();
	private ModelCowHead MODEL_COW = new ModelCowHead();
	private ModelDGhead MODEL_GHOUL = new ModelDGhead();
	private ModelSpiderHead MODEL_SPIDER = new ModelSpiderHead();
	private ModelBipedHead MODEL_ZOMBIE = new ModelBipedHead(64, 64);
	private ModelRemnantHead MODEL_REMNANT = new ModelRemnantHead();
	private ModelGatekeeperMinionHead MODEL_MINION_OF_THE_GATEKEEPER = new ModelGatekeeperMinionHead();
	private ModelLesserShoggothHead MODEL_LESSER_SHOGGOTH = new ModelLesserShoggothHead();
	private ModelSheepHead MODEL_SHEEP = new ModelSheepHead();
	private ModelSquidHead MODEL_SQUID = new ModelSquidHead();

	private interface IRenderHandler {

		public void renderModel(int rotation, double x, double y, double z, float partialTicks, int destroyStage);
	}
}
