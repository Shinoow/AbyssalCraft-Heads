package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelAntiBat - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelAntiBatHead extends ModelBase {
	public ModelRenderer batHead;
	public ModelRenderer batHeadChild;
	public ModelRenderer batHeadChild_1;

	public ModelAntiBatHead() {
		textureWidth = 64;
		textureHeight = 64;
		batHeadChild_1 = new ModelRenderer(this, 24, 0);
		batHeadChild_1.mirror = true;
		batHeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		batHeadChild_1.addBox(1.0F, -6.0F, -2.0F, 3, 4, 1, 0.0F);
		batHead = new ModelRenderer(this, 0, 0);
		batHead.setRotationPoint(0.0F, 21.0F, 0.0F);
		batHead.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
		batHeadChild = new ModelRenderer(this, 24, 0);
		batHeadChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		batHeadChild.addBox(-4.0F, -6.0F, -2.0F, 3, 4, 1, 0.0F);
		batHead.addChild(batHeadChild_1);
		batHead.addChild(batHeadChild);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		batHead.render(f5);
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
