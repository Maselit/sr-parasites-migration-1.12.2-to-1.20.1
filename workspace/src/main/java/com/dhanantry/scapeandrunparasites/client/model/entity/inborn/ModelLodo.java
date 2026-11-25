package com.dhanantry.scapeandrunparasites.client.model.entity.inborn;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityLodo;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelLodo extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "lodo"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodyfront;
    private final ModelPart joint1;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart body;
    private final ModelPart joint2;
    private final ModelPart bodyMiddle;
    private final ModelPart joint3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart dec_6;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart dec_10;
    private final ModelPart body_1;
    private final ModelPart joint4;
    private final ModelPart bodyback;
    private final ModelPart joint5;
    private final ModelPart dec_11;
    private final ModelPart dec_12;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart body_2;

    public ModelLodo(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodyfront = root.getChild("mainbody").getChild("bodyfront");
        this.joint1 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1");
        this.dec = root.getChild("mainbody").getChild("bodyfront").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("bodyfront").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodyfront").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodyfront").getChild("dec_3");
        this.body = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body");
        this.joint2 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2");
        this.bodyMiddle = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle");
        this.joint3 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3");
        this.dec_4 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("dec_10");
        this.body_1 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1");
        this.joint4 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4");
        this.bodyback = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback");
        this.joint5 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback").getChild("joint5");
        this.dec_11 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback").getChild("dec_12");
        this.dec_13 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback").getChild("dec_14");
        this.body_2 = root.getChild("mainbody").getChild("bodyfront").getChild("joint1").getChild("body").getChild("joint2").getChild("bodyMiddle").getChild("joint3").getChild("body_1").getChild("joint4").getChild("bodyback").getChild("joint5").getChild("body_2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, 0.0f, -3.0f, 2, 1, 2), PartPose.offset(0.0f, 23.0f, -3.0f));
        PartDefinition bodyfront = mainbody.addOrReplaceChild("bodyfront", CubeListBuilder.create().texOffs(5, 0).addBox(-2.0f, -1.0f, -1.0f, 4, 2, 3), PartPose.offset(0.0f, 0.0f, -1.5f));
        PartDefinition dec_1 = bodyfront.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-0.9f, -0.5f, -0.2f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition dec_2 = bodyfront.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.5f, 0.0f, -0.2f, 0.0f, -0.38397244f, 0.0f));
        PartDefinition dec = bodyfront.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.9f, -0.5f, -0.2f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition dec_3 = bodyfront.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.5f, 0.0f, -0.2f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition joint1 = bodyfront.addOrReplaceChild("joint1", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 2), PartPose.offset(0.0f, 0.0f, 0.4f));
        PartDefinition body = joint1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(35, 0).addBox(-2.5f, -2.0f, -1.0f, 5, 3, 3), PartPose.offset(0.0f, 0.0f, 1.5f));
        PartDefinition joint2 = body.addOrReplaceChild("joint2", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 2), PartPose.offset(0.0f, 0.0f, -0.5f));
        PartDefinition bodyMiddle = joint2.addOrReplaceChild("bodyMiddle", CubeListBuilder.create().texOffs(16, 3).addBox(-3.0f, -3.0f, -1.5f, 6, 4, 3), PartPose.offset(0.0f, 0.0f, 2.5f));
        PartDefinition dec_4 = bodyMiddle.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -2.6f, -0.7f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition dec_7 = bodyMiddle.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(31, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.6f, -1.7f, -0.7f, 0.0f, -0.38397244f, 0.0f));
        PartDefinition dec_10 = bodyMiddle.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.6f, -0.2f, -0.7f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition dec_5 = bodyMiddle.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(0, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.8f, -2.6f, -0.7f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition joint3 = bodyMiddle.addOrReplaceChild("joint3", CubeListBuilder.create().texOffs(54, 1).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 2), PartPose.offset(0.0f, 0.0f, 0.4f));
        PartDefinition body_1 = joint3.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(34, 6).addBox(-2.5f, -2.0f, -2.0f, 5, 3, 3), PartPose.offset(0.0f, 0.0f, 1.5f));
        PartDefinition joint4 = body_1.addOrReplaceChild("joint4", CubeListBuilder.create().texOffs(2, 5).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 2), PartPose.offset(0.0f, 0.0f, 0.4f));
        PartDefinition bodyback = joint4.addOrReplaceChild("bodyback", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 0.0f, 1.5f));
        PartDefinition dec_11 = bodyback.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(8, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-0.9f, -0.6f, 1.2f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition joint5 = bodyback.addOrReplaceChild("joint5", CubeListBuilder.create().texOffs(47, 6).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 2), PartPose.offset(0.0f, 0.0f, 0.4f));
        PartDefinition body_2 = joint5.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(45, 9).addBox(-1.0f, 0.0f, -2.0f, 2, 1, 5), PartPose.offset(0.0f, 0.0f, 1.5f));
        PartDefinition dec_14 = bodyback.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(57, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.6f, 0.0f, 1.2f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition dec_12 = bodyback.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(12, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.9f, -0.6f, 1.2f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition dec_13 = bodyback.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(53, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.6f, 0.0f, 1.2f, 0.0f, -0.38397244f, 0.0f));
        PartDefinition dec_6 = bodyMiddle.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(51, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.8f, -2.6f, -0.7f, -0.38397244f, 0.0f, 0.0f));
        PartDefinition dec_8 = bodyMiddle.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(54, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.6f, -0.2f, -0.7f, 0.0f, -0.38397244f, 0.0f));
        PartDefinition dec_9 = bodyMiddle.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(58, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.6f, -1.7f, -0.7f, 0.0f, 0.38397244f, 0.0f));
        return LayerDefinition.create(mesh, 64, 16);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityLodo ven = (EntityLodo)entity;
        float f6 = (float)ven.getFloorTimer();
        if (f6 >= 0.0f) {
            float f2 = Mth.cos((float)(ageInTicks * 2.6f)) * 0.015f;
            float f1 = Mth.cos((float)(ageInTicks * 2.27f)) * 0.02f;
            this.mainbody.x = f2;
            this.mainbody.z = f1;
            this.mainbody.xRot = 1.6f;
            this.mainbody.z = 0.2f;
            this.mainbody.y = f6;
            f1 = Mth.cos((float)(ageInTicks * 0.643219f)) * 0.06510051f;
            f2 = Mth.cos((float)(ageInTicks * 0.643219f)) * 0.06510015f;
            this.joint1.yRot = f1;
            this.joint2.yRot = f1;
            this.joint3.yRot = f1;
            this.joint4.yRot = f1;
            this.joint5.yRot = f1;
            this.mainbody.zRot = f2;
            this.bodyMiddle.zRot = f2;
        } else {
            this.mainbody.x = 0.0f;
            this.mainbody.z = 0.0f;
            this.mainbody.xRot = 0.0f;
            this.mainbody.z = 0.0f;
            this.mainbody.y = 0.0f;
            float f1 = Mth.cos((float)(limbSwing * 1.5f)) * 1.0f * limbSwingAmount * 0.25f;
            float f2 = Mth.cos((float)(limbSwing * 1.5f)) * 1.0f * limbSwingAmount * 0.15f;
            this.joint1.yRot = f1;
            this.joint2.yRot = f1;
            this.joint3.yRot = f1;
            this.joint4.yRot = f1;
            this.joint5.yRot = f1;
            this.mainbody.zRot = f2;
            this.bodyMiddle.zRot = f2;
        }
    
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
        modelRenderer.y = (float)invert * Mth.cos(f * speed) * f1 * distance;
    }

    private void underground(com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase parasite, float ageInTicks, ModelPart mainbody) {
    }

}
