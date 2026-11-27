package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityPStationaryArchitect extends EntityPDispatcher {
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

    @Override
    public float getBombDamage() {
        return 0.0f;
    }
}
