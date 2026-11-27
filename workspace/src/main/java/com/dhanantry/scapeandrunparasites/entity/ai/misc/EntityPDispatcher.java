package com.dhanantry.scapeandrunparasites.entity.ai.misc;

/**
 * STUB migrado (Fase C): clase base esqueleto.
 */
public abstract class EntityPDispatcher extends com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase {
    public EntityPDispatcher(net.minecraft.world.level.Level level) {
        super(level);
    }
    public EntityPDispatcher(net.minecraft.world.entity.EntityType<? extends EntityPDispatcher> type, net.minecraft.world.level.Level level) {
        super(type, level);
    }
    // Stubs for methods referenced by EntityAIDodAttack
    public java.util.List getMobList() { return new java.util.ArrayList(); }
    public int getActualT() { return 0; }
    public void setActualT(int v) { }
    public int getActualParasites() { return 0; }
    public int getTotalParasites() { return 0; }
    public String getParasiteStored() { return null; }
    public void setActualParasites(int v) { }
    public void addID(int id, int type) { }
    public void checkID() { }
    public int countNeraby(int id) { return 0; }
    public void setNearbyNonConted(int id) { }
    public void setNearbyFree(int id) { }
    public void setNerabyLocked(int id) { }
    public void setConvert(boolean in) { }
    public void storeAll(EntityParasiteBase in) { }
    public boolean hasLineOfSight(net.minecraft.world.entity.LivingEntity e) { return true; }
    public int totalP = 0;
    public int[] mobID;
    public int[] mobPT;
    public byte stage = 1;
    public int neededTime = 100;
    public int pointCap = 0;
    public double pointReduction = 0;
    public double chanceLearn = 0;
    public double chanceLearnFire = 0;
    public int DamageTypeCap = 0;
    public int setGT(int min, int max) { return min; }
    public boolean storeLodo(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeInf(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeCrude(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeMudo(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeMangler(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeParasite(EntityParasiteBase in) { return false; }
}
