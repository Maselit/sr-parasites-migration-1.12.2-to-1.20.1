package com.dhanantry.scapeandrunparasites.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityScaryOrb extends net.minecraft.world.entity.Entity {
    public EntityScaryOrb(EntityType<? extends EntityScaryOrb> type, Level level) {
        super(type, level);
    }

    @Override
    protected void defineSynchedData() { }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) { }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) { }
}