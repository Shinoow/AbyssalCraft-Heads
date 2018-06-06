package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChagaroth - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelChagarothHead extends ModelBase {
	public ModelRenderer middlehead;
	public ModelRenderer middleheadChild;
	public ModelRenderer middleheadChild_1;
	public ModelRenderer middleheadChild_2;
	public ModelRenderer middleheadChild_3;
	public ModelRenderer middleheadChild_4;
	public ModelRenderer middleheadChild_5;
	public ModelRenderer middleheadChild_6;
	public ModelRenderer middleheadChild_7;
	public ModelRenderer middleheadChildChild;
	public ModelRenderer middleheadChildChild_1;
	public ModelRenderer middleheadChildChild_2;
	public ModelRenderer middleheadChildChild_3;
	public ModelRenderer middleheadChildChild_4;
	public ModelRenderer middleheadChildChild_5;
	public ModelRenderer middleheadChildChild_6;
	public ModelRenderer middleheadChildChild_7;
	public ModelRenderer middleheadChildChild_8;

	public ModelChagarothHead() {
		textureWidth = 128;
		textureHeight = 64;
		middleheadChildChild_4 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_4.setRotationPoint(0.0F, 1.0F, 0.0F);
		middleheadChildChild_4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		middleheadChild_3 = new ModelRenderer(this, 10, 24);
		middleheadChild_3.setRotationPoint(-0.5F, -4.0F, 3.5F);
		middleheadChild_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		middleheadChildChild_2 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_2.setRotationPoint(0.5F, 0.0F, -6.0F);
		middleheadChildChild_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		middleheadChild_6 = new ModelRenderer(this, 0, 24);
		middleheadChild_6.setRotationPoint(0.5F, -6.0F, -5.5F);
		middleheadChild_6.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
		middleheadChild_4 = new ModelRenderer(this, 10, 24);
		middleheadChild_4.setRotationPoint(-0.5F, -6.0F, 3.5F);
		middleheadChild_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		middleheadChildChild_8 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_8.setRotationPoint(8.0F, 1.0F, 0.0F);
		middleheadChildChild_8.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		middleheadChildChild_7 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_7.setRotationPoint(6.0F, 1.0F, 0.0F);
		middleheadChildChild_7.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		middleheadChildChild = new ModelRenderer(this, 0, 50);
		middleheadChildChild.setRotationPoint(-3.5F, 0.0F, -6.0F);
		middleheadChildChild.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		middlehead = new ModelRenderer(this, 0, 30);
		middlehead.setRotationPoint(0.0F, 22.0F, 1.0F);
		middlehead.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 8, 0.0F);
		setRotateAngle(middlehead, -0.33457961760731303F, 0.0F, 0.0F);
		middleheadChild_5 = new ModelRenderer(this, 10, 24);
		middleheadChild_5.setRotationPoint(-0.5F, -8.0F, 3.5F);
		middleheadChild_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		middleheadChildChild_1 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_1.setRotationPoint(-1.5F, 0.0F, -6.0F);
		middleheadChildChild_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		middleheadChildChild_5 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_5.setRotationPoint(2.0F, 1.0F, 0.0F);
		middleheadChildChild_5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		middleheadChild_7 = new ModelRenderer(this, 0, 24);
		middleheadChild_7.setRotationPoint(-3.5F, -6.0F, -5.5F);
		middleheadChild_7.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
		middleheadChildChild_6 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_6.setRotationPoint(4.0F, 1.0F, 0.0F);
		middleheadChildChild_6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		middleheadChild_2 = new ModelRenderer(this, 10, 24);
		middleheadChild_2.setRotationPoint(-0.5F, -2.0F, 3.5F);
		middleheadChild_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		middleheadChild = new ModelRenderer(this, 0, 50);
		middleheadChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		middleheadChild.addBox(-4.5F, 1.0F, -6.0F, 9, 1, 9, 0.0F);
		setRotateAngle(middleheadChild, 0.3346075117588043F, 0.0F, 0.0F);
		middleheadChildChild_3 = new ModelRenderer(this, 0, 50);
		middleheadChildChild_3.setRotationPoint(2.5F, 0.0F, -6.0F);
		middleheadChildChild_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		middleheadChild_1 = new ModelRenderer(this, 0, 28);
		middleheadChild_1.setRotationPoint(-4.5F, -1.0F, -5.5F);
		middleheadChild_1.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
		middleheadChild_1.addChild(middleheadChildChild_4);
		middlehead.addChild(middleheadChild_3);
		middleheadChild.addChild(middleheadChildChild_2);
		middlehead.addChild(middleheadChild_6);
		middlehead.addChild(middleheadChild_4);
		middleheadChild_1.addChild(middleheadChildChild_8);
		middleheadChild_1.addChild(middleheadChildChild_7);
		middleheadChild.addChild(middleheadChildChild);
		middlehead.addChild(middleheadChild_5);
		middleheadChild.addChild(middleheadChildChild_1);
		middleheadChild_1.addChild(middleheadChildChild_5);
		middlehead.addChild(middleheadChild_7);
		middleheadChild_1.addChild(middleheadChildChild_6);
		middlehead.addChild(middleheadChild_2);
		middlehead.addChild(middleheadChild);
		middleheadChild.addChild(middleheadChildChild_3);
		middlehead.addChild(middleheadChild_1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		middlehead.render(f5);
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
