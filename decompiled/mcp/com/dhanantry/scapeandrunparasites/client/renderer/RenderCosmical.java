/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.entity.RenderLivingBase
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.client.event.RenderLivingEvent$Post
 *  net.minecraftforge.client.event.RenderLivingEvent$Pre
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package com.dhanantry.scapeandrunparasites.client.renderer;

import com.dhanantry.scapeandrunparasites.client.model.ModelSRP;
import com.dhanantry.scapeandrunparasites.client.renderer.RenderMalleable;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPCosmical;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public abstract class RenderCosmical<T extends EntityPCosmical>
extends RenderMalleable<T> {
    protected ModelSRP mainModel2;

    public RenderCosmical(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
        this.mainModel2 = (ModelSRP)modelbaseIn;
    }

    public RenderCosmical(RenderManager rendermanagerIn, ModelBase modelbaseIn, ModelSRP modelbaseIn2, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
        this.mainModel2 = modelbaseIn2;
    }

    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
        this.doRenderCosmical(entity, x, y, z, entityYaw, partialTicks);
    }

    public void doRenderCosmical(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        boolean shouldSit;
        if (MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Pre(entity, (RenderLivingBase)this, partialTicks, x, y, z))) {
            return;
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        this.mainModel2.swingProgress = this.getSwingProgress((EntityLivingBase)entity, partialTicks);
        this.mainModel2.isRiding = shouldSit = entity.isRiding() && entity.getRidingEntity() != null && entity.getRidingEntity().shouldRiderSit();
        this.mainModel2.isChild = entity.isChild();
        try {
            float f = this.interpolateRotation(((EntityPCosmical)((Object)entity)).prevRenderYawOffset, ((EntityPCosmical)((Object)entity)).renderYawOffset, partialTicks);
            float f1 = this.interpolateRotation(((EntityPCosmical)((Object)entity)).prevRotationYawHead, ((EntityPCosmical)((Object)entity)).rotationYawHead, partialTicks);
            float f2 = f1 - f;
            if (shouldSit && entity.getRidingEntity() instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase = (EntityLivingBase)entity.getRidingEntity();
                f = this.interpolateRotation(entitylivingbase.prevRenderYawOffset, entitylivingbase.renderYawOffset, partialTicks);
                f2 = f1 - f;
                float f3 = MathHelper.wrapDegrees((float)f2);
                if (f3 < -85.0f) {
                    f3 = -85.0f;
                }
                if (f3 >= 85.0f) {
                    f3 = 85.0f;
                }
                f = f1 - f3;
                if (f3 * f3 > 2500.0f) {
                    f += f3 * 0.2f;
                }
                f2 = f1 - f;
            }
            float f7 = ((EntityPCosmical)((Object)entity)).prevRotationPitch + (((EntityPCosmical)((Object)entity)).rotationPitch - ((EntityPCosmical)((Object)entity)).prevRotationPitch) * partialTicks;
            this.renderLivingAt((EntityLivingBase)entity, x, y, z);
            float f8 = this.handleRotationFloat((EntityLivingBase)entity, partialTicks);
            this.applyRotations((EntityLivingBase)entity, f8, f, partialTicks);
            float f4 = this.prepareScaleCosmical(entity, partialTicks);
            float f5 = 0.0f;
            float f6 = 0.0f;
            if (!entity.isRiding()) {
                f5 = ((EntityPCosmical)((Object)entity)).prevLimbSwingAmount + (((EntityPCosmical)((Object)entity)).limbSwingAmount - ((EntityPCosmical)((Object)entity)).prevLimbSwingAmount) * partialTicks;
                f6 = ((EntityPCosmical)((Object)entity)).limbSwing - ((EntityPCosmical)((Object)entity)).limbSwingAmount * (1.0f - partialTicks);
                if (entity.isChild()) {
                    f6 *= 3.0f;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                f2 = f1 - f;
            }
            GlStateManager.enableAlpha();
            this.mainModel2.setLivingAnimations((EntityLivingBase)entity, f6, f5, partialTicks);
            this.mainModel2.setRotationAnglesCosmical(f6, f5, f8, f2, f7, f4, (Entity)entity);
            if (this.renderOutlines) {
                boolean flag1 = this.setScoreTeamColor((EntityLivingBase)entity);
                GlStateManager.enableColorMaterial();
                GlStateManager.enableOutlineMode((int)this.getTeamColor((Entity)entity));
                if (!this.renderMarker) {
                    this.renderModelCosmical(entity, f6, f5, f8, f2, f7, f4);
                }
                this.renderLayers((EntityLivingBase)entity, f6, f5, partialTicks, f8, f2, f7, f4);
                GlStateManager.disableOutlineMode();
                GlStateManager.disableColorMaterial();
                if (flag1) {
                    this.unsetScoreTeamColor();
                }
            } else {
                boolean flag = this.setDoRenderBrightness((EntityLivingBase)entity, partialTicks);
                this.renderModelCosmical(entity, f6, f5, f8, f2, f7, f4);
                if (flag) {
                    this.unsetBrightness();
                }
                GlStateManager.depthMask((boolean)true);
                this.renderLayers((EntityLivingBase)entity, f6, f5, partialTicks, f8, f2, f7, f4);
            }
            GlStateManager.disableRescaleNormal();
        }
        catch (Exception exception) {
            // empty catch block
        }
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Post(entity, (RenderLivingBase)this, partialTicks, x, y, z));
    }

    protected void renderModelCosmical(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        boolean flag1;
        boolean flag = this.isVisible((EntityLivingBase)entitylivingbaseIn);
        boolean bl = flag1 = !flag && !entitylivingbaseIn.isInvisibleToPlayer((EntityPlayer)Minecraft.getMinecraft().player);
        if (flag || flag1) {
            if (!this.bindEntityTextureCosmical(entitylivingbaseIn)) {
                return;
            }
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)0.35f);
            GlStateManager.depthMask((boolean)false);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            GlStateManager.alphaFunc((int)516, (float)0.003921569f);
            this.mainModel2.renderC((Entity)entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
            GlStateManager.disableBlend();
            GlStateManager.alphaFunc((int)516, (float)0.1f);
            GlStateManager.depthMask((boolean)true);
        }
    }

    protected abstract ResourceLocation getEntityTextureCosmical(T var1);

    protected boolean bindEntityTextureCosmical(T entity) {
        ResourceLocation resourcelocation = this.getEntityTextureCosmical(entity);
        if (resourcelocation == null) {
            return false;
        }
        this.bindTexture(resourcelocation);
        return true;
    }

    protected float prepareScaleCosmical(T entitylivingbaseIn, float partialTicks) {
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.preRenderCallbackCosmical(entitylivingbaseIn, partialTicks);
        float f = 0.0625f;
        GlStateManager.translate((float)0.0f, (float)-1.501f, (float)0.0f);
        return 0.0625f;
    }

    protected void preRenderCallbackCosmical(T entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale((double)1.2, (double)1.2, (double)1.2);
    }
}

