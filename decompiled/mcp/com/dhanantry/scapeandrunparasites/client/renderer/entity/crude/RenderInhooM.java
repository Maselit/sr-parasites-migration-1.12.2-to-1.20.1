/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.util.ResourceLocation
 */
package com.dhanantry.scapeandrunparasites.client.renderer.entity.crude;

import com.dhanantry.scapeandrunparasites.client.model.entity.crude.ModelInhooM;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooM;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderInhooM
extends RenderLiving<EntityInhooM> {
    public static final ResourceLocation TEXTUREM = new ResourceLocation("srparasites:textures/entity/monster/inhoom.png");

    public RenderInhooM(RenderManager manager) {
        super(manager, (ModelBase)new ModelInhooM(), 0.5f);
    }

    protected ResourceLocation getEntityTexture(EntityInhooM entity) {
        return TEXTUREM;
    }
}

