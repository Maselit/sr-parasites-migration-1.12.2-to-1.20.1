package com.dhanantry.scapeandrunparasites.client.model.entity.misc;

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

public class ModelTendrilBano extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrilbano"), "main");
    private final ModelPart mainbody;
    private final ModelPart jointMLT1;
    private final ModelPart jointMLT2;
    private final ModelPart jointMLT3;
    private final ModelPart jointMLT4;
    private final ModelPart jointMLT5;
    private final ModelPart jointMLT6;

    public ModelTendrilBano(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        ModelPart jointMLT0 = this.mainbody.getChild("jointMLT0");
        ModelPart JD = jointMLT0.getChild("JD");
        ModelPart tacle = JD.getChild("tacle");
        this.jointMLT1 = tacle.getChild("jointMLT1");
        ModelPart tacle_1 = this.jointMLT1.getChild("tacle_1");
        this.jointMLT2 = tacle_1.getChild("jointMLT2");
        ModelPart tacle_2 = this.jointMLT2.getChild("tacle_2");
        this.jointMLT3 = tacle_2.getChild("jointMLT3");
        ModelPart tacle_3 = this.jointMLT3.getChild("tacle_3");
        this.jointMLT4 = tacle_3.getChild("jointMLT4");
        ModelPart tacle_4 = this.jointMLT4.getChild("tacle_4");
        this.jointMLT5 = tacle_4.getChild("jointMLT5");
        ModelPart tacle_5 = this.jointMLT5.getChild("tacle_5");
        this.jointMLT6 = tacle_5.getChild("jointMLT6");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 21.3f, 9.0f, 0.0f, (float) Math.PI, 0.0f));
        PartDefinition jointMLT0 = mainbody.addOrReplaceChild("jointMLT0", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition JD = jointMLT0.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle = JD.addOrReplaceChild("tacle", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, -3.0f, -2.0f, 6.0f, 6.0f, 13.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI));
        PartDefinition jointMLT1 = tacle.addOrReplaceChild("jointMLT1", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 10.5f));
        PartDefinition tacle_1 = jointMLT1.addOrReplaceChild("tacle_1", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 6.0f, 19.0f), PartPose.offsetAndRotation(0.0f, -1.0f, 1.0f, -0.4712389f, 0.0f, 0.0f));
        PartDefinition jointMLT2 = tacle_1.addOrReplaceChild("jointMLT2", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 17.5f));
        PartDefinition tacle_2 = jointMLT2.addOrReplaceChild("tacle_2", CubeListBuilder.create().texOffs(44, 4).addBox(-2.5f, -2.5f, -2.0f, 5.0f, 5.0f, 21.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.1868238f, 0.0f, 0.0f));
        PartDefinition jointMLT3 = tacle_2.addOrReplaceChild("jointMLT3", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 18.0f));
        PartDefinition tacle_3 = jointMLT3.addOrReplaceChild("tacle_3", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0f, -2.0f, -1.0f, 4.0f, 4.0f, 18.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.9773844f, 0.0f, 0.0f));
        PartDefinition jointMLT4 = tacle_3.addOrReplaceChild("jointMLT4", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 15.9f));
        PartDefinition tacle_4 = jointMLT4.addOrReplaceChild("tacle_4", CubeListBuilder.create().texOffs(26, 30).addBox(-2.5f, -2.5f, 0.0f, 5.0f, 5.0f, 18.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.2566371f, 0.0f, 0.0f));
        PartDefinition jointMLT5 = tacle_4.addOrReplaceChild("jointMLT5", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 17.0f));
        PartDefinition tacle_5 = jointMLT5.addOrReplaceChild("tacle_5", CubeListBuilder.create().texOffs(54, 30).addBox(-2.0f, -2.0f, -1.0f, 4.0f, 4.0f, 11.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.3089969f, 0.0f, 0.0f));
        PartDefinition jointMLT6 = tacle_5.addOrReplaceChild("jointMLT6", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 10.0f));
        jointMLT6.addOrReplaceChild("tacle_6", CubeListBuilder.create().texOffs(73, 34).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 11.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.89011794f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 100, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f1 = Mth.sin(ageInTicks * 0.06f) * 0.2f;
        float f2 = Mth.sin(ageInTicks * 0.07f + 8.0f) * 0.3f;
        float f3 = Mth.sin(ageInTicks * 0.06f + 4.0f) * 0.4f;
        jointMLT1.xRot = f1;
        jointMLT2.xRot = f2;
        jointMLT3.xRot = f3;
        jointMLT4.xRot = f1;
        jointMLT5.xRot = f2;
        jointMLT6.xRot = f3;
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}