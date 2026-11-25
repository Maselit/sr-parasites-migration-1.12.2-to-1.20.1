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

public class ModelBiomassPod extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "biomasspod"), "main");
    private final ModelPart alafha;
    private final ModelPart pri_sum;
    private final ModelPart ada_sum;

    public ModelBiomassPod(ModelPart root) {
        this.alafha = root.getChild("alafha");
        this.pri_sum = root.getChild("pri_sum");
        this.ada_sum = root.getChild("ada_sum");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        // alafha
        PartDefinition alafha = root.addOrReplaceChild("alafha", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 3.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        alafha.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(46, 5).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, -2.5f, -0.31415927f, 0.0f, 0.0f));
        alafha.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(10, 7).addBox(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(2.5f, -1.2f, 0.0f, 0.0f, 0.0f, 1.3962634f));
        alafha.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, 2.5f, 0.31415927f, 0.0f, 0.0f));
        alafha.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(22, 7).addBox(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(-2.5f, -1.2f, 0.0f, 0.0f, 0.0f, -1.3962634f));
        PartDefinition core2 = alafha.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offset(0.0f, -1.5f, 0.0f));
        core2.addOrReplaceChild("core3", CubeListBuilder.create().texOffs(34, 7).addBox(-1.0f, -4.0f, -1.0f, 2.0f, 4.0f, 2.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        core2.getChild("core3").addOrReplaceChild("core4", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 2.0f, 1.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        PartDefinition core2_1 = alafha.addOrReplaceChild("core2_1", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0f, -3.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        core2_1.addOrReplaceChild("core3_1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 2.0f, 1.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        alafha.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(32, 15).addBox(-1.5f, -2.0f, -1.0f, 3.0f, 4.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, -2.5f, 0.6981317f, 0.0f, 0.0f));
        alafha.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5f, -2.0f, -1.0f, 3.0f, 4.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, 2.5f, -0.6981317f, 0.0f, 0.0f));

        // pri_sum
        PartDefinition pri_sum = root.addOrReplaceChild("pri_sum", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 3.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        pri_sum.addOrReplaceChild("core1", CubeListBuilder.create().texOffs(39, 10).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offset(0.0f, -1.5f, 0.0f));
        pri_sum.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(51, 10).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 2.0f, 2.0f), PartPose.offsetAndRotation(2.3f, -1.0f, 0.0f, 0.0f, 0.0f, 2.146755f));
        pri_sum.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(8, 12).addBox(-1.0f, -1.0f, -2.0f, 2.0f, 2.0f, 4.0f), PartPose.offsetAndRotation(0.0f, -1.0f, 2.3f, -2.146755f, 0.0f, 0.0f));
        pri_sum.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(20, 12).addBox(-1.0f, -1.0f, -2.0f, 2.0f, 2.0f, 4.0f), PartPose.offsetAndRotation(0.0f, -0.9f, -2.3f, 2.146755f, 0.0f, 0.0f));
        pri_sum.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 2.0f, 2.0f), PartPose.offsetAndRotation(-2.3f, -1.0f, 0.0f, 0.0f, 0.0f, -2.146755f));
        pri_sum.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(10, 18).addBox(-2.0f, -1.0f, -1.5f, 4.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(2.5f, -1.2f, 0.0f, 0.0f, 0.0f, -1.012291f));
        pri_sum.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(39, 19).addBox(-2.0f, -1.0f, -1.5f, 4.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(-2.5f, -1.2f, 0.0f, 0.0f, 0.0f, 1.012291f));
        pri_sum.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(22, 7).addBox(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(-2.5f, -1.2f, 0.0f, 0.0f, 0.0f, -1.3962634f));

        // ada_sum
        PartDefinition ada_sum = root.addOrReplaceChild("ada_sum", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 3.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        ada_sum.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(32, 15).addBox(-1.5f, -2.0f, -1.0f, 3.0f, 4.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, -2.5f, 0.6981317f, 0.0f, 0.0f));
        ada_sum.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(10, 18).addBox(-2.0f, -1.0f, -1.5f, 4.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(2.5f, -1.2f, 0.0f, 0.0f, 0.0f, -1.012291f));
        ada_sum.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5f, -2.0f, -1.0f, 3.0f, 4.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, 2.5f, -0.6981317f, 0.0f, 0.0f));
        ada_sum.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(10, 7).addBox(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(2.5f, -1.2f, 0.0f, 0.0f, 0.0f, 1.3962634f));
        ada_sum.addOrReplaceChild("core2_2", CubeListBuilder.create().texOffs(48, 14).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offset(0.0f, -1.5f, 0.0f));
        ada_sum.getChild("core2_2").addOrReplaceChild("core3_2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -3.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        ada_sum.getChild("core2_2").getChild("core3_2").addOrReplaceChild("core4_1", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 2.0f, 1.0f), PartPose.offset(0.0f, -1.0f, 0.0f));

        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        alafha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}