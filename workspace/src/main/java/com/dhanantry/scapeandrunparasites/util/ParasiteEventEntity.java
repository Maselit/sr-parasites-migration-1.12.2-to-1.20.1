package com.dhanantry.scapeandrunparasites.util;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C): esqueleto de ParasiteEventEntity. Metodos referenciados como no-op/stub.
 */
public class ParasiteEventEntity {
    public static boolean alertOthers(EntityParasiteBase self, net.minecraft.world.entity.LivingEntity target, net.minecraft.world.level.Level world, int type) { return false; }
    public static void spawnBeckon(Level world, net.minecraft.world.damagesource.DamageSource cause, EntityParasiteBase self) { }
    public static void leaveScent(Level world, net.minecraft.world.damagesource.DamageSource cause, EntityParasiteBase self) { }
    public static boolean checkEntity(LivingEntity entity, String[] list, boolean white) { return false; }
    public static boolean checkName(String name, String[] list, boolean white) { return false; }
    public static void spawnInsider(Entity entity, Level world, net.minecraft.nbt.CompoundTag tags) { }
    public static boolean convertEntity(LivingEntity entity, net.minecraft.nbt.CompoundTag tags, boolean flag, Object parasite) { return false; }
    public static boolean convertEntityFeral(LivingEntity entity, net.minecraft.nbt.CompoundTag tags, boolean flag, Object parasite) { return false; }
    public static boolean hijackEntity(LivingEntity entity, String parasite) { return false; }
    public static net.minecraft.core.BlockPos getFloor(net.minecraft.world.level.LevelAccessor world, net.minecraft.core.BlockPos pos, int max) {
        if (max <= 0) return null;
        --max;
        if (world.getBlockState(pos).isAir()) {
            if (!world.getBlockState(pos.below()).isAir()) {
                return pos;
            }
            return getFloor(world, pos.below(), max);
        }
        return getFloor(world, pos.above(), max);
    }
    public static int entityChunkCount(net.minecraft.world.level.Level world, net.minecraft.core.BlockPos pos, Class<?> cls) { return 0; }
    public static int getScentReactionBonus(byte phase) { return 0; }
    public static boolean SummonM(EntityParasiteBase self, String[] mobs, int count, double x, double y, double z, net.minecraft.world.entity.LivingEntity target, boolean flag) { return false; }
    public static void alertAllPlayerSer(String msg, Level world) { }
    public static void alertAllPlayerDim(Level world, String msg, int phase) { }
    public static boolean spawnBiomassFromBeckon(EntityParasiteBase self, int stage, net.minecraft.world.entity.LivingEntity target, boolean flag, String[] ground, String[] air) { return false; }
    public static void spawnNext(net.minecraft.world.entity.Entity self, net.minecraft.world.entity.Entity next, boolean a, boolean b) { }
    public static boolean canSpawnNext = true;
}