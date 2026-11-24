package com.dhanantry.scapeandrunparasites.client.particle;

import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.multiplayer.ClientLevel;

/**
 * STUB migrado (Fase C): esqueleto. La logica real se migrara en lotes.
 */
public class ParticleMultipleGore extends TextureSheetParticle {
    protected ParticleMultipleGore(ClientLevel level, double x, double y, double z) {
        super(level, x, y, z);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }
}
