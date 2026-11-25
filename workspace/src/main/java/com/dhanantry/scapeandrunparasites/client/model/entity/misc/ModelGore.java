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

public class ModelGore extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "gore"), "main");
    private final ModelPart sim;
    private final ModelPart pri;
    private final ModelPart ada;
    private final ModelPart pure;

    public ModelGore(ModelPart root) {
        this.sim = root.getChild("sim");
        this.pri = root.getChild("pri");
        this.ada = root.getChild("ada");
        this.pure = root.getChild("pure");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition sim = root.addOrReplaceChild("sim", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), PartPose.offsetAndRotation(0.0f, 21.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        sim.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(80, 4).addBox(-0.5f, -8.0f, -8.0f, 1.0f, 16.0f, 16.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
        sim.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(48, 20).addBox(-0.5f, -8.0f, -8.0f, 1.0f, 16.0f, 16.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 1.5707964f, 0.0f));
        PartDefinition pri = root.addOrReplaceChild("pri", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), PartPose.offsetAndRotation(0.0f, 20.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        pri.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5f, -9.0f, -9.0f, 1.0f, 18.0f, 18.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
        pri.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(64, 36).addBox(-0.5f, -9.0f, -9.0f, 1.0f, 18.0f, 18.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 1.5707964f, 0.0f));
        PartDefinition ada = root.addOrReplaceChild("ada", CubeListBuilder.create().texOffs(56, 0).addBox(-5.0f, -5.0f, -5.0f, 10.0f, 10.0f, 10.0f), PartPose.offsetAndRotation(0.0f, 19.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        ada.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(38, 52).addBox(-0.5f, -10.0f, -10.0f, 1.0f, 20.0f, 20.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 1.5707964f, 0.0f));
        ada.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(82, 52).addBox(-0.5f, -10.0f, -10.0f, 1.0f, 20.0f, 20.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
        PartDefinition pure = root.addOrReplaceChild("pure", CubeListBuilder.create().texOffs(0, 16).addBox(-6.0f, -6.0f, -6.0f, 12.0f, 12.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 18.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        pure.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5f, -11.0f, -11.0f, 1.0f, 22.0f, 22.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 1.5707964f, 0.0f));
        pure.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5f, -11.0f, -11.0f, 1.0f, 22.0f, 22.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        sim.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}