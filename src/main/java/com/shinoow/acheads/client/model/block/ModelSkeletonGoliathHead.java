package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSkeletonGoliath - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelSkeletonGoliathHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer headChild;
	public ModelRenderer headChild_1;
	public ModelRenderer headChild_2;
	public ModelRenderer headChild_3;
	public ModelRenderer headChild_4;
	public ModelRenderer headChild_5;
	public ModelRenderer headChild_6;
	public ModelRenderer headChild_7;
	public ModelRenderer headChild_8;
	public ModelRenderer headChild_9;
	public ModelRenderer headChild_10;

	public ModelSkeletonGoliathHead() {
		textureWidth = 128;
		textureHeight = 64;
		headChild_9 = new ModelRenderer(this, 49, 20);
		headChild_9.setRotationPoint(-2.0F, 1.0F, -4.0F);
		headChild_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild_6 = new ModelRenderer(this, 49, 20);
		headChild_6.setRotationPoint(4.0F, 1.0F, -4.0F);
		headChild_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild_8 = new ModelRenderer(this, 49, 20);
		headChild_8.setRotationPoint(0.0F, 1.0F, -4.0F);
		headChild_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild_5 = new ModelRenderer(this, 73, 18);
		headChild_5.setRotationPoint(-4.0F, 2.0F, -4.0F);
		headChild_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
		head = new ModelRenderer(this, 53, 0);
		head.setRotationPoint(-0.5F, 21.0F, -0.5F);
		head.addBox(-4.0F, -9.0F, -4.0F, 9, 9, 9, 0.0F);
		headChild_1 = new ModelRenderer(this, 49, 16);
		headChild_1.setRotationPoint(-4.0F, 0.0F, 4.0F);
		headChild_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		headChild_2 = new ModelRenderer(this, 53, 18);
		headChild_2.setRotationPoint(0.0F, 2.0F, -3.0F);
		headChild_2.addBox(-4.0F, 0.0F, -1.0F, 9, 1, 1, 0.0F);
		headChild_10 = new ModelRenderer(this, 49, 20);
		headChild_10.setRotationPoint(-4.0F, 1.0F, -4.0F);
		headChild_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild_3 = new ModelRenderer(this, 53, 18);
		headChild_3.setRotationPoint(0.0F, 2.0F, -3.0F);
		headChild_3.addBox(-4.0F, 0.0F, -1.0F, 9, 1, 1, 0.0F);
		headChild_7 = new ModelRenderer(this, 49, 20);
		headChild_7.setRotationPoint(2.0F, 1.0F, -4.0F);
		headChild_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild = new ModelRenderer(this, 49, 16);
		headChild.setRotationPoint(4.0F, 0.0F, 4.0F);
		headChild.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		headChild_4 = new ModelRenderer(this, 73, 18);
		headChild_4.setRotationPoint(4.0F, 2.0F, -4.0F);
		headChild_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
		head.addChild(headChild_9);
		head.addChild(headChild_6);
		head.addChild(headChild_8);
		head.addChild(headChild_5);
		head.addChild(headChild_1);
		head.addChild(headChild_2);
		head.addChild(headChild_10);
		head.addChild(headChild_3);
		head.addChild(headChild_7);
		head.addChild(headChild);
		head.addChild(headChild_4);
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
