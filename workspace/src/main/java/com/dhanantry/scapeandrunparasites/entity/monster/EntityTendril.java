package com.dhanantry.scapeandrunparasites.entity.monster;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityTendril extends EntityParasiteBase {
    public EntityTendril(EntityType<? extends EntityTendril> type, Level level) { super(type, level); }
    @Override public int getParasiteIDRegister() { return 202; }
}