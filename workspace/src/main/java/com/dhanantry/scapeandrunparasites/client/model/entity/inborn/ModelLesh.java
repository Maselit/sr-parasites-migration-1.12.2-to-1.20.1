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
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelLesh extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "lesh"), "main");
    private final ModelPart mainbody;
    private final ModelPart body;
    private final ModelPart jointup;
    private final ModelPart jointright;
    private final ModelPart jointtail;
    private final ModelPart jointleft;
    private final ModelPart body_1;
    private final ModelPart jointup1;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart jointup2;
    private final ModelPart pop8;
    private final ModelPart pop7;
    private final ModelPart body_4;
    private final ModelPart body_5;
    private final ModelPart jointright1;
    private final ModelPart pop5;
    private final ModelPart body_6;
    private final ModelPart jointright2;
    private final ModelPart body_7;
    private final ModelPart body_8;
    private final ModelPart jointtail1;
    private final ModelPart pop4;
    private final ModelPart pop3;
    private final ModelPart pop6;
    private final ModelPart body_9;
    private final ModelPart jointtail2;
    private final ModelPart body_10;
    private final ModelPart body_11;
    private final ModelPart jointleft1;
    private final ModelPart pop1;
    private final ModelPart pop2;
    private final ModelPart body_12;
    private final ModelPart jointleft2;
    private final ModelPart body_13;

    public ModelLesh(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body = root.getChild("mainbody").getChild("body");
        this.jointup = root.getChild("mainbody").getChild("body").getChild("jointup");
        this.jointright = root.getChild("mainbody").getChild("body").getChild("jointright");
        this.jointtail = root.getChild("mainbody").getChild("body").getChild("jointtail");
        this.jointleft = root.getChild("mainbody").getChild("body").getChild("jointleft");
        this.body_1 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1");
        this.jointup1 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("jointup1");
        this.body_2 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("jointup1").getChild("body_3");
        this.jointup2 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("jointup1").getChild("body_3").getChild("jointup2");
        this.pop8 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("jointup1").getChild("body_3").getChild("pop8");
        this.pop7 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("jointup1").getChild("body_3").getChild("pop7");
        this.body_4 = root.getChild("mainbody").getChild("body").getChild("jointup").getChild("body_1").getChild("jointup1").getChild("body_3").getChild("jointup2").getChild("body_4");
        this.body_5 = root.getChild("mainbody").getChild("body").getChild("jointright").getChild("body_5");
        this.jointright1 = root.getChild("mainbody").getChild("body").getChild("jointright").getChild("body_5").getChild("jointright1");
        this.pop5 = root.getChild("mainbody").getChild("body").getChild("jointright").getChild("body_5").getChild("pop5");
        this.body_6 = root.getChild("mainbody").getChild("body").getChild("jointright").getChild("body_5").getChild("jointright1").getChild("body_6");
        this.jointright2 = root.getChild("mainbody").getChild("body").getChild("jointright").getChild("body_5").getChild("jointright1").getChild("body_6").getChild("jointright2");
        this.body_7 = root.getChild("mainbody").getChild("body").getChild("jointright").getChild("body_5").getChild("jointright1").getChild("body_6").getChild("jointright2").getChild("body_7");
        this.body_8 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8");
        this.jointtail1 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("jointtail1");
        this.pop4 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("pop4");
        this.pop3 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("pop3");
        this.pop6 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("pop6");
        this.body_9 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("jointtail1").getChild("body_9");
        this.jointtail2 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("jointtail1").getChild("body_9").getChild("jointtail2");
        this.body_10 = root.getChild("mainbody").getChild("body").getChild("jointtail").getChild("body_8").getChild("jointtail1").getChild("body_9").getChild("jointtail2").getChild("body_10");
        this.body_11 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11");
        this.jointleft1 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11").getChild("jointleft1");
        this.pop1 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11").getChild("pop1");
        this.pop2 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11").getChild("pop2");
        this.body_12 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11").getChild("jointleft1").getChild("body_12");
        this.jointleft2 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11").getChild("jointleft1").getChild("body_12").getChild("jointleft2");
        this.body_13 = root.getChild("mainbody").getChild("body").getChild("jointleft").getChild("body_11").getChild("jointleft1").getChild("body_12").getChild("jointleft2").getChild("body_13");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 23.0f, 0.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0f, -4.0f, -7.0f, 10, 5, 14), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointtail = body.addOrReplaceChild("jointtail", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -0.5f, 7.0f));
        PartDefinition body_8 = jointtail.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(34, 25).addBox(-3.0f, -1.5f, -3.0f, 6, 3, 5), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition jointtail1 = body_8.addOrReplaceChild("jointtail1", CubeListBuilder.create().texOffs(58, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.5f, 1.5f));
        PartDefinition body_9 = jointtail1.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(0, 33).addBox(-2.5f, -1.0f, -2.5f, 5, 2, 4), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition jointtail2 = body_9.addOrReplaceChild("jointtail2", CubeListBuilder.create().texOffs(34, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.5f, 1.5f));
        PartDefinition body_10 = jointtail2.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(18, 33).addBox(-1.0f, -0.5f, -3.0f, 2, 1, 5), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition pop3 = body_8.addOrReplaceChild("pop3", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-0.5f, -1.5f, 0.5f, -0.33161256f, -0.17453292f, 0.0f));
        PartDefinition pop4 = body_8.addOrReplaceChild("pop4", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-2.0f, -1.5f, 0.5f, -0.33161256f, -0.4537856f, 0.0f));
        PartDefinition pop6 = body_8.addOrReplaceChild("pop6", CubeListBuilder.create().texOffs(3, 10).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-3.0f, -0.5f, 0.5f, -0.34906584f, -0.2443461f, -1.5707964f));
        PartDefinition jointleft = body.addOrReplaceChild("jointleft", CubeListBuilder.create().texOffs(38, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(4.0f, -1.0f, 0.0f));
        PartDefinition body_11 = jointleft.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(22, 33).addBox(-2.0f, -1.0f, -5.0f, 4, 4, 10), PartPose.offsetAndRotation(2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5235988f));
        PartDefinition pop2 = body_11.addOrReplaceChild("pop2", CubeListBuilder.create().texOffs(59, 11).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.8f, -1.0f, -2.7f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointleft1 = body_11.addOrReplaceChild("jointleft1", CubeListBuilder.create().texOffs(54, 4).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5235988f));
        PartDefinition body_12 = jointleft1.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(40, 33).addBox(-2.0f, -1.0f, -1.5f, 6, 2, 3), PartPose.offsetAndRotation(1.2f, 0.5f, 0.4f, 0.0f, -0.7330383f, 0.0f));
        PartDefinition jointleft2 = body_12.addOrReplaceChild("jointleft2", CubeListBuilder.create().texOffs(58, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, 0.5f, 0.0f));
        PartDefinition body_13 = jointleft2.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(51, 25).addBox(-1.0f, -0.5f, -3.0f, 2, 1, 4), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, -1.9547688f, 0.0f));
        PartDefinition pop1 = body_11.addOrReplaceChild("pop1", CubeListBuilder.create().texOffs(7, 10).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-0.5f, -1.0f, -4.0f, 0.0f, 0.6457718f, 0.0f));
        PartDefinition jointright = body.addOrReplaceChild("jointright", CubeListBuilder.create().texOffs(8, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(-4.0f, -1.0f, 0.0f));
        PartDefinition body_5 = jointright.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(6, 19).addBox(-2.0f, -1.0f, -5.0f, 4, 4, 10), PartPose.offsetAndRotation(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5235988f));
        PartDefinition jointright1 = body_5.addOrReplaceChild("jointright1", CubeListBuilder.create().texOffs(34, 2).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.5235988f));
        PartDefinition body_6 = jointright1.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(24, 19).addBox(-2.0f, -1.0f, -1.5f, 6, 2, 3), PartPose.offsetAndRotation(-1.2f, 0.5f, 0.4f, 0.0f, -0.7330383f, (float)Math.PI));
        PartDefinition jointright2 = body_6.addOrReplaceChild("jointright2", CubeListBuilder.create().texOffs(54, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, -0.5f, 0.0f));
        PartDefinition body_7 = jointright2.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(24, 24).addBox(-1.0f, -0.5f, -3.0f, 2, 1, 4), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, -1.9547688f, 0.0f));
        PartDefinition pop5 = body_5.addOrReplaceChild("pop5", CubeListBuilder.create().texOffs(38, 2).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.6f, -1.0f, 3.7f, 0.0f, 0.57595867f, 0.0f));
        PartDefinition jointup = body.addOrReplaceChild("jointup", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -4.0f, -2.0f));
        PartDefinition body_1 = jointup.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(36, 0).addBox(-3.0f, -5.0f, -3.0f, 6, 6, 6), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(44, 15).addBox(-2.5f, -3.0f, -2.0f, 5, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 3.0f, 0.7853982f, 0.0f, 0.0f));
        PartDefinition jointup1 = body_1.addOrReplaceChild("jointup1", CubeListBuilder.create().texOffs(54, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -5.0f, 1.0f));
        PartDefinition body_3 = jointup1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0f, -2.0f, -2.0f, 4, 5, 4), PartPose.offsetAndRotation(0.0f, -1.0f, 1.0f, -0.57595867f, 0.0f, 0.0f));
        PartDefinition jointup2 = body_3.addOrReplaceChild("jointup2", CubeListBuilder.create().texOffs(58, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -2.5f, 0.5f));
        PartDefinition body_4 = jointup2.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(6, 3).addBox(-1.0f, -3.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.41887903f, 0.0f, 0.0f));
        PartDefinition pop7 = body_3.addOrReplaceChild("pop7", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.1f, -1.7f, 1.5707964f, 0.0f, -0.33161256f));
        PartDefinition pop8 = body_3.addOrReplaceChild("pop8", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, -0.9f, -1.7f, 1.5707964f, 0.0f, 0.55850536f));
        return LayerDefinition.create(mesh, 64, 50);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float f6;
        this.mainbody.y = 0.0f;
        float f1 = Mth.cos((float)(limbSwing * 0.35f + (float)Math.PI)) * 1.0f * limbSwingAmount;
        float f2 = Mth.cos((float)(limbSwing * 0.35f)) * 1.0f * limbSwingAmount;
        float f3 = Mth.cos((float)(limbSwing * 0.75f)) * limbSwingAmount * 0.4f;
        this.jointright1.yRot = f1;
        this.jointright2.yRot = f2;
        this.jointleft1.yRot = f1;
        this.jointleft2.yRot = f1;
        this.jointtail.yRot = f3;
        this.jointtail1.yRot = f3;
        this.jointtail2.yRot = f3;
        this.jointup.xRot = f6 = 0.6f * Mth.sin((float)(ageInTicks * 0.076843f)) * 0.15f;
        this.jointup1.xRot = f6;
        this.jointup2.xRot = f6;
        float age2f = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 2.0f)) / 4.0f;
        float age4f = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 4.0f)) / 4.0f;
        float age6f = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 6.0f)) / 4.0f;
        this.pop1.y = age2f / 4.0f;
        this.pop2.y = age4f / 4.0f;
        this.pop3.y = age6f / 4.0f;
        this.pop4.y = age2f / 4.0f;
        this.pop5.y = age4f / 4.0f;
        this.pop6.x = age6f / 4.0f;
        this.pop7.z = age4f / 4.0f;
        this.pop8.z = age6f / 4.0f;
        this.underground((EntityParasiteBase)entity, ageInTicks, this.mainbody);
    
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
