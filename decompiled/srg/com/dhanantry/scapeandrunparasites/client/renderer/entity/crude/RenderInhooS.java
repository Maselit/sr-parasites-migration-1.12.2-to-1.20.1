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

import com.dhanantry.scapeandrunparasites.client.model.entity.crude.ModelInhooS;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooS;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderInhooS
extends RenderLiving<EntityInhooS> {
    public static final ResourceLocation TEXTURES = new ResourceLocation("srparasites:textures/entity/monster/inhoos.png");

    public RenderInhooS(RenderManager manager) {
        super(manager, (ModelBase)new ModelInhooS(), 0.5f);
    }

    protected ResourceLocation getEntityTexture(EntityInhooS entity) {
        return TEXTURES;
    }
}

