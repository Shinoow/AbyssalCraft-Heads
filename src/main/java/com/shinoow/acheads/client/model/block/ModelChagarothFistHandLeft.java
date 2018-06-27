package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChagarothFist - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelChagarothFistHandLeft extends ModelBase {
	public ModelRenderer palm1;
	public ModelRenderer finger5;
	public ModelRenderer finger3;
	public ModelRenderer finger4;
	public ModelRenderer finger1;
	public ModelRenderer finger2;
	public ModelRenderer finger52;
	public ModelRenderer eye;
	public ModelRenderer finger42;
	public ModelRenderer finger53;
	public ModelRenderer palm2;
	public ModelRenderer finger12;
	public ModelRenderer finger23;
	public ModelRenderer finger13;
	public ModelRenderer finger32;
	public ModelRenderer finger43;
	public ModelRenderer finger22;
	public ModelRenderer finger33;

	public ModelChagarothFistHandLeft() {
		textureWidth = 64;
		textureHeight = 32;
		palm2 = new ModelRenderer(this, 42, 0);
		palm2.setRotationPoint(-2.0F, 23.0F, -2.5F);
		palm2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
		finger5 = new ModelRenderer(this, 8, 0);
		finger5.setRotationPoint(-3.1F, 22.5F, 0.0F);
		finger5.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger5, 0.48328166987722987F, 1.5707963267948966F, 0.0F);
		finger33 = new ModelRenderer(this, 8, 0);
		finger33.setRotationPoint(0.5F, 18.0F, 2.0F);
		finger33.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger33, 0.48328166987722987F, 0.0F, 0.0F);
		finger1 = new ModelRenderer(this, 8, 0);
		finger1.setRotationPoint(-2.5F, 22.5F, 1.0F);
		finger1.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger1, -0.48328166987722987F, 0.0F, 0.0F);
		finger32 = new ModelRenderer(this, 8, 0);
		finger32.setRotationPoint(0.5F, 20.5F, 2.0F);
		finger32.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		eye = new ModelRenderer(this, 8, 7);
		eye.setRotationPoint(0.0F, 23.0F, -2.0F);
		eye.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
		finger4 = new ModelRenderer(this, 8, 0);
		finger4.setRotationPoint(2.0F, 22.5F, 1.0F);
		finger4.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger4, -0.48328166987722987F, 0.0F, 0.0F);
		finger13 = new ModelRenderer(this, 8, 0);
		finger13.setRotationPoint(-2.5F, 18.0F, 2.0F);
		finger13.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger13, 0.48328166987722987F, 0.0F, 0.0F);
		finger12 = new ModelRenderer(this, 8, 0);
		finger12.setRotationPoint(-2.5F, 20.5F, 2.0F);
		finger12.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		palm1 = new ModelRenderer(this, 26, 0);
		palm1.setRotationPoint(-3.0F, 22.0F, -2.5F);
		palm1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 4, 0.0F);
		finger43 = new ModelRenderer(this, 8, 0);
		finger43.setRotationPoint(2.0F, 18.0F, 2.0F);
		finger43.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger43, 0.48328166987722987F, 0.0F, 0.0F);
		finger3 = new ModelRenderer(this, 8, 0);
		finger3.setRotationPoint(0.5F, 22.5F, 1.0F);
		finger3.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger3, -0.48328166987722987F, 0.0F, 0.0F);
		finger53 = new ModelRenderer(this, 8, 0);
		finger53.setRotationPoint(-4.1F, 17.0F, 0.0F);
		finger53.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
		setRotateAngle(finger53, -0.48328166987722987F, 1.5707963267948966F, 0.0F);
		finger2 = new ModelRenderer(this, 8, 0);
		finger2.setRotationPoint(-1.0F, 22.5F, 1.0F);
		finger2.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger2, -0.48328166987722987F, 0.0F, 0.0F);
		finger23 = new ModelRenderer(this, 8, 0);
		finger23.setRotationPoint(-1.0F, 18.0F, 2.0F);
		finger23.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		setRotateAngle(finger23, 0.48328166987722987F, 0.0F, 0.0F);
		finger42 = new ModelRenderer(this, 8, 0);
		finger42.setRotationPoint(2.0F, 20.5F, 2.0F);
		finger42.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		finger52 = new ModelRenderer(this, 8, 0);
		finger52.setRotationPoint(-4.23F, 20.0F, -1.0F);
		finger52.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
		finger22 = new ModelRenderer(this, 8, 0);
		finger22.setRotationPoint(-1.0F, 20.5F, 2.0F);
		finger22.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		palm2.render(f5);
		finger5.render(f5);
		finger33.render(f5);
		finger1.render(f5);
		finger32.render(f5);
		eye.render(f5);
		finger4.render(f5);
		finger13.render(f5);
		finger12.render(f5);
		palm1.render(f5);
		finger43.render(f5);
		finger3.render(f5);
		finger53.render(f5);
		finger2.render(f5);
		finger23.render(f5);
		finger42.render(f5);
		finger52.render(f5);
		finger22.render(f5);
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
