/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ParticleMultipleGore
extends Particle {
    public static final ResourceLocation PARTICLES_TEXTUREINFECTED = new ResourceLocation("srparasites", "particle/splashi");
    public static final ResourceLocation PARTICLES_TEXTURESPIDER = new ResourceLocation("srparasites", "particle/splashd");
    public static final ResourceLocation PARTICLES_TEXTUREPRIMITIVE = new ResourceLocation("srparasites", "particle/splashp");
    public static final ResourceLocation PARTICLES_TEXTUREADAPTED = new ResourceLocation("srparasites", "particle/splasha");
    public static final ResourceLocation PARTICLES_TEXTUREVOMIT = new ResourceLocation("srparasites", "particle/splashv");

    protected ParticleMultipleGore(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int texture) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, 0.0, 0.0, 0.0);
        if (texture == 0) {
            this.setParticleTexture(Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(PARTICLES_TEXTUREINFECTED.toString()));
        } else if (texture == 1) {
            this.setParticleTexture(Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(PARTICLES_TEXTURESPIDER.toString()));
        } else if (texture == 2) {
            this.setParticleTexture(Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(PARTICLES_TEXTUREPRIMITIVE.toString()));
        } else if (texture == 3) {
            this.setParticleTexture(Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(PARTICLES_TEXTUREADAPTED.toString()));
        } else if (texture == 4) {
            this.setParticleTexture(Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(PARTICLES_TEXTUREVOMIT.toString()));
        }
        this.motionX = xSpeedIn;
        this.motionY = ySpeedIn;
        this.motionZ = zSpeedIn;
        this.setSize(0.01f, 0.01f);
        this.particleGravity = 0.06f;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.particleGravity = 0.04f;
        this.particleMaxAge = 20 * (this.rand.nextInt(3) + 1);
    }

    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= (double)this.particleGravity;
        this.move(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.98f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)0.98f;
        if (this.particleMaxAge-- <= 0) {
            this.setExpired();
        }
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    public int getFXLayer() {
        return 1;
    }
}

