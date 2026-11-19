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

import com.dhanantry.scapeandrunparasites.client.model.entity.infected.head.ModelInfHumanHead;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.head.EntityInfHumanHead;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderInfHumanHead
extends RenderLiving<EntityInfHumanHead> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("srparasites:textures/entity/monster/humanh.png");
    public static final ResourceLocation TEXTURE1 = new ResourceLocation("srparasites:textures/entity/monster/humanh1.png");
    public static final ResourceLocation TEXTURE2 = new ResourceLocation("srparasites:textures/entity/monster/humanh2.png");
    public static final ResourceLocation TEXTURE3 = new ResourceLocation("srparasites:textures/entity/monster/humanhnocturn.png");

    public RenderInfHumanHead(RenderManager manager) {
        super(manager, (ModelBase)new ModelInfHumanHead(), 0.6f);
    }

    protected ResourceLocation getEntityTexture(EntityInfHumanHead entity) {
        switch (entity.getSkin()) {
            case 10: {
                return TEXTURE3;
            }
            case 1: {
                return TEXTURE1;
            }
            case 2: {
                return TEXTURE;
            }
        }
        return TEXTURE;
    }

    protected void applyRotations(EntityInfHumanHead entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.func_77043_a((EntityLivingBase)entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}

