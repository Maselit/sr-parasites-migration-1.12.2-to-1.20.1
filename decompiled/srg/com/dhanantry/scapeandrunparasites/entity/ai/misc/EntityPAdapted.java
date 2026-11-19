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
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
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
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
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
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPAdapted
extends EntityPMalleable {
    public EntityPAdapted(World worldIn) {
        super(worldIn);
        this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, SRPConfig.adaptedWalls, false, null, SRPConfig.adaptedSneakPen, SRPConfig.adaptedInviPen));
        if (SRPConfig.canOrbAttack) {
            this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAISkill(this, 80, 4, false, 21));
        }
        if (SRPConfig.mobattacking) {
            this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, SRPConfig.adaptedWalls, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !(entity instanceof EntityVillager) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.adaptedSneakPen, SRPConfig.adaptedInviPen));
        }
        this.field_70728_aV = SRPAttributes.XP_ADAPTED;
        this.canD = SRPConfig.adapteddespawn;
        this.damageCap = SRPConfig.adaptedCap;
        this.canModRender = 1;
        this.type = (byte)41;
        this.fuseOrb = 13;
        this.orbStartTimer = 15;
        this.foodSteal = SRPConfig.adaptedFoodSteal;
        this.orbItemCool = SRPConfig.adaptedItemOrbCooldown * 20;
        this.pointCap = SRPConfig.adaptedPointCap;
        this.pointReduction = SRPConfig.adaptedPointRed;
        this.chanceLearn = SRPConfig.adaptedChanceLe;
        this.chanceLearnFire = SRPConfig.adaptedChanceLeFire;
        this.DamageTypeCap = SRPConfig.adaptedPointDamCap;
        this.MiniDamage = SRPConfig.adaptedMinDamage;
        this.regen = SRPConfig.adaptedRegen * SRPConfig.globalHealthMultiplier;
        this.oneMindDeathValue = SRPConfig.adaptedOneMindDeathV;
        this.regenEff = 2;
        this.foodRott = SRPConfig.adaptedFoodChance;
        this.foodRootNumber = SRPConfig.adaptedFoodAmount;
        this.valueEvDeath = SRPConfig.adaptedLoosingEPValue;
    }

    @Override
    public void func_70636_d() {
        super.func_70636_d();
    }

    @Override
    protected void func_70623_bb() {
        if (!SRPConfigSystems.useEvolution) {
            super.func_70623_bb();
        } else {
            Event.Result result = null;
            boolean flag = this.func_70692_ba();
            if (this.func_104002_bU()) {
                this.field_70708_bq = 0;
            } else if ((this.field_70708_bq & 0x1F) == 31 && (result = ForgeEventFactory.canEntityDespawn((EntityLiving)this)) != Event.Result.DEFAULT) {
                if (result == Event.Result.DENY) {
                    this.field_70708_bq = 0;
                } else {
                    SRPSaveData data = SRPSaveData.get(this.field_70170_p);
                    data.setTotalKills(this.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueEvolutionDespawn, true, this.field_70170_p, true);
                    this.spawnCyst();
                    this.storeBefDes();
                    this.func_70106_y();
                }
            } else {
                EntityPlayer entity = this.field_70170_p.func_72890_a((Entity)this, -1.0);
                if (entity != null) {
                    SRPSaveData data;
                    double d0 = entity.field_70165_t - this.field_70165_t;
                    double d1 = entity.field_70163_u - this.field_70163_u;
                    double d2 = entity.field_70161_v - this.field_70161_v;
                    double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                    if (flag && d3 > 16384.0) {
                        data = SRPSaveData.get(this.field_70170_p);
                        data.setTotalKills(this.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueEvolutionDespawn, true, this.field_70170_p, true);
                        this.spawnCyst();
                        this.storeBefDes();
                        this.func_70106_y();
                    }
                    if (this.field_70708_bq > 600 && this.field_70146_Z.nextInt(800) == 0 && d3 > 1024.0 && flag) {
                        data = SRPSaveData.get(this.field_70170_p);
                        data.setTotalKills(this.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueEvolutionDespawn, true, this.field_70170_p, true);
                        this.spawnCyst();
                        this.storeBefDes();
                        this.func_70106_y();
                    } else if (d3 < 1024.0) {
                        this.field_70708_bq = 0;
                    }
                }
            }
        }
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
                player.func_70690_d(new PotionEffect(SRPPotions.FEAR_E, 300, 2, false, false));
            } else if (player.func_70660_b(SRPPotions.FEAR_E).func_76458_c() < 2) {
                player.func_70690_d(new PotionEffect(SRPPotions.FEAR_E, 300, 2, false, false));
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
        if (flag && entityIn instanceof EntityLivingBase && this.field_70146_Z.nextDouble() < (double)SRPConfigSystems.cothAdapted && !(target = (EntityLivingBase)entityIn).func_70644_a(SRPPotions.COTH_E)) {
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
        if (distance >= 60.0f) {
            super.func_180430_e(distance, damageMultiplier);
        }
    }

    @Override
    protected void spawnGore() {
        int range = 3;
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
                if (block != Blocks.field_150350_a || blockDown == Blocks.field_150350_a || !this.field_70170_p.func_180495_p(blockpos.func_177977_b()).func_185913_b() || blockDown == SRPBlocks.InfestedStain || this.field_70170_p.field_73012_v.nextInt(4) != 0) continue;
                this.field_70170_p.func_175656_a(blockpos, SRPBlocks.Gore.func_176223_P().func_177226_a(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.ADA_FLAT)));
            }
        }
        if (this.field_70170_p.func_180495_p(this.func_180425_c().func_177977_b()).func_185913_b() && (this.field_70170_p.func_180495_p(this.func_180425_c()).func_177230_c() instanceof BlockBush || this.field_70170_p.func_180495_p(this.func_180425_c()).func_177230_c() == Blocks.field_150350_a)) {
            this.field_70170_p.func_175656_a(this.func_180425_c(), SRPBlocks.Gore.func_176223_P().func_177226_a(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.ADA_BIG)));
            EntityRemain nnn = new EntityRemain(this.field_70170_p);
            nnn.func_70012_b((double)this.func_180425_c().func_177958_n() + 0.5, this.func_180425_c().func_177956_o(), (double)this.func_180425_c().func_177952_p() + 0.5, 0.0f, 0.0f);
            nnn.setParasite(EntityList.func_191301_a((Entity)this).toString());
            nnn.setSkin((byte)this.getSkin());
            nnn.setGoal(20 * SRPConfig.adaptedRemainValue);
            this.field_70170_p.func_72838_d((Entity)nnn);
        }
        for (int i = 0; i < 5 && SRPConfig.paraGore; ++i) {
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
            bomb.setType((byte)3);
            bomb.func_82149_j((Entity)this);
            bomb.setMotion(d3 *= (d7 *= (double)(this.field_70170_p.field_73012_v.nextFloat() * this.field_70170_p.field_73012_v.nextFloat() + 0.3f)), d4, d5 *= d7, 0.2, 0.6);
            this.field_70170_p.func_72838_d((Entity)bomb);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void spawnEffectsGore() {
        for (int i = 0; i <= 80; ++i) {
            if (i % 3 == 0) {
                this.spawnParticles(SRPEnumParticle.GCLOUD, 200, 200, 0);
            }
            if (i % 5 != 0) continue;
            this.spawnParticles(SRPEnumParticle.GSPLASH, 3, -1, -1);
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

