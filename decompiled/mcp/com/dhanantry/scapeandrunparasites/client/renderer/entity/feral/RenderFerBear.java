/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 */
package com.dhanantry.scapeandrunparasites.client.renderer.entity.feral;

import com.dhanantry.scapeandrunparasites.client.model.entity.feral.ModelFerBear;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerBear;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderFerBear
extends RenderLiving<EntityFerBear> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("srparasites:textures/entity/monster/ferbear.png");

    public RenderFerBear(RenderManager manager) {
        super(manager, (ModelBase)new ModelFerBear(), 0.5f);
    }

    protected void preRenderCallback(EntityFerBear entitylivingbaseIn, float partialTickTime) {
        float f = entitylivingbaseIn.getSelfeFlashIntensity(partialTickTime);
        float f1 = 1.0f + MathHelper.sin((float)(f * 100.0f)) * f * 0.01f;
        f = MathHelper.clamp((float)f, (float)0.0f, (float)1.0f);
        f *= f;
        f *= f;
        float f2 = (1.0f + f * 0.4f) * f1;
        float f3 = (1.0f + f * 0.1f) / f1;
        GlStateManager.scale((float)f2, (float)f3, (float)f2);
    }

    protected ResourceLocation getEntityTexture(EntityFerBear entity) {
        return TEXTURE;
    }

    protected void applyRotations(EntityFerBear entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations((EntityLivingBase)entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}

