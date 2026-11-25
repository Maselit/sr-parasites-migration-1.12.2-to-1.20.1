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

public class ModelTendrilCanra extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrilcanra"), "main");
    private final ModelPart mainbody;

    public ModelTendrilCanra(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 21.7f, 5.0f, 0.0f, (float) Math.PI, -1.5707964f));
        PartDefinition taclejointL1 = mainbody.addOrReplaceChild("taclejointL1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejointL1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5f, -2.5f, -1.0f, 5.0f, 5.0f, 10.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition taclejointL2 = tentacle.addOrReplaceChild("taclejointL2", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_1 = taclejointL2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(30, 0).addBox(-2.0f, -2.0f, -1.0f, 4.0f, 4.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.54105204f, 0.0f));
        PartDefinition taclejointL3 = tentacle_1.addOrReplaceChild("taclejointL3", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_2 = taclejointL3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(0, 15).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.62831855f, 0.0f));
        PartDefinition taclejointL4 = tentacle_2.addOrReplaceChild("taclejointL4", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 9.0f));
        taclejointL4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(30, 16).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.80285144f, 0.0f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}