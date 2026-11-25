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

public class ModelBombJinjo extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "bombjinjo"), "main");
    private final ModelPart mainbody;

    public ModelBombJinjo(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offset(-3.0f, 0.0f, 0.0f));
        mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -8.0f, -7.0f, 14.0f, 14.0f, 12.0f), PartPose.offset(0.0f, 18.5f, 0.0f));
        mainbody.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0f, -8.0f, -7.0f, 14.0f, 14.0f, 12.0f), PartPose.offsetAndRotation(-1.1f, 6.5f, -6.0f, 0.50265485f, 0.0f, 0.0f));
        mainbody.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(40, 30).addBox(-4.0f, -12.0f, -3.5f, 15.0f, 22.0f, 6.0f), PartPose.offset(1.0f, 2.0f, 0.0f));
        mainbody.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(52, 0).addBox(-4.0f, 0.0f, -4.0f, 10.0f, 15.0f, 15.0f), PartPose.offsetAndRotation(-8.0f, 4.0f, -5.0f, 0.0f, 0.0f, -0.43982297f));
        mainbody.addOrReplaceChild("b_7", CubeListBuilder.create().texOffs(0, 79).addBox(-3.0f, -16.0f, -7.0f, 14.0f, 19.0f, 12.0f), PartPose.offsetAndRotation(-1.1f, 1.5f, 9.0f, 0.12566371f, 0.0f, 0.0f));
        mainbody.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0f, -4.5f, -6.0f, 10.0f, 17.0f, 10.0f), PartPose.offsetAndRotation(-5.0f, -6.0f, 1.0f, 0.0f, 0.0f, 0.12566371f));
        mainbody.addOrReplaceChild("b_9", CubeListBuilder.create().texOffs(90, 109).addBox(-1.0f, -16.0f, -7.0f, 8.0f, 14.0f, 10.0f), PartPose.offsetAndRotation(-1.4f, -8.5f, 2.0f, 0.06283186f, 0.0f, 0.0f));
        mainbody.addOrReplaceChild("b_8", CubeListBuilder.create().texOffs(52, 88).addBox(-2.5f, -10.0f, -7.0f, 10.0f, 17.0f, 14.0f), PartPose.offsetAndRotation(-1.1f, -2.5f, -7.0f, -0.12566371f, 0.0f, 0.0f));
        mainbody.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(92, 20).addBox(-4.0f, -12.0f, -5.0f, 11.0f, 27.0f, 10.0f), PartPose.offsetAndRotation(8.0f, 5.0f, -1.0f, 0.0f, 0.0f, 0.18849556f));
        mainbody.addOrReplaceChild("b_6", CubeListBuilder.create().texOffs(70, 57).addBox(-1.0f, -16.0f, -7.0f, 11.0f, 19.0f, 12.0f), PartPose.offsetAndRotation(-1.1f, 16.5f, 5.0f, -0.37699112f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 135, 150);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}