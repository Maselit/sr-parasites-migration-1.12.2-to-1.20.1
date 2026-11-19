/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIAttackMelee
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.MobEffects
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 *  net.minecraftforge.event.ForgeEventFactory
 */
package com.dhanantry.scapeandrunparasites.entity.monster.inborn;

import com.dhanantry.scapeandrunparasites.entity.EntityToxicCloud;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackSwell;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class EntityRathol
extends EntityParasiteBase {
    public EntityRathol(World worldIn) {
        super(worldIn);
        this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, true, false, null, SRPConfig.adaptedSneakPen, SRPConfig.adaptedInviPen));
        if (SRPConfig.mobattacking) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, true, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.adaptedSneakPen, SRPConfig.adaptedInviPen));
        }
        this.setSize(1.3f, 3.1f);
        this.experienceValue = SRPAttributes.XP_PRIMITIVE;
        this.fuseTime = 70;
        this.type = (byte)41;
        this.killcount = -10.0;
    }

    @Override
    public int getParasiteIDRegister() {
        return 3;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackSwell(this));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.1, false));
        this.tasks.addTask(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.RATHOL_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.RATHOL_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.RATHOL_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.RATHOL_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0);
    }

    public static void registerFixesRathol(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityRathol.class);
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.CARRIER_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SRPSounds.CARRIER_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.CARRIER_DEATH;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setShort("Fuse", (short)this.fuseTime);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("Fuse", 99)) {
            this.fuseTime = compound.getShort("Fuse");
        }
    }

    public void onUpdate() {
        if (this.isEntityAlive()) {
            this.lastActiveTime = this.timeSinceIgnited;
            if ((double)this.getHealth() < (double)this.getMaxHealth() * 0.05) {
                this.setSelfeState(1);
            }
            this.dyingBurst(false, 2);
        }
        super.onUpdate();
    }

    @Override
    protected void onDeathUpdate() {
        if (this.isBurning()) {
            super.onDeathUpdate();
        } else {
            this.setSelfeState(1);
            this.dyingBurst(true, 2);
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        return true;
    }

    @Override
    protected void selfExplode() {
        if (!this.world.isRemote) {
            double i1 = MathHelper.floor((double)(this.posY + 0.1));
            double l1 = this.posX;
            double i2 = this.posZ;
            World world = this.world;
            int range = 6;
            for (int k2 = -1 * range; k2 <= 1 * range; ++k2) {
                for (int l2 = -1 * range; l2 <= 1 * range; ++l2) {
                    double i3 = l1 + (double)k2;
                    double l = i2 + (double)l2;
                    BlockPos blockpos = new BlockPos(i3, i1, l);
                    if ((blockpos = ParasiteEventEntity.getFloor(this.world, blockpos, 3)) == null || this.world.rand.nextInt(2) != 0) continue;
                    this.world.setBlockState(blockpos, SRPBlocks.InfestRemain.getStateFromMeta(1));
                }
            }
        }
        switch (this.getSkin()) {
            case 1: {
                boolean flag = ForgeEventFactory.getMobGriefingEvent((World)this.world, (Entity)this) && SRPConfigMobs.ratholGriefing;
                ParasiteEventEntity.createExplosion(this.world, (Entity)this, this.posX, this.posY, this.posZ, 4.0f, flag);
                if (!this.world.isRemote) {
                    AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(11.0);
                    List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
                    for (EntityLivingBase mob : moblist) {
                        if (mob instanceof EntityParasiteBase) continue;
                        mob.attackEntityFrom(DamageSource.WITHER, (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue());
                        SRPPotions.applyStackPotion(SRPPotions.VIRA_E, mob, 400, 4);
                    }
                    this.playSound(SRPSounds.RATHOL_BOOM, 2.0f, 1.0f);
                    this.dead = true;
                    this.setDead();
                    this.spawnLingeringCloud();
                }
                return;
            }
        }
        boolean flag = ForgeEventFactory.getMobGriefingEvent((World)this.world, (Entity)this) && SRPConfigMobs.ratholGriefing;
        ParasiteEventEntity.createExplosion(this.world, (Entity)this, this.posX, this.posY, this.posZ, 4.0f, flag);
        if (!this.world.isRemote) {
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(7.0);
            List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
            for (EntityLivingBase mob : moblist) {
                if (mob instanceof EntityParasiteBase) continue;
                SRPPotions.applyStackPotion(SRPPotions.VIRA_E, mob, 400, 2);
            }
            this.playSound(SRPSounds.RATHOL_BOOM, 2.0f, 1.0f);
            this.dead = true;
            this.setDead();
            this.spawnLingeringCloud();
            ParasiteEventEntity.spawnM(this, SRPConfigMobs.ratholMobs, 0, false, this.getCustomNameTag());
        }
    }

    private void spawnLingeringCloud() {
        switch (this.getSkin()) {
            case 1: {
                EntityToxicCloud entityareaeffectcloud = new EntityToxicCloud(this.world, this.posX, this.posY, this.posZ);
                entityareaeffectcloud.setRadius(this.width * 3.0f, this.height);
                entityareaeffectcloud.setWaitTime(10);
                entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() * 2);
                entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float)entityareaeffectcloud.getDuration());
                entityareaeffectcloud.addEffect(new PotionEffect(MobEffects.POISON, 300, 2));
                entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
                entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.VIRA_E, 3600, 2, false, false));
                this.world.spawnEntity((Entity)entityareaeffectcloud);
                return;
            }
        }
        EntityToxicCloud entityareaeffectcloud = new EntityToxicCloud(this.world, this.posX, this.posY, this.posZ);
        entityareaeffectcloud.setRadius(this.width * 2.0f, this.height);
        entityareaeffectcloud.setWaitTime(10);
        entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() * 2);
        entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float)entityareaeffectcloud.getDuration());
        entityareaeffectcloud.addEffect(new PotionEffect(MobEffects.POISON, 300, 0));
        entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
        entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.VIRA_E, 3600, 0, false, false));
        this.world.spawnEntity((Entity)entityareaeffectcloud);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (this.rand.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant) {
            switch (this.rand.nextInt(1)) {
                case 0: {
                    this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
                    this.setSkin(1);
                }
            }
        }
        return floo;
    }
}

