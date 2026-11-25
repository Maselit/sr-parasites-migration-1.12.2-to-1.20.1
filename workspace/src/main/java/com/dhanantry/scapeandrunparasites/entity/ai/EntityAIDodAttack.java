package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPDispatcher;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityNak;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityUnvo;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityDodT;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Migracion de EntityAIDodAttack a 1.20.1 (Goal). Logica portada; entidades subyacentes son stubs.
 */
public class EntityAIDodAttack extends net.minecraft.world.entity.ai.goal.Goal {
    private final EntityPDispatcher parent;
    private byte stage;
    private double tickss;
    private byte maxID;
    private int maxDodT;
    private ArrayList<Integer> resistanceI = new ArrayList<>();
    float maxHardness;
    private int cooldownNak;

    public EntityAIDodAttack(EntityPDispatcher dod, int CURRENTstage, byte limit, float hardness) {
        this.parent = dod;
        this.tickss = 20.0;
        this.stage = (byte) CURRENTstage;
        this.maxID = limit;
        this.maxDodT = CURRENTstage * 3;
        this.maxHardness = hardness;
        this.cooldownNak = 0;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        this.tickss -= 1.0;
        --this.cooldownNak;
        if (this.tickss < 0.0) {
            this.tickss = 80.0;
            if (this.parent.getTarget() != null) {
                this.tickss = 10.0;
            }
            return true;
        }
        return false;
    }

    @Override
    public void start() { }

    @Override
    public void stop() { }

    @Override
    public void tick() {
        double follow = 0.0;
        net.minecraft.world.level.Level level = this.parent.level();
        AABB axisalignedbb = new AABB(this.parent.getX(), this.parent.getY(), this.parent.getZ(), this.parent.getX() + 1.0, this.parent.getY() + 1.0, this.parent.getZ() + 1.0).inflate(this.parent.getAttribute(Attributes.FOLLOW_RANGE).getValue());
        LivingEntity target = this.parent.getTarget();
        this.unhide(axisalignedbb);
        this.storePara(axisalignedbb);
        if (target == null) {
            this.findT(follow, axisalignedbb);
        } else {
            if (!this.parent.getMobList().isEmpty() && level.random.nextInt(3) != 0) {
                int sel = level.random.nextInt(this.stage * 2);
                if (sel < this.parent.getMobList().size()) {
                    for (int i = 0; i <= sel; ++i) {
                        this.summonTentacles(target, follow, axisalignedbb, true);
                    }
                }
            } else {
                switch (this.stage) {
                    case 1: {
                        this.parent.checkID();
                        if (this.parent.getActualParasites() < this.parent.getTotalParasites() && this.checkNak() && this.spawnDet(target, new EntityNak(null, level), 3, 1, true)) { }
                        break;
                    }
                    case 2: {
                        this.parent.checkID();
                        if (this.parent.getActualParasites() < this.parent.getTotalParasites() && this.checkNak() && this.spawnDet(target, new EntityNak(null, level), 3, 1, true)) { }
                        break;
                    }
                    case 3: {
                        if (level.random.nextBoolean()) {
                            this.parent.checkID();
                            if (this.parent.getActualParasites() < this.parent.getTotalParasites() && this.spawnDet(target, new EntityUnvo(null, level), 6, 4, true)) { }
                        } else {
                            this.parent.checkID();
                            if (this.parent.getActualParasites() < this.parent.getTotalParasites() && this.checkNak() && this.spawnDet(target, new EntityNak(null, level), 3, 1, true)) { }
                        }
                        break;
                    }
                    case 4: {
                        if (level.random.nextBoolean()) {
                            this.parent.checkID();
                            if (this.parent.getActualParasites() < this.parent.getTotalParasites() && this.spawnDet(target, new EntityUnvo(null, level), 6, 4, true)) { }
                            break;
                        }
                        this.parent.checkID();
                        if (this.parent.getActualParasites() >= this.parent.getTotalParasites() || !this.checkNak() || this.spawnDet(target, new EntityNak(null, level), 3, 1, true)) { }
                        break;
                    }
                }
            }
            if (!target.isAlive()) {
                this.parent.setTarget(null);
            }
        }
    }

    private void findT(double follow, AABB axisalignedbb) {
        List<LivingEntity> moblist = this.parent.level().getEntitiesOfClass(LivingEntity.class, axisalignedbb);
        for (LivingEntity mob : moblist) {
            if (mob == null) continue;
            if (mob instanceof Player) {
                if (!this.canAttackPlayer((Player) mob)) continue;
                this.parent.setTarget(mob);
                return;
            }
            if (mob instanceof LivingEntity && !(mob instanceof EntityParasiteBase) && mob != this.parent && this.canTargetEntity(mob) && mob.distanceToSqr(this.parent) < 1024.0 && mob.isAlive() && this.parent.canAttackClass(mob.getClass())) {
                this.parent.setTarget(mob);
                return;
            }
        }
    }

    private boolean canTargetEntity(LivingEntity in) {
        return !(in instanceof EntityParasiteBase);
    }

    private boolean canAttackPlayer(Player in) {
        if (in.getAbilities().invulnerable) {
            return false;
        }
        return true;
    }

    private void summonTentacles(LivingEntity in, double follow, AABB axisalignedbb, boolean dod) {
        net.minecraft.world.level.Level level = this.parent.level();
        if (level.random.nextInt(2) != 0) {
            return;
        }
        this.parent.checkID();
        this.checkdodts();
        if (this.resistanceI.size() >= this.maxDodT && dod) {
            return;
        }
        if (this.parent.getMobList().size() <= 0 && dod) {
            // allow spawn
        }
        this.spawnDet(in, new EntityDodT(null, level), 5, 3, dod);
    }

    private void checkdodts() {
        for (int i = 0; i < this.resistanceI.size(); ++i) {
            Entity flag = this.parent.level().getEntity(this.resistanceI.get(i));
            if (flag == null) {
                this.resistanceI.remove(i);
                i = 0;
                continue;
            }
            if (flag instanceof EntityDodT) {
                EntityDodT flagg = (EntityDodT) flag;
                if (flagg.isAlive()) continue;
                this.resistanceI.remove(i);
                i = 0;
                continue;
            }
            this.resistanceI.remove(i);
            i = 0;
        }
    }

    private boolean checkNak() {
        return this.cooldownNak <= 0;
    }

    private void unhide(AABB axisalignedbb) { }
    private void storePara(AABB axisalignedbb) { }

    private boolean spawnDet(LivingEntity in, EntityParasiteBase entityout, int max, int mini, boolean addId) {
        // Simplified stub: underlying entity methods are stubs; full spawn logic deferred.
        return false;
    }
}
