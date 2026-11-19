/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent;

import com.dhanantry.scapeandrunparasites.client.model.ModelSRP;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLeemB
extends ModelSRP {
    public ModelRenderer joint;
    public ModelRenderer jd;
    public ModelRenderer mainbody;
    public ModelRenderer b;
    public ModelRenderer b_1;
    public ModelRenderer b_2;
    public ModelRenderer b_3;
    public ModelRenderer b_4;

    public ModelLeemB() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.b = new ModelRenderer((ModelBase)this, 0, 0);
        this.b.setRotationPoint(-13.0f, -5.0f, 0.0f);
        this.b.addBox(-5.5f, -1.5f, -4.5f, 9, 12, 11, 0.0f);
        this.setRotateAngle(this.b, 0.0f, 0.0f, -0.81681406f);
        this.b_3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.b_3.setRotationPoint(-2.0f, -10.0f, -3.0f);
        this.b_3.addBox(-5.5f, -1.5f, -4.5f, 14, 19, 14, 0.0f);
        this.joint = new ModelRenderer((ModelBase)this, 0, 0);
        this.joint.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.joint.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.mainbody = new ModelRenderer((ModelBase)this, 0, 0);
        this.mainbody.setRotationPoint(0.0f, 22.0f, 0.0f);
        this.mainbody.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.b_2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.b_2.setRotationPoint(2.0f, -5.0f, 13.0f);
        this.b_2.addBox(-5.5f, -1.5f, -4.5f, 9, 12, 11, 0.0f);
        this.setRotateAngle(this.b_2, -1.0681415f, 0.0f, 0.0f);
        this.b_4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.b_4.setRotationPoint(0.0f, -5.0f, 0.0f);
        this.b_4.addBox(-1.7f, -1.5f, -0.5f, 7, 6, 6, 0.0f);
        this.b_1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.b_1.setRotationPoint(11.0f, -4.0f, -10.0f);
        this.b_1.addBox(-5.5f, -1.5f, -4.5f, 10, 14, 14, 0.0f);
        this.setRotateAngle(this.b_1, 0.43982297f, 0.37699112f, 1.0681415f);
        this.jd = new ModelRenderer((ModelBase)this, 0, 0);
        this.jd.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.jd.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.mainbody.addChild(this.b);
        this.mainbody.addChild(this.b_3);
        this.mainbody.addChild(this.b_2);
        this.b_3.addChild(this.b_4);
        this.mainbody.addChild(this.b_1);
    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        this.mainbody.render(scale);
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    }
}

