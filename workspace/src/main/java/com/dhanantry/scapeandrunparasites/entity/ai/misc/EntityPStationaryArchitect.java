package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

/**
 * Migracion de EntityPStationaryArchitect a 1.20.1 (extiende EntityParasiteBase).
 * STUB: estructura. La logica real (summonV, checkID, etc.) se migra en lotes.
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

    // Stubs for methods referenced by EntityDod / EntityAIVenkrolSummon (real logic pendiente)
    public int getActualParasites() { return 0; }
    public int getTotalParasites() { return 0; }
    public int getActualT() { return 0; }
    public void setActualT(int v) { }
    public void checkID() { }
    public Object summonV = null;
}