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

    private void unhide(AABB axisalignedbb) {
        List<LivingEntity> moblist = this.parent.level().getEntitiesOfClass(LivingEntity.class, axisalignedbb);
        for (LivingEntity mob : moblist) {
            if (mob == this.parent || mob instanceof EntityParasiteBase || !mob.onGround() || mob.isInWater() || mob instanceof Player) continue;
            if (!(mob instanceof net.minecraft.world.entity.animal.WaterAnimal) && this.parent.level().random.nextInt(1) == 0 && moblist.size() < this.parent.getMobList().size()) {
                this.summonTentacles(mob, 0.0, axisalignedbb, true);
            }
            if (!mob.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get())) continue;
            // potion refresh omitted (SRPPotions may be stub)
        }
    }

    private void storePara(AABB axisalignedbb) {
        List<EntityParasiteBase> moblist = this.parent.level().getEntitiesOfClass(EntityParasiteBase.class, axisalignedbb);
        for (EntityParasiteBase mob : moblist) {
            if (!mob.isAlive() || mob instanceof EntityPStationaryArchitect || mob instanceof com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPreeminent || mob instanceof com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPCosmical || mob.getTarget() != null || !mob.onGround() || mob.tickCount <= 100 || mob.canBeStored() != 0) continue;
            this.parent.storeParasite(mob);
        }
    }

    private boolean spawnDet(LivingEntity in, EntityParasiteBase entityout, int max, int mini, boolean addId) {
        boolean flagN = (entityout.getParasiteIDRegister() == 72);
        if (flagN && this.cooldownNak > 0) {
            entityout.discard();
            return false;
        }
        boolean tele = (entityout.getParasiteIDRegister() == 74);
        if (this.parent.getMobList().size() <= 0 && tele) {
            entityout.discard();
            return false;
        }
        java.util.Random rand = new java.util.Random();
        double x = in.getX();
        double y = in.getY();
        double z = in.getZ();
        double randomx = rand.nextInt(max) + mini;
        double randomz = rand.nextInt(max) + mini;
        double negative = rand.nextInt(2);
        if (negative == 0.0) randomx *= -1.0;
        negative = rand.nextInt(2);
        if (negative == 0.0) randomz *= -1.0;
        int limit = 0;
        boolean flag = true;
        net.minecraft.world.level.Level level = this.parent.level();
        while (flag) {
            if (limit >= 5) {
                entityout.discard();
                return false;
            }
            net.minecraft.core.BlockPos pos = new net.minecraft.core.BlockPos((int)(x + randomx), (int)y, (int)(z + randomz));
            pos = ParasiteEventEntity.getFloor(level, pos, 5);
            if (pos != null) {
                net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
                if (level.getBlockState(pos.below()).isSolidRender(level, pos.below())) {
                    float bHard = 0.0f;
                    net.minecraft.world.level.block.state.BlockState state2 = level.getBlockState(pos.below());
                    float atm = state2.getDestroySpeed(level, pos.below());
                    if (atm <= 0.0f) { randomx = rand.nextInt(max)+mini; randomz = rand.nextInt(max)+mini; negative = rand.nextInt(2); if (negative==0.0) randomx*=-1.0; negative = rand.nextInt(2); if (negative==0.0) randomz*=-1.0; ++limit; continue; }
                    bHard += atm;
                    state2 = level.getBlockState(pos.below(2));
                    atm = state2.getDestroySpeed(level, pos.below(2));
                    if (atm <= 0.0f) { randomx = rand.nextInt(max)+mini; randomz = rand.nextInt(max)+mini; negative = rand.nextInt(2); if (negative==0.0) randomx*=-1.0; negative = rand.nextInt(2); if (negative==0.0) randomz*=-1.0; ++limit; continue; }
                    bHard += atm;
                    state2 = level.getBlockState(pos.below(3));
                    atm = state2.getDestroySpeed(level, pos.below(3));
                    if (atm <= 0.0f) { randomx = rand.nextInt(max)+mini; randomz = rand.nextInt(max)+mini; negative = rand.nextInt(2); if (negative==0.0) randomx*=-1.0; negative = rand.nextInt(2); if (negative==0.0) randomz*=-1.0; ++limit; continue; }
                    if ((bHard += atm) >= this.maxHardness) { randomx = rand.nextInt(max)+mini; randomz = rand.nextInt(max)+mini; negative = rand.nextInt(2); if (negative==0.0) randomx*=-1.0; negative = rand.nextInt(2); if (negative==0.0) randomz*=-1.0; ++limit; continue; }
                    AABB axisalignedbb = new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1).inflate(2.0);
                    List<LivingEntity> moblist = level.getEntitiesOfClass(LivingEntity.class, axisalignedbb);
                    if (moblist.isEmpty()) {
                        entityout.setPos(x + randomx, y, z + randomz);
                        if (!level.noCollision(entityout, entityout.getBoundingBox())) {
                            randomx = rand.nextInt(max)+mini; randomz = rand.nextInt(max)+mini; negative = rand.nextInt(2); if (negative==0.0) randomx*=-1.0; negative = rand.nextInt(2); if (negative==0.0) randomz*=-1.0; ++limit; continue;
                        }
                        try {
                            if (level instanceof net.minecraft.server.level.ServerLevel) {
                                entityout.finalizeSpawn((net.minecraft.server.level.ServerLevel) level, level.getCurrentDifficultyAt(pos), net.minecraft.world.entity.MobSpawnType.NATURAL, null, null);
                            }
                        } catch (Exception e) {}
                        entityout.setTarget(in);
                        if (tele) {
                            this.resistanceI.add(entityout.getId());
                            String name = this.parent.getParasiteStored();
                            if (name == null) {
                                entityout.discard();
                                return false;
                            }
                            if (entityout instanceof EntityDodT) {
                                ((EntityDodT) entityout).setTele(name, this.stage);
                            }
                        } else {
                            this.parent.setActualParasites(1);
                            this.parent.addID(entityout.getId(), 1);
                        }
                        entityout.setPeek(true);
                        entityout.setBuried();
                        if (this.parent.isOnFire()) {
                            entityout.setSecondsOnFire(8);
                        }
                        level.addFreshEntity(entityout);
                        this.tickss = 10.0;
                        level.broadcastEntityEvent(entityout, (byte) 50);
                        if (entityout.getParasiteIDRegister() == 74) {
                            if (entityout instanceof EntityDodT) ((EntityDodT) entityout).setFather(this.parent);
                        } else if (flagN) {
                            if (entityout instanceof EntityNak) ((EntityNak) entityout).setFather(this.parent);
                            this.cooldownNak = 40;
                        }
                        flag = false;
                        return true;
                    }
                }
            }
            randomx = rand.nextInt(max)+mini; randomz = rand.nextInt(max)+mini; negative = rand.nextInt(2); if (negative==0.0) randomx*=-1.0; negative = rand.nextInt(2); if (negative==0.0) randomz*=-1.0; ++limit;
        }
        entityout.discard();
        return false;
    }

    private boolean checkNak() {
        AABB axisalignedbb = new AABB(this.parent.getX(), this.parent.getY(), this.parent.getZ(), this.parent.getX() + 1.0, this.parent.getY() + 1.0, this.parent.getZ() + 1.0).inflate(7.0, 5.0, 7.0);
        List<EntityNak> moblist = this.parent.level().getEntitiesOfClass(EntityNak.class, axisalignedbb);
        return moblist.isEmpty();
    }
}

