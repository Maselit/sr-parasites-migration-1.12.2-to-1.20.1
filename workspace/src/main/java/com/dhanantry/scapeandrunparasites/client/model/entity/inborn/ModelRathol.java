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

public class ModelRathol extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "rathol"), "main");
    private final ModelPart mainbody;
    private final ModelPart hip;
    private final ModelPart body1;
    private final ModelPart pop1;
    private final ModelPart pop2;
    private final ModelPart pop3;
    private final ModelPart pop4;
    private final ModelPart pop5;
    private final ModelPart pop6;
    private final ModelPart joint1;
    private final ModelPart joint2;
    private final ModelPart joint3;
    private final ModelPart hip2;
    private final ModelPart frontleg;
    private final ModelPart leftleg;
    private final ModelPart rightleg;
    private final ModelPart pop1_1;
    private final ModelPart pop2_2;
    private final ModelPart pop3_3;
    private final ModelPart up3head;
    private final ModelPart pop4_4;
    private final ModelPart up1;
    private final ModelPart up1_1;
    private final ModelPart up1arm;
    private final ModelPart up2;
    private final ModelPart up2_2;
    private final ModelPart up2sleg1;
    private final ModelPart up2sleg2;
    private final ModelPart up3;
    private final ModelPart up3_3;

    public ModelRathol(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.hip = root.getChild("mainbody").getChild("hip");
        this.body1 = root.getChild("mainbody").getChild("body1");
        this.pop1 = root.getChild("mainbody").getChild("pop1");
        this.pop2 = root.getChild("mainbody").getChild("pop2");
        this.pop3 = root.getChild("mainbody").getChild("pop3");
        this.pop4 = root.getChild("mainbody").getChild("pop4");
        this.pop5 = root.getChild("mainbody").getChild("pop5");
        this.pop6 = root.getChild("mainbody").getChild("pop6");
        this.joint1 = root.getChild("mainbody").getChild("joint1");
        this.joint2 = root.getChild("mainbody").getChild("joint2");
        this.joint3 = root.getChild("mainbody").getChild("joint3");
        this.hip2 = root.getChild("mainbody").getChild("hip").getChild("hip2");
        this.frontleg = root.getChild("mainbody").getChild("hip").getChild("hip2").getChild("frontleg");
        this.leftleg = root.getChild("mainbody").getChild("hip").getChild("hip2").getChild("leftleg");
        this.rightleg = root.getChild("mainbody").getChild("hip").getChild("hip2").getChild("rightleg");
        this.pop1_1 = root.getChild("mainbody").getChild("pop1").getChild("pop1_1");
        this.pop2_2 = root.getChild("mainbody").getChild("pop2").getChild("pop2_2");
        this.pop3_3 = root.getChild("mainbody").getChild("pop3").getChild("pop3_3");
        this.up3head = root.getChild("mainbody").getChild("pop3").getChild("up3head");
        this.pop4_4 = root.getChild("mainbody").getChild("pop4").getChild("pop4_4");
        this.up1 = root.getChild("mainbody").getChild("joint1").getChild("up1");
        this.up1_1 = root.getChild("mainbody").getChild("joint1").getChild("up1").getChild("up1_1");
        this.up1arm = root.getChild("mainbody").getChild("joint1").getChild("up1").getChild("up1arm");
        this.up2 = root.getChild("mainbody").getChild("joint2").getChild("up2");
        this.up2_2 = root.getChild("mainbody").getChild("joint2").getChild("up2").getChild("up2_2");
        this.up2sleg1 = root.getChild("mainbody").getChild("joint2").getChild("up2").getChild("up2sleg1");
        this.up2sleg2 = root.getChild("mainbody").getChild("joint2").getChild("up2").getChild("up2sleg2");
        this.up3 = root.getChild("mainbody").getChild("joint3").getChild("up3");
        this.up3_3 = root.getChild("mainbody").getChild("joint3").getChild("up3").getChild("up3_3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5f, 0.0f, -8.5f, 19, 22, 17), PartPose.offset(0.0f, -17.0f, 0.0f));
        PartDefinition pop1 = mainbody.addOrReplaceChild("pop1", CubeListBuilder.create().texOffs(55, 0).addBox(-3.5f, -3.5f, -3.0f, 7, 7, 3), PartPose.offsetAndRotation(8.0f, 6.0f, -12.6f, 0.0f, 0.0f, 0.31869712f));
        PartDefinition pop1_1 = pop1.addOrReplaceChild("pop1_1", CubeListBuilder.create().texOffs(210, 26).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 0.3642502f));
        PartDefinition pop4 = mainbody.addOrReplaceChild("pop4", CubeListBuilder.create().texOffs(224, 0).addBox(-3.5f, -3.5f, -3.0f, 7, 7, 3), PartPose.offsetAndRotation(4.7f, 12.6f, 11.6f, (float)Math.PI, 0.0f, -0.63739425f));
        PartDefinition pop4_4 = pop4.addOrReplaceChild("pop4_4", CubeListBuilder.create().texOffs(72, 35).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.5462881f));
        PartDefinition pop6 = mainbody.addOrReplaceChild("pop6", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 3), PartPose.offsetAndRotation(-6.3f, 14.0f, -13.4f, 0.0f, 0.0f, -0.4098033f));
        PartDefinition body1 = mainbody.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(110, 0).addBox(-12.0f, 0.0f, -13.0f, 24, 17, 26), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition joint3 = mainbody.addOrReplaceChild("joint3", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 2.5f, 10.1f));
        PartDefinition up3 = joint3.addOrReplaceChild("up3", CubeListBuilder.create().texOffs(193, 65).addBox(-8.0f, 0.0f, -7.5f, 16, 22, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.276433f, (float)Math.PI, -0.4553564f));
        PartDefinition up3_3 = up3.addOrReplaceChild("up3_3", CubeListBuilder.create().texOffs(124, 80).addBox(-10.0f, 0.0f, -11.0f, 20, 17, 22), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition hip = mainbody.addOrReplaceChild("hip", CubeListBuilder.create().texOffs(72, 0).addBox(-8.5f, 0.0f, -7.5f, 17, 4, 15), PartPose.offset(0.0f, 21.3f, 0.0f));
        PartDefinition hip2 = hip.addOrReplaceChild("hip2", CubeListBuilder.create().texOffs(184, 10).addBox(-7.0f, 0.0f, -6.0f, 14, 4, 12), PartPose.offset(0.0f, 3.8f, 0.0f));
        PartDefinition rightleg = hip2.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(88, 19).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4), PartPose.offset(-4.5f, 3.9f, 3.7f));
        PartDefinition frontleg = hip2.addOrReplaceChild("frontleg", CubeListBuilder.create().texOffs(236, 10).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4), PartPose.offset(0.0f, 3.9f, -3.7f));
        PartDefinition leftleg = hip2.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(72, 19).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4), PartPose.offset(4.5f, 3.9f, 3.7f));
        PartDefinition pop3 = mainbody.addOrReplaceChild("pop3", CubeListBuilder.create().texOffs(204, 0).addBox(-3.5f, -3.5f, -3.0f, 7, 7, 3), PartPose.offsetAndRotation(11.3f, 16.0f, 9.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition pop3_3 = pop3.addOrReplaceChild("pop3_3", CubeListBuilder.create().texOffs(239, 31).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -1.1383038f));
        PartDefinition up3head = pop3.addOrReplaceChild("up3head", CubeListBuilder.create().texOffs(210, 34).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 6), PartPose.offsetAndRotation(13.7f, -15.8f, 14.0f, 1.1383038f, -0.63739425f, -0.7285004f));
        PartDefinition pop5 = mainbody.addOrReplaceChild("pop5", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 3), PartPose.offsetAndRotation(-11.9f, 14.8f, -3.8f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition joint2 = mainbody.addOrReplaceChild("joint2", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 6.7f, -1.7f));
        PartDefinition up2 = joint2.addOrReplaceChild("up2", CubeListBuilder.create().texOffs(146, 43).addBox(-8.0f, 0.0f, -7.5f, 16, 22, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.321986f, -1.1383038f, 0.18203785f));
        PartDefinition up2sleg2 = up2.addOrReplaceChild("up2sleg2", CubeListBuilder.create().texOffs(47, 43).addBox(-1.0f, -1.0f, -1.0f, 16, 2, 2), PartPose.offsetAndRotation(-6.8f, 6.0f, 11.1f, 0.4098033f, 0.0f, 0.4098033f));
        PartDefinition up2_2 = up2.addOrReplaceChild("up2_2", CubeListBuilder.create().texOffs(0, 76).addBox(-10.0f, 0.0f, -11.0f, 20, 17, 22), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition up2sleg1 = up2.addOrReplaceChild("up2sleg1", CubeListBuilder.create().texOffs(100, 19).addBox(-1.0f, -1.0f, -1.0f, 16, 2, 2), PartPose.offsetAndRotation(-5.0f, 10.2f, 11.5f, 0.045553092f, 0.091106184f, 0.58119464f));
        PartDefinition pop2 = mainbody.addOrReplaceChild("pop2", CubeListBuilder.create().texOffs(184, 0).addBox(-3.5f, -3.5f, -3.1f, 7, 7, 3), PartPose.offsetAndRotation(-11.3f, 7.2f, 8.2f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition pop2_2 = pop2.addOrReplaceChild("pop2_2", CubeListBuilder.create().texOffs(226, 26).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 1.4570009f));
        PartDefinition joint1 = mainbody.addOrReplaceChild("joint1", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-8.2f, 4.6f, -9.1f));
        PartDefinition up1 = joint1.addOrReplaceChild("up1", CubeListBuilder.create().texOffs(0, 39).addBox(-8.0f, 0.0f, -7.5f, 16, 22, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5307274f, 0.0f, -0.7853982f));
        PartDefinition up1arm = up1.addOrReplaceChild("up1arm", CubeListBuilder.create().texOffs(238, 39).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4), PartPose.offsetAndRotation(-10.0f, 13.7f, 5.7f, -2.003289f, -0.10000736f, 0.10000736f));
        PartDefinition up1_1 = up1.addOrReplaceChild("up1_1", CubeListBuilder.create().texOffs(62, 43).addBox(-10.0f, 0.0f, -11.0f, 20, 17, 22), PartPose.offset(0.0f, 3.0f, 0.0f));
        return LayerDefinition.create(mesh, 256, 120);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float f1 = Mth.cos((float)(limbSwing * 0.5f)) * 1.0f * limbSwingAmount;
        float f2 = Mth.cos((float)(limbSwing * 0.5f + (float)Math.PI)) * 1.0f * limbSwingAmount;
        float age2f = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 2.0f)) / 4.0f;
        float age4f = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 4.0f)) / 4.0f;
        float age6f = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 6.0f)) / 4.0f;
        this.leftleg.xRot = f1;
        this.rightleg.xRot = f1;
        this.frontleg.xRot = f2;
        this.joint1.y = age2f;
        this.joint2.y = age4f;
        this.joint3.y = age6f;
        this.up1_1.y = age6f;
        this.up2_2.y = age4f;
        this.up3_3.y = age2f;
        this.pop1.y = age6f / 2.0f;
        this.pop2.y = age4f / 2.0f;
        this.pop3.y = age6f / 2.0f;
        this.pop4.y = age4f / 2.0f;
        this.pop5.y = age6f / 2.0f;
        this.pop6.y = age4f / 2.0f;
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
