package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChagarothSpawn - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelChagarothSpawnHead extends ModelBase {
	public ModelRenderer bigspike1;
	public ModelRenderer bigspike2;
	public ModelRenderer bigspike3;
	public ModelRenderer bigspike4;
	public ModelRenderer body;
	public ModelRenderer smallspike1;
	public ModelRenderer smallspike2;
	public ModelRenderer smallspike3;
	public ModelRenderer smallspike4;

	public ModelChagarothSpawnHead() {
		textureWidth = 128;
		textureHeight = 64;
		bigspike4 = new ModelRenderer(this, 24, 11);
		bigspike4.setRotationPoint(2.0F, 21.0F, 0.0F);
		bigspike4.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(bigspike4, 0.0F, 0.0F, 0.8922821283340455F);
		body = new ModelRenderer(this, 12, 22);
		body.setRotationPoint(0.0F, 21.0F, 0.0F);
		body.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
		smallspike4 = new ModelRenderer(this, 30, 12);
		smallspike4.setRotationPoint(3.0F, 18.0F, 2.0F);
		smallspike4.addBox(0.0F, -4.0F, 0.0F, 1, 5, 1, 0.0F);
		setRotateAngle(smallspike4, 0.3346075117588043F, -2.3794310092926025F, 0.0F);
		smallspike3 = new ModelRenderer(this, 30, 12);
		smallspike3.setRotationPoint(-2.0F, 18.0F, 3.0F);
		smallspike3.addBox(0.0F, -4.0F, 0.0F, 1, 5, 1, 0.0F);
		setRotateAngle(smallspike3, 0.3346075117588043F, 2.4166100025177F, 0.0F);
		bigspike3 = new ModelRenderer(this, 24, 11);
		bigspike3.setRotationPoint(-2.0F, 21.0F, 0.0F);
		bigspike3.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(bigspike3, 0.0F, 0.0F, -0.8922821283340455F);
		smallspike1 = new ModelRenderer(this, 30, 12);
		smallspike1.setRotationPoint(2.0F, 18.0F, -3.0F);
		smallspike1.addBox(0.0F, -4.0F, 0.0F, 1, 5, 1, 0.0F);
		setRotateAngle(smallspike1, 0.3346075117588043F, -0.7435721755027772F, 0.0F);
		bigspike2 = new ModelRenderer(this, 24, 11);
		bigspike2.setRotationPoint(0.0F, 21.0F, -2.0F);
		bigspike2.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(bigspike2, 0.8922821283340455F, 0.0F, 0.0F);
		smallspike2 = new ModelRenderer(this, 30, 12);
		smallspike2.setRotationPoint(-3.0F, 18.0F, -2.0F);
		smallspike2.addBox(0.0F, -4.0F, 0.0F, 1, 5, 1, 0.0F);
		setRotateAngle(smallspike2, 0.3346144855022431F, 0.8922867178916931F, 0.0F);
		bigspike1 = new ModelRenderer(this, 24, 11);
		bigspike1.setRotationPoint(0.0F, 21.0F, 2.0F);
		bigspike1.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
		setRotateAngle(bigspike1, -0.8922867178916931F, 0.0F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bigspike4.render(f5);
		body.render(f5);
		smallspike4.render(f5);
		smallspike3.render(f5);
		bigspike3.render(f5);
		smallspike1.render(f5);
		bigspike2.render(f5);
		smallspike2.render(f5);
		bigspike1.render(f5);
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
