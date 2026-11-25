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
import net.minecraft.world.entity.Entity;

public class ModelTendrilDragonELW extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrildragonelw"), "main");
    private final ModelPart mainbody;

    public ModelTendrilDragonELW(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(-23.0f, 22.0f, -22.0f, -0.25132743f, 0.0f, 0.0f));
        PartDefinition jointLW1 = mainbody.addOrReplaceChild("jointLW1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jd = jointLW1.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.24993114f, (float) Math.PI));
        PartDefinition jointLW1_1 = jd.addOrReplaceChild("jointLW1_1", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition w = jointLW1_1.addOrReplaceChild("w", CubeListBuilder.create().texOffs(8, 0).addBox(-38.0f, -4.0f, -4.0f, 38.0f, 8.0f, 8.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.29670596f, 0.0f, -0.08726646f));
        w.addOrReplaceChild("skin", CubeListBuilder.create().texOffs(-49, 24).addBox(-60.0f, 0.0f, 0.0f, 60.0f, 0.0f, 58.0f), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition jointLW2 = w.addOrReplaceChild("jointLW2", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(-60.0f, 0.0f, 0.0f));
        jointLW2.addOrReplaceChild("w_1", CubeListBuilder.create().texOffs(160, 6).addBox(-15.0f, -2.0f, -2.0f, 15.0f, 4.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9536479f));
        jointLW2.getChild("w_1").addOrReplaceChild("skin_1", CubeListBuilder.create().texOffs(16, 85).addBox(-56.0f, 0.0f, 2.0f, 60.0f, 0.0f, 60.0f), PartPose.offsetAndRotation(-56.0f, 0.0f, 0.0f, 0.0f, 0.0f, (float) -Math.PI));
        jointLW2.getChild("w_1").addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(97, 14).addBox(-1.0f, -1.0f, -2.0f, 47.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(-16.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, 0.0f));
        w.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(154, 0).addBox(-1.5f, -1.0f, -1.0f, 3.0f, 5.0f, 2.0f), PartPose.offsetAndRotation(-6.0f, -4.6f, -0.5f, 1.5707964f, -1.8221238f, 0.0f));
        w.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(164, 0).addBox(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 2.0f), PartPose.offsetAndRotation(-4.0f, -0.6f, -4.5f, 0.0f, 0.0f, 0.50265485f));
        w.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0f, -1.0f, -2.5f, 22.0f, 4.0f, 5.0f), PartPose.offsetAndRotation(-39.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, 0.0f));
        return LayerDefinition.create(mesh, 200, 150);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}