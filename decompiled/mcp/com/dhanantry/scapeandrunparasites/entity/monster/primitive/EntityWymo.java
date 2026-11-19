/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNodeType
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatusAOE;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWymo
extends EntityPPrimitive
implements EntityCutomAttack {
    private boolean open;
    private float buried;
    private int blockI;
    private int buriedC;
    private static final DataParameter<Boolean> UP = EntityDataManager.createKey(EntityWymo.class, (DataSerializer)DataSerializers.BOOLEAN);
    private float attackTimer;
    private boolean up;
    private int border;
    private boolean skillshockwave;

    public EntityWymo(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 0.25f);
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.setPathPriority(PathNodeType.WATER, -1.0f);
        this.canModRender = 0;
        this.buried = 4.6f;
        this.stepHeight = 1.0f;
    }

    @Override
    public int getParasiteIDRegister() {
        return 37;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatusAOE(this, 1.3, false, 0.0, 3.5, true));
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(UP, (Object)false);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.WYMO_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.WYMO_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.WYMO_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.WYMO_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.primitiveFollow);
    }

    @Override
    public void onLivingUpdate() {
        if (this.isAIDisabled()) {
            this.setParasiteStatus(3);
            this.setBurrowed(true);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
            this.buriedC = 80;
            if (this.buriedC > 0) {
                --this.buriedC;
            }
            if (this.up) {
                this.attackTimer = (float)((double)this.attackTimer + 0.2);
                if (this.attackTimer > 1.0f) {
                    this.up = false;
                }
            } else {
                this.attackTimer = (float)((double)this.attackTimer - 0.1);
            }
            this.checkBurrowed();
            return;
        }
        super.onLivingUpdate();
        if (this.buriedC > 0) {
            --this.buriedC;
        }
        if (this.up) {
            this.attackTimer = (float)((double)this.attackTimer + 0.2);
            if (this.attackTimer > 1.0f) {
                this.up = false;
            }
        } else {
            this.attackTimer = (float)((double)this.attackTimer - 0.1);
        }
        this.checkBurrowed();
        this.checkSpeed();
        this.teleportByGround();
        if (!(this.getBurrowed() || this.posX == this.prevPosX && this.posZ == this.prevPosZ)) {
            this.spawnGroundParticles();
        }
    }

    private void checkBurrowed() {
        if (this.getBurrowed()) {
            if (this.height < 3.0f) {
                this.setSize(0.9f, this.height + 0.13f);
            }
            if (this.buried >= 0.0f) {
                this.buried -= 0.18f;
                this.spawnGroundParticles();
                this.open = false;
            } else {
                this.open = true;
            }
        } else {
            if (this.height > 0.25f) {
                this.setSize(0.9f, this.height - 0.15f);
            }
            if (this.buried < 4.6f) {
                this.buried += 0.18f;
                this.spawnGroundParticles();
                this.open = false;
            }
        }
    }

    private void checkSpeed() {
        if (!this.world.isRemote) {
            if (this.getAttackTarget() != null) {
                if (this.getDistanceSq((Entity)this.getAttackTarget()) <= 1.0) {
                    this.setParasiteStatus(3);
                    this.setBurrowed(true);
                    this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
                    this.buriedC = 40;
                } else if (this.buriedC <= 0) {
                    this.setParasiteStatus(0);
                    this.setBurrowed(false);
                    this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26);
                }
            } else if (this.getBurrowed() && this.buriedC <= 0) {
                this.setParasiteStatus(0);
                this.setBurrowed(false);
                this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26);
            }
        }
    }

    private void spawnGroundParticles() {
        IBlockState state = this.world.getBlockState(this.getPosition().down());
        if (state.getBlock() != Blocks.AIR) {
            int id = Block.getStateId((IBlockState)state);
            for (int i = 0; i < 15; ++i) {
                this.world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, this.posX + (double)(this.rand.nextFloat() * this.width * 3.0f) - (double)this.width, this.posY, this.posZ + (double)(this.rand.nextFloat() * this.width * 3.0f) - (double)this.width, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, new int[]{id});
            }
        }
    }

    private void teleportByGround() {
        EntityLivingBase target;
        if (this.srpTicks != 10) {
            return;
        }
        if (!this.getBurrowed() && this.rand.nextInt(3) == 0 && this.height <= 0.25f && (target = this.getAttackTarget()) != null && target.getDistanceSq((Entity)this) > 49.0 && ParasiteEventEntity.teleportDigging(this, 10.0f, target.getPosition(), 4, 1)) {
            this.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10, 30, false, false));
        }
    }

    public void addVelocity(double x, double y, double z) {
        if (this.getBurrowed()) {
            super.addVelocity(x, y, z);
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (this.world.isRemote) {
            return false;
        }
        if (source == DamageSource.IN_WALL) {
            return false;
        }
        if (source == DamageSource.OUT_OF_WORLD) {
            return super.attackEntityFrom(source, amount);
        }
        if (!this.getBurrowed() && this.height < 1.0f) {
            if (source == DamageSource.DROWN) {
                return false;
            }
            if (source.getTrueSource() == null) {
                return super.attackEntityFrom(source, amount);
            }
            return false;
        }
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        if (!this.getBurrowed() || this.height < 1.0f) {
            if (entityIn == null) {
                return false;
            }
            if (this.getDistanceSq(entityIn) > 4.0) {
                return false;
            }
            this.setParasiteStatus(3);
            this.setBurrowed(true);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
            this.buriedC = 40;
            return false;
        }
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag) {
            this.buriedC += 40;
        }
        return flag;
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        if (this.borderOrb != 0) {
            return false;
        }
        this.up = true;
        this.attackTimer = 0.0f;
        boolean flag = false;
        this.playSound(SRPSounds.SWIPE, 2.0f, 1.0f);
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entityIn.posX, entityIn.posY, entityIn.posZ, entityIn.posX + 1.0, entityIn.posY + 1.0, entityIn.posZ + 1.0).grow(1.5);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob instanceof EntityParasiteBase) {
                if (this.getAttackTarget() != mob) continue;
                this.setAttackTarget(null);
                return false;
            }
            if (mob == this || !this.canEntityBeSeen((Entity)mob) || !this.attackEntityAsMob((Entity)mob)) continue;
            flag = true;
        }
        return flag;
    }

    public boolean isPushedByWater() {
        return super.isPushedByWater();
    }

    @Override
    public boolean isPotionApplicable(PotionEffect potioneffectIn) {
        return super.isPotionApplicable(potioneffectIn);
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
        this.particleStatus((byte)5);
    }

    public float getEyeHeight() {
        return this.height;
    }

    public boolean getBurrowed() {
        return (Boolean)this.dataManager.get(UP);
    }

    public void setBurrowed(boolean in) {
        this.dataManager.set(UP, (Object)in);
    }

    public static void registerFixesBano(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityWymo.class);
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
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

    @SideOnly(value=Side.CLIENT)
    public float getBurrowTimer() {
        return this.buried;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean getOpen() {
        return this.open;
    }

    @SideOnly(value=Side.CLIENT)
    public float getAttackTimer() {
        return this.attackTimer;
    }
}

