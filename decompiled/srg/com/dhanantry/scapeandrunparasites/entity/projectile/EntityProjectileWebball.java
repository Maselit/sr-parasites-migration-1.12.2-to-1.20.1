/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.projectile;

import com.dhanantry.scapeandrunparasites.block.BlockWebBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntitySRPProjectile;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityProjectileWebball
extends EntitySRPProjectile {
    private byte type;

    public EntityProjectileWebball(World worldIn) {
        super(worldIn);
        this.func_70105_a(0.3f, 0.3f);
        this.type = 1;
    }

    public EntityProjectileWebball(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
        super(worldIn, shooter, accelX, accelY, accelZ);
        this.func_70105_a(0.3f, 0.3f);
        this.type = 1;
    }

    public EntityProjectileWebball(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ, byte t) {
        super(worldIn, shooter, accelX, accelY, accelZ);
        this.func_70105_a(0.3f, 0.3f);
        this.type = t;
    }

    protected EnumParticleTypes func_184563_j() {
        return EnumParticleTypes.EXPLOSION_NORMAL;
    }

    protected void func_70227_a(RayTraceResult result) {
        if (!this.field_70170_p.field_72995_K) {
            if (SRPConfigMobs.dorpaWeb) {
                this.setWebsAround();
            } else if (result.field_72308_g != null && result.field_72308_g instanceof EntityLivingBase) {
                EntityLivingBase target = (EntityLivingBase)result.field_72308_g;
                if (target instanceof EntityParasiteBase) {
                    this.func_70106_y();
                    return;
                }
                int i = 3;
                if (this.field_70170_p.func_175659_aa() == EnumDifficulty.NORMAL) {
                    i = 6;
                } else if (this.field_70170_p.func_175659_aa() == EnumDifficulty.HARD) {
                    i = 9;
                }
                DamageSource damagesource = this.field_70235_a == null ? DamageSource.func_76356_a((Entity)this, (Entity)this) : DamageSource.func_76356_a((Entity)this, (Entity)this.field_70235_a);
                target.func_70690_d(new PotionEffect(MobEffects.field_76421_d, i * 20, 1));
                target.func_70097_a(damagesource, SRPAttributes.DORPA_RANGED_DAMAGE);
                this.attackEntityAsMobMinimum((Entity)target, (EntityParasiteBase)this.field_70235_a);
            }
            this.func_70106_y();
        }
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.field_70173_aa > 60) {
            this.setWebsAround();
            this.func_70106_y();
        }
    }

    private void setWebsAround() {
        int totalWebs = this.field_70146_Z.nextInt(3) + 1;
        int[] positionss = new int[]{-1, 0, 1};
        block5: for (int i = 1; i <= totalWebs; ++i) {
            int poz;
            int poy;
            int pox = positionss[this.field_70146_Z.nextInt(3)];
            if (this.field_70170_p.func_180495_p(new BlockPos(this.field_70165_t + (double)pox, this.field_70163_u + (double)(poy = positionss[this.field_70146_Z.nextInt(3)]), this.field_70161_v + (double)(poz = positionss[this.field_70146_Z.nextInt(3)]))).func_177230_c() != Blocks.field_150350_a) continue;
            switch (this.type) {
                case 1: {
                    this.field_70170_p.func_175656_a(new BlockPos(this.field_70165_t + (double)pox, this.field_70163_u + (double)poy, this.field_70161_v + (double)poz), SRPBlocks.SRPWeb.func_176223_P());
                    continue block5;
                }
                case 2: {
                    this.field_70170_p.func_175656_a(new BlockPos(this.field_70165_t + (double)pox, this.field_70163_u + (double)poy, this.field_70161_v + (double)poz), SRPBlocks.SRPWeb.func_176223_P().func_177226_a(BlockWebBase.VARIANT, (Comparable)((Object)BlockWebBase.EnumType.TWO)));
                    continue block5;
                }
                case 3: {
                    this.field_70170_p.func_175656_a(new BlockPos(this.field_70165_t + (double)pox, this.field_70163_u + (double)poy, this.field_70161_v + (double)poz), SRPBlocks.SRPWeb.func_176223_P().func_177226_a(BlockWebBase.VARIANT, (Comparable)((Object)BlockWebBase.EnumType.THREE)));
                }
            }
        }
    }
}

