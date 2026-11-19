/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIAttackMelee
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.init.Blocks
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityWave
extends EntityParasiteBase {
    private int raaa;
    private EntityLivingBase target;
    private int duration;

    public EntityWave(World worldIn) {
        super(worldIn);
        this.setSize(1.5f, 0.2f);
        this.tasks.removeTask((EntityAIBase)this.aiWander);
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.killcount = -10.0;
        this.MiniDamage = 0.1f;
        this.duration = 1;
    }

    protected void initEntityAI() {
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.0, false));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.45);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20.0);
    }

    public void setDamages(double baseDamage, float min, int range, int durationF) {
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(baseDamage);
        this.MiniDamage = min;
        this.raaa = range;
        this.duration = durationF;
    }

    @Override
    public int getParasiteIDRegister() {
        return 211;
    }

    public void onUpdate() {
        block8: {
            block7: {
                super.onUpdate();
                if (!this.world.isRemote) break block7;
                IBlockState state = this.world.getBlockState(this.getPosition().down());
                if (state.getBlock() == Blocks.AIR) break block8;
                int id = Block.getStateId((IBlockState)state);
                for (int i = 0; i < 15; ++i) {
                    this.world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY, this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() + 20.0, this.rand.nextGaussian() * 0.02, new int[]{id});
                }
                break block8;
            }
            if (this.target != null && !this.target.isEntityAlive()) {
                this.setDead();
                return;
            }
            if (this.ticksExisted > 40) {
                if (this.posX == this.prevPosX || this.posZ == this.prevPosZ) {
                    this.setDead();
                }
                if (this.ticksExisted > 20 * this.duration) {
                    this.setDead();
                    return;
                }
            }
            if (this.world.getBlockState(this.getPosition()).getBlock() instanceof BlockLiquid) {
                this.setDead();
                return;
            }
            float f = this.width / 2.0f;
            float f1 = this.height;
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX - (double)f, this.posY, this.posZ - (double)f, this.posX + (double)f, this.posY + (double)f1, this.posZ + (double)f).grow(0.4, 0.2, 0.4);
            List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
            for (EntityLivingBase mob : moblist) {
                if (mob instanceof EntityParasiteBase) continue;
                this.attackEntityAsMobMinimum(mob);
            }
        }
    }

    protected void jump() {
        this.setDead();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return false;
    }

    @Override
    public boolean isPotionApplicable(PotionEffect potioneffectIn) {
        return false;
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBox() {
        return new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    @Override
    protected void collideWithEntity(Entity entityIn) {
    }

    protected void collideWithNearbyEntities() {
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
        if (this.world.isRemote) {
            return;
        }
        if (this.target == entityLivingIn) {
            this.setDead();
        }
    }

    public void setAttackTarget(EntityLivingBase entitylivingbaseIn) {
        if (this.ticksExisted > 40) {
            this.setDead();
        }
        super.setAttackTarget(entitylivingbaseIn);
        this.target = entitylivingbaseIn;
    }
}

