package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelRemnant - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelRemnantHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer headChild;
	public ModelRenderer headChild_1;

	public ModelRemnantHead() {
		textureWidth = 128;
		textureHeight = 64;
		headChild = new ModelRenderer(this, 32, 0);
		headChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		headChild.addBox(-3.4000000953674316F, -8.0F, -6.0F, 6, 8, 1, 0.0F);
		setRotateAngle(headChild, 0.0F, -0.5235987901687622F, 0.0F);
		head = new ModelRenderer(this, 0, 0);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		headChild_1 = new ModelRenderer(this, 32, 0);
		headChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		headChild_1.addBox(-2.5999999046325684F, -8.0F, -6.0F, 6, 8, 1, 0.0F);
		setRotateAngle(headChild_1, 0.0F, 0.5235987901687622F, 0.0F);
		head.addChild(headChild);
		head.addChild(headChild_1);
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
