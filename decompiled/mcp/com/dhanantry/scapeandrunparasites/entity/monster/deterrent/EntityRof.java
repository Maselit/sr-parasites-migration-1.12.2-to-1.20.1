/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.deterrent;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityRof
extends EntityPStationary {
    public EntityLivingBase targetScent;
    public byte dangerArea;
    public int minmob;
    public int maxmob;
    private float attackTimer;
    private boolean upT;

    public EntityRof(World worldIn) {
        super(worldIn);
        this.setSize(1.5f, 4.6f);
        this.experienceValue = 0;
        this.type = (byte)40;
        this.buriedT = 5.7;
        this.damageCap = SRPConfig.turretCap;
        this.pointCap = SRPConfig.turretPointCap;
        this.pointReduction = SRPConfig.turretPointRed;
        this.chanceLearn = SRPConfig.turretChanceLe;
        this.chanceLearnFire = SRPConfig.turretChanceLeFire;
        this.DamageTypeCap = SRPConfig.turretPointDamCap;
        this.MiniDamage = SRPConfig.turretMinDamage;
        this.regen = SRPConfig.turretRegen;
        this.valueEvDeath = 0;
        this.delayBuried = 40;
    }

    @Override
    public int getParasiteIDRegister() {
        return 308;
    }

    protected void initEntityAI() {
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.upT) {
            this.attackTimer = (float)((double)this.attackTimer + 0.2);
            if (this.attackTimer > 3.0f) {
                this.upT = false;
            }
        } else {
            this.attackTimer = (float)((double)this.attackTimer - 0.1);
        }
        if (!this.world.isRemote) {
            if (this.getAttackTarget() != null && this.getAttackTarget().getDistanceSq((Entity)this) > 256.0) {
                this.world.setEntityState((Entity)this, (byte)51);
                this.up = true;
            }
            if (this.ticksExisted > 160 && this.targetScent == null) {
                this.world.setEntityState((Entity)this, (byte)51);
                this.up = true;
            }
            if (this.ticksExisted == 100) {
                this.upT = true;
                this.attackTimer = 0.0f;
                this.world.setEntityState((Entity)this, (byte)112);
            }
            if (!this.up && this.ticksExisted > 120 && !this.buried() && this.targetScent != null) {
                for (int i = 0; i <= this.maxmob; ++i) {
                    this.spawnWaves();
                    if (i < this.minmob || this.rand.nextInt(3) != 0) continue;
                    this.targetScent = null;
                }
                this.targetScent = null;
            }
        }
    }

    @Override
    protected void retreat(boolean dead) {
        if (this.up) {
            this.setParasiteStatus(3);
            this.buried += this.getBuriedSpeed();
            if (this.buried > this.buriedT + 0.7 && !this.world.isRemote) {
                this.setDead();
            }
        }
    }

    @Override
    public double getBuriedSpeed() {
        return 0.12;
    }

    private String getMob() {
        String mob = "minecraft:zombie";
        byte area = this.dangerArea;
        switch (area) {
            case 0: {
                mob = SRPConfigSystems.scentLevelZero[this.rand.nextInt(SRPConfigSystems.scentLevelZero.length)];
                break;
            }
            case 1: {
                mob = SRPConfigSystems.scentLevelOne[this.rand.nextInt(SRPConfigSystems.scentLevelOne.length)];
                break;
            }
            case 2: {
                mob = SRPConfigSystems.scentLevelTwo[this.rand.nextInt(SRPConfigSystems.scentLevelTwo.length)];
                break;
            }
            case 3: {
                mob = SRPConfigSystems.scentLevelThree[this.rand.nextInt(SRPConfigSystems.scentLevelThree.length)];
                break;
            }
            case 4: {
                mob = SRPConfigSystems.scentLevelFour[this.rand.nextInt(SRPConfigSystems.scentLevelFour.length)];
                break;
            }
            case 5: {
                mob = SRPConfigSystems.scentLevelFive[this.rand.nextInt(SRPConfigSystems.scentLevelFive.length)];
                break;
            }
            case 6: {
                mob = SRPConfigSystems.scentLevelSix[this.rand.nextInt(SRPConfigSystems.scentLevelSix.length)];
                break;
            }
            case 7: {
                mob = SRPConfigSystems.scentLevelSeven[this.rand.nextInt(SRPConfigSystems.scentLevelSeven.length)];
                break;
            }
            case 8: {
                mob = SRPConfigSystems.scentLevelEight[this.rand.nextInt(SRPConfigSystems.scentLevelEight.length)];
            }
        }
        return mob;
    }

    public int spawnWaves() {
        if (this.targetScent == null) {
            return 0;
        }
        String mob = this.getMob();
        EntityLiving entityliving = (EntityLiving)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(mob), (World)this.world);
        if (entityliving == null) {
            return 0;
        }
        entityliving.onInitialSpawn(this.world.getDifficultyForLocation(new BlockPos((Entity)entityliving)), (IEntityLivingData)null);
        entityliving.setAttackTarget(this.getAttackTarget());
        double d0 = (float)this.posX + this.world.rand.nextFloat();
        double d1 = (float)this.posY + this.world.rand.nextFloat();
        double d2 = (float)this.posZ + this.world.rand.nextFloat();
        double d3 = d0 - this.posX;
        double d4 = d1 - this.posY;
        double d5 = d2 - this.posZ;
        double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
        d3 /= d6;
        d4 /= d6;
        d5 /= d6;
        double d7 = 0.5 / (d6 / 4.0 + 0.1);
        d4 = d4 * d7 * 6.0;
        entityliving.copyLocationAndAnglesFrom((Entity)this);
        entityliving.posY = this.posY + (double)this.height + 0.5;
        this.setMotion((EntityLivingBase)entityliving, d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3f)), d4, d5 *= d7, 0.03, 1.2);
        this.world.spawnEntity((Entity)entityliving);
        entityliving.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1200, 1, false, false));
        return 1;
    }

    public void setMotion(EntityLivingBase in, double xSpeedIn, double ySpeedIn, double zSpeedIn, double capX, double capY) {
        xSpeedIn = Math.min(xSpeedIn, capX);
        ySpeedIn = Math.min(ySpeedIn, capY);
        zSpeedIn = Math.min(zSpeedIn, capX);
        in.motionX = xSpeedIn * (Math.random() * 2.0 - 1.0);
        in.motionY = ySpeedIn;
        in.motionZ = zSpeedIn * (Math.random() * 2.0 - 1.0);
    }

    public float getEyeHeight() {
        return 1.8f;
    }

    public static void registerFixesTonro(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityRof.class);
    }

    @SideOnly(value=Side.CLIENT)
    public float getAttackTimer() {
        return this.attackTimer;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 112) {
            this.upT = true;
            this.attackTimer = 0.0f;
        } else {
            super.handleStatusUpdate(id);
        }
    }
}

