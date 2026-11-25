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

public class ModelMor extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "mor"), "main");
    private final ModelPart mainbody;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart mainbody_1;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart dec_6;
    private final ModelPart dec_7;

    public ModelMor(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.dec = root.getChild("mainbody").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("dec_3");
        this.mainbody_1 = root.getChild("mainbody").getChild("mainbody_1");
        this.dec_4 = root.getChild("mainbody").getChild("mainbody_1").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("mainbody_1").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("mainbody_1").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("mainbody_1").getChild("dec_7");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 3), PartPose.offset(0.0f, 20.0f, 0.0f));
        PartDefinition dec = mainbody.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(-2.0f, -2.0f, -2.0f, -0.36651915f, 0.7853982f, 0.0f));
        PartDefinition mainbody_1 = mainbody.addOrReplaceChild("mainbody_1", CubeListBuilder.create().texOffs(13, 6).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.0f));
        PartDefinition dec_4 = mainbody_1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(29, 6).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(-2.0f, -2.0f, -2.0f, -0.36651915f, 0.7853982f, 0.0f));
        PartDefinition dec_6 = mainbody_1.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(38, 9).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(2.0f, 2.0f, -2.0f, 0.36651915f, -0.7853982f, 0.0f));
        PartDefinition dec_7 = mainbody_1.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(50, 9).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(-2.0f, 2.0f, -2.0f, 0.36651915f, 0.7853982f, 0.0f));
        PartDefinition dec_5 = mainbody_1.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(2.0f, -2.0f, -2.0f, -0.36651915f, -0.7853982f, 0.0f));
        PartDefinition dec_1 = mainbody.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(28, 0).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(2.0f, -2.0f, -2.0f, -0.36651915f, -0.7853982f, 0.0f));
        PartDefinition dec_2 = mainbody.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(40, 0).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(2.0f, 2.0f, -2.0f, 0.36651915f, -0.7853982f, 0.0f));
        PartDefinition dec_3 = mainbody.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(49, 3).addBox(-1.5f, -1.5f, -2.5f, 3, 3, 3), PartPose.offsetAndRotation(-2.0f, 2.0f, -2.0f, 0.36651915f, 0.7853982f, 0.0f));
        return LayerDefinition.create(mesh, 64, 16);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    
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
