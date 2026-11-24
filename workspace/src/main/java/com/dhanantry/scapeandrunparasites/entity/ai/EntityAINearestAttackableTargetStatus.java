package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;

/**
 * Migracion de EntityAINearestAttackableTargetStatus a 1.20.1 (TargetGoal).
 */
public class EntityAINearestAttackableTargetStatus<T extends net.minecraft.world.entity.LivingEntity> extends TargetGoal {
    protected final Class<T> targetClass;
    private final int targetChance;
    protected final java.util.Comparator<net.minecraft.world.entity.Entity> sorter;
    protected final java.util.function.Predicate<? super T> targetEntitySelector;
    protected T targetEntity;
    protected double sneakPPP;
    protected float inviPPP;

    public EntityAINearestAttackableTargetStatus(EntityParasiteBase creature, Class<T> classTarget, boolean checkSight) {
        this(creature, classTarget, checkSight, false);
    }

    public EntityAINearestAttackableTargetStatus(EntityParasiteBase creature, Class<T> classTarget, boolean checkSight, boolean onlyNearby) {
        this(creature, classTarget, 10, checkSight, onlyNearby, null, 0.8, 0.7f);
    }

    public EntityAINearestAttackableTargetStatus(EntityParasiteBase creature, Class<T> classTarget, int chance, boolean checkSight, boolean onlyNearby, java.util.function.Predicate<? super T> targetSelector, double sneakP, float inviP) {
        super(creature, checkSight, onlyNearby);
        this.targetClass = classTarget;
        this.targetChance = chance;
        this.sorter = java.util.Comparator.comparingDouble(e -> creature.distanceToSqr(e));
        this.targetEntitySelector = t -> {
            if (t == null) return false;
            if (targetSelector != null && !targetSelector.test(t)) return false;
            return true;
        };
        this.sneakPPP = sneakP;
        this.inviPPP = inviP;
    }

    @Override
    public boolean canUse() {
        if (this.targetChance > 0 && this.mob.getRandom().nextInt(this.targetChance) != 0 || ((EntityParasiteBase) this.mob).getParasiteStatus() != 0) {
            return false;
        }
        if (this.targetClass != net.minecraft.world.entity.player.Player.class) {
            java.util.List<T> list = this.mob.level().getEntitiesOfClass(this.targetClass, this.mob.getBoundingBox().inflate(this.getFollowDistance(), 4.0, this.getFollowDistance()), this.targetEntitySelector);
            if (list.isEmpty()) return false;
            list.sort(this.sorter);
            this.targetEntity = list.get(0);
            return true;
        }
        // player nearest
        this.targetEntity = null;
        double d0 = -1.0;
        for (net.minecraft.world.entity.player.Player p : this.mob.level().players()) {
            if (p.isSpectator() || p.isCreative() || !p.isAlive()) continue;
            if (this.targetEntitySelector != null && !this.targetEntitySelector.test((T) p)) continue;
            double d1 = p.distanceToSqr(this.mob);
            double d2 = this.getFollowDistance();
            if (p.isCrouching()) d2 = d2 * this.sneakPPP;
            float f = p.getArmorValue() > 0 ? p.getArmorValue() : 0.1f;
            if (f < 0.1f && this.inviPPP != 1.0f) f = 0.1f;
            d2 *= (double) (this.inviPPP * f);
            if (d1 > d2 * d2) continue;
            if (d0 != -1.0 && !(d1 < d0)) continue;
            d0 = d1;
            this.targetEntity = (T) p;
        }
        return this.targetEntity != null;
    }

    @Override
    public boolean canContinueToUse() {
        return super.canContinueToUse();
    }

    @Override
    public void start() {
        this.mob.setTarget(this.targetEntity);
        if (SRPConfigSystems.useOneMind && ParasiteEventEntity.alertOthers((EntityParasiteBase) this.mob, this.targetEntity, this.mob.level(), 4)) {
            this.mob.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.SENS_E.get(), 300, 3));
        }
        super.start();
    }
}