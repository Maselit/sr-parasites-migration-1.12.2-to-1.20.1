/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.block.BlockGore;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.EntityRemain;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSpawn;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityGore;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPFeral
extends EntityParasiteBase
implements EntityCanSpawn {
    public EntityPFeral(World worldIn) {
        super(worldIn);
        this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, true, false, null, SRPConfig.feralSneakPen, SRPConfig.feralInviPen));
        if (SRPConfig.mobattacking) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, true, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.feralSneakPen, SRPConfig.feralInviPen));
        }
        this.tasks.addTask(2, (EntityAIBase)new EntityAIEvade(this, 30, 5, 3));
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.experienceValue = SRPAttributes.XP_FERAL;
        this.damageCap = SRPConfig.feralCap;
        this.canD = SRPConfig.feraldespawn;
        this.MiniDamage = SRPConfig.feralMinDamage;
        this.oneMindDeathValue = SRPConfig.feralOneMindDeathV;
        this.foodSteal = 0.1f;
        this.valueEvDeath = SRPConfig.feralLoosingEPValue;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.world.isRemote && this.rand.nextInt(25) == 0) {
            for (int i = 0; i <= 1; ++i) {
                this.spawnParticlesGoreBox(SRPEnumParticle.GSPLASH, 0, -1, -1, 0.1, 0.0);
            }
        }
    }

    @Override
    protected void fearPlayer(EntityLivingBase player) {
        try {
            if (player == null) {
                return;
            }
            if (!this.canEntityBeSeen((Entity)player)) {
                return;
            }
            if (!player.isPotionActive(SRPPotions.FEAR_E)) {
                player.addPotionEffect(new PotionEffect(SRPPotions.FEAR_E, 300, 0, false, false));
            } else if (player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() < 0) {
                player.addPotionEffect(new PotionEffect(SRPPotions.FEAR_E, 300, 0, false, false));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        EntityLivingBase target;
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag && entityIn instanceof EntityLivingBase && this.rand.nextDouble() < (double)SRPConfigSystems.cothInfected && !(target = (EntityLivingBase)entityIn).isPotionActive(SRPPotions.COTH_E)) {
            if (target.isPotionActive(SRPPotions.EPEL_E)) {
                if (this.rand.nextDouble() >= SRPConfigSystems.epelChanceCOTH) {
                    target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                }
            } else {
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
        }
        return flag;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
    }

    @Override
    protected void spawnGore() {
        int range = 2;
        double i1 = MathHelper.floor((double)(this.posY + 0.1));
        double l1 = this.posX;
        double i2 = this.posZ;
        for (int k2 = -1 * range; k2 <= 1 * range && SRPConfig.paraGore; ++k2) {
            for (int l2 = -1 * range; l2 <= 1 * range; ++l2) {
                double i3 = l1 + (double)k2;
                double l = i2 + (double)l2;
                BlockPos blockpos = new BlockPos(i3, i1, l);
                Block block = this.world.getBlockState(blockpos).getBlock();
                Block blockDown = this.world.getBlockState(blockpos.down()).getBlock();
                if (block != Blocks.AIR || blockDown == Blocks.AIR || !this.world.getBlockState(blockpos.down()).isFullBlock() || blockDown == SRPBlocks.InfestedStain || this.world.rand.nextInt(6) != 0) continue;
                this.world.setBlockState(blockpos, SRPBlocks.Gore.getDefaultState().withProperty(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.SIM_FLAT)));
            }
        }
        if (this.world.getBlockState(this.getPosition().down()).isFullBlock() && (this.world.getBlockState(this.getPosition()).getBlock() instanceof BlockBush || this.world.getBlockState(this.getPosition()).getBlock() == Blocks.AIR)) {
            this.world.setBlockState(this.getPosition(), SRPBlocks.Gore.getDefaultState().withProperty(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.SIM_BIG)));
            EntityRemain nnn = new EntityRemain(this.world);
            nnn.setLocationAndAngles((double)this.getPosition().getX() + 0.5, this.getPosition().getY(), (double)this.getPosition().getZ() + 0.5, 0.0f, 0.0f);
            nnn.setParasite(EntityList.getKey((Entity)this).toString());
            nnn.setSkin((byte)this.getSkin());
            nnn.setGoal(20 * SRPConfig.feralRemainValue);
            this.world.spawnEntity((Entity)nnn);
        }
        for (int i = 0; i < 3 && SRPConfig.paraGore; ++i) {
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
            d4 = d4 * d7 * 2.0;
            EntityGore bomb = new EntityGore(this.world);
            bomb.setType((byte)1);
            bomb.copyLocationAndAnglesFrom((Entity)this);
            bomb.setMotion(d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3f)), d4, d5 *= d7, 0.1, 0.5);
            this.world.spawnEntity((Entity)bomb);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void spawnEffectsGore() {
        int i;
        for (i = 0; i <= 100; ++i) {
            if (i % 5 != 0) continue;
            this.spawnParticlesGore(SRPEnumParticle.GSPLASH, 0, -1, -1);
        }
        for (i = 0; i <= 20; ++i) {
            if (i % 5 == 0) {
                this.spawnParticles(SRPEnumParticle.GCLOUD, 127, 0, 0);
            }
            if (i % 5 != 0) continue;
            this.spawnParticles(SRPEnumParticle.GSPLASH, 0, -1, -1);
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
    }
}

