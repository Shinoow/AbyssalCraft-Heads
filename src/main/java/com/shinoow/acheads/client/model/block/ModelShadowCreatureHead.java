package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelShadowCreature - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelShadowCreatureHead extends ModelBase {
	public ModelRenderer Head1;

	public ModelShadowCreatureHead() {
		textureWidth = 32;
		textureHeight = 32;
		Head1 = new ModelRenderer(this, 0, 0);
		Head1.setRotationPoint(0.5F, 24.0F, 0.5F);
		Head1.addBox(-3.0F, -5.0F, -3.0F, 5, 5, 5, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head1.render(f5);
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
