package com.dhanantry.scapeandrunparasites.util;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C): esqueleto de ParasiteEventEntity. Metodos referenciados como no-op/stub.
 */
public class ParasiteEventEntity {
    public static void alertOthers(EntityParasiteBase self, LivingEntity target, Level world, int type) { }
    public static void spawnBeckon(Level world, net.minecraft.world.damagesource.DamageSource cause, EntityParasiteBase self) { }
    public static void leaveScent(Level world, net.minecraft.world.damagesource.DamageSource cause, EntityParasiteBase self) { }
    public static boolean checkEntity(LivingEntity entity, String[] list, boolean white) { return false; }
    public static boolean checkName(String name, String[] list, boolean white) { return false; }
    public static void spawnInsider(Entity entity, Level world, net.minecraft.nbt.CompoundTag tags) { }
    public static boolean convertEntity(LivingEntity entity, net.minecraft.nbt.CompoundTag tags, boolean flag, Object parasite) { return false; }
    public static boolean convertEntityFeral(LivingEntity entity, net.minecraft.nbt.CompoundTag tags, boolean flag, Object parasite) { return false; }
    public static boolean hijackEntity(LivingEntity entity, String parasite) { return false; }
    public static net.minecraft.core.BlockPos getFloor(net.minecraft.world.level.Level world, net.minecraft.core.BlockPos pos, int max) { return pos; }
    public static int getScentBonus(byte phase) { return 0; }
    public static int getScentReactionBonus(byte phase) { return 0; }
    public static void alertAllPlayerDim(Level world, String msg, int phase) { }
    public static void alertAllPlayerSer(String msg, Level world) { }
}