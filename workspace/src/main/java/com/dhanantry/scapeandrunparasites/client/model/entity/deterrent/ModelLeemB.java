package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent;

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

public class ModelLeemB extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "leemb"), "main");
    private final ModelPart joint;
    private final ModelPart jd;
    private final ModelPart mainbody;
    private final ModelPart b;
    private final ModelPart b_1;
    private final ModelPart b_2;
    private final ModelPart b_3;
    private final ModelPart b_4;

    public ModelLeemB(ModelPart root) {
        this.joint = root.getChild("joint");
        this.jd = root.getChild("jd");
        this.mainbody = root.getChild("mainbody");
        this.b = root.getChild("mainbody").getChild("b");
        this.b_1 = root.getChild("mainbody").getChild("b_1");
        this.b_2 = root.getChild("mainbody").getChild("b_2");
        this.b_3 = root.getChild("mainbody").getChild("b_3");
        this.b_4 = root.getChild("mainbody").getChild("b_3").getChild("b_4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition joint = root.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jd = root.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 22.0f, 0.0f));
        PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5f, -1.5f, -4.5f, 9, 12, 11), PartPose.offsetAndRotation(-13.0f, -5.0f, 0.0f, 0.0f, 0.0f, -0.81681406f));
        PartDefinition b_3 = mainbody.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5f, -1.5f, -4.5f, 14, 19, 14), PartPose.offset(-2.0f, -10.0f, -3.0f));
        PartDefinition b_4 = b_3.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7f, -1.5f, -0.5f, 7, 6, 6), PartPose.offset(0.0f, -5.0f, 0.0f));
        PartDefinition b_2 = mainbody.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5f, -1.5f, -4.5f, 9, 12, 11), PartPose.offsetAndRotation(2.0f, -5.0f, 13.0f, -1.0681415f, 0.0f, 0.0f));
        PartDefinition b_1 = mainbody.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5f, -1.5f, -4.5f, 10, 14, 14), PartPose.offsetAndRotation(11.0f, -4.0f, -10.0f, 0.43982297f, 0.37699112f, 1.0681415f));
        return LayerDefinition.create(mesh, 64, 32);
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
