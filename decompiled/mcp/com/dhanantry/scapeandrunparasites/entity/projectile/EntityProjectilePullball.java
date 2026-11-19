/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.projectile;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityRanracAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityRanrac;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntitySRPProjectile;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityProjectilePullball
extends EntitySRPProjectile {
    private EntityLivingBase ranrac;
    private byte type;

    public EntityProjectilePullball(World worldIn) {
        super(worldIn);
        this.setSize(0.3f, 0.3f);
    }

    public EntityProjectilePullball(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ, byte t) {
        super(worldIn, shooter, accelX, accelY, accelZ);
        this.setSize(0.3f, 0.3f);
        this.ranrac = shooter;
        this.type = t;
    }

    protected EnumParticleTypes getParticleType() {
        return EnumParticleTypes.EXPLOSION_NORMAL;
    }

    protected void onImpact(RayTraceResult result) {
        if (!this.world.isRemote) {
            if (result.entityHit != null) {
                if (result.entityHit instanceof EntityLivingBase) {
                    // empty if block
                }
            } else {
                this.setWebsAround();
            }
            this.setDead();
        }
    }

    public void onUpdate() {
        super.onUpdate();
        if (this.ticksExisted == 5) {
            switch (this.type) {
                case 1: {
                    this.accelerationX *= 2.0;
                    this.accelerationZ *= 2.0;
                    break;
                }
                case 2: {
                    this.accelerationX *= 4.0;
                    this.accelerationZ *= 4.0;
                }
            }
        }
        if (!this.world.isRemote) {
            switch (this.type) {
                case 1: {
                    this.pRanrac();
                    break;
                }
                case 2: {
                    this.aRanrac();
                }
            }
        }
    }

    private void pRanrac() {
        if (!(this.shootingEntity instanceof EntityRanrac)) {
            return;
        }
        if (this.shootingEntity == null || ((EntityRanrac)this.shootingEntity).hasTargetedEntity()) {
            this.setDead();
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(2.0);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            EntityRanrac ra;
            if (mob instanceof EntityParasiteBase || !this.shootingEntity.canEntityBeSeen((Entity)mob) || mob != (ra = (EntityRanrac)this.shootingEntity).getAttackTarget()) continue;
            if (!mob.isEntityAlive()) {
                this.setDead();
                return;
            }
            ra.setParasiteStatus(3);
            mob.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 2, false, false));
            ra.setTargetedEntity(mob.getEntityId());
            ra.getNavigator().tryMoveToEntityLiving((Entity)mob, 0.0);
            ra.resetPullSkill();
        }
    }

    private void aRanrac() {
        if (!(this.shootingEntity instanceof EntityRanracAdapted)) {
            return;
        }
        if (this.shootingEntity == null || ((EntityRanracAdapted)this.shootingEntity).hasTargetedEntity()) {
            this.setDead();
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(2.5);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            EntityRanracAdapted ra;
            if (mob instanceof EntityParasiteBase || !this.shootingEntity.canEntityBeSeen((Entity)mob) || mob != (ra = (EntityRanracAdapted)this.shootingEntity).getAttackTarget()) continue;
            if (!mob.isEntityAlive()) {
                this.setDead();
                return;
            }
            ra.setParasiteStatus(3);
            mob.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 2, false, false));
            ra.setTargetedEntity(mob.getEntityId());
            ra.getNavigator().tryMoveToEntityLiving((Entity)mob, 0.0);
            ra.resetPullSkill();
        }
    }

    private void setWebsAround() {
        int totalWebs = this.rand.nextInt(3) + 1;
        int[] positionss = new int[]{-1, 0, 1};
        for (int i = 1; i <= totalWebs; ++i) {
            int poz;
            int poy;
            int pox = positionss[this.rand.nextInt(3)];
            if (this.world.getBlockState(new BlockPos(this.posX + (double)pox, this.posY + (double)(poy = positionss[this.rand.nextInt(3)]), this.posZ + (double)(poz = positionss[this.rand.nextInt(3)]))).getBlock() != Blocks.AIR) continue;
            this.world.setBlockState(new BlockPos(this.posX + (double)pox, this.posY + (double)poy, this.posZ + (double)poz), SRPBlocks.SRPWeb.getDefaultState());
        }
    }
}

