package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelShadowMonster - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelShadowMonsterHead extends ModelBase {
	public ModelRenderer Head;

	public ModelShadowMonsterHead() {
		textureWidth = 64;
		textureHeight = 32;
		Head = new ModelRenderer(this, 0, 0);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.addBox(-3.5F, -7.0F, -3.5F, 7, 7, 7, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
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
