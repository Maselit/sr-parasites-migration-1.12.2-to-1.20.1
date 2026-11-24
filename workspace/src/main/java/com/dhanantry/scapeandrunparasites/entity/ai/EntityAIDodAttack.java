package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIDodAttack a 1.20.1 (Goal). Estructura migrada; logica compleja (bloqueo, pathfinding) con TODO.
 */
public class EntityAIDodAttack extends Goal {
    private final EntityPStationaryArchitect parentEntity;
    private int attackTimer = 0;
    private int limit = 0;
    private final int sLimit;
    private final int sCooldown;
    private final int sStage;
    private boolean locked;
    private boolean counted;
    private boolean flag;
    private int extraV;
    private double extraM;
    private int totalV;
    private double totalM;

    public EntityAIDodAttack(EntityPStationaryArchitect dod, int limit, int cooldown, float attackD) {
        this.parentEntity = dod;
        this.sCooldown = cooldown;
        this.sLimit = limit;
        this.sStage = 1;
        this.locked = false;
        this.flag = false;
        this.counted = false;
        if (!com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems.useEvolution && !com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems.rsIgnoreCooldownAtSpawn) {
            this.attackTimer = -this.sCooldown;
        }
        this.totalV = 5;
        this.totalM = 1.0;
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
        // STUB: logica compleja de convocacion (EntityAIDodAttack) pendiente de migracion completa.
        // TODO: portar updateTask con SummonM, spawnBiomassFromBeckon, setNerabyLocked, etc.
    }
}