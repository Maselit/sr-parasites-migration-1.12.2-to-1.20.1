/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityMoveHelper
 *  net.minecraft.entity.ai.EntityMoveHelper$Action
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.pathfinding.PathNavigateSwimmer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.infected;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeNotGround;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanFly;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPFeral;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPInfected;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityInfSquid
extends EntityPInfected
implements EntityCanFly,
EntityCutomAttack {
    protected static final DataParameter<Byte> VEX_FLAGS = EntityDataManager.createKey(EntityInfSquid.class, (DataSerializer)DataSerializers.BYTE);

    public EntityInfSquid(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 0.9f);
        this.moveHelper = new AIMoveControl(this);
        this.canModRender = 0;
        this.type = (byte)15;
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.tasks.removeTask((EntityAIBase)this.aiWander);
    }

    @Override
    public int getParasiteIDRegister() {
        return 307;
    }

    @Override
    public int canSpawnByIDData() {
        return SRPConfigMobs.infsquidCanSpawnAssimilatedNat;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackMeleeNotGround(this, 4.0, SRPConfig.primitiveFollow, 0.05, false, 0));
        this.tasks.addTask(6, (EntityAIBase)new AIMoveRandom());
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.INFSQUID_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.INFSQUID_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.INFSQUID_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.INFSQUID_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.infectedFollow);
    }

    protected PathNavigate createNavigator(World worldIn) {
        return new PathNavigateSwimmer((EntityLiving)this, worldIn);
    }

    @Override
    public void onLivingUpdate() {
        if (this.isAIDisabled()) {
            return;
        }
        this.liquidLeap = 0;
        super.onLivingUpdate();
        if (this.inWater) {
            this.setNoGravity(true);
        } else {
            this.setNoGravity(false);
        }
        this.liquidLeap = 0;
    }

    public float getEyeHeight() {
        return this.height * 0.8f;
    }

    public static void registerFixesInfHuman(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityInfSquid.class);
    }

    @Override
    public EntityPFeral getFeral() {
        return null;
    }

    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15f, 1.0f);
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        return this.attackEntityAsMob(entityIn);
    }

    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    public boolean isNotColliding() {
        return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), (Entity)this);
    }

    public int getTalkInterval() {
        return 0;
    }

    @Override
    public boolean canDespawn() {
        return true;
    }

    protected int getExperiencePoints(EntityPlayer player) {
        return 1 + this.world.rand.nextInt(3);
    }

    public void onEntityUpdate() {
        int i = this.getAir();
        super.onEntityUpdate();
        if (this.isAIDisabled()) {
            return;
        }
        if (this.isEntityAlive() && !this.isInWater()) {
            this.setAir(--i);
            if (this.getAir() == -20) {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0f);
            }
        } else {
            this.setAir(300);
        }
    }

    public boolean isPushedByWater() {
        return false;
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

    public void move(MoverType type, double x, double y, double z) {
        super.move(type, x, y, z);
        this.doBlockCollisions();
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(VEX_FLAGS, (Object)0);
    }

    public static void registerFixesLum(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityInfSquid.class);
    }

    private boolean getVexFlag(int mask) {
        byte i = (Byte)this.dataManager.get(VEX_FLAGS);
        return (i & mask) != 0;
    }

    private void setVexFlag(int mask, boolean value) {
        int i = ((Byte)this.dataManager.get(VEX_FLAGS)).byteValue();
        i = value ? (i |= mask) : (i &= ~mask);
        this.dataManager.set(VEX_FLAGS, (Object)((byte)(i & 0xFF)));
    }

    class AIMoveRandom
    extends EntityAIBase {
        public AIMoveRandom() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            return EntityInfSquid.this.rand.nextInt(7) == 0;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            BlockPos blockpos = new BlockPos((Entity)EntityInfSquid.this);
            int flag = 1;
            double speed = 0.13;
            if (EntityInfSquid.this.getAttackTarget() != null) {
                if (EntityInfSquid.this.getDistanceSq((Entity)EntityInfSquid.this.getAttackTarget()) > 100.0) {
                    blockpos = new BlockPos((Entity)EntityInfSquid.this.getAttackTarget());
                    flag = 2;
                } else if (EntityInfSquid.this.getDistanceSq((Entity)EntityInfSquid.this.getAttackTarget()) < 36.0) {
                    blockpos = new BlockPos((Entity)EntityInfSquid.this.getAttackTarget());
                    flag = 3;
                }
            }
            for (int i = 0; i < 3; ++i) {
                BlockPos blockpos1 = blockpos.add(EntityInfSquid.this.rand.nextInt(15) - 7, EntityInfSquid.this.rand.nextInt(11) - 5, EntityInfSquid.this.rand.nextInt(15) - 7);
                if (flag == 2) {
                    blockpos1 = blockpos.add(EntityInfSquid.this.rand.nextInt(6) - 2, EntityInfSquid.this.rand.nextInt(7) - 2, EntityInfSquid.this.rand.nextInt(6) - 2);
                } else if (flag == 3) {
                    blockpos1 = blockpos.add(EntityInfSquid.this.rand.nextInt(4) + 3, EntityInfSquid.this.rand.nextInt(5) + 4, EntityInfSquid.this.rand.nextInt(4) + 3);
                }
                if (EntityInfSquid.this.world.getBlockState(blockpos1).getMaterial() != Material.WATER) continue;
                EntityInfSquid.this.moveHelper.setMoveTo((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 0.5, (double)blockpos1.getZ() + 0.5, speed);
                if (EntityInfSquid.this.getAttackTarget() != null) break;
                EntityInfSquid.this.getLookHelper().setLookPosition((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 0.5, (double)blockpos1.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    class AIMoveControl
    extends EntityMoveHelper {
        public AIMoveControl(EntityInfSquid vex) {
            super((EntityLiving)vex);
        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                double d0 = this.posX - EntityInfSquid.this.posX;
                double d1 = this.posY - EntityInfSquid.this.posY;
                double d2 = this.posZ - EntityInfSquid.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                if ((d3 = (double)MathHelper.sqrt((double)d3)) < EntityInfSquid.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityInfSquid.this.motionX *= 0.5;
                    EntityInfSquid.this.motionY *= 0.5;
                    EntityInfSquid.this.motionZ *= 0.5;
                } else {
                    EntityInfSquid.this.motionX += d0 / d3 * 0.05 * this.speed;
                    EntityInfSquid.this.motionY += d1 / d3 * 0.05 * this.speed;
                    EntityInfSquid.this.motionZ += d2 / d3 * 0.05 * this.speed;
                    if (EntityInfSquid.this.getAttackTarget() == null) {
                        EntityInfSquid.this.renderYawOffset = EntityInfSquid.this.rotationYaw = -((float)MathHelper.atan2((double)EntityInfSquid.this.motionX, (double)EntityInfSquid.this.motionZ)) * 57.295776f;
                    } else {
                        double d4 = EntityInfSquid.this.getAttackTarget().posX - EntityInfSquid.this.posX;
                        double d5 = EntityInfSquid.this.getAttackTarget().posZ - EntityInfSquid.this.posZ;
                        EntityInfSquid.this.renderYawOffset = EntityInfSquid.this.rotationYaw = -((float)MathHelper.atan2((double)d4, (double)d5)) * 57.295776f;
                    }
                }
            }
        }
    }
}

