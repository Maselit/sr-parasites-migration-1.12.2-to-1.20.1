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

public class ModelBombOmboo extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "bombomboo"), "main");
    private final ModelPart mainbody;

    public ModelBombOmboo(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5f, 0.0f, -5.0f, 7.0f, 7.0f, 10.0f), PartPose.offset(0.0f, 17.0f, 0.0f));
        mainbody.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(24, 0).addBox(-2.0f, -2.0f, -3.0f, 4.0f, 4.0f, 6.0f), PartPose.offsetAndRotation(4.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.43633232f));
        mainbody.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(30, 14).addBox(-2.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 4.0f, -5.5f, 0.4712389f, 0.0f, 0.0f));
        mainbody.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(38, 4).addBox(-2.0f, -2.0f, -3.0f, 4.0f, 4.0f, 6.0f), PartPose.offsetAndRotation(-4.0f, 4.0f, 0.0f, 0.0f, 0.0f, -0.43633232f));
        mainbody.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0f, -2.0f, -3.0f, 4.0f, 4.0f, 6.0f), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.7853982f));
        mainbody.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(46, 14).addBox(-2.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 4.0f, 5.5f, -0.4712389f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}