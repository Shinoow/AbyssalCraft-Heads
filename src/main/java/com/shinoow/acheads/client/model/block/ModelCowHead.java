package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelCowHead extends ModelBase {
	public ModelRenderer head0;
	public ModelRenderer head1;
	public ModelRenderer head2;

	public ModelCowHead() {
		textureWidth = 64;
		textureHeight = 32;
		head2 = new ModelRenderer(this, 22, 0);
		head2.setRotationPoint(0.0F, 20.0F, 3.0F);
		head2.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
		head0 = new ModelRenderer(this, 0, 0);
		head0.setRotationPoint(0.0F, 20.0F, 3.0F);
		head0.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
		head1 = new ModelRenderer(this, 22, 0);
		head1.setRotationPoint(0.0F, 20.0F, 3.0F);
		head1.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head2.render(f5);
		head0.render(f5);
		head1.render(f5);
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
