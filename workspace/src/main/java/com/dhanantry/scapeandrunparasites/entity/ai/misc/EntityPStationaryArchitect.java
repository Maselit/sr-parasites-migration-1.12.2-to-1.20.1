package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

/**
 * Migracion de EntityPStationaryArchitect a 1.20.1.
 * STUB con metodos referenciados por EntityDod / EntityAIVenkrolSummon / EntityAIDodAttack / EntityAINexusGrow.
 */
public class EntityPStationaryArchitect extends EntityParasiteBase {
    public EntityPStationaryArchitect(EntityType<? extends EntityPStationaryArchitect> type, Level level) {
        super(type, level);
    }

    public EntityPStationaryArchitect(Level level) {
        super(level);
    }

    @Override
    public int getParasiteIDRegister() {
        return 0;
    }

    // Stubs for methods referenced by AI classes and EntityDod
    public int getActualParasites() { return 0; }
    public int getTotalParasites() { return 0; }
    public int getActualT() { return 0; }
    public void setActualT(int v) { }
    public void checkID() { }
    public Object summonV = null;
    public boolean getLocker() { return false; }
    public void setlocker(boolean in) { }
    public void setCooldownZero(int in) { }
    public int countNeraby(int id) { return 0; }
    public void setNerabyLocked(int id) { }
    public void setNearbyFree(int id) { }
    public void setNearbyNonConted(int id) { }
    public void setCounted(boolean in) { }
    public boolean getCounted() { return false; }
    public boolean storeParasite(EntityParasiteBase in) { return false; }
    public boolean storeLodo(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeInf(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeCrude(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeMudo(EntityParasiteBase in, boolean b) { return false; }
    public boolean storeMangler(EntityParasiteBase in, boolean b) { return false; }
    public void storeAll(EntityParasiteBase in) { }
    public int setGT(int min, int max) { return min; }
}