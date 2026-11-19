/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSpawn;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPHijacked
extends EntityParasiteBase
implements EntityCanSpawn {
    public EntityPHijacked(World worldIn) {
        super(worldIn);
        this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, true, false, null, SRPConfig.infectedSneakPen, SRPConfig.infectedInviPen));
        if (SRPConfig.mobattacking) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, true, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.infectedSneakPen, SRPConfig.infectedInviPen));
        }
        this.experienceValue = SRPAttributes.XP_INFECTED;
        this.damageCap = SRPConfig.infectedCap;
        this.canD = SRPConfig.infecteddespawn;
        this.MiniDamage = SRPConfig.infectedMinDamage;
        this.oneMindDeathValue = SRPConfig.infectedOneMindDeathV;
        this.foodSteal = 0.1f;
        this.canModRender = 0;
        this.valueEvDeath = SRPConfig.infectedLoosingEPValue;
    }

    @Override
    public int getIDSpawn() {
        return this.getParasiteIDRegister();
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
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
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void spawnEffectsGore() {
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

