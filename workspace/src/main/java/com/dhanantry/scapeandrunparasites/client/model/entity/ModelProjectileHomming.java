package com.dhanantry.scapeandrunparasites.client.model.entity;

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

public class ModelProjectileHomming extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "projectilehomming"), "main");
    private final ModelPart renderer;

    public ModelProjectileHomming(ModelPart root) {
        this.renderer = root.getChild("renderer");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        root.addOrReplaceChild("renderer", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 2)
                .texOffs(0, 10).addBox(-1.0f, -4.0f, -4.0f, 2, 8, 8)
                .texOffs(20, 0).addBox(-4.0f, -1.0f, -4.0f, 8, 2, 8), PartPose.offset(0.0f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.renderer.yRot = netHeadYaw * ((float)Math.PI / 180.0f);
        this.renderer.xRot = headPitch * ((float)Math.PI / 180.0f);
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        renderer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
