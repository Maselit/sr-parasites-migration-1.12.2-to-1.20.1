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

public class ModelTendrilNogla extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrilynogla"), "main");
    private final ModelPart mainbody;
    private final ModelPart taclejointL1;
    private final ModelPart taclejointL2;
    private final ModelPart taclejointL3;

    public ModelTendrilNogla(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        ModelPart taclejointL = this.mainbody.getChild("taclejointL");
        ModelPart tentacle = taclejointL.getChild("tentacle");
        this.taclejointL1 = tentacle.getChild("taclejointL1");
        this.taclejointL2 = this.taclejointL1.getChild("tentacle_1").getChild("taclejointL2");
        this.taclejointL3 = this.taclejointL2.getChild("tentacle_2").getChild("taclejointL3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 21.5f, 6.0f));
        PartDefinition taclejointL = mainbody.addOrReplaceChild("taclejointL", CubeListBuilder.create().texOffs(4, 0).addBox(-2.0f, -2.0f, 0.0f, 4.0f, 4.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, (float) Math.PI, (float) Math.PI));
        PartDefinition tentacle = taclejointL.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5f, -2.5f, -1.0f, 5.0f, 5.0f, 14.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition taclejointL1 = tentacle.addOrReplaceChild("taclejointL1", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 1.0f), PartPose.offset(0.0f, -0.2f, 11.0f));
        PartDefinition tentacle_1 = taclejointL1.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(38, 0).addBox(-2.0f, -2.0f, 0.0f, 4.0f, 4.0f, 11.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition taclejointL2 = tentacle_1.addOrReplaceChild("taclejointL2", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0f, -1.0f, 0.0f, 2.0f, 2.0f, 1.0f), PartPose.offset(0.0f, -0.2f, 9.0f));
        PartDefinition tentacle_2 = taclejointL2.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(27, 15).addBox(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 11.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.8552113f, 0.0f, 0.0f));
        PartDefinition taclejointL3 = tentacle_2.addOrReplaceChild("taclejointL3", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, -0.2f, 9.0f));
        taclejointL3.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(42, 16).addBox(-1.0f, -1.0f, 0.0f, 2.0f, 2.0f, 13.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.7853982f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 80, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f1 = Mth.sin(ageInTicks * 0.06f) * 0.2f;
        float f2 = Mth.sin(ageInTicks * 0.07f + 8.0f) * 0.3f;
        float f3 = Mth.sin(ageInTicks * 0.06f + 4.0f) * 0.4f;
        taclejointL1.xRot = f1;
        taclejointL2.xRot = f2;
        taclejointL3.xRot = f3;
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}