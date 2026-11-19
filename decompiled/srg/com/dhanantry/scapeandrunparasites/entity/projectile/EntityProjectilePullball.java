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
        this.func_70105_a(0.3f, 0.3f);
    }

    public EntityProjectilePullball(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ, byte t) {
        super(worldIn, shooter, accelX, accelY, accelZ);
        this.func_70105_a(0.3f, 0.3f);
        this.ranrac = shooter;
        this.type = t;
    }

    protected EnumParticleTypes func_184563_j() {
        return EnumParticleTypes.EXPLOSION_NORMAL;
    }

    protected void func_70227_a(RayTraceResult result) {
        if (!this.field_70170_p.field_72995_K) {
            if (result.field_72308_g != null) {
                if (result.field_72308_g instanceof EntityLivingBase) {
                    // empty if block
                }
            } else {
                this.setWebsAround();
            }
            this.func_70106_y();
        }
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.field_70173_aa == 5) {
            switch (this.type) {
                case 1: {
                    this.field_70232_b *= 2.0;
                    this.field_70230_d *= 2.0;
                    break;
                }
                case 2: {
                    this.field_70232_b *= 4.0;
                    this.field_70230_d *= 4.0;
                }
            }
        }
        if (!this.field_70170_p.field_72995_K) {
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
        if (!(this.field_70235_a instanceof EntityRanrac)) {
            return;
        }
        if (this.field_70235_a == null || ((EntityRanrac)this.field_70235_a).hasTargetedEntity()) {
            this.func_70106_y();
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70165_t + 1.0, this.field_70163_u + 1.0, this.field_70161_v + 1.0).func_186662_g(2.0);
        List moblist = this.field_70170_p.func_72872_a(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            EntityRanrac ra;
            if (mob instanceof EntityParasiteBase || !this.field_70235_a.func_70685_l((Entity)mob) || mob != (ra = (EntityRanrac)this.field_70235_a).func_70638_az()) continue;
            if (!mob.func_70089_S()) {
                this.func_70106_y();
                return;
            }
            ra.setParasiteStatus(3);
            mob.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 60, 2, false, false));
            ra.setTargetedEntity(mob.func_145782_y());
            ra.func_70661_as().func_75497_a((Entity)mob, 0.0);
            ra.resetPullSkill();
        }
    }

    private void aRanrac() {
        if (!(this.field_70235_a instanceof EntityRanracAdapted)) {
            return;
        }
        if (this.field_70235_a == null || ((EntityRanracAdapted)this.field_70235_a).hasTargetedEntity()) {
            this.func_70106_y();
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70165_t + 1.0, this.field_70163_u + 1.0, this.field_70161_v + 1.0).func_186662_g(2.5);
        List moblist = this.field_70170_p.func_72872_a(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            EntityRanracAdapted ra;
            if (mob instanceof EntityParasiteBase || !this.field_70235_a.func_70685_l((Entity)mob) || mob != (ra = (EntityRanracAdapted)this.field_70235_a).func_70638_az()) continue;
            if (!mob.func_70089_S()) {
                this.func_70106_y();
                return;
            }
            ra.setParasiteStatus(3);
            mob.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 60, 2, false, false));
            ra.setTargetedEntity(mob.func_145782_y());
            ra.func_70661_as().func_75497_a((Entity)mob, 0.0);
            ra.resetPullSkill();
        }
    }

    private void setWebsAround() {
        int totalWebs = this.field_70146_Z.nextInt(3) + 1;
        int[] positionss = new int[]{-1, 0, 1};
        for (int i = 1; i <= totalWebs; ++i) {
            int poz;
            int poy;
            int pox = positionss[this.field_70146_Z.nextInt(3)];
            if (this.field_70170_p.func_180495_p(new BlockPos(this.field_70165_t + (double)pox, this.field_70163_u + (double)(poy = positionss[this.field_70146_Z.nextInt(3)]), this.field_70161_v + (double)(poz = positionss[this.field_70146_Z.nextInt(3)]))).func_177230_c() != Blocks.field_150350_a) continue;
            this.field_70170_p.func_175656_a(new BlockPos(this.field_70165_t + (double)pox, this.field_70163_u + (double)poy, this.field_70161_v + (double)poz), SRPBlocks.SRPWeb.func_176223_P());
        }
    }
}

