package com.dhanantry.scapeandrunparasites.client.model.entity.primitive;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelHull extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "hull"), "main");
    private final ModelPart jointFRL;
    private final ModelPart mainbody;
    private final ModelPart jointBLL;
    private final ModelPart jointFLL;
    private final ModelPart jointBRL;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelHull(ModelPart root) {
        this.jointFRL = root.getChild("mainbody").getChild("body").getChild("jointFRL");
        this.mainbody = root.getChild("mainbody");
        this.jointBLL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("body_4").getChild("body_5").getChild("jointBLL");
        this.jointFLL = root.getChild("mainbody").getChild("body").getChild("jointFLL");
        this.jointBRL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("body_4").getChild("body_5").getChild("jointBRL");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 8.0f;
        this.mainbodyBaseZ = 0.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 8.0f, 0.0f));
                PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0f, 0.0f, -2.0f, 12, 10, 5), PartPose.offsetAndRotation(0.0f, -6.3f, -3.9f, -0.61086524f, 0.0f, 0.0f));
                PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(34, 0).addBox(-5.5f, 2.0f, -5.0f, 11, 7, 7), PartPose.offsetAndRotation(0.0f, -0.5f, 1.7f, 0.61086524f, 0.0f, 0.0f));
                PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(64, 11).addBox(-5.0f, 0.0f, -3.0f, 10, 4, 6), PartPose.offsetAndRotation(0.0f, 5.3f, 2.0f, 1.5707964f, 0.0f, 0.0f));
                PartDefinition body_3 = body_2.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(100, 7).addBox(-4.5f, 0.0f, -2.0f, 9, 3, 4), PartPose.offset(0.0f, 4.0f, 0.7f));
                PartDefinition body_4 = body_3.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(28, 14).addBox(-5.5f, 0.0f, -3.0f, 11, 2, 6), PartPose.offsetAndRotation(0.0f, 2.7f, -1.0f, -0.07853982f, 0.0f, 0.0f));
                PartDefinition body_5 = body_4.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(54, 21).addBox(-6.0f, 0.0f, -4.0f, 12, 5, 8), PartPose.offsetAndRotation(0.0f, 1.8f, -0.6f, -0.07853982f, 0.0f, 0.0f));
                PartDefinition jointBLL = body_5.addOrReplaceChild("jointBLL", CubeListBuilder.create().texOffs(98, 0).addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2), PartPose.offset(6.0f, 2.3f, 1.0f));
                PartDefinition leg = jointBLL.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(0.4f, 1.9f, 1.1f, -2.0943952f, 0.0f, 0.2617994f));
                PartDefinition jointBLL1 = leg.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.1f, 6.0f, 2.0f));
                PartDefinition leg_1 = jointBLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(16, 15).addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
                PartDefinition leg_2 = leg_1.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(26, 22).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2), PartPose.offsetAndRotation(0.1f, 3.5f, -1.1f, -1.5707964f, 0.0f, 0.0f));
                PartDefinition feet = leg_2.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(114, 0).addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(0.1f, 8.0f, 1.0f, -0.87266463f, -0.0017453292f, 0.0f));
                PartDefinition body_6 = body_5.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(90, 15).addBox(-5.0f, 0.0f, -3.0f, 10, 1, 6), PartPose.offset(0.0f, 5.0f, 0.7f));
                PartDefinition jointBRL = body_5.addOrReplaceChild("jointBRL", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2), PartPose.offset(-6.0f, 2.3f, 1.0f));
                PartDefinition leg_3 = jointBRL.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(34, 22).addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(-0.4f, 1.9f, 1.1f, -2.0943952f, 0.0f, -0.2617994f));
                PartDefinition jointBRL1 = leg_3.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.1f, 6.0f, 2.0f));
                PartDefinition leg_4 = jointBRL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(94, 22).addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
                PartDefinition leg_5 = leg_4.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(106, 22).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2), PartPose.offsetAndRotation(-0.1f, 3.5f, -1.1f, -1.5707964f, 0.0f, 0.0f));
                PartDefinition feet_1 = leg_5.addOrReplaceChild("feet_1", CubeListBuilder.create().texOffs(50, 22).addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(-0.1f, 8.0f, 1.0f, -0.87266463f, -0.0017453292f, 0.0f));
                PartDefinition jointFLL = body.addOrReplaceChild("jointFLL", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2), PartPose.offset(6.0f, 5.9f, 2.1f));
                PartDefinition leg_6 = jointFLL.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4), PartPose.offsetAndRotation(0.4f, 0.0f, -1.3f, 1.0471976f, 0.0f, 0.0f));
                PartDefinition jointFLL1 = leg_6.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.1f, 6.3f, -0.2f));
                PartDefinition leg_7 = jointFLL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(114, 22).addBox(-1.5f, 0.0f, -1.0f, 3, 11, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.9578367f, 0.0f, 0.0f));
                PartDefinition feet_2 = leg_7.addOrReplaceChild("feet_2", CubeListBuilder.create().texOffs(14, 25).addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(0.1f, 11.3f, 1.0f, -1.0646509f, -0.0017453292f, 0.0f));
                PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(70, 0).addBox(-5.5f, -4.0f, -6.0f, 11, 5, 6), PartPose.offsetAndRotation(0.0f, 2.8f, 1.4f, 1.0471976f, 0.0f, 0.0f));
                PartDefinition neck_1 = neck.addOrReplaceChild("neck_1", CubeListBuilder.create().texOffs(88, 32).addBox(-4.0f, -4.0f, -6.0f, 8, 5, 6), PartPose.offsetAndRotation(0.0f, 1.4f, -4.9f, 0.045553092f, 0.0f, 0.0f));
                PartDefinition jointH = neck_1.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(90, 11).addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2), PartPose.offsetAndRotation(0.0f, -1.8f, -5.3f, -0.43633232f, 0.0f, 0.0f));
                PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(16, 34).addBox(-5.0f, -3.0f, -2.0f, 10, 7, 4), PartPose.offsetAndRotation(0.0f, 0.5f, -1.3f, 0.22759093f, 0.0f, 0.0f));
                PartDefinition head_1 = head.addOrReplaceChild("head_1", CubeListBuilder.create().texOffs(44, 34).addBox(-4.0f, 0.0f, -2.0f, 8, 4, 4), PartPose.offset(0.0f, -0.4f, -0.7f));
                PartDefinition jointFRL = body.addOrReplaceChild("jointFRL", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2), PartPose.offset(-6.0f, 5.9f, 2.1f));
                PartDefinition leg_8 = jointFRL.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(68, 34).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4), PartPose.offsetAndRotation(-0.4f, 0.0f, -1.3f, 1.0471976f, 0.0f, 0.0f));
                PartDefinition jointFRL1 = leg_8.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.1f, 6.3f, -0.2f));
                PartDefinition leg_9 = jointFRL1.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(116, 35).addBox(-1.5f, 0.0f, -1.0f, 3, 11, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.9578367f, 0.0f, 0.0f));
                PartDefinition feet_3 = leg_9.addOrReplaceChild("feet_3", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0f, 0.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(-0.1f, 11.3f, 1.0f, -1.0646509f, -0.0017453292f, 0.0f));
        return LayerDefinition.create(mesh, 128, 50);
    }


    private void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    private void swingX(ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.xRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingX(ModelPart modelRenderer, float speed, float degree, int invert, float offset, float weight, float limbSwing, float limbSwingAmount) {
        modelRenderer.xRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed + offset) + (double)(weight * limbSwingAmount));
    }

    private void swingX(float pref, ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.xRot = pref + (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingY(ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.yRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingY(ModelPart modelRenderer, float speed, float degree, int invert, float offset, float weight, float limbSwing, float limbSwingAmount) {
        modelRenderer.yRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed + offset) + (double)(weight * limbSwingAmount));
    }

    private void swingY(float pref, ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.yRot = pref + (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingZ(ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.zRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingZ(ModelPart modelRenderer, float speed, float degree, int invert, float offset, float weight, float limbSwing, float limbSwingAmount) {
        modelRenderer.zRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed + offset) + (double)(weight * limbSwingAmount));
    }

    private void swingZ(float pref, ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.zRot = pref + (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void moveY(ModelPart modelRenderer, float speed, int invert, float f, float f1, float distance) {
        float base = (modelRenderer == this.mainbody) ? this.mainbodyBaseY : 0.0f;
        modelRenderer.y = base + (float)invert * Mth.cos(f * speed) * f1 * distance;
    }

    private void underground(com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase parasite, float ageInTicks, ModelPart mainbody) {
    }


    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointFLL.xRot = 0.0f;
        this.jointFRL.xRot = 0.0f;
        this.jointBLL.xRot = 0.0f;
        this.jointBRL.xRot = 0.0f;
        this.mainbody.y = this.mainbodyBaseY + (0.0f);
        this.mainbody.xRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 1.1f;
                float GD = 0.6f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.mainbody.xRot = 0.0f;
            }
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 1.1f;
                float GD = 0.6f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.mainbody.xRot = 0.0f;
            }
        } else if (i == 2 && !parasite.getStillAni()) {
            float GS = 1.2f;
            float GD = 0.5f;
            this.swingX(this.jointFLL, 0.3f * GS, 1.5f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
            this.swingX(this.jointFRL, 0.3f * GS, 1.5f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
            this.swingX(this.jointBLL, 0.3f * GS, 1.8f * GD, 1, -0.5f, 0.6f, limbSwing, limbSwingAmount);
            this.swingX(this.jointBRL, 0.3f * GS, 1.8f * GD, 1, 0.5f, 0.6f, limbSwing, limbSwingAmount);
            this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.04f);
            this.swingX(this.mainbody, 0.3f * GS, 0.4f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}