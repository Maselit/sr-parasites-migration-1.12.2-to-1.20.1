/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.dhanantry.scapeandrunparasites.client.model.entity.primitive;

import com.dhanantry.scapeandrunparasites.client.model.ModelSRP;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHull
extends ModelSRP {
    public ModelRenderer mainbody;
    public ModelRenderer body;
    public ModelRenderer body_1;
    public ModelRenderer jointFLL;
    public ModelRenderer neck;
    public ModelRenderer jointFRL;
    public ModelRenderer body_2;
    public ModelRenderer body_3;
    public ModelRenderer body_4;
    public ModelRenderer body_5;
    public ModelRenderer jointBLL;
    public ModelRenderer body_6;
    public ModelRenderer jointBRL;
    public ModelRenderer leg;
    public ModelRenderer jointBLL1;
    public ModelRenderer leg_1;
    public ModelRenderer leg_2;
    public ModelRenderer feet;
    public ModelRenderer leg_3;
    public ModelRenderer jointBRL1;
    public ModelRenderer leg_4;
    public ModelRenderer leg_5;
    public ModelRenderer feet_1;
    public ModelRenderer leg_6;
    public ModelRenderer jointFLL1;
    public ModelRenderer leg_7;
    public ModelRenderer feet_2;
    public ModelRenderer neck_1;
    public ModelRenderer jointH;
    public ModelRenderer head;
    public ModelRenderer head_1;
    public ModelRenderer leg_8;
    public ModelRenderer jointFRL1;
    public ModelRenderer leg_9;
    public ModelRenderer feet_3;

    public ModelHull() {
        this.textureWidth = 128;
        this.textureHeight = 50;
        this.jointH = new ModelRenderer((ModelBase)this, 90, 11);
        this.jointH.setRotationPoint(0.0f, -1.8f, -5.3f);
        this.jointH.addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.jointH, -0.43633232f, 0.0f, 0.0f);
        this.body_6 = new ModelRenderer((ModelBase)this, 90, 15);
        this.body_6.setRotationPoint(0.0f, 5.0f, 0.7f);
        this.body_6.addBox(-5.0f, 0.0f, -3.0f, 10, 1, 6, 0.0f);
        this.leg_3 = new ModelRenderer((ModelBase)this, 34, 22);
        this.leg_3.setRotationPoint(-0.4f, 1.9f, 1.1f);
        this.leg_3.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.setRotateAngle(this.leg_3, -2.0943952f, 0.0f, -0.2617994f);
        this.jointFRL1 = new ModelRenderer((ModelBase)this, 112, 0);
        this.jointFRL1.setRotationPoint(-0.1f, 6.3f, -0.2f);
        this.jointFRL1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.leg = new ModelRenderer((ModelBase)this, 0, 15);
        this.leg.setRotationPoint(0.4f, 1.9f, 1.1f);
        this.leg.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.setRotateAngle(this.leg, -2.0943952f, 0.0f, 0.2617994f);
        this.leg_6 = new ModelRenderer((ModelBase)this, 0, 27);
        this.leg_6.setRotationPoint(0.4f, 0.0f, -1.3f);
        this.leg_6.addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4, 0.0f);
        this.setRotateAngle(this.leg_6, 1.0471976f, 0.0f, 0.0f);
        this.body_1 = new ModelRenderer((ModelBase)this, 34, 0);
        this.body_1.setRotationPoint(0.0f, -0.5f, 1.7f);
        this.body_1.addBox(-5.5f, 2.0f, -5.0f, 11, 7, 7, 0.0f);
        this.setRotateAngle(this.body_1, 0.61086524f, 0.0f, 0.0f);
        this.mainbody = new ModelRenderer((ModelBase)this, 0, 0);
        this.mainbody.setRotationPoint(0.0f, 8.0f, 0.0f);
        this.mainbody.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.jointFLL = new ModelRenderer((ModelBase)this, 29, 0);
        this.jointFLL.setRotationPoint(6.0f, 5.9f, 2.1f);
        this.jointFLL.addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2, 0.0f);
        this.leg_8 = new ModelRenderer((ModelBase)this, 68, 34);
        this.leg_8.setRotationPoint(-0.4f, 0.0f, -1.3f);
        this.leg_8.addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4, 0.0f);
        this.setRotateAngle(this.leg_8, 1.0471976f, 0.0f, 0.0f);
        this.neck_1 = new ModelRenderer((ModelBase)this, 88, 32);
        this.neck_1.setRotationPoint(0.0f, 1.4f, -4.9f);
        this.neck_1.addBox(-4.0f, -4.0f, -6.0f, 8, 5, 6, 0.0f);
        this.setRotateAngle(this.neck_1, 0.045553092f, 0.0f, 0.0f);
        this.feet_3 = new ModelRenderer((ModelBase)this, 0, 40);
        this.feet_3.setRotationPoint(-0.1f, 11.3f, 1.0f);
        this.feet_3.addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2, 0.0f);
        this.setRotateAngle(this.feet_3, -1.0646509f, -0.0017453292f, 0.0f);
        this.leg_4 = new ModelRenderer((ModelBase)this, 94, 22);
        this.leg_4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leg_4.addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3, 0.0f);
        this.setRotateAngle(this.leg_4, 1.5707964f, 0.0f, 0.0f);
        this.body_4 = new ModelRenderer((ModelBase)this, 28, 14);
        this.body_4.setRotationPoint(0.0f, 2.7f, -1.0f);
        this.body_4.addBox(-5.5f, 0.0f, -3.0f, 11, 2, 6, 0.0f);
        this.setRotateAngle(this.body_4, -0.07853982f, 0.0f, 0.0f);
        this.body_5 = new ModelRenderer((ModelBase)this, 54, 21);
        this.body_5.setRotationPoint(0.0f, 1.8f, -0.6f);
        this.body_5.addBox(-6.0f, 0.0f, -4.0f, 12, 5, 8, 0.0f);
        this.setRotateAngle(this.body_5, -0.07853982f, 0.0f, 0.0f);
        this.jointBRL1 = new ModelRenderer((ModelBase)this, 69, 0);
        this.jointBRL1.setRotationPoint(-0.1f, 6.0f, 2.0f);
        this.jointBRL1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.jointBLL = new ModelRenderer((ModelBase)this, 98, 0);
        this.jointBLL.setRotationPoint(6.0f, 2.3f, 1.0f);
        this.jointBLL.addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2, 0.0f);
        this.neck = new ModelRenderer((ModelBase)this, 70, 0);
        this.neck.setRotationPoint(0.0f, 2.8f, 1.4f);
        this.neck.addBox(-5.5f, -4.0f, -6.0f, 11, 5, 6, 0.0f);
        this.setRotateAngle(this.neck, 1.0471976f, 0.0f, 0.0f);
        this.feet = new ModelRenderer((ModelBase)this, 114, 0);
        this.feet.setRotationPoint(0.1f, 8.0f, 1.0f);
        this.feet.addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2, 0.0f);
        this.setRotateAngle(this.feet, -0.87266463f, -0.0017453292f, 0.0f);
        this.jointBRL = new ModelRenderer((ModelBase)this, 106, 0);
        this.jointBRL.setRotationPoint(-6.0f, 2.3f, 1.0f);
        this.jointBRL.addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2, 0.0f);
        this.leg_1 = new ModelRenderer((ModelBase)this, 16, 15);
        this.leg_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leg_1.addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3, 0.0f);
        this.setRotateAngle(this.leg_1, 1.5707964f, 0.0f, 0.0f);
        this.body_3 = new ModelRenderer((ModelBase)this, 100, 7);
        this.body_3.setRotationPoint(0.0f, 4.0f, 0.7f);
        this.body_3.addBox(-4.5f, 0.0f, -2.0f, 9, 3, 4, 0.0f);
        this.jointBLL1 = new ModelRenderer((ModelBase)this, 35, 0);
        this.jointBLL1.setRotationPoint(-0.1f, 6.0f, 2.0f);
        this.jointBLL1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.jointFRL = new ModelRenderer((ModelBase)this, 63, 0);
        this.jointFRL.setRotationPoint(-6.0f, 5.9f, 2.1f);
        this.jointFRL.addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2, 0.0f);
        this.feet_2 = new ModelRenderer((ModelBase)this, 14, 25);
        this.feet_2.setRotationPoint(0.1f, 11.3f, 1.0f);
        this.feet_2.addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2, 0.0f);
        this.setRotateAngle(this.feet_2, -1.0646509f, -0.0017453292f, 0.0f);
        this.jointFLL1 = new ModelRenderer((ModelBase)this, 104, 0);
        this.jointFLL1.setRotationPoint(-0.1f, 6.3f, -0.2f);
        this.jointFLL1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.feet_1 = new ModelRenderer((ModelBase)this, 50, 22);
        this.feet_1.setRotationPoint(-0.1f, 8.0f, 1.0f);
        this.feet_1.addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2, 0.0f);
        this.setRotateAngle(this.feet_1, -0.87266463f, -0.0017453292f, 0.0f);
        this.leg_7 = new ModelRenderer((ModelBase)this, 114, 22);
        this.leg_7.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leg_7.addBox(-1.5f, 0.0f, -1.0f, 3, 11, 2, 0.0f);
        this.setRotateAngle(this.leg_7, -0.9578367f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 0, 0);
        this.body.setRotationPoint(0.0f, -6.3f, -3.9f);
        this.body.addBox(-6.0f, 0.0f, -2.0f, 12, 10, 5, 0.0f);
        this.setRotateAngle(this.body, -0.61086524f, 0.0f, 0.0f);
        this.leg_5 = new ModelRenderer((ModelBase)this, 106, 22);
        this.leg_5.setRotationPoint(-0.1f, 3.5f, -1.1f);
        this.leg_5.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.setRotateAngle(this.leg_5, -1.5707964f, 0.0f, 0.0f);
        this.leg_2 = new ModelRenderer((ModelBase)this, 26, 22);
        this.leg_2.setRotationPoint(0.1f, 3.5f, -1.1f);
        this.leg_2.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.setRotateAngle(this.leg_2, -1.5707964f, 0.0f, 0.0f);
        this.head_1 = new ModelRenderer((ModelBase)this, 44, 34);
        this.head_1.setRotationPoint(0.0f, -0.4f, -0.7f);
        this.head_1.addBox(-4.0f, 0.0f, -2.0f, 8, 4, 4, 0.0f);
        this.head = new ModelRenderer((ModelBase)this, 16, 34);
        this.head.setRotationPoint(0.0f, 0.5f, -1.3f);
        this.head.addBox(-5.0f, -3.0f, -2.0f, 10, 7, 4, 0.0f);
        this.setRotateAngle(this.head, 0.22759093f, 0.0f, 0.0f);
        this.body_2 = new ModelRenderer((ModelBase)this, 64, 11);
        this.body_2.setRotationPoint(0.0f, 5.3f, 2.0f);
        this.body_2.addBox(-5.0f, 0.0f, -3.0f, 10, 4, 6, 0.0f);
        this.setRotateAngle(this.body_2, 1.5707964f, 0.0f, 0.0f);
        this.leg_9 = new ModelRenderer((ModelBase)this, 116, 35);
        this.leg_9.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leg_9.addBox(-1.5f, 0.0f, -1.0f, 3, 11, 2, 0.0f);
        this.setRotateAngle(this.leg_9, -0.9578367f, 0.0f, 0.0f);
        this.neck_1.addChild(this.jointH);
        this.body_5.addChild(this.body_6);
        this.jointBRL.addChild(this.leg_3);
        this.leg_8.addChild(this.jointFRL1);
        this.jointBLL.addChild(this.leg);
        this.jointFLL.addChild(this.leg_6);
        this.body.addChild(this.body_1);
        this.body.addChild(this.jointFLL);
        this.jointFRL.addChild(this.leg_8);
        this.neck.addChild(this.neck_1);
        this.leg_9.addChild(this.feet_3);
        this.jointBRL1.addChild(this.leg_4);
        this.body_3.addChild(this.body_4);
        this.body_4.addChild(this.body_5);
        this.leg_3.addChild(this.jointBRL1);
        this.body_5.addChild(this.jointBLL);
        this.body.addChild(this.neck);
        this.leg_2.addChild(this.feet);
        this.body_5.addChild(this.jointBRL);
        this.jointBLL1.addChild(this.leg_1);
        this.body_2.addChild(this.body_3);
        this.leg.addChild(this.jointBLL1);
        this.body.addChild(this.jointFRL);
        this.leg_7.addChild(this.feet_2);
        this.leg_6.addChild(this.jointFLL1);
        this.leg_5.addChild(this.feet_1);
        this.jointFLL1.addChild(this.leg_7);
        this.mainbody.addChild(this.body);
        this.leg_4.addChild(this.leg_5);
        this.leg_1.addChild(this.leg_2);
        this.head.addChild(this.head_1);
        this.jointH.addChild(this.head);
        this.body_1.addChild(this.body_2);
        this.jointFRL1.addChild(this.leg_9);
    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        this.mainbody.render(scale);
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        EntityParasiteBase parasite = (EntityParasiteBase)entityIn;
        this.jointFLL.rotateAngleX = 0.0f;
        this.jointFRL.rotateAngleX = 0.0f;
        this.jointBLL.rotateAngleX = 0.0f;
        this.jointBRL.rotateAngleX = 0.0f;
        this.mainbody.offsetY = 0.0f;
        this.mainbody.rotateAngleX = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 1.1f;
                float GD = 0.6f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.mainbody.rotateAngleX = 0.0f;
            }
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 1.1f;
                float GD = 0.6f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.mainbody.rotateAngleX = 0.0f;
            }
        } else if (i == 2 && !parasite.getStillAni()) {
            float GS = 1.2f;
            float GD = 0.5f;
            this.swingX(this.jointFLL, 0.3f * GS, 1.5f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
            this.swingX(this.jointFRL, 0.3f * GS, 1.5f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
            this.swingX(this.jointBLL, 0.3f * GS, 1.8f * GD, 1, -0.5f, 0.6f, limbSwing, limbSwingAmount);
            this.swingX(this.jointBRL, 0.3f * GS, 1.8f * GD, 1, 0.5f, 0.6f, limbSwing, limbSwingAmount);
            this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.04f);
            this.swingX(this.mainbody, 0.3f * GS, 0.4f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }
}

