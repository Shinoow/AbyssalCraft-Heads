package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelJzahar - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelJzaharHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer headChild;
	public ModelRenderer headChild_1;
	public ModelRenderer headChild_2;
	public ModelRenderer headChild_3;
	public ModelRenderer headChild_4;

	public ModelJzaharHead() {
		textureWidth = 128;
		textureHeight = 64;
		head = new ModelRenderer(this, 72, 0);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10, 0.0F);
		headChild_3 = new ModelRenderer(this, 116, 0);
		headChild_3.setRotationPoint(-1.0F, -2.0F, -7.0F);
		headChild_3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		headChild = new ModelRenderer(this, 102, 0);
		headChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		headChild.addBox(-3.5F, -10.0F, -7.0F, 6, 8, 1, 0.0F);
		setRotateAngle(headChild, 0.0F, 0.349065899848938F, 0.0F);
		headChild_1 = new ModelRenderer(this, 102, 0);
		headChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		headChild_1.addBox(-2.5F, -10.0F, -7.0F, 6, 8, 1, 0.0F);
		setRotateAngle(headChild_1, 0.0F, -0.349065899848938F, 0.0F);
		headChild_4 = new ModelRenderer(this, 116, 0);
		headChild_4.setRotationPoint(2.0F, -2.0F, -7.0F);
		headChild_4.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		headChild_2 = new ModelRenderer(this, 116, 0);
		headChild_2.setRotationPoint(-4.0F, -2.0F, -7.0F);
		headChild_2.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		head.addChild(headChild_3);
		head.addChild(headChild);
		head.addChild(headChild_1);
		head.addChild(headChild_4);
		head.addChild(headChild_2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
