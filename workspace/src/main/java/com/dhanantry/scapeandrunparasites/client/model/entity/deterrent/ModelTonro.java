package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

/**
 * STUB migrado (Fase renderers/modelos): esqueleto compilable. La geometria real se migrara en lotes.
 */
public class ModelTonro extends EntityModel<Entity> {
    public ModelTonro(ModelPart root) { }

    public static LayerDefinition createBodyLayer() { return null; }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) { }
}