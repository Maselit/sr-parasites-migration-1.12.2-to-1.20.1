/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 */
package com.dhanantry.scapeandrunparasites.client.renderer.entity.infected;

import com.dhanantry.scapeandrunparasites.client.model.entity.infected.ModelInfSquid;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfSquid;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderInfSquid
extends RenderLiving<EntityInfSquid> {
    public static final ResourceLocation TEXTURES = new ResourceLocation("srparasites:textures/entity/monster/squid.png");

    public RenderInfSquid(RenderManager manager) {
        super(manager, (ModelBase)new ModelInfSquid(), 0.5f);
    }

    protected void preRenderCallback(EntityInfSquid entitylivingbaseIn, float partialTickTime) {
    }

    protected ResourceLocation getEntityTexture(EntityInfSquid entity) {
        return TEXTURES;
    }

    protected void applyRotations(EntityInfSquid entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations((EntityLivingBase)entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}

