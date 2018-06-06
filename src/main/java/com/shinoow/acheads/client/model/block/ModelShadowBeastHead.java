package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelShadowBeast - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelShadowBeastHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer headChild;
	public ModelRenderer headChild_1;
	public ModelRenderer headChild_2;
	public ModelRenderer headChild_3;
	public ModelRenderer headChild_4;
	public ModelRenderer headChild_5;
	public ModelRenderer headChildChild;
	public ModelRenderer headChildChild_1;
	public ModelRenderer headChildChild_2;
	public ModelRenderer headChildChild_3;

	public ModelShadowBeastHead() {
		textureWidth = 128;
		textureHeight = 64;
		headChild_4 = new ModelRenderer(this, 37, 4);
		headChild_4.setRotationPoint(3.5F, 0.0F, -4.5F);
		headChild_4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		headChildChild_2 = new ModelRenderer(this, 37, 4);
		headChildChild_2.setRotationPoint(0.5F, 0.8999999761581421F, -5.0F);
		headChildChild_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		head = new ModelRenderer(this, 0, 0);
		head.setRotationPoint(0.0F, 21.0F, -1.0F);
		head.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9, 0.0F);
		setRotateAngle(head, -0.4461061568097506F, 0.0F, 0.0F);
		headChildChild = new ModelRenderer(this, 37, 4);
		headChildChild.setRotationPoint(-3.5F, 0.8999999761581421F, -5.0F);
		headChildChild.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild_1 = new ModelRenderer(this, 37, 4);
		headChild_1.setRotationPoint(-2.5F, 0.0F, -4.5F);
		headChild_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		headChildChild_3 = new ModelRenderer(this, 37, 4);
		headChildChild_3.setRotationPoint(2.5F, 0.8999999761581421F, -5.0F);
		headChildChild_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild_2 = new ModelRenderer(this, 37, 4);
		headChild_2.setRotationPoint(-0.5F, 0.0F, -4.5F);
		headChild_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		headChild_5 = new ModelRenderer(this, 36, 0);
		headChild_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		headChild_5.addBox(-4.5F, 1.899999976158142F, -5.0F, 9, 1, 9, 0.0F);
		setRotateAngle(headChild_5, 0.44614329934120184F, 0.0F, 0.0F);
		headChildChild_1 = new ModelRenderer(this, 37, 4);
		headChildChild_1.setRotationPoint(-1.5F, 0.8999999761581421F, -5.0F);
		headChildChild_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		headChild = new ModelRenderer(this, 37, 4);
		headChild.setRotationPoint(-4.5F, 0.0F, -4.5F);
		headChild.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		headChild_3 = new ModelRenderer(this, 37, 4);
		headChild_3.setRotationPoint(1.5F, 0.0F, -4.5F);
		headChild_3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		head.addChild(headChild_4);
		headChild_5.addChild(headChildChild_2);
		headChild_5.addChild(headChildChild);
		head.addChild(headChild_1);
		headChild_5.addChild(headChildChild_3);
		head.addChild(headChild_2);
		head.addChild(headChild_5);
		headChild_5.addChild(headChildChild_1);
		head.addChild(headChild);
		head.addChild(headChild_3);
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
