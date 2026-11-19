/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.block.BlockGore;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.EntityRemain;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityGore;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPPrimitive
extends EntityPMalleable {
    public EntityPPrimitive(World worldIn) {
        super(worldIn);
        this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, SRPConfig.primitiveWalls, false, null, SRPConfig.primitiveSneakPen, SRPConfig.primitiveInviPen));
        if (SRPConfig.canOrbAttack) {
            this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAISkill(this, 100, 4, false, 21));
        }
        if (SRPConfig.mobattacking) {
            this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, SRPConfig.primitiveWalls, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !(entity instanceof EntityVillager) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.primitiveSneakPen, SRPConfig.primitiveInviPen));
        }
        this.field_70728_aV = SRPAttributes.XP_PRIMITIVE;
        this.damageCap = SRPConfig.primitiveCap;
        this.canD = SRPConfig.primitivedespawn;
        this.canModRender = 1;
        this.type = (byte)31;
        this.fuseOrb = 8;
        this.orbStartTimer = 30;
        this.foodSteal = SRPConfig.primitiveFoodSteal;
        this.orbItemCool = SRPConfig.primitiveItemOrbCooldown * 20;
        this.pointCap = SRPConfig.primitivePointCap;
        this.pointReduction = SRPConfig.primitivePointRed;
        this.chanceLearn = SRPConfig.primitiveChanceLe;
        this.chanceLearnFire = SRPConfig.primitiveChanceLeFire;
        this.DamageTypeCap = SRPConfig.primitivePointDamCap;
        this.MiniDamage = SRPConfig.primitiveMinDamage;
        this.regen = SRPConfig.primitiveRegen * SRPConfig.globalHealthMultiplier;
        this.oneMindDeathValue = SRPConfig.primitiveOneMindDeathV;
        this.regenEff = 1;
        this.foodRott = SRPConfig.primitiveFoodChance;
        this.foodRootNumber = SRPConfig.primitiveFoodAmount;
        this.valueEvDeath = SRPConfig.primitiveLoosingEPValue;
    }

    @Override
    protected void fearPlayer(EntityLivingBase player) {
        try {
            if (player == null) {
                return;
            }
            if (!this.func_70685_l((Entity)player)) {
                return;
            }
            if (!player.func_70644_a(SRPPotions.FEAR_E)) {
                player.func_70690_d(new PotionEffect(SRPPotions.FEAR_E, 300, 1, false, false));
            } else if (player.func_70660_b(SRPPotions.FEAR_E).func_76458_c() < 1) {
                player.func_70690_d(new PotionEffect(SRPPotions.FEAR_E, 300, 1, false, false));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public boolean func_70652_k(Entity entityIn) {
        EntityLivingBase target;
        boolean flag = super.func_70652_k(entityIn);
        if (flag && entityIn instanceof EntityLivingBase && this.field_70146_Z.nextDouble() < (double)SRPConfigSystems.cothPrimitive && !(target = (EntityLivingBase)entityIn).func_70644_a(SRPPotions.COTH_E)) {
            if (target.func_70644_a(SRPPotions.EPEL_E)) {
                if (this.field_70146_Z.nextDouble() >= SRPConfigSystems.epelChanceCOTH) {
                    target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                }
            } else {
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
        }
        return flag;
    }

    public void func_180430_e(float distance, float damageMultiplier) {
        if (distance >= 40.0f) {
            super.func_180430_e(distance, damageMultiplier);
        }
    }

    @Override
    protected void spawnGore() {
        int range = 2;
        double i1 = MathHelper.func_76128_c((double)(this.field_70163_u + 0.1));
        double l1 = this.field_70165_t;
        double i2 = this.field_70161_v;
        for (int k2 = -1 * range; k2 <= 1 * range && SRPConfig.paraGore; ++k2) {
            for (int l2 = -1 * range; l2 <= 1 * range; ++l2) {
                double i3 = l1 + (double)k2;
                double l = i2 + (double)l2;
                BlockPos blockpos = new BlockPos(i3, i1, l);
                Block block = this.field_70170_p.func_180495_p(blockpos).func_177230_c();
                Block blockDown = this.field_70170_p.func_180495_p(blockpos.func_177977_b()).func_177230_c();
                if (block != Blocks.field_150350_a || blockDown == Blocks.field_150350_a || !this.field_70170_p.func_180495_p(blockpos.func_177977_b()).func_185913_b() || blockDown == SRPBlocks.InfestedStain || this.field_70170_p.field_73012_v.nextInt(3) != 0) continue;
                this.field_70170_p.func_175656_a(blockpos, SRPBlocks.Gore.func_176223_P().func_177226_a(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.PRI_FLAT)));
            }
        }
        if (this.field_70170_p.func_180495_p(this.func_180425_c().func_177977_b()).func_185913_b() && (this.field_70170_p.func_180495_p(this.func_180425_c()).func_177230_c() instanceof BlockBush || this.field_70170_p.func_180495_p(this.func_180425_c()).func_177230_c() == Blocks.field_150350_a)) {
            this.field_70170_p.func_175656_a(this.func_180425_c(), SRPBlocks.Gore.func_176223_P().func_177226_a(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.PRI_BIG)));
            EntityRemain nnn = new EntityRemain(this.field_70170_p);
            nnn.func_70012_b((double)this.func_180425_c().func_177958_n() + 0.5, this.func_180425_c().func_177956_o(), (double)this.func_180425_c().func_177952_p() + 0.5, 0.0f, 0.0f);
            nnn.setParasite(EntityList.func_191301_a((Entity)this).toString());
            nnn.setSkin((byte)this.getSkin());
            nnn.setGoal(20 * SRPConfig.primitiveRemainValue);
            this.field_70170_p.func_72838_d((Entity)nnn);
        }
        for (int i = 0; i < 4 && SRPConfig.paraGore; ++i) {
            double d0 = (float)this.field_70165_t + this.field_70170_p.field_73012_v.nextFloat();
            double d1 = (float)this.field_70163_u + this.field_70170_p.field_73012_v.nextFloat();
            double d2 = (float)this.field_70161_v + this.field_70170_p.field_73012_v.nextFloat();
            double d3 = d0 - this.field_70165_t;
            double d4 = d1 - this.field_70163_u;
            double d5 = d2 - this.field_70161_v;
            double d6 = MathHelper.func_76133_a((double)(d3 * d3 + d4 * d4 + d5 * d5));
            d3 /= d6;
            d4 /= d6;
            d5 /= d6;
            double d7 = 0.5 / (d6 / 4.0 + 0.1);
            d4 = d4 * d7 * 2.0;
            EntityGore bomb = new EntityGore(this.field_70170_p);
            bomb.setType((byte)2);
            bomb.func_82149_j((Entity)this);
            bomb.setMotion(d3 *= (d7 *= (double)(this.field_70170_p.field_73012_v.nextFloat() * this.field_70170_p.field_73012_v.nextFloat() + 0.3f)), d4, d5 *= d7, 0.15, 0.55);
            this.field_70170_p.func_72838_d((Entity)bomb);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void spawnEffectsGore() {
        for (int i = 0; i <= 60; ++i) {
            if (i % 4 == 0) {
                this.spawnParticles(SRPEnumParticle.GCLOUD, 150, 0, 0);
            }
            if (i % 5 != 0) continue;
            this.spawnParticles(SRPEnumParticle.GSPLASH, 2, -1, -1);
        }
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            // empty if block
        }
        return flag;
    }
}

