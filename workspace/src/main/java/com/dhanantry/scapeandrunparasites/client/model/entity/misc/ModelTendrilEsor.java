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

public class ModelTendrilEsor extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrilesor"), "main");
    private final ModelPart mainbody;
    private final ModelPart taclejointLA1;
    private final ModelPart taclejointLA2;
    private final ModelPart taclejointLA3;

    public ModelTendrilEsor(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.taclejointLA1 = this.mainbody.getChild("taclejointLA0").getChild("tentacle").getChild("taclejointLA1");
        this.taclejointLA2 = this.taclejointLA1.getChild("tentacle_1").getChild("taclejointLA2");
        this.taclejointLA3 = this.taclejointLA2.getChild("tentacle_2").getChild("taclejointLA3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 23.0f, 6.0f, 0.0f, (float) Math.PI, 0.0f));
        PartDefinition taclejointLA0 = mainbody.addOrReplaceChild("taclejointLA0", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejointLA0.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -1.0f, -2.0f, 2.0f, 2.0f, 10.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition taclejointLA1 = tentacle.addOrReplaceChild("taclejointLA1", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_1 = taclejointLA1.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 7.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.5061455f, 0.0f, 0.0f));
        PartDefinition taclejointLA2 = tentacle_1.addOrReplaceChild("taclejointLA2", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 4.0f));
        PartDefinition tentacle_2 = taclejointLA2.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.8552113f, 0.0f, 0.0f));
        PartDefinition taclejointLA3 = tentacle_2.addOrReplaceChild("taclejointLA3", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 9.0f));
        taclejointLA3.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5f, -0.5f, -1.0f, 1.0f, 1.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.82030475f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 55, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f1 = Mth.sin(ageInTicks * 0.06f) * 0.2f;
        float f2 = Mth.sin(ageInTicks * 0.07f + 8.0f) * 0.3f;
        float f3 = Mth.sin(ageInTicks * 0.06f + 4.0f) * 0.4f;
        taclejointLA1.xRot = f1;
        taclejointLA2.xRot = f2;
        taclejointLA3.xRot = f3;
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}