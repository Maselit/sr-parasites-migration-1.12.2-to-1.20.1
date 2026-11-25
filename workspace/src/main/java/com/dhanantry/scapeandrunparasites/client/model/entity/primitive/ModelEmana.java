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

public class ModelEmana extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "emana"), "main");
    private final ModelPart mainbody;
    private final ModelPart Ltentacle3;
    private final ModelPart Rtentacle3;
    private final ModelPart Btentacle3;

    public ModelEmana(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        ModelPart shoulderL = this.mainbody.getChild("shoulderL");
        this.Ltentacle3 = shoulderL.getChild("Ltentacle3");
        ModelPart shoulderR = this.mainbody.getChild("shoulderR");
        this.Rtentacle3 = shoulderR.getChild("Rtentacle3");
        ModelPart shoulderB = this.mainbody.getChild("shoulderB");
        this.Btentacle3 = shoulderB.getChild("Btentacle3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0f, 0.0f, -5.0f, 10.0f, 4.0f, 10.0f), PartPose.offset(0.0f, 6.0f, 0.0f));
        PartDefinition shoulderL = mainbody.addOrReplaceChild("shoulderL", CubeListBuilder.create().texOffs(34, 8).addBox(-3.0f, -6.0f, -3.0f, 6.0f, 6.0f, 6.0f), PartPose.offsetAndRotation(3.3f, 1.0f, -3.0f, 0.0f, 0.0f, 0.5934119f));
        PartDefinition shoulderL_1 = shoulderL.addOrReplaceChild("shoulderL_1", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(0.0f, -5.5f, 0.0f, -0.12217305f, 0.0f, 0.0f));
        PartDefinition Ltentacle3 = shoulderL.addOrReplaceChild("Ltentacle3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 1.0f), PartPose.offsetAndRotation(2.0f, -4.0f, 0.0f, -0.2617994f, 1.5707964f, 0.0f));
        Ltentacle3.addOrReplaceChild("Ltentacle3_1", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 5.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition shoulderR = mainbody.addOrReplaceChild("shoulderR", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0f, -6.0f, -3.0f, 6.0f, 6.0f, 6.0f), PartPose.offsetAndRotation(-3.3f, 1.0f, -3.0f, 0.0f, 0.0f, -0.5934119f));
        PartDefinition shoulderR_1 = shoulderR.addOrReplaceChild("shoulderR_1", CubeListBuilder.create().texOffs(18, 14).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(0.0f, -5.5f, 0.0f, -0.12217305f, 0.0f, 0.0f));
        PartDefinition Rtentacle3 = shoulderR.addOrReplaceChild("Rtentacle3", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 1.0f), PartPose.offsetAndRotation(-2.0f, -4.0f, 0.0f, -0.2617994f, -1.5707964f, 0.0f));
        Rtentacle3.addOrReplaceChild("Rtentacle3_1", CubeListBuilder.create().texOffs(42, 20).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 5.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition shoulderB = mainbody.addOrReplaceChild("shoulderB", CubeListBuilder.create().texOffs(18, 20).addBox(-3.0f, 0.0f, -3.0f, 6.0f, 6.0f, 6.0f), PartPose.offsetAndRotation(0.0f, -4.0f, 7.0f, -0.5934119f, 0.0f, 0.0f));
        PartDefinition shoulderB_1 = shoulderB.addOrReplaceChild("shoulderB_1", CubeListBuilder.create().texOffs(51, 24).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, -0.12217305f, 0.0f, 0.0f));
        PartDefinition Btentacle3 = shoulderB.addOrReplaceChild("Btentacle3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 2.0f, 1.7f, -0.4712389f, 0.0f, 0.0f));
        Btentacle3.addOrReplaceChild("Btentacle3_1", CubeListBuilder.create().texOffs(35, 27).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 7.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition body1 = mainbody.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 32).addBox(-4.5f, -2.0f, -4.5f, 9.0f, 4.0f, 9.0f), PartPose.offset(0.0f, 6.0f, 0.0f));
        PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(28, 37).addBox(-4.0f, -2.0f, -4.0f, 8.0f, 6.0f, 8.0f), PartPose.offset(0.0f, 4.0f, 0.0f));
        body2.addOrReplaceChild("tentacle1", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5f, -2.0f, 0.0f, 3.0f, 4.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -1.4486233f, 0.0f, 0.0f));
        body2.getChild("tentacle1").addOrReplaceChild("tentacle1_1", CubeListBuilder.create().texOffs(51, 30).addBox(-1.5f, -2.0f, 0.0f, 3.0f, 4.0f, 3.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        body2.getChild("tentacle1").getChild("tentacle1_1").addOrReplaceChild("tentacle2", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0f, -1.5f, 0.0f, 2.0f, 3.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 2.0f, 0.06981317f, 0.0f, 0.0f));
        body2.getChild("tentacle1").getChild("tentacle1_1").getChild("tentacle2").addOrReplaceChild("tentacle2_1", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0f, -1.5f, 0.0f, 2.0f, 3.0f, 4.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        body2.addOrReplaceChild("Rbtentacle3", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 1.0f), PartPose.offsetAndRotation(3.2f, 0.3f, 0.0f, -0.5061455f, -0.82030475f, 0.0f));
        body2.getChild("Rbtentacle3").addOrReplaceChild("Rbtentacle3_1", CubeListBuilder.create().texOffs(12, 45).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 5.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        body2.addOrReplaceChild("Lbtentacle3", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 1.0f), PartPose.offsetAndRotation(3.2f, 0.3f, 0.0f, -0.5061455f, 0.82030475f, 0.0f));
        body2.getChild("Lbtentacle3").addOrReplaceChild("Lbtentacle3_1", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 5.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        body2.addOrReplaceChild("tentacle2", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0f, -1.5f, 0.0f, 2.0f, 3.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 2.0f));
        body2.getChild("tentacle2").addOrReplaceChild("tentacle2_1", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0f, -1.5f, 0.0f, 2.0f, 3.0f, 4.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        body2.getChild("tentacle2").getChild("tentacle2_1").addOrReplaceChild("tentacle3", CubeListBuilder.create().texOffs(6, 3).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 3.0f, 0.05235988f, 0.0f, 0.0f));
        body2.getChild("tentacle2").getChild("tentacle2_1").getChild("tentacle3").addOrReplaceChild("tentacle3_1", CubeListBuilder.create().texOffs(53, 3).addBox(-0.5f, -1.0f, 0.0f, 1.0f, 2.0f, 4.0f), PartPose.offset(0.0f, 0.0f, 1.0f));
        return LayerDefinition.create(mesh, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f3 = 0.6f * Mth.sin(ageInTicks / 10.0f);
        Ltentacle3.xRot = f3 / 3.0f;
        Rtentacle3.xRot = f3 / 3.0f;
        Btentacle3.xRot = f3 / 3.0f;
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}