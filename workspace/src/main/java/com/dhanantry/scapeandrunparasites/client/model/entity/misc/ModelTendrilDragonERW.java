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

public class ModelTendrilDragonERW extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrildragonerw"), "main");
    private final ModelPart mainbody;

    public ModelTendrilDragonERW(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(28.0f, 23.0f, -20.0f, -0.25132743f, 0.0f, 0.0f));
        PartDefinition jointRW1 = mainbody.addOrReplaceChild("jointRW1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jd = jointRW1.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.24993114f, 0.0f));
        PartDefinition jointRW1_1 = jd.addOrReplaceChild("jointRW1_1", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition w = jointRW1_1.addOrReplaceChild("w", CubeListBuilder.create().texOffs(8, 0).addBox(-25.0f, -4.0f, -4.0f, 25.0f, 8.0f, 8.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.29670596f, 0.0f, 0.08726646f));
        w.addOrReplaceChild("skin", CubeListBuilder.create().texOffs(-52, 23).addBox(-60.0f, 0.0f, 0.0f, 60.0f, 0.0f, 58.0f), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition jointRW2 = w.addOrReplaceChild("jointRW2", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(-60.0f, 0.0f, 0.0f));
        PartDefinition w_1 = jointRW2.addOrReplaceChild("w_1", CubeListBuilder.create().texOffs(74, 9).addBox(-50.0f, -2.0f, -2.0f, 50.0f, 4.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0164797f));
        w_1.addOrReplaceChild("skin_1", CubeListBuilder.create().texOffs(16, 84).addBox(-56.0f, 0.0f, 2.0f, 60.0f, 0.0f, 60.0f), PartPose.offsetAndRotation(-56.0f, 0.0f, 0.0f, 0.0f, 0.0f, (float) -Math.PI));
        w_1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0f, -1.0f, -2.0f, 15.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(-51.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, 0.0f));
        w.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(68, 0).addBox(-1.5f, -1.0f, -1.0f, 3.0f, 3.0f, 2.0f), PartPose.offsetAndRotation(-21.0f, -4.6f, -1.5f, 1.5707964f, -0.43982297f, 0.0f));
        w.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(154, 0).addBox(-1.5f, -1.0f, -1.0f, 3.0f, 5.0f, 2.0f), PartPose.offsetAndRotation(-13.0f, -4.6f, -1.5f, 1.5707964f, -0.87964594f, 0.0f));
        w.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(74, 0).addBox(-1.0f, -1.0f, -2.5f, 35.0f, 4.0f, 5.0f), PartPose.offsetAndRotation(-26.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, 0.0f));
        w.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(154, 0).addBox(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 2.0f), PartPose.offsetAndRotation(-19.0f, -1.6f, -4.5f, 0.0f, 0.0f, -0.43982297f));
        return LayerDefinition.create(mesh, 200, 150);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}