/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 */
package com.dhanantry.scapeandrunparasites.client.renderer.entity.deterrent;

import com.dhanantry.scapeandrunparasites.client.model.entity.deterrent.ModelTonro;
import com.dhanantry.scapeandrunparasites.client.renderer.RenderMalleable;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityTonro;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderTonro
extends RenderMalleable<EntityTonro> {
    public static final ResourceLocation TEXTURES = new ResourceLocation("srparasites:textures/entity/monster/tonro.png");
    public static final ResourceLocation STEXTURE = new ResourceLocation("srparasites:textures/entity/monster/stonro.png");

    public RenderTonro(RenderManager manager) {
        super(manager, new ModelTonro(), 0.4f);
    }

    protected ResourceLocation getEntityTexture(EntityTonro entity) {
        switch (entity.getSkin()) {
            case 120: {
                return STEXTURE;
            }
        }
        return TEXTURES;
    }

    protected void applyRotations(EntityTonro entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.func_77043_a((EntityLivingBase)entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}

