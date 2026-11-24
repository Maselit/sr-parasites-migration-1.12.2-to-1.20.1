package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAISkill a 1.20.1 (Goal).
 */
public class EntityAISkill extends Goal {
    private final EntityParasiteBase parentEntity;
    private final int sCooldown;
    private int attackTimer = 0;
    private int attacking = 0;
    private final boolean checV;
    private final int distanceC;
    private int distanceL;
    private final byte attID;
    private final boolean ignoreStatus;

    public EntityAISkill(EntityParasiteBase para, int cooldown, int miniDistance, boolean needVisual, int attackID) {
        this(para, cooldown, miniDistance, 0, needVisual, attackID, false);
    }

    public EntityAISkill(EntityParasiteBase para, int cooldown, int miniDistance, int maxDistance, boolean needVisual, int attackID) {
        this(para, cooldown, miniDistance, maxDistance, needVisual, attackID, false);
    }

    public EntityAISkill(EntityParasiteBase para, int cooldown, int miniDistance, int maxDistance, boolean needVisual, int attackID, boolean iS) {
        this.parentEntity = para;
        this.sCooldown = cooldown;
        this.distanceC = miniDistance * miniDistance;
        this.checV = needVisual;
        this.attID = (byte) attackID;
        this.distanceL = maxDistance * maxDistance;
        this.ignoreStatus = iS;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        if (this.ignoreStatus) return true;
        return this.parentEntity.getParasiteStatus() > 0 && this.parentEntity.getParasiteStatus() < 3 || this.attacking >= 1;
    }

    @Override
    public void start() { }

    @Override
    public void stop() { }

    @Override
    public void tick() {
        if (this.attacking >= 1) {
            ++this.attacking;
            this.parentEntity.doSpecialSkill(this.attID);
            if (this.parentEntity.getFinished(this.attID)) {
                this.attacking = 0;
                this.attackTimer = 0;
                this.parentEntity.setFinished(this.attID, false);
            }
        } else {
            net.minecraft.world.entity.LivingEntity target = this.parentEntity.getTarget();
            if (target != null) {
                double dis = this.parentEntity.distanceToSqr(target);
                if (dis < (double) this.distanceC && (this.distanceL == 0 || dis >= (double) this.distanceL)) {
                    if (this.checV) {
                        if (this.parentEntity.hasLineOfSight(target)) {
                            ++this.attackTimer;
                        }
                    } else {
                        ++this.attackTimer;
                    }
                }
                if (this.parentEntity.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.RAGE_E.get())) {
                    ++this.attackTimer;
                }
                if (this.parentEntity.getSkin() == 120 && this.attID == 13) {
                    ++this.attackTimer;
                }
                if (this.attackTimer >= this.sCooldown) {
                    ++this.attacking;
                }
            }
        }
    }
}