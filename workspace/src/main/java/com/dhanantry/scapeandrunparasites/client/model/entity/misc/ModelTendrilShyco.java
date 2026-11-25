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

public class ModelTendrilShyco extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "tendrilshyco"), "main");
    private final ModelPart mainbody;
    private final ModelPart taclejointL2;
    private final ModelPart taclejointL3;
    private final ModelPart taclejointL4;

    public ModelTendrilShyco(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        ModelPart taclejointL1 = this.mainbody.getChild("taclejointL1");
        ModelPart tentacle = taclejointL1.getChild("tentacle");
        this.taclejointL2 = tentacle.getChild("taclejointL2");
        ModelPart tentacle_1 = this.taclejointL2.getChild("tentacle_1");
        this.taclejointL3 = tentacle_1.getChild("taclejointL3");
        ModelPart tentacle_2 = this.taclejointL3.getChild("tentacle_2");
        this.taclejointL4 = tentacle_2.getChild("taclejointL4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offsetAndRotation(0.0f, 22.2f, 6.0f, 0.0f, 1.5707964f, 1.5707964f));
        PartDefinition taclejointL1 = mainbody.addOrReplaceChild("taclejointL1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejointL1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(4, 0).addBox(-1.0f, -2.0f, -2.0f, 8.0f, 4.0f, 4.0f), PartPose.offset(0.0f, 0.0f, 0.0f));
        tentacle.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(28, 0).addBox(-2.5f, -2.5f, -1.0f, 5.0f, 5.0f, 4.0f), PartPose.offset(-0.3f, 0.0f, 0.0f));
        PartDefinition taclejointL2 = tentacle.addOrReplaceChild("taclejointL2", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0f, -1.0f, 0.0f, 2.0f, 2.0f, 1.0f), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition tentacle_1 = taclejointL2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 12.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f, 0.0f));
        PartDefinition taclejointL3 = tentacle_1.addOrReplaceChild("taclejointL3", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_2 = taclejointL3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(35, 0).addBox(-1.0f, -1.0f, 0.0f, 2.0f, 2.0f, 11.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 1.012291f, 0.0f));
        PartDefinition taclejointL4 = tentacle_2.addOrReplaceChild("taclejointL4", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 1.0f), PartPose.offset(0.0f, 0.0f, 9.0f));
        taclejointL4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5f, -0.5f, -1.0f, 1.0f, 1.0f, 13.0f), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.9250245f, 0.0f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f1 = Mth.sin(ageInTicks * 0.06f) * 0.2f;
        float f2 = Mth.sin(ageInTicks * 0.07f + 8.0f) * 0.3f;
        float f3 = Mth.sin(ageInTicks * 0.06f + 4.0f) * 0.4f;
        taclejointL2.yRot = f1;
        taclejointL3.yRot = f2;
        taclejointL4.yRot = f3;
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}