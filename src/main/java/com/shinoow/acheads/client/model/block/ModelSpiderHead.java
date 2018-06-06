package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSpider - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelSpiderHead extends ModelBase {
	public ModelRenderer spiderHead;

	public ModelSpiderHead() {
		textureWidth = 64;
		textureHeight = 32;
		spiderHead = new ModelRenderer(this, 32, 4);
		spiderHead.setRotationPoint(0.0F, 20.0F, 4.0F);
		spiderHead.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		spiderHead.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
