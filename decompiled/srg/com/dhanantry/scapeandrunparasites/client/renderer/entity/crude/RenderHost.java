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

import com.dhanantry.scapeandrunparasites.client.model.entity.crude.ModelHost;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityHost;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHost
extends RenderLiving<EntityHost> {
    public static final ResourceLocation TEXTUREM = new ResourceLocation("srparasites:textures/entity/monster/host.png");

    public RenderHost(RenderManager manager) {
        super(manager, (ModelBase)new ModelHost(), 0.0f);
    }

    protected ResourceLocation getEntityTexture(EntityHost entity) {
        return TEXTUREM;
    }
}

