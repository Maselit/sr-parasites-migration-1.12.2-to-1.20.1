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

/**
 * Migracion de ModelScaryOrb a 1.20.1 (EntityModel + LayerDefinition).
 */
public class ModelScaryOrb extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "scaryorb"), "main");
    private final ModelPart mainbody;

    public ModelScaryOrb(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0f, -12.0f, -8.0f, 16.0f, 16.0f, 16.0f), PartPose.offset(0.0f, 20.0f, 0.0f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // simple rotation
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}