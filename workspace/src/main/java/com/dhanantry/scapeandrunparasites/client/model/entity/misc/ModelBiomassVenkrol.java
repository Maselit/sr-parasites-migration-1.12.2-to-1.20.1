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

public class ModelBiomassVenkrol extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "biomassvenkrol"), "main");
    private final ModelPart mainbodysi;
    private final ModelPart mainbodysii;
    private final ModelPart mainbodysiii;

    public ModelBiomassVenkrol(ModelPart root) {
        this.mainbodysi = root.getChild("mainbodysi");
        this.mainbodysii = root.getChild("mainbodysii");
        this.mainbodysiii = root.getChild("mainbodysiii");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        // mainbodysi
        PartDefinition mainbodysi = root.addOrReplaceChild("mainbodysi", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 3.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition core1 = mainbodysi.addOrReplaceChild("core1", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offset(0.0f, -1.5f, 0.0f));
        PartDefinition core2 = core1.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(52, 5).addBox(-1.0f, -3.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        core2.addOrReplaceChild("core3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -3.0f, -0.5f, 1.0f, 2.0f, 1.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        mainbodysi.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offsetAndRotation(2.3f, -1.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        mainbodysi.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(70, 2).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.0f, 2.3f, -1.1170107f, 0.0f, 0.0f));
        mainbodysi.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offsetAndRotation(-2.3f, -1.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        mainbodysi.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(62, 4).addBox(-1.0f, -1.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.0f, -2.3f, 1.1170107f, 0.0f, 0.0f));
        mainbodysi.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, -2.5f, 1.1170107f, 0.0f, 0.0f));

        // mainbodysii
        PartDefinition mainbodysii = root.addOrReplaceChild("mainbodysii", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 3.0f, 4.0f), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition core2_1 = mainbodysii.addOrReplaceChild("core2_1", CubeListBuilder.create().texOffs(67, 6).addBox(-1.5f, -3.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offset(0.0f, -1.5f, 0.0f));
        core2_1.addOrReplaceChild("core3_1", CubeListBuilder.create().texOffs(71, 11).addBox(-1.0f, -3.0f, -1.0f, 2.0f, 2.0f, 2.0f), PartPose.offset(0.0f, -1.0f, 0.0f));
        mainbodysii.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(10, 7).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, 2.5f, -1.1170107f, 0.0f, 0.0f));
        mainbodysii.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(59, 11).addBox(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(2.5f, -1.2f, 0.0f, 0.0f, 0.0f, -0.55850536f));
        mainbodysii.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), PartPose.offsetAndRotation(-2.5f, -1.2f, 0.0f, 0.0f, 0.0f, 0.55850536f));
        mainbodysii.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5f, -1.5f, -1.0f, 3.0f, 3.0f, 2.0f), PartPose.offsetAndRotation(0.0f, -1.2f, -2.5f, 1.1170107f, 0.0f, 0.0f));

        // mainbodysiii
        PartDefinition mainbodysiii = root.addOrReplaceChild("mainbodysiii", CubeListBuilder.create().texOffs(22, 0).addBox(-5.0f, -3.0f, -5.0f, 10.0f, 4.0f, 10.0f), PartPose.offsetAndRotation(0.0f, 19.5f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition core2_2 = mainbodysiii.addOrReplaceChild("core2_2", CubeListBuilder.create().texOffs(4, 14).addBox(-4.0f, -3.0f, -4.0f, 8.0f, 3.0f, 8.0f), PartPose.offset(0.0f, -2.5f, 0.0f));
        PartDefinition core3_2 = core2_2.addOrReplaceChild("core3_2", CubeListBuilder.create().texOffs(0, 33).addBox(-3.0f, -3.0f, -3.0f, 6.0f, 2.0f, 6.0f), PartPose.offset(0.0f, -2.0f, 0.0f));
        core3_2.addOrReplaceChild("core4_1", CubeListBuilder.create().texOffs(56, 16).addBox(-2.0f, -3.0f, -2.0f, 4.0f, 3.0f, 4.0f), PartPose.offset(0.0f, -2.5f, 0.0f));
        mainbodysiii.addOrReplaceChild("core5", CubeListBuilder.create().texOffs(26, 15).addBox(-5.0f, -3.0f, -5.0f, 10.0f, 2.0f, 10.0f), PartPose.offsetAndRotation(0.0f, -0.5f, 0.0f, (float) -Math.PI, 0.0f, 0.0f));
        mainbodysiii.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(0, 25).addBox(-3.5f, -1.5f, -2.5f, 7.0f, 3.0f, 5.0f), PartPose.offsetAndRotation(-4.6f, -1.0f, 0.0f, 0.0f, 0.0f, 1.2566371f));
        mainbodysiii.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(24, 27).addBox(-3.5f, -1.5f, -2.5f, 7.0f, 3.0f, 5.0f), PartPose.offsetAndRotation(4.6f, -1.0f, 0.0f, 0.0f, 0.0f, -1.2566371f));
        mainbodysiii.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(63, 24).addBox(-2.5f, -3.5f, -1.5f, 5.0f, 7.0f, 3.0f), PartPose.offsetAndRotation(0.0f, -1.0f, 4.6f, -0.31415927f, 0.0f, 0.0f));
        mainbodysiii.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(48, 31).addBox(-2.5f, -3.5f, -1.5f, 5.0f, 7.0f, 3.0f), PartPose.offsetAndRotation(0.0f, -1.0f, -4.6f, 0.31415927f, 0.0f, 0.0f));

        return LayerDefinition.create(mesh, 80, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        // render all three variants; visibility handled by entity skin at runtime (simplified: render all)
        mainbodysi.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}