/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.projectile;

import com.dhanantry.scapeandrunparasites.entity.EntityToxicCloud;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntitySRPProjectile;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityProjectileAlafhaBall
extends EntitySRPProjectile {
    public EntityProjectileAlafhaBall(World worldIn) {
        super(worldIn);
        this.setSize(0.3f, 0.3f);
    }

    public EntityProjectileAlafhaBall(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
        super(worldIn, shooter, accelX, accelY, accelZ);
        this.setSize(0.3f, 0.3f);
    }

    protected EnumParticleTypes getParticleType() {
        return EnumParticleTypes.EXPLOSION_NORMAL;
    }

    protected void onImpact(RayTraceResult result) {
        if (!this.world.isRemote) {
            DamageSource damagesource = this.shootingEntity == null ? DamageSource.causeThrownDamage((Entity)this, (Entity)this) : DamageSource.causeThrownDamage((Entity)this, (Entity)this.shootingEntity);
            for (EntityLivingBase entitylivingbase : this.world.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().grow(3.0, 3.0, 3.0))) {
                if (entitylivingbase instanceof EntityParasiteBase) continue;
                SRPPotions.applyStackPotion(SRPPotions.DLER_E, entitylivingbase, 300, 0);
                entitylivingbase.attackEntityFrom(damagesource, SRPAttributes.ALAFHA_ATTACK_DAMAGE);
                this.attackEntityAsMobMinimum((Entity)entitylivingbase, (EntityParasiteBase)this.shootingEntity);
            }
            this.world.playSound((EntityPlayer)null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.BLOCKS, 4.0f, (1.0f + (this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.2f) * 0.7f);
            this.spawnLingeringCloud();
            this.setDead();
        }
    }

    private void spawnLingeringCloud() {
        EntityToxicCloud entityareaeffectcloud = new EntityToxicCloud(this.world, this.posX, this.posY, this.posZ);
        entityareaeffectcloud.setRadius(1.5f, 1.1f);
        entityareaeffectcloud.setRadiusOnUse(-0.5f);
        entityareaeffectcloud.setWaitTime(30);
        entityareaeffectcloud.setDuration(60);
        entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float)entityareaeffectcloud.getDuration());
        entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.DLER_E, 360, 0, false, false));
        this.world.spawnEntity((Entity)entityareaeffectcloud);
    }
}

