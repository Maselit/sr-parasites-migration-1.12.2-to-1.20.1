/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAIWanderAvoidWater
 *  net.minecraft.init.MobEffects
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.adapted;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.entity.EntityBody;
import com.dhanantry.scapeandrunparasites.entity.EntityDamage;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIBlockResidue;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIGetFollowers;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityBodyParts;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPAdapted;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.EntityTendril;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityNogla;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.network.SRPPacketEntityBodyDead;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityNoglaAdapted
extends EntityPAdapted
implements EntityBodyParts {
    private EntityBody leftTendril;
    private EntityBody rightTendril;
    private float leftTendrilHealth;
    private float rightTendrilHealth;
    private int attacking;
    private double targetX;
    private double targetY;
    private double targetZ;
    private boolean skillCharge;

    public EntityNoglaAdapted(World worldIn) {
        super(worldIn);
        this.setSize(1.3f, 3.3f);
        this.stepHeight = 1.0f;
        this.leftTendril = new EntityBody(this, 0.6f, 2.0f, 1.0f, 0.9f, 0.9f, 1, 1, true);
        this.rightTendril = new EntityBody(this, 0.6f, 2.0f, 1.0f, 0.9f, 0.9f, -1, 2, true);
        this.leftTendrilHealth = (float)((double)this.getMaxHealth() * SRPConfig.tendrilHealth);
        this.rightTendrilHealth = (float)((double)this.getMaxHealth() * SRPConfig.tendrilHealth);
        this.skillCharge = false;
    }

    @Override
    public int getParasiteIDRegister() {
        return 54;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.11));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, 8.0));
        this.tasks.addTask(7, (EntityAIBase)new EntityAIWanderAvoidWater((EntityCreature)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAISkill(this, 40, 32, 8, true, 1));
        if (SRPConfig.parasiteGenResidue) {
            this.tasks.addTask(9, (EntityAIBase)new EntityAIBlockResidue(this, 2));
        }
        this.tasks.addTask(6, (EntityAIBase)new EntityAIGetFollowers(this, 3, 32));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIEvade(this, 25, 10, 4));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.NOGLA_HEALTH + SRPAttributes.NOGLA_A_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.NOGLA_ARMOR + SRPAttributes.NOGLA_A_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.31234);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.NOGLA_KD_RESISTANCE + SRPAttributes.NOGLA_A_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.NOGLA_ATTACK_DAMAGE + SRPAttributes.NOGLA_A_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.adaptedFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.leftTendrilHealth > 0.0f) {
            this.leftTendril.onUpdate();
        }
        if (this.rightTendrilHealth > 0.0f) {
            this.rightTendril.onUpdate();
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag && entityIn instanceof EntityLivingBase) {
            ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.POISON, 120, 1));
            switch (this.getSkin()) {
                case 5: {
                    SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 100, 0);
                    break;
                }
                case 6: {
                    SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)entityIn, 100, 0);
                }
            }
        }
        return flag;
    }

    @Override
    public boolean attackEntityBodyFrom(DamageSource source, float amount, int id, boolean notify) {
        if (this.world.isRemote) {
            return false;
        }
        boolean flag = this.attackEntityFrom(source, amount);
        if (!flag) {
            return false;
        }
        if (this.leftTendril.getId() == id) {
            this.leftTendrilHealth -= amount;
            if (this.leftTendrilHealth <= 0.0f) {
                EntityTendril tendril = new EntityTendril(this.world);
                tendril.setSkin(2);
                tendril.copyLocationAndAnglesFrom(this.leftTendril);
                this.world.spawnEntity((Entity)tendril);
                this.world.removeEntityDangerously((Entity)this.leftTendril);
                this.world.setEntityState((Entity)this, (byte)11);
                this.cutResistances(SRPConfig.adaptedPointDamCap / 2);
                SRPMain.network.sendToAll((IMessage)new SRPPacketEntityBodyDead(this.getEntityId(), id));
            }
        } else if (this.rightTendril.getId() == id) {
            this.rightTendrilHealth -= amount;
            if (this.rightTendrilHealth <= 0.0f) {
                EntityTendril tendril = new EntityTendril(this.world);
                tendril.setSkin(2);
                tendril.copyLocationAndAnglesFrom(this.rightTendril);
                this.world.spawnEntity((Entity)tendril);
                this.world.removeEntityDangerously((Entity)this.rightTendril);
                this.world.setEntityState((Entity)this, (byte)22);
                this.cutResistances(SRPConfig.adaptedPointDamCap / 2);
                SRPMain.network.sendToAll((IMessage)new SRPPacketEntityBodyDead(this.getEntityId(), id));
            }
        }
        return flag;
    }

    @Override
    public void setBodyPartDead(int id) {
        if (this.leftTendril.getId() == id) {
            this.world.removeEntityDangerously((Entity)this.leftTendril);
        } else if (this.rightTendril.getId() == id) {
            this.world.removeEntityDangerously((Entity)this.rightTendril);
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

    public float getEyeHeight() {
        return 2.4f;
    }

    @Override
    public void onDeath(DamageSource cause) {
        if (!this.world.isRemote) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.world) >= 1 || this.canChangeVariant) {
                    ParasiteEventEntity.checkColony(this.world, cause, this);
                    ParasiteEventEntity.spawnNext(this, new EntityNogla(this.world), true, false);
                } else {
                    super.onDeath(cause);
                }
            } else {
                super.onDeath(cause);
            }
        }
    }

    public static void registerFixesNogla(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityNoglaAdapted.class);
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.ANOGLA_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.ANOGLA_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.ANOGLA_DEATH;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.noglaadaptedOrbEffects, mobs);
        }
        return flag;
    }

    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SRPSounds.MONSTER_STEP, 0.15f, 1.0f);
    }

    public void setDead() {
        if (this.leftTendril != null) {
            this.world.removeEntityDangerously((Entity)this.leftTendril);
        }
        if (this.rightTendril != null) {
            this.world.removeEntityDangerously((Entity)this.rightTendril);
        }
        super.setDead();
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (this.rand.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.rand.nextInt(3)) {
                case 0: {
                    this.setSkin(5);
                    break;
                }
                case 1: {
                    this.setSkin(6);
                    break;
                }
                case 2: {
                    this.setSkin(7);
                }
            }
        }
        return floo;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setFloat("parasiteleftTendril", this.leftTendrilHealth);
        compound.setFloat("parasiterightTendril", this.rightTendrilHealth);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("parasiteleftTendril", 99)) {
            this.leftTendrilHealth = compound.getFloat("parasiteleftTendril");
            if (this.leftTendrilHealth <= 0.0f) {
                this.world.setEntityState((Entity)this, (byte)11);
            }
        }
        if (compound.hasKey("parasiterightTendril", 99)) {
            this.rightTendrilHealth = compound.getFloat("parasiterightTendril");
            if (this.rightTendrilHealth <= 0.0f) {
                this.world.setEntityState((Entity)this, (byte)22);
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    public float getLeft() {
        return this.leftTendrilHealth;
    }

    @SideOnly(value=Side.CLIENT)
    public float getRight() {
        return this.rightTendrilHealth;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 11) {
            this.leftTendrilHealth = 0.0f;
        } else if (id == 22) {
            this.rightTendrilHealth = 0.0f;
        } else if (id == 100) {
            for (int i = 0; i <= 1; ++i) {
                this.spawnParticles(EnumParticleTypes.FLAME);
            }
        } else {
            super.handleStatusUpdate(id);
        }
    }

    @Override
    public boolean getFinished(byte attID) {
        switch (attID) {
            case 1: {
                return this.skillCharge;
            }
        }
        return super.getFinished(attID);
    }

    @Override
    public void setFinished(byte attID, boolean in) {
        switch (attID) {
            case 1: {
                this.skillCharge = in;
                return;
            }
        }
        super.setFinished(attID, in);
    }

    @Override
    public void doSpecialSkill(byte id) {
        switch (id) {
            case 1: {
                this.charge();
                return;
            }
        }
        super.doSpecialSkill(id);
    }

    private void charge() {
        ++this.attacking;
        this.miniCapA = true;
        if (this.attacking < 20) {
            EntityLivingBase entitylivingbase;
            this.world.setEntityState((Entity)this, (byte)100);
            if (this.attacking == 2) {
                float v = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f + 2.0f;
                this.playSound(this.getHurtSound(DamageSource.GENERIC), 4.0f, v);
            }
            if ((entitylivingbase = this.getAttackTarget()) == null || !this.onGround || this.isInWater() || entitylivingbase.posY > this.posY && entitylivingbase.onGround) {
                this.skillCharge = true;
                this.attacking = 0;
                this.miniCapA = false;
                this.setParasiteStatus(0);
                return;
            }
            if (!entitylivingbase.isEntityAlive()) {
                this.skillCharge = true;
                this.attacking = 0;
                this.miniCapA = false;
                this.setParasiteStatus(0);
                return;
            }
            if (this.attacking <= 19) {
                double dis = this.getDistance((Entity)entitylivingbase);
                this.setParasiteStatus(3);
                this.getNavigator().clearPath();
                this.targetX = this.posX + 15.0 * (entitylivingbase.posX - this.posX) / dis;
                this.targetY = this.posY + 15.0 * (entitylivingbase.posY - this.posY) / dis;
                this.targetZ = this.posZ + 15.0 * (entitylivingbase.posZ - this.posZ) / dis;
            }
        }
        if (this.attacking == 20) {
            this.getNavigator().tryMoveToXYZ(this.targetX, this.targetY, this.targetZ, 3.0);
        }
        if (this.attacking >= 20) {
            for (EntityLivingBase mob : this.world.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().grow(2.0, 0.0, 2.0))) {
                if (mob == this || mob instanceof EntityParasiteBase) continue;
                float f = (float)MathHelper.atan2((double)(mob.posZ - this.posZ), (double)(mob.posX - this.posX));
                EntityDamage damage = new EntityDamage(this.world, mob.posX, mob.posY, mob.posZ, f, (EntityLivingBase)this, 1.0f, false, 0.5f);
                this.world.spawnEntity((Entity)damage);
            }
        }
        this.skillBreakBlocks();
        if (!this.onGround) {
            this.motionX *= 0.7;
            this.motionZ *= 0.7;
        }
        if (this.attacking >= 60 && this.posX == this.prevPosX && this.posZ == this.prevPosZ) {
            this.attacking = 0;
            this.miniCapA = false;
            this.skillCharge = true;
            this.setParasiteStatus(2);
        }
    }
}

