/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAINearestAttackableTarget$Sorter
 *  net.minecraft.entity.ai.EntityAITarget
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EntitySelectors
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.common.ForgeHooks
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.common.ForgeHooks;

public class EntityAINearestAttackableTargetStatus<T extends EntityLivingBase>
extends EntityAITarget {
    protected final Class<T> targetClass;
    private final int targetChance;
    protected final EntityAINearestAttackableTarget.Sorter sorter;
    protected final Predicate<? super T> targetEntitySelector;
    protected T targetEntity;
    protected double sneakPPP;
    protected float inviPPP;

    public EntityAINearestAttackableTargetStatus(EntityParasiteBase creature, Class<T> classTarget, boolean checkSight) {
        this(creature, classTarget, checkSight, false);
    }

    public EntityAINearestAttackableTargetStatus(EntityParasiteBase creature, Class<T> classTarget, boolean checkSight, boolean onlyNearby) {
        this(creature, classTarget, 10, checkSight, onlyNearby, null, 0.8f, 0.7f);
    }

    public EntityAINearestAttackableTargetStatus(EntityParasiteBase creature, Class<T> classTarget, int chance, boolean checkSight, boolean onlyNearby, final @Nullable Predicate<? super T> targetSelector, double sneakP, float inviP) {
        super((EntityCreature)creature, checkSight, onlyNearby);
        this.targetClass = classTarget;
        this.targetChance = chance;
        this.sorter = new EntityAINearestAttackableTarget.Sorter((Entity)creature);
        this.func_75248_a(1);
        this.targetEntitySelector = new Predicate<T>(){

            public boolean apply(@Nullable T p_apply_1_) {
                if (p_apply_1_ == null) {
                    return false;
                }
                if (targetSelector != null && !targetSelector.apply(p_apply_1_)) {
                    return false;
                }
                return !EntitySelectors.field_180132_d.apply(p_apply_1_) ? false : EntityAINearestAttackableTargetStatus.this.func_75296_a(p_apply_1_, true);
            }
        };
        this.sneakPPP = sneakP;
        this.inviPPP = inviP;
    }

    public boolean func_75250_a() {
        if (this.targetChance > 0 && this.field_75299_d.func_70681_au().nextInt(this.targetChance) != 0 || ((EntityParasiteBase)this.field_75299_d).getParasiteStatus() != 0) {
            return false;
        }
        if (this.targetClass != EntityPlayer.class && this.targetClass != EntityPlayerMP.class) {
            List list = this.field_75299_d.field_70170_p.func_175647_a(this.targetClass, this.getTargetableArea(this.func_111175_f()), this.targetEntitySelector);
            if (list.isEmpty()) {
                return false;
            }
            Collections.sort(list, this.sorter);
            this.targetEntity = (EntityLivingBase)list.get(0);
            return true;
        }
        this.targetEntity = this.getNearest(this.field_75299_d.field_70165_t, this.field_75299_d.field_70163_u + (double)this.field_75299_d.func_70047_e(), this.field_75299_d.field_70161_v, this.func_111175_f(), this.func_111175_f(), this.targetEntitySelector);
        return this.targetEntity != null;
    }

    public boolean func_75253_b() {
        return super.func_75253_b();
    }

    private EntityPlayer getNearest(double posX, double posY, double posZ, double maxXZDistance, double maxYDistance, @Nullable Predicate<EntityPlayer> predicate) {
        double d0 = -1.0;
        EntityPlayer entityplayer = null;
        for (int j2 = 0; j2 < this.field_75299_d.field_70170_p.field_73010_i.size(); ++j2) {
            EntityPlayer entityplayer1 = (EntityPlayer)this.field_75299_d.field_70170_p.field_73010_i.get(j2);
            if (entityplayer1.field_71075_bZ.field_75102_a || !entityplayer1.func_70089_S() || entityplayer1.func_175149_v() || predicate != null && !predicate.apply((Object)entityplayer1)) continue;
            double d1 = entityplayer1.func_70092_e(posX, entityplayer1.field_70163_u, posZ);
            double d2 = maxXZDistance;
            if (entityplayer1.func_70093_af()) {
                d2 = maxXZDistance * this.sneakPPP;
            }
            if (entityplayer1.func_82150_aj()) {
                float f = entityplayer1.func_82243_bO();
                if (f < 0.1f && this.inviPPP != 1.0f) {
                    f = 0.1f;
                }
                d2 *= (double)(this.inviPPP * f);
            }
            d2 = ForgeHooks.getPlayerVisibilityDistance((EntityPlayer)entityplayer1, (double)d2, (double)maxYDistance);
            if (!(maxYDistance < 0.0) && !(Math.abs(entityplayer1.field_70163_u - posY) < maxYDistance * maxYDistance) || !(maxXZDistance < 0.0) && !(d1 < d2 * d2) || d0 != -1.0 && !(d1 < d0)) continue;
            d0 = d1;
            entityplayer = entityplayer1;
        }
        return entityplayer;
    }

    protected AxisAlignedBB getTargetableArea(double targetDistance) {
        return this.field_75299_d.func_174813_aQ().func_72314_b(targetDistance, 4.0, targetDistance);
    }

    public void func_75249_e() {
        this.field_75299_d.func_70624_b(this.targetEntity);
        if (SRPConfigSystems.useOneMind && ParasiteEventEntity.alertOthers((EntityParasiteBase)this.field_75299_d, this.targetEntity, this.field_75299_d.field_70170_p, 4)) {
            this.field_75299_d.func_70690_d(new PotionEffect(SRPPotions.SENS_E, 300, 3, false, false));
        }
        super.func_75249_e();
    }

    public static class Sorter
    implements Comparator<Entity> {
        private final Entity entity;

        public Sorter(Entity entityIn) {
            this.entity = entityIn;
        }

        @Override
        public int compare(Entity p_compare_1_, Entity p_compare_2_) {
            double d1;
            double d0 = this.entity.func_70068_e(p_compare_1_);
            if (d0 < (d1 = this.entity.func_70068_e(p_compare_2_))) {
                return -1;
            }
            return d0 > d1 ? 1 : 0;
        }
    }
}

