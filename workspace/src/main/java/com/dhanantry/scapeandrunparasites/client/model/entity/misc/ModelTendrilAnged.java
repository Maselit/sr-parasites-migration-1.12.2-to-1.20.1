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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ModelTendrilAnged extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrilanged"), "main");
    private final ModelPart mainbody;
    private final ModelPart taclejointUL2;
    private final ModelPart taclejointUL3;
    private final ModelPart taclejointUL4;

    public ModelTendrilAnged(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.taclejointUL2 = this.mainbody.getChild("tentacle").getChild("taclejointUL2");
        this.taclejointUL3 = this.taclejointUL2.getChild("tentacle_1").getChild("taclejointUL3");
        this.taclejointUL4 = this.taclejointUL3.getChild("tentacle_2").getChild("taclejointUL4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 22.0f, 6.0f));
        PartDefinition taclejointUL1 = mainbody.addOrReplaceChild("taclejointUL1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, 0.0f));
        PartDefinition tentacle = taclejointUL1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -2.0f, 0.0f, 4.0f, 4.0f, 10.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition taclejointUL2 = tentacle.addOrReplaceChild("taclejointUL2", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_1 = taclejointUL2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(28, 0).addBox(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition taclejointUL3 = tentacle_1.addOrReplaceChild("taclejointUL3", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_2 = taclejointUL3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0f, -1.0f, 0.0f, 2.0f, 2.0f, 14.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.40142572f, 0.0f, 0.0f));
        PartDefinition taclejointUL4 = tentacle_2.addOrReplaceChild("taclejointUL4", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 12.0f));
        taclejointUL4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(16, 15).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 16.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.6457718f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 64, 35);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f1 = Mth.sin(ageInTicks * 0.06f) * 0.2f;
        float f2 = Mth.sin(ageInTicks * 0.07f + 8.0f) * 0.3f;
        float f3 = Mth.sin(ageInTicks * 0.06f + 4.0f) * 0.4f;
        taclejointUL2.xRot = f1;
        taclejointUL3.xRot = f2;
        taclejointUL4.xRot = f3;
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}