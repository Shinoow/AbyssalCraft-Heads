package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChicken - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelChickenHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer chin;
	public ModelRenderer bill;

	public ModelChickenHead() {
		textureWidth = 64;
		textureHeight = 32;
		bill = new ModelRenderer(this, 14, 0);
		bill.setRotationPoint(0.0F, 24.0F, 1.0F);
		bill.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
		chin = new ModelRenderer(this, 14, 4);
		chin.setRotationPoint(0.0F, 24.0F, 1.0F);
		chin.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
		head = new ModelRenderer(this, 0, 0);
		head.setRotationPoint(0.0F, 24.0F, 1.0F);
		head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bill.render(f5);
		chin.render(f5);
		head.render(f5);
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
