/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityAreaEffectCloud
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILeapAtTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityAINearestAttackableTarget
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.pathfinding.PathNavigateClimber
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.inborn;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAvoidEntityStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAvoidOrAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityLodo;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityNuuh;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityMudo
extends EntityParasiteBase {
    private static final DataParameter<Byte> CLIMBING = EntityDataManager.createKey(EntityMudo.class, (DataSerializer)DataSerializers.BYTE);

    public EntityMudo(World worldIn) {
        super(worldIn);
        this.setSize(0.85f, 1.0f);
        this.type = (byte)5;
        this.MiniDamage = SRPConfigMobs.mudoMinDamage;
        this.experienceValue = SRPAttributes.XP_LiTTLE;
    }

    @Override
    public int getParasiteIDRegister() {
        return 12;
    }

    @Override
    public void applyBonuses(int colony, int node, byte phase) {
        super.applyBonuses(colony, node, phase);
        this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, true, false, null, SRPConfig.primitiveSneakPen, SRPConfig.primitiveInviPen));
        if (SRPConfig.mobattacking) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, true, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !(entity instanceof EntityVillager) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.primitiveSneakPen, SRPConfig.primitiveInviPen));
        }
        if (SRPConfigSystems.useEvolution) {
            if (phase >= SRPConfigSystems.evolutionMudoAttack) {
                if (phase >= SRPConfigSystems.evolutionAssimilatedDehiding) {
                    this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 10, true, false, new Predicate<EntityLiving>(){

                        public boolean apply(@Nullable EntityLiving entity) {
                            return !(entity instanceof EntityMob) && !(entity instanceof EntityWaterMob) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                        }
                    }, SRPConfig.primitiveSneakPen, SRPConfig.primitiveInviPen));
                } else {
                    this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 10, true, false, new Predicate<EntityLiving>(){

                        public boolean apply(@Nullable EntityLiving entity) {
                            return !entity.isPotionActive(SRPPotions.COTH_E) && !(entity instanceof EntityMob) && !(entity instanceof EntityWaterMob) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                        }
                    }, SRPConfig.primitiveSneakPen, SRPConfig.primitiveInviPen));
                }
            } else {
                this.tasks.addTask(2, (EntityAIBase)new EntityAIMudoInfest(this, 1.0));
                this.tasks.addTask(4, (EntityAIBase)new EntityAIAvoidOrAttack(this, 0.0f));
                this.tasks.addTask(5, new EntityAIAvoidEntityStatus<EntityLiving>(this, EntityLiving.class, new Predicate<EntityLiving>(){

                    public boolean apply(@Nullable EntityLiving entity) {
                        return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityParasiteBase) && !(entity instanceof EntityAnimal) && !(entity instanceof EntityVillager);
                    }
                }, 8.0f, 1.3));
            }
        }
    }

    protected void initEntityAI() {
        this.tasks.addTask(0, (EntityAIBase)new EntityAISkill(this, 40, 100, 5, true, 14));
        this.setskillLeapValues(0.7f, 2.5, 0);
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, -1.0, 10));
        this.tasks.addTask(3, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4f));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        if (SRPConfigMobs.mudoAnimalAttacking && !SRPConfigSystems.useEvolution) {
            this.targetTasks.addTask(4, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityAnimal.class, true));
        }
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.srpTicks == 10 && !this.world.isRemote && this.killcount >= (double)SRPConfigMobs.mudoTunnelValue && this.phaseCreated < SRPConfigMobs.mudoTunnelPhase && this.rand.nextInt(30) == 0) {
            if (this.getAttackTarget() != null) {
                return;
            }
            if (this.world.getBlockState(this.getPosition()).getBlock() == Blocks.AIR && this.world.getBlockState(this.getPosition().down()).isFullBlock() && this.world.getBlockState(this.getPosition().down()).isFullCube()) {
                this.world.setBlockState(this.getPosition(), SRPBlocks.buglin.getDefaultState());
                this.killcount -= (double)SRPConfigMobs.mudoTunnelValue;
            }
        }
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.MUDO_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.MUDO_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.MUDO_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.MUDO_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag && entityIn instanceof EntityLivingBase) {
            switch (this.getSkin()) {
                case 5: {
                    SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 100, 0);
                    break;
                }
                case 6: {
                    SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)entityIn, 100, 0);
                }
            }
            ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 40, 1));
            if (!((EntityLivingBase)entityIn).isPotionActive(SRPPotions.COTH_E)) {
                ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
        }
        return flag;
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        if (this.killcount >= 0.0) {
            this.killcount += 1.0;
        }
        if (!this.world.isRemote && SRPConfigSystems.useEvolution) {
            SRPSaveData data = SRPSaveData.get(this.world);
            data.setTotalKills(this.world.provider.getDimension(), SRPConfigSystems.valueKill, true, this.world, true);
        }
        if (!entityLivingIn.isPotionActive(SRPPotions.COTH_E)) {
            entityLivingIn.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
        }
        ParasiteEventEntity.convertEntity(entityLivingIn, entityLivingIn.getEntityData(), true, SRPConfigSystems.COTHVictimParasite);
        this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 80, 0, false, false));
        this.setWait(10);
        if (!this.world.isRemote && this.killcount > (double)SRPConfigMobs.mudoMangler && !this.isDead && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityNuuh(this.world), true, false);
        }
    }

    public void fall(float distance, float damageMultiplier) {
        if (distance >= 60.0f) {
            super.fall(distance, damageMultiplier);
        }
    }

    public double getMountedYOffset() {
        return this.height * 0.5f;
    }

    protected PathNavigate createNavigator(World worldIn) {
        return new PathNavigateClimber((EntityLiving)this, worldIn);
    }

    public void onUpdate() {
        super.onUpdate();
        if (!this.world.isRemote) {
            this.setBesideClimbableBlock(this.collidedHorizontally);
            if (this.srpTicks == 10 && this.killcount > (double)SRPConfigMobs.mudoMangler && ParasiteEventEntity.canSpawnNext) {
                ParasiteEventEntity.spawnNext(this, new EntityNuuh(this.world), true, true);
            }
        }
    }

    @Override
    protected void collideWithEntity(Entity entityIn) {
        super.collideWithEntity(entityIn);
        if (this.world.isRemote) {
            return;
        }
        if (entityIn instanceof EntityLivingBase && !(entityIn instanceof EntityParasiteBase) && this.getSkin() == 5) {
            SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 100, 0);
        }
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(CLIMBING, (Object)0);
    }

    public boolean isOnLadder() {
        return this.isBesideClimbableBlock();
    }

    public boolean isBesideClimbableBlock() {
        return ((Byte)this.dataManager.get(CLIMBING) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing) {
        byte b0 = (Byte)this.dataManager.get(CLIMBING);
        if (this.getAttackTarget() != null) {
            if (!this.canEntityBeSeen((Entity)this.getAttackTarget())) {
                if (this.getDistanceSq((Entity)this.getAttackTarget()) < 100.0) {
                    b0 = (byte)(b0 & 0xFFFFFFFE);
                    this.dataManager.set(CLIMBING, (Object)b0);
                    return;
                }
            } else if (this.getAttackTarget().posY + 1.0 < this.posY) {
                b0 = (byte)(b0 & 0xFFFFFFFE);
                this.dataManager.set(CLIMBING, (Object)b0);
                return;
            }
        }
        b0 = climbing ? (byte)(b0 | 1) : (byte)(b0 & 0xFFFFFFFE);
        this.dataManager.set(CLIMBING, (Object)b0);
    }

    public float getEyeHeight() {
        return 0.8f;
    }

    @Override
    public void onDeath(DamageSource cause) {
        if (!this.world.isRemote) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.world) >= 1 && SRPConfigMobs.lodoEnabled || this.canChangeVariant) {
                    ParasiteEventEntity.spawnNext(this, new EntityLodo(this.world), true, false);
                } else {
                    super.onDeath(cause);
                }
            } else {
                super.onDeath(cause);
            }
        }
    }

    public static void registerFixesMudo(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityMudo.class);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (this.rand.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.rand.nextInt(2)) {
                case 0: {
                    this.setSkin(5);
                    break;
                }
                case 1: {
                    this.setSkin(6);
                }
            }
        }
        return floo;
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.MUDO_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SRPSounds.MUDO_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.MUDO_DEATH;
    }

    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(this.getStepSound(), this.getSoundVolume(), this.getSoundPitch());
    }

    protected SoundEvent getStepSound() {
        return SRPSounds.SMALL_STEPS;
    }

    static class EntityAIMudoInfest
    extends EntityAIBase {
        private final EntityMudo parent;
        private int count;

        public EntityAIMudoInfest(EntityMudo animal, double speedIn) {
            this.parent = animal;
            this.count = 0;
            this.setMutexBits(3);
        }

        public boolean shouldExecute() {
            ++this.count;
            if (this.count >= 20) {
                this.count = 0;
                return this.parent.getAttackTarget() == null;
            }
            return false;
        }

        public void updateTask() {
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.parent.posX, this.parent.posY, this.parent.posZ, this.parent.posX + 1.0, this.parent.posY + 1.0, this.parent.posZ + 1.0).grow(10.0, 2.0, 10.0);
            List moblist = this.parent.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
            for (EntityLivingBase mob : moblist) {
                if (!(mob instanceof EntityAnimal) && !(mob instanceof EntityVillager) || mob.isPotionActive(SRPPotions.COTH_E) || !this.parent.canEntityBeSeen((Entity)mob) || !this.parent.getNavigator().tryMoveToEntityLiving((Entity)mob, 1.3) || !(this.parent.getDistanceSq((Entity)mob) < 9.0)) continue;
                this.spawnLingeringCloud();
                this.parent.playSound(SRPSounds.MUDO_CLOUD, 2.0f, 1.0f);
            }
        }

        private void spawnLingeringCloud() {
            EntityAreaEffectCloud entityareaeffectcloud = new EntityAreaEffectCloud(this.parent.world, this.parent.posX, this.parent.posY, this.parent.posZ);
            entityareaeffectcloud.setRadius(this.parent.width * 3.0f);
            entityareaeffectcloud.setRadiusOnUse(-0.5f);
            entityareaeffectcloud.setWaitTime(10);
            entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() * 2);
            entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float)entityareaeffectcloud.getDuration());
            entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 1, false, false));
            this.parent.world.spawnEntity((Entity)entityareaeffectcloud);
        }
    }
}

