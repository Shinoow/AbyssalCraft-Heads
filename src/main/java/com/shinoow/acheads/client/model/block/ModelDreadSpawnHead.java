package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelDreadSpawn - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelDreadSpawnHead extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer headChild;

	public ModelDreadSpawnHead() {
		textureWidth = 128;
		textureHeight = 64;
		headChild = new ModelRenderer(this, 17, 23);
		headChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		headChild.addBox(-1.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F);
		setRotateAngle(headChild, 0.48332190513610845F, 0.0F, 0.0F);
		head = new ModelRenderer(this, 37, 18);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addBox(-1.5F, -4.0F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(head, -0.48328166987722987F, 0.0F, 0.0F);
		head.addChild(headChild);
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
