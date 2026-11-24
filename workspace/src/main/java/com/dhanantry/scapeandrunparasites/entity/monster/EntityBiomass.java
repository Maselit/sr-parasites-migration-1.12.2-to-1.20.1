package com.dhanantry.scapeandrunparasites.entity.monster;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityBiomass extends EntityParasiteBase {
    public EntityBiomass(EntityType<? extends EntityBiomass> type, Level level) { super(type, level); }
    @Override public int getParasiteIDRegister() { return 205; }
}