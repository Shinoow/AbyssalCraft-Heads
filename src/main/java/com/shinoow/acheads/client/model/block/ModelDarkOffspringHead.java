package com.shinoow.acheads.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * dark offspring head - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelDarkOffspringHead extends ModelBase {
    public ModelRenderer neck;
    public ModelRenderer head;
    public ModelRenderer snout;
    public ModelRenderer jawUpper01;
    public ModelRenderer jawLower;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lHorn01;
    public ModelRenderer rHorn01;
    public ModelRenderer lTentacle01a;
    public ModelRenderer rTentacle01a;
    public ModelRenderer jawUpper02;
    public ModelRenderer lTentacle02b01;
    public ModelRenderer rTentacle02b01;
    public ModelRenderer lTentacle02b02;
    public ModelRenderer lTentacle02b03;
    public ModelRenderer lTentacle02b04;
    public ModelRenderer lTentacle02c;
    public ModelRenderer rTentacle02b02;
    public ModelRenderer rTentacle02b03;
    public ModelRenderer rTentacle02b04;
    public ModelRenderer rTentacle02c;
    public ModelRenderer lHorn02;
    public ModelRenderer lHorn03a;
    public ModelRenderer lHorn03b;
    public ModelRenderer lHorn03c;
    public ModelRenderer lHorn03d;
    public ModelRenderer lHorn04;
    public ModelRenderer rHorn02;
    public ModelRenderer rHorn03a;
    public ModelRenderer rHorn03b;
    public ModelRenderer rHorn03c;
    public ModelRenderer rHorn03d;
    public ModelRenderer rHorn04;
    public ModelRenderer lTentacle01b01;
    public ModelRenderer lTentacle01b02;
    public ModelRenderer lTentacle01b03;
    public ModelRenderer lTentacle01b04;
    public ModelRenderer lTentacle01c;
    public ModelRenderer rTentacle01b01;
    public ModelRenderer rTentacle01b02;
    public ModelRenderer rTentacle01b03;
    public ModelRenderer rTentacle01b04;
    public ModelRenderer rTentacle01c;

    public ModelDarkOffspringHead() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.jawLower = new ModelRenderer(this, 53, 57);
        this.jawLower.setRotationPoint(0.0F, 2.3F, -5.0F);
        this.jawLower.addBox(-2.0F, -0.5F, -4.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(jawLower, 0.06981317007977318F, 0.0F, 0.0F);
        this.rTentacle01b01 = new ModelRenderer(this, 45, 7);
        this.rTentacle01b01.mirror = true;
        this.rTentacle01b01.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rTentacle01b01.addBox(-0.2F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rTentacle01b01, -0.17453292519943295F, 0.0F, -0.17453292519943295F);
        this.lTentacle01b01 = new ModelRenderer(this, 45, 7);
        this.lTentacle01b01.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.lTentacle01b01.addBox(-0.2F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lTentacle01b01, -0.17453292519943295F, 0.0F, 0.17453292519943295F);
        this.lHorn02 = new ModelRenderer(this, 0, 0);
        this.lHorn02.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.lHorn02.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lHorn02, -0.13962634015954636F, 0.0F, 0.13962634015954636F);
        this.rTentacle01c = new ModelRenderer(this, 51, 6);
        this.rTentacle01c.mirror = true;
        this.rTentacle01c.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.rTentacle01c.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rTentacle01c, -0.22689280275926282F, 0.0F, -0.05235987755982988F);
        this.lEar = new ModelRenderer(this, 40, 26);
        this.lEar.setRotationPoint(2.6F, -2.2F, -1.6F);
        this.lEar.addBox(0.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(lEar, -0.6981317007977318F, 0.0F, -0.08726646259971647F);
        this.lTentacle01b04 = new ModelRenderer(this, 45, 7);
        this.lTentacle01b04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle01b04.addBox(-0.8F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.rTentacle02b03 = new ModelRenderer(this, 45, 7);
        this.rTentacle02b03.mirror = true;
        this.rTentacle02b03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle02b03.addBox(-0.2F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.lTentacle02b02 = new ModelRenderer(this, 45, 7);
        this.lTentacle02b02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle02b02.addBox(-0.8F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.lTentacle02b04 = new ModelRenderer(this, 45, 7);
        this.lTentacle02b04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle02b04.addBox(-0.8F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.lTentacle02b01 = new ModelRenderer(this, 45, 7);
        this.lTentacle02b01.setRotationPoint(0.7F, -0.1F, -1.5F);
        this.lTentacle02b01.addBox(-0.2F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lTentacle02b01, -0.7853981633974483F, -0.17453292519943295F, 0.0F);
        this.rHorn03b = new ModelRenderer(this, 0, 6);
        this.rHorn03b.mirror = true;
        this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
        this.rHorn03c = new ModelRenderer(this, 0, 6);
        this.rHorn03c.mirror = true;
        this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
        this.lTentacle02c = new ModelRenderer(this, 51, 6);
        this.lTentacle02c.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.lTentacle02c.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lTentacle02c, -0.20943951023931953F, 0.0F, 0.08726646259971647F);
        this.rHorn03d = new ModelRenderer(this, 0, 6);
        this.rHorn03d.mirror = true;
        this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
        this.lHorn03a = new ModelRenderer(this, 0, 6);
        this.lHorn03a.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.lHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lHorn03a, -0.3141592653589793F, 0.0F, -0.13962634015954636F);
        this.lTentacle01c = new ModelRenderer(this, 51, 6);
        this.lTentacle01c.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.lTentacle01c.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lTentacle01c, -0.22689280275926282F, 0.0F, 0.05235987755982988F);
        this.rTentacle02b02 = new ModelRenderer(this, 45, 7);
        this.rTentacle02b02.mirror = true;
        this.rTentacle02b02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle02b02.addBox(-0.8F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.rTentacle01b03 = new ModelRenderer(this, 45, 7);
        this.rTentacle01b03.mirror = true;
        this.rTentacle01b03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle01b03.addBox(-0.2F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.rTentacle02b04 = new ModelRenderer(this, 45, 7);
        this.rTentacle02b04.mirror = true;
        this.rTentacle02b04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle02b04.addBox(-0.8F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.lHorn04 = new ModelRenderer(this, 5, 6);
        this.lHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.lHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lHorn04, 0.0F, 0.0F, -0.17453292519943295F);
        this.lHorn01 = new ModelRenderer(this, 0, 0);
        this.lHorn01.setRotationPoint(2.2F, -2.6F, -0.3F);
        this.lHorn01.addBox(-1.0F, -3.9F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lHorn01, -0.7330382858376184F, 0.0F, 0.40142572795869574F);
        this.snout = new ModelRenderer(this, 0, 46);
        this.snout.setRotationPoint(0.0F, -1.3F, -3.8F);
        this.snout.addBox(-2.0F, -1.9F, -6.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(snout, 0.4363323129985824F, 0.0F, 0.0F);
        this.jawUpper01 = new ModelRenderer(this, 0, 55);
        this.jawUpper01.setRotationPoint(0.0F, 0.9F, -4.4F);
        this.jawUpper01.addBox(-1.6F, -1.0F, -5.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(jawUpper01, 0.06981317007977318F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 24, 46);
        this.head.setRotationPoint(0.0F, -1.9F, -3.1F);
        this.head.addBox(-3.5F, -3.5F, -5.0F, 7, 7, 6, 0.0F);
        this.setRotateAngle(head, 0.9599310885968813F, 0.0F, 0.0F);
        this.rEar = new ModelRenderer(this, 40, 26);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.6F, -2.2F, -1.6F);
        this.rEar.addBox(-5.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(rEar, -0.6981317007977318F, 0.0F, 0.08726646259971647F);
        this.jawUpper02 = new ModelRenderer(this, 71, 49);
        this.jawUpper02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jawUpper02.addBox(-2.3F, -1.0F, -5.0F, 1, 2, 5, 0.0F);
        this.rTentacle02b01 = new ModelRenderer(this, 45, 7);
        this.rTentacle02b01.mirror = true;
        this.rTentacle02b01.setRotationPoint(-0.7F, -0.1F, -1.5F);
        this.rTentacle02b01.addBox(-0.2F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rTentacle02b01, -0.7853981633974483F, 0.17453292519943295F, 0.0F);
        this.rTentacle02c = new ModelRenderer(this, 51, 6);
        this.rTentacle02c.mirror = true;
        this.rTentacle02c.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.rTentacle02c.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rTentacle02c, -0.20943951023931953F, 0.0F, -0.08726646259971647F);
        this.lHorn03b = new ModelRenderer(this, 0, 6);
        this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
        this.lTentacle01b02 = new ModelRenderer(this, 45, 7);
        this.lTentacle01b02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle01b02.addBox(-0.8F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.lTentacle01b03 = new ModelRenderer(this, 45, 7);
        this.lTentacle01b03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle01b03.addBox(-0.2F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.rHorn04 = new ModelRenderer(this, 5, 6);
        this.rHorn04.mirror = true;
        this.rHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.rHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rHorn04, 0.0F, 0.0F, 0.17453292519943295F);
        this.rTentacle01a = new ModelRenderer(this, 45, 0);
        this.rTentacle01a.mirror = true;
        this.rTentacle01a.setRotationPoint(-1.5F, 2.7F, -4.3F);
        this.rTentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rTentacle01a, -0.5759586531581287F, 0.2792526803190927F, 0.0F);
        this.rHorn03a = new ModelRenderer(this, 0, 6);
        this.rHorn03a.mirror = true;
        this.rHorn03a.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.rHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rHorn03a, -0.3141592653589793F, 0.0F, 0.13962634015954636F);
        this.lTentacle01a = new ModelRenderer(this, 45, 0);
        this.lTentacle01a.setRotationPoint(1.5F, 2.7F, -4.3F);
        this.lTentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lTentacle01a, -0.5759586531581287F, -0.2792526803190927F, 0.0F);
        this.lHorn03c = new ModelRenderer(this, 0, 6);
        this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
        this.lHorn03d = new ModelRenderer(this, 0, 6);
        this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
        this.rTentacle01b04 = new ModelRenderer(this, 45, 7);
        this.rTentacle01b04.mirror = true;
        this.rTentacle01b04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle01b04.addBox(-0.8F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.rHorn01 = new ModelRenderer(this, 0, 0);
        this.rHorn01.mirror = true;
        this.rHorn01.setRotationPoint(-2.2F, -2.6F, -0.3F);
        this.rHorn01.addBox(-1.0F, -3.9F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rHorn01, -0.7330382858376184F, 0.0F, -0.40142572795869574F);
        this.lTentacle02b03 = new ModelRenderer(this, 45, 7);
        this.lTentacle02b03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle02b03.addBox(-0.2F, 0.1F, -0.2F, 1, 4, 1, 0.0F);
        this.neck = new ModelRenderer(this, 50, 30);
        this.neck.setRotationPoint(0.0F, 10.5F, 8.0F);
        this.neck.addBox(-3.0F, -3.0F, -3.3F, 6, 6, 3, 0.0F);
        this.rHorn02 = new ModelRenderer(this, 0, 0);
        this.rHorn02.mirror = true;
        this.rHorn02.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.rHorn02.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rHorn02, -0.13962634015954636F, 0.0F, -0.13962634015954636F);
        this.rTentacle01b02 = new ModelRenderer(this, 45, 7);
        this.rTentacle01b02.mirror = true;
        this.rTentacle01b02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle01b02.addBox(-0.8F, 0.1F, -0.8F, 1, 4, 1, 0.0F);
        this.head.addChild(this.jawLower);
        this.rTentacle01a.addChild(this.rTentacle01b01);
        this.lTentacle01a.addChild(this.lTentacle01b01);
        this.lHorn01.addChild(this.lHorn02);
        this.rTentacle01b01.addChild(this.rTentacle01c);
        this.head.addChild(this.lEar);
        this.lTentacle01b01.addChild(this.lTentacle01b04);
        this.rTentacle02b01.addChild(this.rTentacle02b03);
        this.lTentacle02b01.addChild(this.lTentacle02b02);
        this.lTentacle02b01.addChild(this.lTentacle02b04);
        this.jawLower.addChild(this.lTentacle02b01);
        this.rHorn03a.addChild(this.rHorn03b);
        this.rHorn03a.addChild(this.rHorn03c);
        this.lTentacle02b01.addChild(this.lTentacle02c);
        this.rHorn03a.addChild(this.rHorn03d);
        this.lHorn02.addChild(this.lHorn03a);
        this.lTentacle01b01.addChild(this.lTentacle01c);
        this.rTentacle02b01.addChild(this.rTentacle02b02);
        this.rTentacle01b01.addChild(this.rTentacle01b03);
        this.rTentacle02b01.addChild(this.rTentacle02b04);
        this.lHorn03a.addChild(this.lHorn04);
        this.head.addChild(this.lHorn01);
        this.head.addChild(this.snout);
        this.head.addChild(this.jawUpper01);
        this.neck.addChild(this.head);
        this.head.addChild(this.rEar);
        this.jawUpper01.addChild(this.jawUpper02);
        this.jawLower.addChild(this.rTentacle02b01);
        this.rTentacle02b01.addChild(this.rTentacle02c);
        this.lHorn03a.addChild(this.lHorn03b);
        this.lTentacle01b01.addChild(this.lTentacle01b02);
        this.lTentacle01b01.addChild(this.lTentacle01b03);
        this.rHorn03a.addChild(this.rHorn04);
        this.head.addChild(this.rTentacle01a);
        this.rHorn02.addChild(this.rHorn03a);
        this.head.addChild(this.lTentacle01a);
        this.lHorn03a.addChild(this.lHorn03c);
        this.lHorn03a.addChild(this.lHorn03d);
        this.rTentacle01b01.addChild(this.rTentacle01b04);
        this.head.addChild(this.rHorn01);
        this.lTentacle02b01.addChild(this.lTentacle02b03);
        this.rHorn01.addChild(this.rHorn02);
        this.rTentacle01b01.addChild(this.rTentacle01b02);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.neck.render(f5);
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
