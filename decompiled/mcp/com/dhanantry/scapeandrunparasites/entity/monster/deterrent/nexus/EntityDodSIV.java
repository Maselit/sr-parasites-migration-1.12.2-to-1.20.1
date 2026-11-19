/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.BossInfo$Color
 *  net.minecraft.world.BossInfo$Overlay
 *  net.minecraft.world.BossInfoServer
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.entity.EntityBodyModel;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAncientSummon;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIDodAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityBodyParts;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPDispatcher;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSIII;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityDodSIV
extends EntityPDispatcher
implements EntityBodyParts {
    private EntityBodyModel head;
    private int ticksss;
    private final BossInfoServer bossInfo = (BossInfoServer)new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS).setDarkenSky(false);

    public EntityDodSIV(World worldIn) {
        super(worldIn);
        this.setSize(4.7f, 5.5f);
        this.ignoreFrustumCheck = true;
        this.experienceValue = SRPAttributes.XP_ADAPTED * 4;
        this.buried = 0.1;
        this.setParasiteStatus(3);
        this.damageCap = SRPConfig.nexussivCap;
        this.pointCap = SRPConfig.nexussivPointCap;
        this.pointReduction = SRPConfig.nexussivPointRed;
        this.chanceLearn = SRPConfig.nexussivChanceLe;
        this.chanceLearnFire = SRPConfig.nexussivChanceLeFire;
        this.DamageTypeCap = SRPConfig.nexussivPointDamCap;
        this.totalP = SRPConfigMobs.dodsivTotalActiveMobs;
        this.mobID = new int[3];
        this.mobPT = new int[3];
        this.stage = (byte)4;
        this.experienceValue = SRPAttributes.XP_INFECTED * 2;
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.head = new EntityBodyModel(this, 1.2f, 2.5f, 1.0f, 0.0f, 6.3f, -1, 1, false, 0.2f);
        this.head.setSkin(1);
        this.valueEvDeath = SRPConfig.nexussivLoosingEPValue;
    }

    @Override
    public int getParasiteIDRegister() {
        return 79;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIDodAttack(this, 4, 52, 30.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIAncientSummon(this, 120, 4, new String[]{"srparasites:ancientpod;1;1"}));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.DODSIV_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.DODSIV_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.DODSIV_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.nexussivFollow * (double)SRPConfigMobs.dodsivFollowRangeMult);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.head.onUpdate();
        this.placeColony();
    }

    @Override
    public boolean attackEntityBodyFrom(DamageSource source, float amount, int id, boolean notify) {
        if (this.rand.nextBoolean()) {
            SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)this, 80, 0);
        }
        return this.attackEntityFrom(source, amount * 3.0f);
    }

    public void setDead() {
        if (this.head != null) {
            this.world.removeEntityDangerously((Entity)this.head);
        }
        super.setDead();
    }

    public float getEyeHeight() {
        return 2.5f;
    }

    private void placeColony() {
        if (this.rand.nextInt(10) != 0) {
            return;
        }
        if (this.ticksExisted < 1200) {
            return;
        }
        if (this.world.isRemote) {
            return;
        }
        ++this.ticksss;
        if (this.ticksss < 200) {
            return;
        }
        this.ticksss = 0;
        if (ParasiteEventWorld.numberofColonies(this.world) >= 1) {
            this.ticksss = -1000;
            return;
        }
        int range = 7;
        int attemp = 3;
        int mini = 5;
        while (attemp > 0) {
            --attemp;
            double randomx = this.rand.nextInt(range);
            double randomz = this.rand.nextInt(range);
            double negative = this.rand.nextInt(2);
            randomx = negative == 0.0 ? randomx * -1.0 - (double)mini : (randomx += (double)mini);
            negative = this.rand.nextInt(2);
            randomz = negative == 0.0 ? randomz * -1.0 - (double)mini : (randomz += (double)mini);
            BlockPos pos = new BlockPos(this.posX + randomx, this.posY, this.posZ + randomz);
            if ((pos = ParasiteEventEntity.getFloor(this.world, pos, 5)) == null || ParasiteEventWorld.placeColonyInWorld(this.world, pos) != 1) continue;
            this.ticksss = -1000;
            return;
        }
        this.ticksss = -100;
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
        this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    }

    public void setCustomNameTag(String name) {
        super.setCustomNameTag(name);
        this.bossInfo.setName(this.getDisplayName());
    }

    public void addTrackingPlayer(EntityPlayerMP player) {
    }

    public void removeTrackingPlayer(EntityPlayerMP player) {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        boolean flag = super.attackEntityFrom(source, amount);
        if (flag && source.getTrueSource() != null && source.getTrueSource() instanceof EntityPlayerMP) {
            this.bossInfo.addPlayer((EntityPlayerMP)source.getTrueSource());
        }
        return flag;
    }

    @Override
    public void setBodyPartDead(int id) {
    }

    @Override
    public boolean canDespawn() {
        return SRPConfig.rsDespawn;
    }

    @Override
    public float getBombDamage() {
        return (float)SRPAttributes.DODSIV_ATTACK_DAMAGE;
    }

    @Override
    public boolean storeParasite(EntityParasiteBase in) {
        if (super.storeParasite(in)) {
            return true;
        }
        if (this.storeLodo(in, true)) {
            return true;
        }
        if (this.storeInf(in, true)) {
            return true;
        }
        if (this.storeCrude(in, true)) {
            return true;
        }
        if (this.storeMudo(in, true)) {
            return true;
        }
        if (this.storeMangler(in, true)) {
            return true;
        }
        this.storeAll(in);
        return false;
    }

    @Override
    public void onDeath(DamageSource cause) {
        if (!this.world.isRemote) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.world) >= 1 || this.canChangeVariant) {
                    ParasiteEventEntity.checkColony(this.world, cause, this);
                    ParasiteEventEntity.spawnNext(this, new EntityDodSIII(this.world), true, false);
                } else {
                    super.onDeath(cause);
                }
            } else {
                super.onDeath(cause);
            }
        }
    }
}

