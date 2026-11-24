package com.dhanantry.scapeandrunparasites.client.renderer;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

/**
 * STUB migrado (Fase C): renderer generico vacio para compilar. Los renderers reales (127) se migraran en lotes.
 */
public class SRPRenderer<T extends LivingEntity> extends EntityRenderer<T> {
    public SRPRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return new ResourceLocation("srparasites", "textures/entity/placeholder.png");
    }
}
