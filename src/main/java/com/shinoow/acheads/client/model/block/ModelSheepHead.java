package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelDemonSheep2 - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelSheepHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer head_1;

	public ModelSheepHead() {
		textureWidth = 64;
		textureHeight = 32;
		head = new ModelRenderer(this, 0, 0);
		head.setRotationPoint(0.0F, 22.0F, 2.0F);
		head.addBox(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
		head_1 = new ModelRenderer(this, 0, 0);
		head_1.setRotationPoint(0.0F, 22.0F, 2.0F);
		head_1.addBox(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
	}

	public void renderHead(float f) {
		head.render(f);
	}

	public void renderWool(float f) {
		head_1.render(f);
	}
}
