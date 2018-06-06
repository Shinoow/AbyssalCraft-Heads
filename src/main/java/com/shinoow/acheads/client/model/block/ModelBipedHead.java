package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelAntiSkeleton - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelBipedHead extends ModelBase {
	public ModelRenderer bipedHeadwear;
	public ModelRenderer bipedHead;

	public ModelBipedHead() {
		this(64, 32);
	}

	public ModelBipedHead(int height, int width) {
		textureWidth = height;
		textureHeight = width;
		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		bipedHeadwear = new ModelRenderer(this, 32, 0);
		bipedHeadwear.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
	}

	public ModelBipedHead offsetHeadwear(int x, int y) {
		bipedHeadwear = new ModelRenderer(this, x, y);
		bipedHeadwear.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
		return this;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		renderHead(f5);
		renderHeadwear(f5);
	}

	public void renderHead(float f) {
		bipedHead.render(f);
	}

	public void renderHeadwear(float f) {
		bipedHeadwear.render(f);
	}
}
