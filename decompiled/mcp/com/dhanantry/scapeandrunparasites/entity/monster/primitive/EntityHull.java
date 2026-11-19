/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityHullAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityLesh;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityHull
extends EntityPPrimitive {
    private int timer = 0;
    private static final DataParameter<Boolean> CAM = EntityDataManager.createKey(EntityHull.class, (DataSerializer)DataSerializers.BOOLEAN);

    public EntityHull(World worldIn) {
        super(worldIn);
        this.setSize(1.3f, 1.2f);
    }

    @Override
    public int getParasiteIDRegister() {
        return 7;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(CAM, (Object)false);
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.095));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIEvade(this, 40, 5, 8));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, 8.0, 6));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.HULL_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.HULL_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.HULL_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.HULL_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.primitiveFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.srpTicks == 10 && !this.world.isRemote) {
            float currentH = this.getHealth() / this.getMaxHealth();
            if (this.getSSS()) {
                this.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 25, 0, false, false));
                this.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 25, 2, false, false));
                if (this.ticksExisted % 2 == 0) {
                    this.playSound(SRPSounds.HULL_C, 0.2f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                }
                if ((double)currentH < SRPConfigMobs.hullNeededHealth) {
                    this.setSSS(false);
                }
            } else if ((double)currentH >= SRPConfigMobs.hullNeededHealth) {
                ++this.timer;
                if ((float)this.timer > SRPConfigMobs.hullNeededTime) {
                    this.setSSS(true);
                    this.particleStatus((byte)6);
                    this.timer = 0;
                }
            }
        }
        if (!this.world.isRemote && this.ticksExisted % 20 == 0 && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityHullAdapted(this.world), true, true);
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        this.setSSS(false);
        this.timer = 0;
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag && this.getSSS()) {
            float f = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * SRPConfigMobs.hullStealthDamageMultiplier;
            if (entityIn instanceof EntityLivingBase) {
                f += EnchantmentHelper.getModifierForCreature((ItemStack)this.getHeldItemMainhand(), (EnumCreatureAttribute)((EntityLivingBase)entityIn).getCreatureAttribute());
            }
            entityIn.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), f);
            this.setSSS(false);
            this.timer = 0;
        }
        return flag;
    }

    @Override
    public boolean attackEntityAsMobMinimum(EntityLivingBase entityIn) {
        boolean flag = super.attackEntityAsMobMinimum(entityIn);
        if (flag && this.getSSS()) {
            this.setSSS(false);
            this.timer = 0;
        }
        return flag;
    }

    public float getEyeHeight() {
        return 1.0f;
    }

    @Override
    public void onDeath(DamageSource cause) {
        if (!this.world.isRemote) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.world) >= 1 || this.canChangeVariant) {
                    ParasiteEventEntity.checkColony(this.world, cause, this);
                    ParasiteEventEntity.spawnNext(this, new EntityLesh(this.world), true, false);
                } else {
                    super.onDeath(cause);
                }
            } else {
                super.onDeath(cause);
            }
        }
    }

    public boolean getSSS() {
        return (Boolean)this.dataManager.get(CAM);
    }

    public void setSSS(boolean in) {
        this.dataManager.set(CAM, (Object)in);
    }

    public static void registerFixesHull(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityHull.class);
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
        this.particleStatus((byte)5);
        if (!this.world.isRemote && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityHullAdapted(this.world), true, true);
        }
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0 || this.isPotionActive(MobEffects.INVISIBILITY)) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.HULL_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.HULL_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.HULL_DEATH;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.hullOrbEffects, mobs);
        }
        return flag;
    }

    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SRPSounds.MONSTER_STEP, 0.15f, 1.0f);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (this.rand.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.rand.nextInt(1)) {
                case 0: {
                    this.setSkin(7);
                }
            }
        }
        return floo;
    }
}

