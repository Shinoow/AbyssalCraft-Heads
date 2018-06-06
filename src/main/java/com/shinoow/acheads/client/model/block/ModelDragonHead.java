package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelDragonBoss - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelDragonHead extends ModelBase {
	public ModelRenderer upperlip;
	public ModelRenderer upperhead;
	public ModelRenderer scale;
	public ModelRenderer nostril;
	public ModelRenderer scale_1;
	public ModelRenderer nostril_1;
	public ModelRenderer jaw;

	public ModelDragonHead() {
		textureWidth = 256;
		textureHeight = 256;
		nostril = new ModelRenderer(this, 112, 0);
		nostril.mirror = true;
		nostril.setRotationPoint(0.0F, 16.0F, 2.0F);
		nostril.addBox(-5.0F, -3.0F, -22.0F, 2, 2, 4, 0.0F);
		upperhead = new ModelRenderer(this, 112, 30);
		upperhead.setRotationPoint(0.0F, 16.0F, 2.0F);
		upperhead.addBox(-8.0F, -8.0F, -10.0F, 16, 16, 16, 0.0F);
		scale_1 = new ModelRenderer(this, 0, 0);
		scale_1.setRotationPoint(0.0F, 16.0F, 2.0F);
		scale_1.addBox(3.0F, -12.0F, -4.0F, 2, 4, 6, 0.0F);
		nostril_1 = new ModelRenderer(this, 112, 0);
		nostril_1.setRotationPoint(0.0F, 16.0F, 2.0F);
		nostril_1.addBox(3.0F, -3.0F, -22.0F, 2, 2, 4, 0.0F);
		jaw = new ModelRenderer(this, 176, 65);
		jaw.setRotationPoint(0.0F, 4.0F, -8.0F);
		jaw.addBox(-6.0F, 0.0F, -16.0F, 12, 4, 16, 0.0F);
		setRotateAngle(jaw, 0.20000000298023227F, 0.0F, 0.0F);
		upperlip = new ModelRenderer(this, 176, 44);
		upperlip.setRotationPoint(0.0F, 16.0F, 2.0F);
		upperlip.addBox(-6.0F, -1.0F, -24.0F, 12, 5, 16, 0.0F);
		scale = new ModelRenderer(this, 0, 0);
		scale.mirror = true;
		scale.setRotationPoint(0.0F, 16.0F, 2.0F);
		scale.addBox(-5.0F, -12.0F, -4.0F, 2, 4, 6, 0.0F);
		upperlip.addChild(jaw);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		nostril.render(f5);
		upperhead.render(f5);
		scale_1.render(f5);
		nostril_1.render(f5);
		upperlip.render(f5);
		scale.render(f5);
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
