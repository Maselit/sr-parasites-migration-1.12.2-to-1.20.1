package com.dhanantry.scapeandrunparasites.entity.monster;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityWave extends EntityParasiteBase {
    public EntityWave(EntityType<? extends EntityWave> type, Level level) { super(type, level); }
    @Override public int getParasiteIDRegister() { return 211; }
}