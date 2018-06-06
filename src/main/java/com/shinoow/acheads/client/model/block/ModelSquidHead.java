package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSquid - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelSquidHead extends ModelBase {
	public ModelRenderer squidBody;

	public ModelSquidHead() {
		textureWidth = 64;
		textureHeight = 32;
		squidBody = new ModelRenderer(this, 0, 0);
		squidBody.setRotationPoint(0.0F, 16.0F, 0.0F);
		squidBody.addBox(-6.0F, -8.0F, -6.0F, 12, 16, 12, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		squidBody.render(f5);
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
