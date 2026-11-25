package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIVenkrolSummon a 1.20.1 (Goal). Logica de control portada; convocacion delegada a stubs.
 */
public class EntityAIVenkrolSummon extends Goal {
    private final EntityPStationaryArchitect parentEntity;
    private int attackTimer = 0;
    private int limit = 0;
    private int sLimit;
    private int sCooldown;
    private int sStage;
    private boolean locked;
    private boolean counted;
    private boolean flag;
    private int extraV;
    private double extraM;
    private int totalV;
    private double totalM;

    public EntityAIVenkrolSummon(EntityPStationaryArchitect venkrol, int limit, int cooldown, int stage, int CAV, double CAM) {
        this.parentEntity = venkrol;
        this.sCooldown = cooldown;
        this.sLimit = limit;
        this.sStage = stage;
        this.locked = false;
        this.flag = false;
        this.counted = false;
        if (!SRPConfigSystems.useEvolution && !SRPConfigSystems.rsIgnoreCooldownAtSpawn) {
            this.attackTimer = -this.sCooldown;
        }
        this.totalV = CAV;
        this.totalM = CAM;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return this.parentEntity.getTarget() != null;
    }

    @Override
    public void start() {
        this.parentEntity.setParasiteStatus(1);
    }

    @Override
    public void stop() {
        this.limit = 0;
        this.parentEntity.setParasiteStatus(0);
    }

    @Override
    public void tick() {
        if (this.locked) {
            --this.attackTimer;
            if (this.attackTimer <= -200) {
                this.locked = false;
                this.attackTimer = -this.sCooldown;
            }
        } else if (this.parentEntity.getTarget() == null) {
            if (this.attackTimer > 0) --this.attackTimer;
        } else if (!this.parentEntity.getTarget().isAlive()) {
            if (this.attackTimer > 0) --this.attackTimer;
        } else {
            LivingEntity target = this.parentEntity.getTarget();
            if (this.parentEntity.hasLineOfSight(target)) {
                ++this.attackTimer;
                this.parentEntity.level().broadcastEntityEvent(this.parentEntity, (byte) 12);
                if (this.attackTimer % 20 == 0 && this.attackTimer > 0) {
                    if (this.attackTimer == 20) {
                        this.extraV = this.countNeraby(this.parentEntity.getId());
                        this.extraM = Math.floor((double) this.extraV * this.totalM);
                        this.flag = this.extraV >= this.totalV;
                        this.parentEntity.setNearbyNonConted(this.parentEntity.getId());
                        this.parentEntity.checkID();
                    }
                    this.parentEntity.checkID();
                    if (this.parentEntity.getActualParasites() < this.parentEntity.getTotalParasites() && this.limit < this.sLimit) {
                        if (this.sStage == 4) {
                            if (ParasiteEventEntity.SummonM(this.parentEntity, SRPAttributes.VENKROLSIV_MOBTABLEG, 7, this.parentEntity.getX(), this.parentEntity.getY(), this.parentEntity.getZ(), target, false)) {
                                if (this.flag) this.parentEntity.setNerabyLocked(this.parentEntity.getId());
                                ++this.limit;
                            }
                        } else {
                            String[] ground = SRPAttributes.VENKROL_MOBTABLEG;
                            String[] air = null;
                            switch (this.sStage) {
                                case 2: ground = SRPAttributes.VENKROLSII_MOBTABLEG; air = SRPAttributes.VENKROLSII_MOBTABLEA; break;
                                case 3: ground = SRPAttributes.VENKROLSIII_MOBTABLEG; air = SRPAttributes.VENKROLSIII_MOBTABLEA; break;
                            }
                            if (ParasiteEventEntity.spawnBiomassFromBeckon(this.parentEntity, this.sStage, target, true, ground, air)) {
                                if (this.flag) this.parentEntity.setNerabyLocked(this.parentEntity.getId());
                                ++this.limit;
                                int j = this.parentEntity.getActualT();
                                this.parentEntity.setActualT(++j);
                            }
                        }
                        if (this.limit >= this.sLimit) {
                            if (this.flag) {
                                if (this.extraM > 0.0 && this.attackTimer > this.sLimit * 20) {
                                    if (this.sStage == 4) {
                                        if (ParasiteEventEntity.SummonM(this.parentEntity, SRPAttributes.VENKROLSIV_MOBTABLEG, 5, this.parentEntity.getX(), this.parentEntity.getY(), this.parentEntity.getZ(), target, false)) {
                                            this.extraM -= 1.0;
                                        }
                                    } else {
                                        String[] ground = SRPAttributes.VENKROL_MOBTABLEG;
                                        String[] air = null;
                                        switch (this.sStage) {
                                            case 2: ground = SRPAttributes.VENKROLSII_MOBTABLEG; air = SRPAttributes.VENKROLSII_MOBTABLEA; break;
                                            case 3: ground = SRPAttributes.VENKROLSIII_MOBTABLEG; air = SRPAttributes.VENKROLSIII_MOBTABLEA; break;
                                        }
                                        if (ParasiteEventEntity.spawnBiomassFromBeckon(this.parentEntity, this.sStage, target, true, ground, air)) {
                                            this.extraM -= 1.0;
                                        }
                                    }
                                } else if (this.extraM <= 0.0) {
                                    this.extraM = 0.0;
                                    this.flag = false;
                                    this.attackTimer = -this.sCooldown;
                                    this.parentEntity.setNearbyFree(this.parentEntity.getId());
                                    this.limit = 0;
                                }
                            } else {
                                this.attackTimer = -this.sCooldown;
                                this.parentEntity.setNearbyFree(this.parentEntity.getId());
                                this.limit = 0;
                            }
                        }
                    }
                } else if (this.attackTimer > 0) {
                    --this.attackTimer;
                }
            }
        }
    }

    private int countNeraby(int id) { return this.parentEntity.countNeraby(id); }
    private void setNerabyNonConted(int id) { this.parentEntity.setNearbyNonConted(id); }
    private void setNerabyLocked(int id) { this.parentEntity.setNerabyLocked(id); }
    private void setNearbyFree(int id) { this.parentEntity.setNearbyFree(id); }
}