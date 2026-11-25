package com.dhanantry.scapeandrunparasites.entity.monster;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityWave extends EntityParasiteBase {
    public EntityWave(EntityType<? extends EntityWave> type, Level level) { super(type, level); }
    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() { return net.minecraft.world.entity.monster.Monster.createMonsterAttributes(); }
    @Override public int getParasiteIDRegister() { return 211; }
}