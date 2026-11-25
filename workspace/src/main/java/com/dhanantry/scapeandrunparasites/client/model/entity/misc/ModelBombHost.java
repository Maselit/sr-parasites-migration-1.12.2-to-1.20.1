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

public class ModelBombHost extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "bombhost"), "main");
    private final ModelPart mainbody;

    public ModelBombHost(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 3.0f), PartPose.offset(0.0f, 20.0f, 0.0f));
        PartDefinition mainbody_1 = mainbody.addOrReplaceChild("mainbody_1", CubeListBuilder.create().texOffs(13, 6).addBox(-2.5f, -2.5f, -2.5f, 5.0f, 5.0f, 3.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, 0.0f));
        mainbody.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(-2.0f, -2.0f, -2.0f, -0.36651915f, 0.7853982f, 0.0f));
        mainbody_1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(29, 6).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(-2.0f, -2.0f, -2.0f, -0.36651915f, 0.7853982f, 0.0f));
        mainbody_1.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(38, 9).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(2.0f, 2.0f, -2.0f, 0.36651915f, -0.7853982f, 0.0f));
        mainbody_1.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(50, 9).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(-2.0f, 2.0f, -2.0f, 0.36651915f, 0.7853982f, 0.0f));
        mainbody_1.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(2.0f, -2.0f, -2.0f, -0.36651915f, -0.7853982f, 0.0f));
        mainbody.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(28, 0).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(2.0f, -2.0f, -2.0f, -0.36651915f, -0.7853982f, 0.0f));
        mainbody.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(40, 0).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(2.0f, 2.0f, -2.0f, 0.36651915f, -0.7853982f, 0.0f));
        mainbody.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(49, 3).addBox(-1.5f, -1.5f, -2.5f, 3.0f, 3.0f, 3.0f), PartPose.offsetAndRotation(-2.0f, 2.0f, -2.0f, 0.36651915f, 0.7853982f, 0.0f));
        return LayerDefinition.create(mesh, 64, 16);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}