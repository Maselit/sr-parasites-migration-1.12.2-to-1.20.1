package com.dhanantry.scapeandrunparasites.client.model.entity.awakened;

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

public class ModelOroncoAW extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "oroncoaw"), "main");
    private final ModelPart mainbody;
    private final ModelPart jointH;
    private final ModelPart body;
    private final ModelPart b;
    private final ModelPart head;
    private final ModelPart taclejointUM1;
    private final ModelPart taclejointDM1;
    private final ModelPart taclejointRM1;
    private final ModelPart taclejointLM1;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart tentacle;
    private final ModelPart taclejointUM2;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointUM3;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointUM4;
    private final ModelPart tentacle_3;
    private final ModelPart tentacle_4;
    private final ModelPart taclejointDM2;
    private final ModelPart tentacle_5;
    private final ModelPart taclejointDM3;
    private final ModelPart tentacle_6;
    private final ModelPart taclejointDM4;
    private final ModelPart tentacle_7;
    private final ModelPart tentacle_8;
    private final ModelPart taclejointRM2;
    private final ModelPart tentacle_9;
    private final ModelPart taclejointRM3;
    private final ModelPart tentacle_10;
    private final ModelPart taclejointRM4;
    private final ModelPart tentacle_11;
    private final ModelPart tentacle_12;
    private final ModelPart taclejointLM2;
    private final ModelPart tentacle_13;
    private final ModelPart taclejointLM3;
    private final ModelPart tentacle_14;
    private final ModelPart taclejointLM4;
    private final ModelPart tentacle_15;

    public ModelOroncoAW(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.jointH = root.getChild("jointH");
        this.body = root.getChild("mainbody").getChild("body");
        this.b = root.getChild("mainbody").getChild("b");
        this.head = root.getChild("jointH").getChild("head");
        this.taclejointUM1 = root.getChild("jointH").getChild("head").getChild("taclejointUM1");
        this.taclejointDM1 = root.getChild("jointH").getChild("head").getChild("taclejointDM1");
        this.taclejointRM1 = root.getChild("jointH").getChild("head").getChild("taclejointRM1");
        this.taclejointLM1 = root.getChild("jointH").getChild("head").getChild("taclejointLM1");
        this.dec = root.getChild("jointH").getChild("head").getChild("dec");
        this.dec_1 = root.getChild("jointH").getChild("head").getChild("dec_1");
        this.tentacle = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle");
        this.taclejointUM2 = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle").getChild("taclejointUM2");
        this.tentacle_1 = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle").getChild("taclejointUM2").getChild("tentacle_1");
        this.taclejointUM3 = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle").getChild("taclejointUM2").getChild("tentacle_1").getChild("taclejointUM3");
        this.tentacle_2 = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle").getChild("taclejointUM2").getChild("tentacle_1").getChild("taclejointUM3").getChild("tentacle_2");
        this.taclejointUM4 = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle").getChild("taclejointUM2").getChild("tentacle_1").getChild("taclejointUM3").getChild("tentacle_2").getChild("taclejointUM4");
        this.tentacle_3 = root.getChild("jointH").getChild("head").getChild("taclejointUM1").getChild("tentacle").getChild("taclejointUM2").getChild("tentacle_1").getChild("taclejointUM3").getChild("tentacle_2").getChild("taclejointUM4").getChild("tentacle_3");
        this.tentacle_4 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4");
        this.taclejointDM2 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4").getChild("taclejointDM2");
        this.tentacle_5 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4").getChild("taclejointDM2").getChild("tentacle_5");
        this.taclejointDM3 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4").getChild("taclejointDM2").getChild("tentacle_5").getChild("taclejointDM3");
        this.tentacle_6 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4").getChild("taclejointDM2").getChild("tentacle_5").getChild("taclejointDM3").getChild("tentacle_6");
        this.taclejointDM4 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4").getChild("taclejointDM2").getChild("tentacle_5").getChild("taclejointDM3").getChild("tentacle_6").getChild("taclejointDM4");
        this.tentacle_7 = root.getChild("jointH").getChild("head").getChild("taclejointDM1").getChild("tentacle_4").getChild("taclejointDM2").getChild("tentacle_5").getChild("taclejointDM3").getChild("tentacle_6").getChild("taclejointDM4").getChild("tentacle_7");
        this.tentacle_8 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8");
        this.taclejointRM2 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8").getChild("taclejointRM2");
        this.tentacle_9 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8").getChild("taclejointRM2").getChild("tentacle_9");
        this.taclejointRM3 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8").getChild("taclejointRM2").getChild("tentacle_9").getChild("taclejointRM3");
        this.tentacle_10 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8").getChild("taclejointRM2").getChild("tentacle_9").getChild("taclejointRM3").getChild("tentacle_10");
        this.taclejointRM4 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8").getChild("taclejointRM2").getChild("tentacle_9").getChild("taclejointRM3").getChild("tentacle_10").getChild("taclejointRM4");
        this.tentacle_11 = root.getChild("jointH").getChild("head").getChild("taclejointRM1").getChild("tentacle_8").getChild("taclejointRM2").getChild("tentacle_9").getChild("taclejointRM3").getChild("tentacle_10").getChild("taclejointRM4").getChild("tentacle_11");
        this.tentacle_12 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12");
        this.taclejointLM2 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12").getChild("taclejointLM2");
        this.tentacle_13 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12").getChild("taclejointLM2").getChild("tentacle_13");
        this.taclejointLM3 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12").getChild("taclejointLM2").getChild("tentacle_13").getChild("taclejointLM3");
        this.tentacle_14 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12").getChild("taclejointLM2").getChild("tentacle_13").getChild("taclejointLM3").getChild("tentacle_14");
        this.taclejointLM4 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12").getChild("taclejointLM2").getChild("tentacle_13").getChild("taclejointLM3").getChild("tentacle_14").getChild("taclejointLM4");
        this.tentacle_15 = root.getChild("jointH").getChild("head").getChild("taclejointLM1").getChild("tentacle_12").getChild("taclejointLM2").getChild("tentacle_13").getChild("taclejointLM3").getChild("tentacle_14").getChild("taclejointLM4").getChild("tentacle_15");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -33.0f, -23.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(237, 0).addBox(-35.0f, -1.0f, -19.5f, 70, 80, 48), PartPose.offsetAndRotation(0.0f, -10.0f, 0.0f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0f, -15.0f, 0.0f, 30, 30, 66), PartPose.offsetAndRotation(0.0f, 17.0f, 36.0f, 0.34906584f, 0.0f, 0.0f));
        PartDefinition jointH = root.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, -35.0f));
        PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(192, 182).addBox(-6.0f, -12.0f, -10.0f, 12, 12, 18), PartPose.offsetAndRotation(0.0f, 0.0f, -9.0f, -2.5830872f, 0.0f, 0.0f));
        PartDefinition taclejointRM1 = head.addOrReplaceChild("taclejointRM1", CubeListBuilder.create().texOffs(110, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, -6.0f, 4.5f));
        PartDefinition tentacle_8 = taclejointRM1.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(347, 274).addBox(-3.5f, -2.5f, -1.0f, 7, 5, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.9424778f, -0.33161256f, 1.5707964f));
        PartDefinition taclejointRM2 = tentacle_8.addOrReplaceChild("taclejointRM2", CubeListBuilder.create().texOffs(206, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_9 = taclejointRM2.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(76, 234).addBox(-4.0f, -2.0f, -1.0f, 8, 4, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointRM3 = tentacle_9.addOrReplaceChild("taclejointRM3", CubeListBuilder.create().texOffs(358, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_10 = taclejointRM3.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(173, 253).addBox(-3.5f, -1.5f, -1.0f, 7, 3, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition taclejointRM4 = tentacle_10.addOrReplaceChild("taclejointRM4", CubeListBuilder.create().texOffs(77, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_11 = taclejointRM4.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(559, 243).addBox(-3.0f, -1.0f, -1.0f, 6, 2, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.6632251f, 0.0f, 0.0f));
        PartDefinition taclejointDM1 = head.addOrReplaceChild("taclejointDM1", CubeListBuilder.create().texOffs(184, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -11.5f, 5.5f));
        PartDefinition tentacle_4 = taclejointDM1.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(32, 235).addBox(-3.5f, -2.5f, -1.0f, 7, 5, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.012291f, 0.0f, (float)Math.PI));
        PartDefinition taclejointDM2 = tentacle_4.addOrReplaceChild("taclejointDM2", CubeListBuilder.create().texOffs(196, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_5 = taclejointDM2.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(399, 252).addBox(-3.0f, -2.0f, -1.0f, 6, 4, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.40142572f, 0.0f, 0.0f));
        PartDefinition taclejointDM3 = tentacle_5.addOrReplaceChild("taclejointDM3", CubeListBuilder.create().texOffs(352, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_6 = taclejointDM3.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(0, 236).addBox(-2.5f, -1.5f, -1.0f, 5, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.38397244f, 0.0f, 0.0f));
        PartDefinition taclejointDM4 = tentacle_6.addOrReplaceChild("taclejointDM4", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_7 = taclejointDM4.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(0, 222).addBox(-2.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.34906584f, 0.0f, 0.0f));
        PartDefinition taclejointUM1 = head.addOrReplaceChild("taclejointUM1", CubeListBuilder.create().texOffs(168, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offset(0.0f, -0.5f, 4.5f));
        PartDefinition tentacle = taclejointUM1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(258, 270).addBox(-3.5f, -2.5f, -2.0f, 7, 5, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.34906584f, 0.0f, 0.0f));
        PartDefinition taclejointUM2 = tentacle.addOrReplaceChild("taclejointUM2", CubeListBuilder.create().texOffs(180, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_1 = taclejointUM2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(99, 254).addBox(-3.0f, -2.0f, -1.0f, 6, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.31415927f, 0.0f, 0.0f));
        PartDefinition taclejointUM3 = tentacle_1.addOrReplaceChild("taclejointUM3", CubeListBuilder.create().texOffs(346, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_2 = taclejointUM3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(421, 255).addBox(-2.5f, -1.5f, -1.0f, 5, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointUM4 = tentacle_2.addOrReplaceChild("taclejointUM4", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_3 = taclejointUM4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(0, 250).addBox(-2.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.55850536f, 0.0f, 0.0f));
        PartDefinition taclejointLM1 = head.addOrReplaceChild("taclejointLM1", CubeListBuilder.create().texOffs(200, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, -6.0f, 4.5f));
        PartDefinition tentacle_12 = taclejointLM1.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(297, 257).addBox(-3.5f, -2.5f, -1.0f, 7, 5, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.9424778f, 0.33161256f, -1.5707964f));
        PartDefinition taclejointLM2 = tentacle_12.addOrReplaceChild("taclejointLM2", CubeListBuilder.create().texOffs(570, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_13 = taclejointLM2.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(118, 188).addBox(-4.0f, -2.0f, -1.0f, 8, 4, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointLM3 = tentacle_13.addOrReplaceChild("taclejointLM3", CubeListBuilder.create().texOffs(364, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_14 = taclejointLM3.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(372, 254).addBox(-3.5f, -1.5f, -1.0f, 7, 3, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition taclejointLM4 = tentacle_14.addOrReplaceChild("taclejointLM4", CubeListBuilder.create().texOffs(94, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_15 = taclejointLM4.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(551, 205).addBox(-3.0f, -1.0f, -1.0f, 6, 2, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.6632251f, 0.0f, 0.0f));
        PartDefinition dec = head.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(88, 77).addBox(-4.0f, -2.0f, -1.5f, 8, 9, 3), PartPose.offsetAndRotation(3.9f, -2.2f, -1.0f, 0.38397244f, 0.0f, -0.7853982f));
        PartDefinition dec_1 = head.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(141, 77).addBox(-4.0f, -2.0f, -1.5f, 8, 9, 3), PartPose.offsetAndRotation(-3.9f, -2.2f, -1.0f, 0.38397244f, 0.0f, 0.7853982f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        jointH.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
