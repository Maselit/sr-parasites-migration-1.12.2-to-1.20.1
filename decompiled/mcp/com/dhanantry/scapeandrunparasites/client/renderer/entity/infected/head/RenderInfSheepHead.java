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
package com.dhanantry.scapeandrunparasites.client.renderer.entity.infected.head;

import com.dhanantry.scapeandrunparasites.client.model.entity.infected.head.ModelInfSheepHead;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.head.EntityInfSheepHead;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderInfSheepHead
extends RenderLiving<EntityInfSheepHead> {
    public static final ResourceLocation TEXTURES = new ResourceLocation("srparasites:textures/entity/monster/sheeph.png");

    public RenderInfSheepHead(RenderManager manager) {
        super(manager, (ModelBase)new ModelInfSheepHead(), 0.5f);
    }

    protected ResourceLocation getEntityTexture(EntityInfSheepHead entity) {
        return TEXTURES;
    }

    protected void applyRotations(EntityInfSheepHead entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations((EntityLivingBase)entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}

