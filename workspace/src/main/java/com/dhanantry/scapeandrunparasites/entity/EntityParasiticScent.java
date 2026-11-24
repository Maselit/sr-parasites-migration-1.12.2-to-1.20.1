package com.dhanantry.scapeandrunparasites.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityParasiticScent extends net.minecraft.world.entity.Entity {
    public EntityParasiticScent(EntityType<? extends EntityParasiticScent> type, Level level) {
        super(type, level);
    }

    @Override
    protected void defineSynchedData() { }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) { }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) { }
}