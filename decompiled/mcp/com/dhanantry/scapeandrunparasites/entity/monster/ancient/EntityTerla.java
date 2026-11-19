/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IRangedAttackMob
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.BossInfo$Color
 *  net.minecraft.world.BossInfo$Overlay
 *  net.minecraft.world.BossInfoServer
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.ancient;

import com.dhanantry.scapeandrunparasites.entity.EntityBody;
import com.dhanantry.scapeandrunparasites.entity.EntityDamage;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeRangeSwitch;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatusAOE;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackRangedStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityBodyParts;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPAncient;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityProjectileHomming;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityTerla
extends EntityPAncient
implements EntityBodyParts,
IRangedAttackMob,
EntityCutomAttack {
    private EntityBody head;
    private EntityBody middle;
    private final BossInfoServer bossInfo = (BossInfoServer)new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS).setDarkenSky(false);

    public EntityTerla(World worldIn) {
        super(worldIn);
        this.setSize(2.4f, 2.9f);
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.ignoreFrustumCheck = true;
        this.type = (byte)63;
        this.borderOrb = -1;
        this.head = new EntityBody(this, 2.4f, 7.5f, 1.0f, -3.0f, 0.0f, -1, 1, false, 0.2f);
        this.middle = new EntityBody(this, 2.4f, 4.5f, 1.0f, 0.0f, 3.0f, 1, 2, false, 0.2f);
    }

    @Override
    public int getParasiteIDRegister() {
        return 20;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIAttackMeleeRangeSwitch(this, 10.0f));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackMeleeStatusAOE((EntityParasiteBase)this, 1.0, false, 100.0, 5.0));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackRangedStatus(this, 1.0, 60, 80, 40.0f));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.TERLA_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.TERLA_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.23f);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.TERLA_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.ancientFollow);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(2.0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.head.onUpdate();
        this.middle.onUpdate();
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

    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
        Vec3d vec3d = this.getLook(1.0f);
        double d2 = target.posX - (this.posX + vec3d.x);
        double d3 = target.getEntityBoundingBox().minY + (double)(target.height / 2.0f) - (0.5 + this.posY + (double)(this.height / 2.0f));
        double d4 = target.posZ - (this.posZ + vec3d.z);
        this.playSound(SRPSounds.EMANA_SHOOTING, 2.0f, 1.0f);
        d3 = target.getEntityBoundingBox().minY + (double)(target.height / 4.0f) - (1.0 + this.posY + (double)(this.height / 2.0f));
        EntityProjectileHomming entitylargefireball = new EntityProjectileHomming(this.world, (EntityLivingBase)this, (Entity)target, SRPAttributes.ORONCO_ATTACK_DAMAGE);
        entitylargefireball.posX = this.posX + vec3d.x;
        entitylargefireball.posY = this.posY + (double)this.getEyeHeight() - 0.2;
        entitylargefireball.posZ = this.posZ + vec3d.z;
        this.world.spawnEntity((Entity)entitylargefireball);
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entityIn.posX, entityIn.posY, entityIn.posZ, entityIn.posX + 1.0, entityIn.posY + 1.0, entityIn.posZ + 1.0).grow(5.0, 2.0, 5.0);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        if (moblist.size() > 4) {
            axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(5.0, 3.0, 5.0);
            moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
            float luck = (float)(SRPAttributes.TERLA_ATTACK_DAMAGE * 2.0);
            for (EntityLivingBase mob : moblist) {
                if (mob == null || mob instanceof EntityParasiteBase || mob == this) continue;
                EntityDamage damage = new EntityDamage(this.world, mob.posX, mob.posY, mob.posZ, 0.0f, (EntityLivingBase)this, luck, false, 3.0f);
                this.world.spawnEntity((Entity)damage);
            }
            return true;
        }
        for (EntityLivingBase mob : moblist) {
            if (mob == null || mob instanceof EntityParasiteBase) continue;
            this.attackEntityAsMob((Entity)mob);
        }
        return !moblist.isEmpty();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        boolean flag = super.attackEntityFrom(source, amount);
        if (flag && source.getTrueSource() instanceof EntityPlayerMP) {
            this.bossInfo.addPlayer((EntityPlayerMP)source.getTrueSource());
        }
        return flag;
    }

    @Override
    public boolean attackEntityBodyFrom(DamageSource source, float amount, int id, boolean notify) {
        boolean flag = this.attackEntityFrom(source, amount);
        return flag;
    }

    @Override
    public void setBodyPartDead(int id) {
    }

    public int getHorizontalFaceSpeed() {
        return 3;
    }

    @Override
    public boolean isPotionApplicable(PotionEffect potioneffectIn) {
        return potioneffectIn.getPotion() == MobEffects.POISON ? false : super.isPotionApplicable(potioneffectIn);
    }

    public float getEyeHeight() {
        return 4.7f;
    }

    protected SoundEvent getAmbientSound() {
        return SRPSounds.MOBSILENCE;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.MOBSILENCE;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.MOBSILENCE;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            // empty if block
        }
        return flag;
    }

    protected float getSoundVolume() {
        return 5.0f;
    }

    public void setDead() {
        if (this.head != null) {
            this.world.removeEntityDangerously((Entity)this.head);
        }
        if (this.middle != null) {
            this.world.removeEntityDangerously((Entity)this.middle);
        }
        super.setDead();
    }

    public void setSwingingArms(boolean swingingArms) {
    }

    public static void registerFixesTerla(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityTerla.class);
    }
}

