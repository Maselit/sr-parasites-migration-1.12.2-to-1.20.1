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
        super.func_76986_a(entity, x, y, z, entityYaw, partialTicks);
        this.doRenderCosmical(entity, x, y, z, entityYaw, partialTicks);
    }

    public void doRenderCosmical(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        boolean shouldSit;
        if (MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Pre(entity, (RenderLivingBase)this, partialTicks, x, y, z))) {
            return;
        }
        GlStateManager.func_179094_E();
        GlStateManager.func_179129_p();
        this.mainModel2.field_78095_p = this.func_77040_d((EntityLivingBase)entity, partialTicks);
        this.mainModel2.field_78093_q = shouldSit = entity.func_184218_aH() && entity.func_184187_bx() != null && entity.func_184187_bx().shouldRiderSit();
        this.mainModel2.field_78091_s = entity.func_70631_g_();
        try {
            float f = this.func_77034_a(((EntityPCosmical)((Object)entity)).field_70760_ar, ((EntityPCosmical)((Object)entity)).field_70761_aq, partialTicks);
            float f1 = this.func_77034_a(((EntityPCosmical)((Object)entity)).field_70758_at, ((EntityPCosmical)((Object)entity)).field_70759_as, partialTicks);
            float f2 = f1 - f;
            if (shouldSit && entity.func_184187_bx() instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase = (EntityLivingBase)entity.func_184187_bx();
                f = this.func_77034_a(entitylivingbase.field_70760_ar, entitylivingbase.field_70761_aq, partialTicks);
                f2 = f1 - f;
                float f3 = MathHelper.func_76142_g((float)f2);
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
            float f7 = ((EntityPCosmical)((Object)entity)).field_70127_C + (((EntityPCosmical)((Object)entity)).field_70125_A - ((EntityPCosmical)((Object)entity)).field_70127_C) * partialTicks;
            this.func_77039_a((EntityLivingBase)entity, x, y, z);
            float f8 = this.func_77044_a((EntityLivingBase)entity, partialTicks);
            this.func_77043_a((EntityLivingBase)entity, f8, f, partialTicks);
            float f4 = this.prepareScaleCosmical(entity, partialTicks);
            float f5 = 0.0f;
            float f6 = 0.0f;
            if (!entity.func_184218_aH()) {
                f5 = ((EntityPCosmical)((Object)entity)).field_184618_aE + (((EntityPCosmical)((Object)entity)).field_70721_aZ - ((EntityPCosmical)((Object)entity)).field_184618_aE) * partialTicks;
                f6 = ((EntityPCosmical)((Object)entity)).field_184619_aG - ((EntityPCosmical)((Object)entity)).field_70721_aZ * (1.0f - partialTicks);
                if (entity.func_70631_g_()) {
                    f6 *= 3.0f;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                f2 = f1 - f;
            }
            GlStateManager.func_179141_d();
            this.mainModel2.func_78086_a((EntityLivingBase)entity, f6, f5, partialTicks);
            this.mainModel2.setRotationAnglesCosmical(f6, f5, f8, f2, f7, f4, (Entity)entity);
            if (this.field_188301_f) {
                boolean flag1 = this.func_177088_c((EntityLivingBase)entity);
                GlStateManager.func_179142_g();
                GlStateManager.func_187431_e((int)this.func_188298_c((Entity)entity));
                if (!this.field_188323_j) {
                    this.renderModelCosmical(entity, f6, f5, f8, f2, f7, f4);
                }
                this.func_177093_a((EntityLivingBase)entity, f6, f5, partialTicks, f8, f2, f7, f4);
                GlStateManager.func_187417_n();
                GlStateManager.func_179119_h();
                if (flag1) {
                    this.func_180565_e();
                }
            } else {
                boolean flag = this.func_177090_c((EntityLivingBase)entity, partialTicks);
                this.renderModelCosmical(entity, f6, f5, f8, f2, f7, f4);
                if (flag) {
                    this.func_177091_f();
                }
                GlStateManager.func_179132_a((boolean)true);
                this.func_177093_a((EntityLivingBase)entity, f6, f5, partialTicks, f8, f2, f7, f4);
            }
            GlStateManager.func_179101_C();
        }
        catch (Exception exception) {
            // empty catch block
        }
        GlStateManager.func_179138_g((int)OpenGlHelper.field_77476_b);
        GlStateManager.func_179098_w();
        GlStateManager.func_179138_g((int)OpenGlHelper.field_77478_a);
        GlStateManager.func_179089_o();
        GlStateManager.func_179121_F();
        MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Post(entity, (RenderLivingBase)this, partialTicks, x, y, z));
    }

    protected void renderModelCosmical(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        boolean flag1;
        boolean flag = this.func_193115_c((EntityLivingBase)entitylivingbaseIn);
        boolean bl = flag1 = !flag && !entitylivingbaseIn.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g);
        if (flag || flag1) {
            if (!this.bindEntityTextureCosmical(entitylivingbaseIn)) {
                return;
            }
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)0.35f);
            GlStateManager.func_179132_a((boolean)false);
            GlStateManager.func_179147_l();
            GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            GlStateManager.func_179092_a((int)516, (float)0.003921569f);
            this.mainModel2.renderC((Entity)entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
            GlStateManager.func_179084_k();
            GlStateManager.func_179092_a((int)516, (float)0.1f);
            GlStateManager.func_179132_a((boolean)true);
        }
    }

    protected abstract ResourceLocation getEntityTextureCosmical(T var1);

    protected boolean bindEntityTextureCosmical(T entity) {
        ResourceLocation resourcelocation = this.getEntityTextureCosmical(entity);
        if (resourcelocation == null) {
            return false;
        }
        this.func_110776_a(resourcelocation);
        return true;
    }

    protected float prepareScaleCosmical(T entitylivingbaseIn, float partialTicks) {
        GlStateManager.func_179091_B();
        GlStateManager.func_179152_a((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.preRenderCallbackCosmical(entitylivingbaseIn, partialTicks);
        float f = 0.0625f;
        GlStateManager.func_179109_b((float)0.0f, (float)-1.501f, (float)0.0f);
        return 0.0625f;
    }

    protected void preRenderCallbackCosmical(T entitylivingbaseIn, float partialTickTime) {
        GlStateManager.func_179139_a((double)1.2, (double)1.2, (double)1.2);
    }
}

