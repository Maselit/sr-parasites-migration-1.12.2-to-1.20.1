/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.BlockLeaves
 *  net.minecraft.block.BlockLog
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IRangedAttackMob
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.effect.EntityLightningBolt
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.ClassInheritanceMultiMap
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.apache.logging.log4j.Level
 */
package com.dhanantry.scapeandrunparasites.util;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.compatibility.ModCompatibility;
import com.dhanantry.scapeandrunparasites.entity.EntityParasiticScent;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanFly;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSummon;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPCrude;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPFeral;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPHijacked;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPInfected;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.EntityBiomass;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooM;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooS;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityNak;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityTonro;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityUnvo;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrol;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSIII;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityKol;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityCanra;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityDropPod;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityProjectileBiomass;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.network.SRPPacketMovingSound;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPExplosion;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.apache.logging.log4j.Level;

public class ParasiteEventEntity {
    public static boolean canSpawnNext = true;

    public static int entityChunkCount(World world, BlockPos pos, Class<? extends EntityLivingBase> mobC) {
        ClassInheritanceMultiMap[] arrayE = world.getChunk(pos).getEntityLists();
        int v = 0;
        for (ClassInheritanceMultiMap entities : arrayE) {
            Object[] arrayO;
            if (entities == null) continue;
            for (Object o : arrayO = entities.toArray()) {
                if (o == null || !mobC.isInstance(o)) continue;
                ++v;
            }
        }
        return v;
    }

    public static boolean checkEntity(EntityLivingBase entity, String[] list, boolean inverted) {
        ResourceLocation enti = EntityList.getKey((Entity)entity);
        if (enti != null) {
            return ParasiteEventEntity.checkName(enti.toString(), list, inverted);
        }
        return false;
    }

    public static boolean checkName(String name, String[] list, boolean inverted) {
        boolean inv = false;
        if (list.length != 0) {
            if (inverted) {
                inv = true;
            }
            for (String i : list) {
                if (inverted) {
                    if (!name.contains(i)) continue;
                    return false;
                }
                if (!name.contains(i)) continue;
                return true;
            }
        }
        return inv;
    }

    public static void orbApplyEffects(EntityLivingBase target, EntityParasiteBase in, String[] effects, int mobs) {
        for (String i : effects) {
            String[] here = i.split(";");
            try {
                if (here[5] == null) {
                    return;
                }
            }
            catch (Exception e) {
                return;
            }
            Potion potionE = Potion.getPotionFromResourceLocation((String)here[3]);
            if (potionE == null) continue;
            int self = Integer.parseInt(here[0]);
            int duration = Integer.parseInt(here[1]) * 20;
            int amp = Integer.parseInt(here[2]);
            int enemiesA = Integer.parseInt(here[4]);
            int enemiesD = Integer.parseInt(here[5]);
            if (enemiesA != 0) {
                amp += mobs / enemiesA;
            }
            if (enemiesD != 0) {
                duration += mobs / enemiesD * 20;
            }
            if (self == 1) {
                in.addPotionEffect(new PotionEffect(potionE, duration, amp, false, false));
                continue;
            }
            if (self == 2) {
                if (!(target instanceof EntityParasiteBase)) continue;
                SRPPotions.applyStackPotion(potionE, target, duration, amp);
                continue;
            }
            if (target instanceof EntityParasiteBase) continue;
            SRPPotions.applyStackPotion(potionE, target, duration, amp);
        }
    }

    public static void spawnNext(EntityParasiteBase entityin, EntityParasiteBase entityout, boolean effects, boolean thunder) {
        if (entityin.isDead) {
            return;
        }
        boolean flag = entityin.isBurning();
        entityin.setDead();
        entityout.setLocationAndAngles(entityin.posX, entityin.posY, entityin.posZ, entityin.rotationYaw, entityin.rotationPitch);
        entityout.onInitialSpawn(entityin.world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
        entityout.cannotDespawn(entityin.canDespawn());
        if (entityin.hasCustomName()) {
            entityout.setCustomNameTag(entityin.getCustomNameTag());
            entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
        }
        entityin.world.spawnEntity((Entity)entityout);
        if (entityin instanceof EntityPMalleable && entityout instanceof EntityPMalleable) {
            ((EntityPMalleable)entityout).copyResistancesFrom((EntityPMalleable)entityin);
        }
        if (effects) {
            entityout.particleStatus((byte)7);
        }
        if (thunder && SRPConfig.thunderEnable) {
            entityout.world.addWeatherEffect((Entity)new EntityLightningBolt(entityout.world, entityout.posX, entityout.posY, entityout.posZ, true));
        }
        if (flag) {
            entityout.setHealth(entityout.getMaxHealth() * 0.5f);
            entityout.setFire(8);
        }
    }

    public static void spawnM(EntityParasiteBase entityin, String[] out, int particle, boolean cannotDespawn, String name) {
        if (!entityin.world.isRemote) {
            Random rand = new Random();
            double x = entityin.posX;
            double y = entityin.posY;
            double z = entityin.posZ;
            for (String s : out) {
                if (s == null) continue;
                String[] entityC = s.split(";");
                int max = Integer.parseInt(entityC[1]);
                int min = Integer.parseInt(entityC[2]);
                int total = min == max ? min : rand.nextInt(max - min + 1) + min;
                ResourceLocation entityR = new ResourceLocation(entityC[0]);
                for (int count = 0; count < total; ++count) {
                    EntityLiving entityout = (EntityLiving)EntityList.createEntityByIDFromName((ResourceLocation)entityR, (World)entityin.world);
                    if (entityout == null) {
                        return;
                    }
                    entityout.setLocationAndAngles(x, y + (double)(entityin.height / 2.0f) + 0.5, z, entityin.rotationYaw, entityin.rotationPitch);
                    entityout.onInitialSpawn(entityin.world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                    if (entityout instanceof EntityParasiteBase && cannotDespawn) {
                        EntityParasiteBase parasite = (EntityParasiteBase)entityout;
                        parasite.cannotDespawn(SRPConfig.convertedDespawn);
                        entityin.world.spawnEntity((Entity)parasite);
                        continue;
                    }
                    entityin.world.spawnEntity((Entity)entityout);
                }
            }
        }
    }

    public static boolean SummonM(EntityParasiteBase entityin, String[] out, int range, @Nullable EntityLivingBase target) {
        if (!entityin.world.isRemote) {
            Random rand = new Random();
            double x = entityin.posX;
            double y = entityin.posY;
            double z = entityin.posZ;
            double randomx = rand.nextInt(range);
            double randomz = rand.nextInt(range);
            double negative = rand.nextInt(2);
            if (negative == 0.0) {
                randomx *= -1.0;
            }
            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                randomz *= -1.0;
            }
            int index = rand.nextInt(out.length);
            int limit = 0;
            boolean flag = true;
            while (flag) {
                if (index >= out.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (out[index] != null) {
                    String[] entityC = out[index].split(";");
                    double chance = Double.parseDouble(entityC[1]);
                    if (rand.nextDouble() <= chance) {
                        if (entityin.world.getBlockState(new BlockPos(x + randomx, y, z + randomz)).getBlock() == Blocks.AIR && entityin.world.getBlockState(new BlockPos(x + randomx, y - 1.0, z + randomz)).getBlock() != Blocks.AIR) {
                            EntityLiving entityout = (EntityLiving)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(entityC[0]), (World)entityin.world);
                            if (entityout == null) {
                                return false;
                            }
                            entityout.setLocationAndAngles(x + randomx, y, z + randomz, entityin.rotationYaw, entityin.rotationPitch);
                            if (!entityin.world.getCollisionBoxes((Entity)entityout, entityout.getEntityBoundingBox()).isEmpty()) {
                                entityout.setDead();
                                ++index;
                                continue;
                            }
                            entityout.onInitialSpawn(entityin.world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                            if (entityin instanceof EntityCanSummon) {
                                EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                                int points = Integer.parseInt(entityC[2]);
                                if (father.getTotalParasites() - father.getActualParasites() < points) {
                                    entityout.setDead();
                                    ++index;
                                    continue;
                                }
                                father.setActualParasites(points);
                                father.addID(entityout.getEntityId(), points);
                            }
                            if (entityout instanceof EntityPStationaryArchitect) {
                                if (SRPConfigSystems.rsSky && !entityout.world.canSeeSky(new BlockPos(entityout.posX, entityout.posY + (double)entityout.getEyeHeight(), entityout.posZ))) {
                                    randomx = rand.nextInt(range);
                                    randomz = rand.nextInt(range);
                                    negative = rand.nextInt(2);
                                    if (negative == 0.0) {
                                        randomx *= -1.0;
                                    }
                                    if ((negative = (double)rand.nextInt(2)) == 0.0) {
                                        randomz *= -1.0;
                                    }
                                    entityout.setDead();
                                    ++index;
                                    continue;
                                }
                                Block looking = entityin.world.getBlockState(entityout.getPosition().down()).getBlock();
                                if (looking == SRPBlocks.InfestedStain) {
                                    entityout.setDead();
                                    return false;
                                }
                                switch (((EntityPStationaryArchitect)entityout).getParasiteIDRegister()) {
                                    case 16: {
                                        EntityVenkrol vOut = (EntityVenkrol)entityout;
                                        vOut.setRSSpawned(true);
                                        entityin.world.spawnEntity((Entity)vOut);
                                        if (target != null) {
                                            vOut.setAttackTarget(target);
                                        }
                                        entityin.world.setEntityState((Entity)vOut, (byte)50);
                                        flag = false;
                                        break;
                                    }
                                    case 18: {
                                        EntityVenkrolSII vOutii = (EntityVenkrolSII)entityout;
                                        vOutii.setRSSpawned(true);
                                        entityin.world.spawnEntity((Entity)vOutii);
                                        if (target != null) {
                                            vOutii.setAttackTarget(target);
                                        }
                                        entityin.world.setEntityState((Entity)vOutii, (byte)50);
                                        flag = false;
                                        break;
                                    }
                                    case 19: {
                                        EntityVenkrolSIII vOutiii = (EntityVenkrolSIII)entityout;
                                        vOutiii.setRSSpawned(true);
                                        entityin.world.spawnEntity((Entity)vOutiii);
                                        if (target != null) {
                                            vOutiii.setAttackTarget(target);
                                        }
                                        entityin.world.setEntityState((Entity)vOutiii, (byte)50);
                                        flag = false;
                                    }
                                }
                                return true;
                            }
                            entityin.world.spawnEntity((Entity)entityout);
                            if (target != null) {
                                entityout.setAttackTarget(target);
                            }
                            flag = false;
                            return true;
                        }
                        randomx = rand.nextInt(range);
                        randomz = rand.nextInt(range);
                        negative = rand.nextInt(2);
                        if (negative == 0.0) {
                            randomx *= -1.0;
                        }
                        if ((negative = (double)rand.nextInt(2)) == 0.0) {
                            randomz *= -1.0;
                        }
                    }
                }
                ++index;
            }
        }
        return false;
    }

    public static boolean SummonM(EntityParasiteBase entityin, String[] out, int range, double tx, double ty, double tz, @Nullable EntityLivingBase target, boolean pod) {
        if (!entityin.world.isRemote) {
            Random rand = new Random();
            double randomx = rand.nextInt(range);
            double randomz = rand.nextInt(range);
            double negative = rand.nextInt(2);
            if (negative == 0.0) {
                randomx *= -1.0;
            }
            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                randomz *= -1.0;
            }
            int index = rand.nextInt(out.length);
            int limit = 0;
            boolean flag = true;
            while (flag) {
                if (index >= out.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (out[index] != null) {
                    String[] entityC = out[index].split(";");
                    double chance = Double.parseDouble(entityC[1]);
                    if (rand.nextDouble() <= chance) {
                        if (entityin.world.getBlockState(new BlockPos(tx + randomx, ty, tz + randomz)).getBlock() == Blocks.AIR && entityin.world.getBlockState(new BlockPos(tx + randomx, ty - 1.0, tz + randomz)).getBlock() != Blocks.AIR || pod) {
                            if (pod) {
                                EntityDropPod entityout2 = new EntityDropPod(entityin.world);
                                entityout2.setLocationAndAngles(tx + randomx, ty, tz + randomz, entityin.rotationYaw, entityin.rotationPitch);
                                entityout2.setOwner(entityin.getParasiteType());
                                entityin.world.spawnEntity((Entity)entityout2);
                                flag = false;
                                return true;
                            }
                            EntityLiving entityout = (EntityLiving)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(entityC[0]), (World)entityin.world);
                            if (entityout == null) {
                                return false;
                            }
                            entityout.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0);
                            entityout.setLocationAndAngles(tx + randomx, ty, tz + randomz, entityin.rotationYaw, entityin.rotationPitch);
                            entityout.onInitialSpawn(entityin.world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                            if (entityin instanceof EntityCanSummon) {
                                EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                                int points = Integer.parseInt(entityC[2]);
                                if (father.getTotalParasites() - father.getActualParasites() < points) {
                                    ++index;
                                    continue;
                                }
                                father.setActualParasites(points);
                                father.addID(entityout.getEntityId(), points);
                            }
                            if (entityout instanceof EntityVenkrol) {
                                Block looking = entityin.world.getBlockState(entityout.getPosition().down()).getBlock();
                                if (looking == SRPBlocks.InfestedStain) {
                                    return false;
                                }
                                if (entityin.getParasiteIDRegister() == 41) {
                                    EntityPStationaryArchitect out2 = (EntityPStationaryArchitect)entityout;
                                    out2.setCanGrowTo(false);
                                }
                            }
                            entityin.world.spawnEntity((Entity)entityout);
                            if (target != null) {
                                entityout.setAttackTarget(target);
                            }
                            flag = false;
                            if (entityout instanceof EntityParasiteBase) {
                                EntityParasiteBase eOut = (EntityParasiteBase)entityout;
                                eOut.setParasiteToFollow(entityin);
                            }
                            return true;
                        }
                        randomx = rand.nextInt(range);
                        randomz = rand.nextInt(range);
                        negative = rand.nextInt(2);
                        if (negative == 0.0) {
                            randomx *= -1.0;
                        }
                        if ((negative = (double)rand.nextInt(2)) == 0.0) {
                            randomz *= -1.0;
                        }
                    }
                }
                ++index;
            }
        }
        return false;
    }

    public static void spawnFromList(Entity entityin, String[] out, @Nullable EntityLivingBase target) {
        EntityLiving entityout = (EntityLiving)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(out[entityin.world.rand.nextInt(out.length)]), (World)entityin.world);
        if (entityout == null) {
            return;
        }
        entityout.copyLocationAndAnglesFrom(entityin);
        entityout.onInitialSpawn(entityin.world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
        entityin.world.spawnEntity((Entity)entityout);
        if (target != null) {
            entityout.setAttackTarget(target);
        }
    }

    public static boolean spawnBiomassFromProjectile(EntityParasiteBase entityin, String[] out, @Nullable EntityLivingBase target) {
        if (!entityin.world.isRemote) {
            Random rand = new Random();
            int index = rand.nextInt(out.length);
            int limit = 0;
            boolean flag = true;
            while (flag) {
                if (index >= out.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (out[index] != null) {
                    String[] entityC = out[index].split(";");
                    double chance = Double.parseDouble(entityC[1]);
                    if (rand.nextDouble() <= chance) {
                        EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                        int points = Integer.parseInt(entityC[2]);
                        if (father.getTotalParasites() - father.getActualParasites() < points) {
                            ++index;
                            continue;
                        }
                        if (target == null) {
                            return false;
                        }
                        Vec3d vec3d = entityin.getLook(1.0f);
                        double d2 = target.posX - (entityin.posX + vec3d.x);
                        double d3 = target.getEntityBoundingBox().minY + (double)(target.height / 2.0f) - (0.5 + entityin.posY + (double)(entityin.height / 2.0f));
                        double d4 = target.posZ - (entityin.posZ + vec3d.z);
                        EntityProjectileBiomass entityout = new EntityProjectileBiomass(entityin.world, (EntityLivingBase)entityin, d2, d3, d4);
                        entityout.posX = entityin.posX + vec3d.x;
                        entityout.posY = entityin.posY + (double)entityin.getEyeHeight() - 0.2;
                        entityout.posZ = entityin.posZ + vec3d.z;
                        entityout.setParasite(entityC[0], points, 4);
                        father.setActualParasites(points);
                        father.addID(entityout.getEntityId(), points);
                        entityin.world.spawnEntity((Entity)entityout);
                        flag = false;
                        return true;
                    }
                }
                ++index;
            }
        }
        return false;
    }

    public static boolean spawnBiomassFromVomit(EntityParasiteBase entityin, String[] out, @Nullable EntityLivingBase target) {
        if (!entityin.world.isRemote) {
            Random rand = new Random();
            int index = rand.nextInt(out.length);
            int limit = 0;
            boolean flag = true;
            while (flag) {
                if (index >= out.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (out[index] != null) {
                    String[] entityC = out[index].split(";");
                    double chance = Double.parseDouble(entityC[1]);
                    if (rand.nextDouble() <= chance) {
                        EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                        int points = Integer.parseInt(entityC[2]);
                        if (father.getTotalParasites() - father.getActualParasites() < points) {
                            ++index;
                            continue;
                        }
                        EntityBiomass entityout = new EntityBiomass(entityin.world, entityin, target);
                        entityout.setLocationAndAngles(entityin.posX, entityin.posY, entityin.posZ, entityin.rotationYaw, entityin.rotationPitch);
                        float f19 = MathHelper.sin((float)(entityin.rotationYaw * ((float)Math.PI / 180) - entityin.randomYawVelocity * 0.01f));
                        float f14 = 0.17453292f;
                        float f16 = MathHelper.cos((float)f14);
                        float f4 = MathHelper.cos((float)(entityin.rotationYaw * ((float)Math.PI / 180) - entityin.randomYawVelocity * 0.01f));
                        entityout.rotationYaw = entityin.rotationYaw;
                        if (entityout.world.getBlockState(new BlockPos(entityin.posX + -1.0 * (double)(f19 * 3.0f * f16), entityin.posY + (double)entityin.getEyeHeight(), entityin.posZ - -1.0 * (double)(f4 * 3.0f * f16))).getBlock() != Blocks.AIR) {
                            entityout.setDead();
                            return false;
                        }
                        entityout.setPosition(entityin.posX + -1.0 * (double)(f19 * 3.0f * f16), entityin.posY + (double)entityin.getEyeHeight(), entityin.posZ - -1.0 * (double)(f4 * 3.0f * f16));
                        entityout.setFuse(80);
                        entityout.setParasite(entityC[0], points);
                        if (entityin instanceof EntityCanra) {
                            entityout.setSkin(5);
                        } else {
                            entityout.setSkin(6);
                        }
                        father.setActualParasites(points);
                        father.addID(entityout.getEntityId(), points);
                        if (entityin.isBurning()) {
                            entityout.setFire(8);
                        }
                        entityin.world.spawnEntity((Entity)entityout);
                        flag = false;
                        return true;
                    }
                }
                ++index;
            }
        }
        return false;
    }

    public static boolean spawnBiomassFromBeckon(EntityParasiteBase entityin, int stage, EntityLivingBase target, boolean payfather, String[] ground, String[] air) {
        if (!entityin.world.isRemote) {
            String[] mobListG = ground;
            if (entityin.posY + 3.0 <= target.posY) {
                if (stage == 1) {
                    return false;
                }
                mobListG = air;
            }
            Random rand = new Random();
            int index = rand.nextInt(mobListG.length);
            int limit = 0;
            boolean flag = true;
            while (flag) {
                if (index >= mobListG.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (mobListG[index] != null) {
                    String[] entityC = mobListG[index].split(";");
                    double chance = Double.parseDouble(entityC[1]);
                    if (rand.nextDouble() <= chance) {
                        EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                        int points = Integer.parseInt(entityC[2]);
                        if (father.getTotalParasites() - father.getActualParasites() < points && payfather) {
                            ++index;
                            continue;
                        }
                        double b = 0.0;
                        if (stage == 3) {
                            b = 0.5;
                        }
                        EntityBiomass entityout = new EntityBiomass(entityin.world, entityin, stage, target, payfather);
                        entityout.setLocationAndAngles(entityin.posX, entityin.posY + ((double)entityin.getEyeHeight() + b), entityin.posZ, entityin.rotationYaw, entityin.rotationPitch);
                        double d0 = (float)entityin.posX + entityin.world.rand.nextFloat();
                        double d1 = (float)entityin.posY + entityin.getEyeHeight() + entityin.world.rand.nextFloat();
                        double d2 = (float)entityin.posZ + entityin.world.rand.nextFloat();
                        double d3 = d0 - entityin.posX;
                        double d4 = d1 - entityin.posY;
                        double d5 = d2 - entityin.posZ;
                        double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
                        d3 /= d6;
                        d4 /= d6;
                        d5 /= d6;
                        double d7 = 0.5 / (d6 / 4.0 + 0.1);
                        d7 *= (double)(entityin.world.rand.nextFloat() * entityin.world.rand.nextFloat() + 1.7f);
                        double k = 3.0;
                        if (stage == 3) {
                            k = 5.0;
                        }
                        entityout.setMotion(d3 *= d7 * k, d4 *= d7 * 2.0, d5 *= d7 * k, 0.4, 0.5);
                        entityout.setFuse(80);
                        entityout.setParasite(entityC[0], points);
                        entityout.setSkin(stage);
                        if (entityin.isBurning()) {
                            entityout.setFire(8);
                        }
                        entityin.world.spawnEntity((Entity)entityout);
                        if (payfather) {
                            father.setActualParasites(points);
                            father.addID(entityout.getEntityId(), points);
                        }
                        flag = false;
                        return true;
                    }
                }
                ++index;
            }
        }
        return false;
    }

    public static void convertEntity(EntityLivingBase entityin, NBTTagCompound tags, boolean ignoreKey, String[] list) {
        if (entityin == null) {
            return;
        }
        if (SRPSaveData.get(entityin.world).getEvolutionPhase(entityin.dimension) >= SRPConfigSystems.evolutionFeralNoSim && ParasiteEventEntity.convertEntityFeral(entityin, tags, true, list)) {
            return;
        }
        if (tags.hasKey("srpcothimmunity")) {
            String mobname;
            int key = tags.getInteger("srpcothimmunity");
            if (key == 0 && !ignoreKey) {
                entityin.removeActivePotionEffect(SRPPotions.COTH_E);
                return;
            }
            entityin.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entityin.posX, entityin.posY, entityin.posZ, entityin.width, entityin.height, 1));
            tags.setInteger("srpcothimmunity", ++key);
            if (key < 3 && !ignoreKey) {
                return;
            }
            World world = entityin.world;
            if (world.isRemote) {
                return;
            }
            try {
                mobname = EntityList.getKey((Entity)entityin).toString();
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem while converting entity", (Throwable)e);
                ParasiteEventEntity.spawnInsider(entityin, world, tags);
                return;
            }
            boolean flag = true;
            for (String s : list) {
                EntityPInfected entityout;
                String[] here = s.split(";");
                try {
                    if (here[0] == null || here[1] == null) {
                        ParasiteEventEntity.spawnInsider(entityin, world, tags);
                        return;
                    }
                }
                catch (Exception e) {
                    SRPMain.logger.log(Level.ERROR, "Problem while converting entity", (Throwable)e);
                    ParasiteEventEntity.spawnInsider(entityin, world, tags);
                    return;
                }
                if (!here[0].equals(mobname)) continue;
                Entity outOne = EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(here[1]), (World)world);
                if (outOne == null) {
                    ParasiteEventEntity.spawnInsider(entityin, world, tags);
                    return;
                }
                if (outOne instanceof EntityPInfected) {
                    entityout = (EntityPInfected)outOne;
                    SRPSaveData.get(world).addNumberIDDataSpawn(entityout.getParasiteIDRegister());
                    entityout.copyLocationAndAnglesFrom((Entity)entityin);
                    world.removeEntity((Entity)entityin);
                    entityout.setHost(mobname);
                    entityout.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                    if (entityin.hasCustomName()) {
                        entityout.setCustomNameTag(entityin.getCustomNameTag());
                        entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                    }
                    world.spawnEntity((Entity)entityout);
                    world.playEvent(null, 1026, new BlockPos((Entity)entityout), 0);
                    entityout.particleStatus((byte)7);
                    entityout.cannotDespawn(SRPConfig.convertedDespawn);
                    if (key >= 10) {
                        entityout.addPotionEffect(new PotionEffect(SRPPotions.EPEL_E, 600, 0, false, false));
                    }
                } else if (outOne instanceof EntityLiving) {
                    entityout = (EntityLiving)outOne;
                    entityout.copyLocationAndAnglesFrom((Entity)entityin);
                    world.removeEntity((Entity)entityin);
                    entityout.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                    if (entityin.hasCustomName()) {
                        entityout.setCustomNameTag(entityin.getCustomNameTag());
                        entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                    }
                    world.spawnEntity((Entity)entityout);
                    world.playEvent(null, 1026, new BlockPos((Entity)entityout), 0);
                }
                flag = false;
            }
            if (flag && !ignoreKey) {
                ParasiteEventEntity.spawnInsider(entityin, world, tags);
            }
        }
    }

    public static void spawnInsider(EntityLivingBase entity, World world, NBTTagCompound tags) {
        if (!SRPConfigMobs.inhooSEnabled || !SRPConfigMobs.inhooMEnabled) {
            return;
        }
        List serverList = world.loadedEntityList;
        int count = 0;
        for (Entity value : serverList) {
            if (!(value instanceof EntityInhooM) && !(value instanceof EntityInhooS)) continue;
            ++count;
        }
        if (count > SRPConfig.incompleteCap) {
            world.removeEntity((Entity)entity);
            return;
        }
        if (tags.hasKey("srpcothimmunity")) {
            int key = tags.getInteger("srpcothimmunity");
            if (key == 0) {
                entity.removeActivePotionEffect(SRPPotions.COTH_E);
                return;
            }
            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entity.posX, entity.posY, entity.posZ, entity.width, entity.height, 1));
            tags.setInteger("srpcothimmunity", ++key);
            if (key < 3) {
                return;
            }
            EntityPCrude out = new EntityInhooS(world);
            float mass = ParasiteEventEntity.getEntityArea(entity);
            if ((double)mass > 0.517) {
                out = new EntityInhooM(world);
            }
            out.copyLocationAndAnglesFrom((Entity)entity);
            world.removeEntity((Entity)entity);
            world.spawnEntity((Entity)out);
            world.playEvent(null, 1026, new BlockPos((Entity)out), 0);
            out.particleStatus((byte)7);
            out.cannotDespawn(SRPConfig.convertedDespawn);
        }
    }

    private static float getEntityArea(EntityLivingBase entity) {
        return entity.width * entity.width * entity.height;
    }

    public static boolean convertEntityFeral(EntityLivingBase entityin, NBTTagCompound tags, boolean ignoreKey, String[] list) {
        if (entityin == null) {
            return false;
        }
        if (tags.hasKey("srpcothimmunity")) {
            String mobname;
            int key = tags.getInteger("srpcothimmunity");
            if (key == 0 && !ignoreKey) {
                entityin.removeActivePotionEffect(SRPPotions.COTH_E);
                return false;
            }
            entityin.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entityin.posX, entityin.posY, entityin.posZ, entityin.width, entityin.height, 1));
            tags.setInteger("srpcothimmunity", ++key);
            if (key < 3 && !ignoreKey) {
                return false;
            }
            World world = entityin.world;
            if (world.isRemote) {
                return false;
            }
            try {
                mobname = EntityList.getKey((Entity)entityin).toString();
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem while converting entity", (Throwable)e);
                ParasiteEventEntity.spawnInsider(entityin, world, tags);
                return false;
            }
            boolean flag = true;
            for (String s : list) {
                String[] here = s.split(";");
                try {
                    if (here[0] == null || here[1] == null) {
                        ParasiteEventEntity.spawnInsider(entityin, world, tags);
                        return false;
                    }
                }
                catch (Exception e) {
                    SRPMain.logger.log(Level.ERROR, "Problem while converting entity", (Throwable)e);
                    ParasiteEventEntity.spawnInsider(entityin, world, tags);
                    return false;
                }
                if (!here[0].equals(mobname)) continue;
                Entity outOne = EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(here[1]), (World)world);
                if (outOne == null) {
                    ParasiteEventEntity.spawnInsider(entityin, world, tags);
                    return false;
                }
                if (outOne instanceof EntityPInfected) {
                    EntityPFeral gaa = ((EntityPInfected)outOne).getFeral();
                    if (gaa != null) {
                        outOne.setDead();
                        gaa.copyLocationAndAnglesFrom((Entity)entityin);
                        world.removeEntity((Entity)entityin);
                        gaa.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)gaa)), null);
                        if (entityin.hasCustomName()) {
                            gaa.setCustomNameTag(entityin.getCustomNameTag());
                            gaa.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                        }
                        world.spawnEntity((Entity)gaa);
                        world.playEvent(null, 1026, new BlockPos((Entity)gaa), 0);
                        gaa.particleStatus((byte)7);
                        gaa.cannotDespawn(SRPConfig.convertedDespawn);
                    } else {
                        EntityPInfected entityout = (EntityPInfected)outOne;
                        SRPSaveData.get(world).addNumberIDDataSpawn(entityout.getParasiteIDRegister());
                        entityout.copyLocationAndAnglesFrom((Entity)entityin);
                        world.removeEntity((Entity)entityin);
                        entityout.setHost(mobname);
                        entityout.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                        if (entityin.hasCustomName()) {
                            entityout.setCustomNameTag(entityin.getCustomNameTag());
                            entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                        }
                        world.spawnEntity((Entity)entityout);
                        world.playEvent(null, 1026, new BlockPos((Entity)entityout), 0);
                        entityout.particleStatus((byte)7);
                        entityout.cannotDespawn(SRPConfig.convertedDespawn);
                        if (key >= 10) {
                            entityout.addPotionEffect(new PotionEffect(SRPPotions.EPEL_E, 600, 0, false, false));
                        }
                    }
                    return true;
                }
                if (outOne instanceof EntityLiving) {
                    EntityLiving entityout = (EntityLiving)outOne;
                    entityout.copyLocationAndAnglesFrom((Entity)entityin);
                    world.removeEntity((Entity)entityin);
                    entityout.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                    if (entityin.hasCustomName()) {
                        entityout.setCustomNameTag(entityin.getCustomNameTag());
                        entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                    }
                    world.spawnEntity((Entity)entityout);
                    world.playEvent(null, 1026, new BlockPos((Entity)entityout), 0);
                    return true;
                }
                flag = false;
            }
            if (flag && !ignoreKey) {
                ParasiteEventEntity.spawnInsider(entityin, world, tags);
            }
        }
        return false;
    }

    public static boolean hijackEntity(EntityLivingBase entityin, String[] list) {
        String mobname;
        if (entityin == null) {
            return false;
        }
        World world = entityin.world;
        if (world.isRemote) {
            return false;
        }
        try {
            mobname = EntityList.getKey((Entity)entityin).toString();
        }
        catch (Exception e) {
            SRPMain.logger.log(Level.ERROR, "Problem while converting entity", (Throwable)e);
            return false;
        }
        boolean flag = true;
        for (String s : list) {
            EntityPHijacked entityout;
            String[] here = s.split(";");
            try {
                if (here[0] == null || here[1] == null) {
                    return false;
                }
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem while converting entity", (Throwable)e);
                return false;
            }
            if (!here[0].equals(mobname)) continue;
            Entity outOne = EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(here[1]), (World)world);
            if (outOne == null) {
                return false;
            }
            if (outOne instanceof EntityPHijacked) {
                entityout = (EntityPHijacked)outOne;
                SRPSaveData.get(world).addNumberIDDataSpawn(entityout.getParasiteIDRegister());
                entityout.copyLocationAndAnglesFrom((Entity)entityin);
                world.removeEntity((Entity)entityin);
                entityout.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                if (entityin.hasCustomName()) {
                    entityout.setCustomNameTag(entityin.getCustomNameTag());
                    entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                }
                world.spawnEntity((Entity)entityout);
                world.playEvent(null, 1026, new BlockPos((Entity)entityout), 0);
                entityout.particleStatus((byte)7);
                entityout.cannotDespawn(SRPConfig.convertedDespawn);
            } else if (outOne instanceof EntityLiving) {
                entityout = (EntityLiving)outOne;
                entityout.copyLocationAndAnglesFrom((Entity)entityin);
                world.removeEntity((Entity)entityin);
                entityout.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                if (entityin.hasCustomName()) {
                    entityout.setCustomNameTag(entityin.getCustomNameTag());
                    entityout.setAlwaysRenderNameTag(entityin.getAlwaysRenderNameTag());
                }
                world.spawnEntity((Entity)entityout);
                world.playEvent(null, 1026, new BlockPos((Entity)entityout), 0);
            }
            flag = false;
        }
        return false;
    }

    public static boolean merge(EntityParasiteBase entityin, int code, String name) {
        if (SRPConfigSystems.mergeRandom) {
            entityin.particleStatus((byte)7);
            Random rand = new Random();
            int index = rand.nextInt(SRPConfigSystems.mergeMobTable.length);
            boolean flag = true;
            int limit = 0;
            while (flag) {
                if (index >= SRPConfigSystems.mergeMobTable.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (SRPConfigSystems.mergeMobTable[index] != null) {
                    String[] entityC = SRPConfigSystems.mergeMobTable[index].split(";");
                    ParasiteEventEntity.spawnM(entityin, new String[]{entityC[0] + ";1;1"}, 7, true, name);
                    flag = false;
                    if (SRPConfigSystems.useEvolution) {
                        SRPWorldData data = SRPWorldData.get(entityin.world);
                        SRPSaveData.get(entityin.world).setTotalKills(entityin.world.provider.getDimension(), SRPConfigSystems.valueMerge, true, entityin.world, true);
                    }
                    return true;
                }
                ++index;
            }
        } else {
            String[] entityC;
            for (int i = 0; i < SRPConfigSystems.mergeMobTable.length; ++i) {
                int points;
                if (SRPConfigSystems.mergeMobTable[i] == null || (points = Integer.parseInt((entityC = SRPConfigSystems.mergeMobTable[i].split(";"))[1])) != code) continue;
                ParasiteEventEntity.spawnM(entityin, new String[]{entityC[0] + ";1;1"}, 7, true, name);
                if (SRPConfigSystems.useEvolution) {
                    SRPSaveData.get(entityin.world).setTotalKills(entityin.world.provider.getDimension(), SRPConfigSystems.valueMerge, true, entityin.world, true);
                }
                return true;
            }
            Random rand = new Random();
            int index = rand.nextInt(SRPConfigSystems.mergeMobTable.length);
            boolean flag = true;
            int limit = 0;
            while (flag) {
                if (index >= SRPConfigSystems.mergeMobTable.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (SRPConfigSystems.mergeMobTable[index] != null) {
                    entityC = SRPConfigSystems.mergeMobTable[index].split(";");
                    ParasiteEventEntity.spawnM(entityin, new String[]{entityC[0] + ";1;1"}, 7, true, name);
                    flag = false;
                    if (SRPConfigSystems.useEvolution) {
                        SRPSaveData.get(entityin.world).setTotalKills(entityin.world.provider.getDimension(), SRPConfigSystems.valueMerge, true, entityin.world, true);
                    }
                    return true;
                }
                ++index;
            }
        }
        return false;
    }

    public static BlockPos getFloor(World worldIn, BlockPos pos, int loop) {
        if (loop <= 0) {
            return null;
        }
        --loop;
        if (worldIn.getBlockState(pos).getBlock() == Blocks.AIR) {
            if (worldIn.getBlockState(pos.down()).getBlock() != Blocks.AIR) {
                return pos;
            }
            return ParasiteEventEntity.getFloor(worldIn, pos.down(), loop);
        }
        return ParasiteEventEntity.getFloor(worldIn, pos.up(), loop);
    }

    public static BlockPos getFloorBuilding(World worldIn, BlockPos pos, int loop) {
        if (loop <= 0) {
            return null;
        }
        --loop;
        if (!worldIn.getBlockState(pos).isFullBlock()) {
            if (worldIn.getBlockState(pos.down()).isFullBlock() && !(worldIn.getBlockState(pos.down()).getBlock() instanceof BlockBush) && !(worldIn.getBlockState(pos.down()).getBlock() instanceof BlockLeaves) && !(worldIn.getBlockState(pos.down()).getBlock() instanceof BlockLog)) {
                return pos;
            }
            return ParasiteEventEntity.getFloorBuilding(worldIn, pos.down(), loop);
        }
        if (worldIn.getBlockState(pos).getBlock() instanceof BlockBush || worldIn.getBlockState(pos).getBlock() instanceof BlockLeaves || worldIn.getBlockState(pos).getBlock() instanceof BlockLog) {
            return ParasiteEventEntity.getFloorBuilding(worldIn, pos.down(1), loop);
        }
        return ParasiteEventEntity.getFloorBuilding(worldIn, pos.up(), loop);
    }

    public static boolean spawnTurrets(EntityLivingBase entityin, int range, byte type, int stage) {
        if (stage <= 2) {
            return false;
        }
        if (entityin.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return false;
        }
        Random rand = new Random();
        World world = entityin.world;
        double randomx = rand.nextInt(range);
        double randomz = rand.nextInt(range);
        double negative = rand.nextInt(2);
        if (negative == 0.0) {
            randomx *= -1.0;
        }
        if ((negative = (double)rand.nextInt(2)) == 0.0) {
            randomz *= -1.0;
        }
        int index = 5;
        int limit = 0;
        boolean flag = true;
        while (flag) {
            if (limit >= 5) {
                return false;
            }
            BlockPos floor = ParasiteEventEntity.getFloor(world, new BlockPos(entityin.posX + randomx, entityin.posY, entityin.posZ + randomz), 5);
            if (floor != null && world.getBlockState(floor.down()).getBlock() == SRPBlocks.InfestedStain) {
                int flag2 = 0;
                AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)floor.getX(), (double)floor.getY(), (double)floor.getZ(), (double)(floor.getX() + 1), (double)(floor.getY() + 1), (double)(floor.getZ() + 1)).grow(42.0, 5.0, 42.0);
                List moblist = world.getEntitiesWithinAABB(EntityParasiteBase.class, axisalignedbb);
                for (EntityParasiteBase mob : moblist) {
                    if (!mob.isEntityAlive() || mob.getParasiteType() != 40) continue;
                    ++flag2;
                }
                if (flag2 < 3) {
                    EntityPStationary out;
                    if (type == 1) {
                        if (!SRPConfigMobs.unvoEnabled) {
                            return false;
                        }
                        out = new EntityUnvo(world);
                        out.setLocationAndAngles(floor.getX(), floor.getY(), floor.getZ(), 0.0f, 0.0f);
                        world.spawnEntity((Entity)out);
                        out.setAttackTarget(entityin);
                        return true;
                    }
                    if (type == 2) {
                        if (!SRPConfigMobs.tonroEnabled) {
                            return false;
                        }
                        out = new EntityTonro(world);
                        out.setLocationAndAngles(floor.getX(), floor.getY(), floor.getZ(), 0.0f, 0.0f);
                        world.spawnEntity((Entity)out);
                        out.setAttackTarget(entityin);
                        return true;
                    }
                } else {
                    return false;
                }
            }
            randomx = rand.nextInt(range);
            randomz = rand.nextInt(range);
            negative = rand.nextInt(2);
            if (negative == 0.0) {
                randomx *= -1.0;
            }
            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                randomz *= -1.0;
            }
            ++limit;
        }
        return false;
    }

    public static void alertAllPlayerDim(World worldIn, String message, int warning) {
        List playerEntityList = worldIn.playerEntities;
        for (EntityPlayer entityPlayer : playerEntityList) {
            entityPlayer.sendMessage((ITextComponent)new TextComponentString(message));
            SRPMain.network.sendToDimension((IMessage)new SRPPacketMovingSound(warning), worldIn.provider.getDimension());
        }
        if (warning == -7 && message.equals("Phase decreased")) {
            List serverList = worldIn.loadedEntityList;
            for (Entity entity : serverList) {
                if (!(entity instanceof EntityParasiteBase)) continue;
                ((EntityParasiteBase)entity).addPotionEffect(new PotionEffect(SRPPotions.RAGE_E, 2400, 1, false, false));
            }
        }
    }

    public static void alertAllPlayerSer(String message, World w) {
        List playerEntityList = w.getMinecraftServer().getPlayerList().getPlayers();
        for (EntityPlayerMP entityPlayerMP : playerEntityList) {
            entityPlayerMP.sendMessage((ITextComponent)new TextComponentString(message));
        }
    }

    public static boolean spawnFromBlock(World world, String[] out, int range, BlockPos pos) {
        if (!world.isRemote) {
            Random rand = new Random();
            double x = pos.getX();
            double y = pos.getY();
            double z = pos.getZ();
            double randomx = rand.nextInt(range);
            double randomz = rand.nextInt(range);
            double negative = rand.nextInt(2);
            if (negative == 0.0) {
                randomx *= -1.0;
            }
            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                randomz *= -1.0;
            }
            int index = rand.nextInt(out.length);
            int limit = 0;
            boolean flag = true;
            while (flag) {
                if (index >= out.length) {
                    index = 0;
                    ++limit;
                }
                if (limit == 2) {
                    return false;
                }
                if (out[index] != null) {
                    String[] entityC = out[index].split(";");
                    double chance = Double.parseDouble(entityC[1]);
                    if (rand.nextDouble() <= chance) {
                        BlockPos helper = ParasiteEventEntity.getFloor(world, new BlockPos(x + randomx, y, z + randomz), 3);
                        if (helper != null) {
                            EntityLiving entityout = (EntityLiving)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(entityC[0]), (World)world);
                            if (entityout == null) {
                                return false;
                            }
                            entityout.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0);
                            entityout.setLocationAndAngles((double)helper.getX(), (double)helper.getY(), (double)helper.getZ(), 0.0f, 0.0f);
                            entityout.onInitialSpawn(world.getDifficultyForLocation(helper), null);
                            if (entityout instanceof EntityKol) {
                                EntityKol kol = (EntityKol)entityout;
                                SRPWorldData data = SRPWorldData.get(world);
                                BlockPos origin = data.nearestColonyPosition(helper, false);
                                if (origin != null) {
                                    kol.setTask(origin, data.getColonyDistanceSpreadByPosition(origin, false));
                                } else {
                                    return false;
                                }
                            }
                            world.spawnEntity((Entity)entityout);
                            flag = false;
                            return true;
                        }
                        randomx = rand.nextInt(range);
                        randomz = rand.nextInt(range);
                        negative = rand.nextInt(2);
                        if (negative == 0.0) {
                            randomx *= -1.0;
                        }
                        if ((negative = (double)rand.nextInt(2)) == 0.0) {
                            randomz *= -1.0;
                        }
                    }
                }
                ++index;
            }
        }
        return false;
    }

    public static void spawnBeckon(World world, DamageSource cause, EntityParasiteBase in) {
        if (in.width <= 1.0f && in.height <= 1.0f) {
            return;
        }
        if (SRPConfigSystems.rsEnabled) {
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(in.posX, in.posY, in.posZ, in.posX + 1.0, in.posY + 1.0, in.posZ + 1.0).grow((double)(SRPConfigMobs.venkrolsiiiRange - 1), (double)SRPConfigMobs.venkrolsiiiRangeY, (double)(SRPConfigMobs.venkrolsiiiRange - 1));
            List moblist = world.getEntitiesWithinAABB(EntityPStationaryArchitect.class, axisalignedbb);
            if (!moblist.isEmpty()) {
                return;
            }
            if (ParasiteEventEntity.entityChunkCount(world, in.getPosition(), EntityPStationaryArchitect.class) >= SRPConfigSystems.rsMaxVenkrolChunk) {
                return;
            }
            SRPWorldData data = SRPWorldData.get(world);
            if (SRPConfigSystems.rsPlayer) {
                if (cause.getTrueSource() instanceof EntityPlayer) {
                    if (SRPConfigSystems.useEvolution) {
                        ParasiteEventEntity.spawnBeckonE(data, world, in);
                    } else {
                        ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.rschance, world, in);
                    }
                }
            } else if (SRPConfigSystems.useEvolution) {
                ParasiteEventEntity.spawnBeckonE(data, world, in);
            } else {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.rschance, world, in);
            }
        }
    }

    public static void spawnBeckonNE(SRPWorldData data, double chance, World world, EntityParasiteBase in) {
        long worldT = world.getWorldTime();
        long seconds = (worldT - SRPAttributes.lastTimeD1) / 20L;
        Random rand = new Random();
        if (rand.nextDouble() < chance && data.getCurrentV() < SRPConfigSystems.rsMaxVenkrols && (long)SRPConfigSystems.rsCooldown < Math.abs(seconds) && ParasiteEventEntity.SummonM(in, new String[]{ParasiteEventEntity.getRSColony(data)}, 7, in.getAttackTarget())) {
            if (SRPConfigSystems.rsSounds) {
                in.playSound(SRPSounds.VENKROLSI, 4.0f, 1.0f);
            }
            data.setCurrentV(1);
            SRPAttributes.lastTimeD1 = worldT;
        }
    }

    public static String getRSColony(SRPWorldData data) {
        if (SRPConfigWorld.coloniesActivated) {
            int totalColonyPoints = data.totalColonyPoints(0);
            double bonus = (float)totalColonyPoints / SRPConfigWorld.colonyExtraRSChancePoint * SRPConfigWorld.colonyExtraRSChanceValue;
            if (bonus > 2.0) {
                return "srparasites:beckon_siii;1;1";
            }
            if (bonus > 1.0) {
                return "srparasites:beckon_sii;1;1";
            }
        }
        return "srparasites:beckon_si;1;1";
    }

    public static void spawnBeckonE(SRPWorldData data, World world, EntityParasiteBase in) {
        switch (SRPSaveData.get(world).getEvolutionPhase(world.provider.getDimension())) {
            case 1: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceOne, world, in);
                break;
            }
            case 2: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceTwo, world, in);
                break;
            }
            case 3: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceThree, world, in);
                break;
            }
            case 4: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceFour, world, in);
                break;
            }
            case 5: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceFive, world, in);
                break;
            }
            case 6: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceSix, world, in);
                break;
            }
            case 7: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceSeven, world, in);
                break;
            }
            case 8: {
                ParasiteEventEntity.spawnBeckonNE(data, SRPConfigSystems.reinforcementSystemChanceEight, world, in);
            }
        }
    }

    public static double getRSchance(World world) {
        switch (SRPSaveData.get(world).getEvolutionPhase(world.provider.getDimension())) {
            case 1: {
                return SRPConfigSystems.reinforcementSystemChanceOne;
            }
            case 2: {
                return SRPConfigSystems.reinforcementSystemChanceTwo;
            }
            case 3: {
                return SRPConfigSystems.reinforcementSystemChanceThree;
            }
            case 4: {
                return SRPConfigSystems.reinforcementSystemChanceFour;
            }
            case 5: {
                return SRPConfigSystems.reinforcementSystemChanceFive;
            }
            case 6: {
                return SRPConfigSystems.reinforcementSystemChanceSix;
            }
            case 7: {
                return SRPConfigSystems.reinforcementSystemChanceSeven;
            }
            case 8: {
                return SRPConfigSystems.reinforcementSystemChanceEight;
            }
        }
        return 0.0;
    }

    public static boolean alertOthers(EntityParasiteBase pin, EntityLivingBase target, World world, int loop) {
        if (target == null) {
            return false;
        }
        if (!(target instanceof EntityPlayer) && SRPConfigSystems.oneMindPlayer) {
            return false;
        }
        if (!target.isEntityAlive()) {
            return false;
        }
        if (loop <= 0) {
            return false;
        }
        if (SRPConfigSystems.useEvolution && pin.getPhaseCreated() < SRPConfigSystems.evolutionOneMind) {
            return false;
        }
        --loop;
        int cap = SRPConfigSystems.oneMinRangeCap;
        double d0 = pin.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue();
        for (EntityParasiteBase entitycreature : world.getEntitiesWithinAABB(EntityParasiteBase.class, new AxisAlignedBB(pin.posX, pin.posY, pin.posZ, pin.posX + 1.0, pin.posY + 1.0, pin.posZ + 1.0).grow(d0, 10.0, d0))) {
            if (pin == entitycreature || !entitycreature.isEntityAlive() || entitycreature instanceof IRangedAttackMob || entitycreature instanceof EntityPStationary || entitycreature instanceof EntityBiomass || entitycreature instanceof EntityCanFly || entitycreature.getAttackTarget() != null && entitycreature.getAttackTarget().isEntityAlive()) continue;
            if (entitycreature.canEntityBeSeen((Entity)target)) {
                if (SRPPotions.applySense((EntityLivingBase)entitycreature, 200, entitycreature.getDistanceSq((Entity)target), cap)) {
                    entitycreature.setAttackTarget(target);
                    ParasiteEventEntity.alertOthers(entitycreature, target, world, loop);
                    continue;
                }
                if (!SRPPotions.applySense((EntityLivingBase)entitycreature, 200, entitycreature.getDistanceSq((Entity)pin), cap)) continue;
                entitycreature.setAttackTarget((EntityLivingBase)pin);
                ParasiteEventEntity.alertOthers(entitycreature, target, world, loop);
                continue;
            }
            if (!SRPPotions.applySense((EntityLivingBase)entitycreature, 200, entitycreature.getDistanceSq((Entity)pin), cap)) continue;
            entitycreature.setAttackTarget((EntityLivingBase)pin);
            ParasiteEventEntity.alertOthers(entitycreature, target, world, loop);
        }
        return false;
    }

    public static void leaveScent(World world, DamageSource cause, EntityParasiteBase in) {
        if (!SRPConfigSystems.useScent) {
            return;
        }
        if (SRPConfigSystems.scentPlayer ? !(cause.getTrueSource() instanceof EntityPlayer) : !(cause.getTrueSource() instanceof EntityLivingBase)) {
            return;
        }
        if (world.rand.nextDouble() < SRPConfigSystems.scentDeathSpawning) {
            return;
        }
        if (SRPConfigSystems.useEvolution && in.getPhaseCreated() < SRPConfigSystems.evolutionOneMind) {
            return;
        }
        List serverList = world.loadedEntityList;
        int count = 0;
        for (Entity entity : serverList) {
            if (!(entity instanceof EntityParasiticScent)) continue;
            ++count;
        }
        if (count > SRPConfigSystems.scentCap) {
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(in.posX, in.posY, in.posZ, in.posX + 1.0, in.posY + 1.0, in.posZ + 1.0).grow(64.0);
        List moblist1 = world.getEntitiesWithinAABB(EntityParasiticScent.class, axisalignedbb);
        for (EntityParasiticScent mob : moblist1) {
            if (!in.canEntityBeSeen(mob)) continue;
            mob.increaseDanger(in.getCCDeathValue(), true);
            mob.increaseActivity(1, true);
            mob.setScentLife(mob.getScentLife() + 20 * SRPConfigSystems.scentLifeDeath);
            mob.setScentReaction(ParasiteEventEntity.getScentReactionBonus(in.getPhaseCreated()), false);
            mob.setTargetToKill((EntityLivingBase)cause.getTrueSource(), true);
            if (cause.getTrueSource() instanceof EntityPlayer) {
                ((EntityPlayer)cause.getTrueSource()).sendStatusMessage((ITextComponent)new TextComponentString("Closest Scent was notified"), true);
            }
            return;
        }
        axisalignedbb = new AxisAlignedBB(in.posX, in.posY, in.posZ, in.posX + 1.0, in.posY + 1.0, in.posZ + 1.0).grow(64.0);
        List moblist2 = world.getEntitiesWithinAABB(EntityParasiteBase.class, axisalignedbb);
        int dangerValue = in.getCCDeathValue() + ParasiteEventEntity.getScentBonus(in.getPhaseCreated());
        if (moblist2.size() <= 3 && in.getPhaseCreated() >= 0 && in.getCCDeathValue() > 2) {
            EntityParasiticScent nut = new EntityParasiticScent(world, 0, (EntityLivingBase)cause.getTrueSource());
            nut.copyLocationAndAnglesFrom(cause.getTrueSource());
            nut.setScentLife(SRPConfigSystems.scentLifeObserver * 20);
            nut.increaseDanger(dangerValue, true);
            nut.setScentReaction(ParasiteEventEntity.getScentReactionBonus(in.getPhaseCreated()), false);
            world.spawnEntity((Entity)nut);
            nut.warnPlayers("A Scent has been deployed in this area");
        }
    }

    public static int getScentBonus(byte in) {
        int q = 1;
        if (SRPConfigSystems.useEvolution) {
            switch (in) {
                case 0: {
                    q = SRPConfigSystems.phaseScentBonusZero;
                    break;
                }
                case 1: {
                    q = SRPConfigSystems.phaseScentBonusOne;
                    break;
                }
                case 2: {
                    q = SRPConfigSystems.phaseScentBonusTwo;
                    break;
                }
                case 3: {
                    q = SRPConfigSystems.phaseScentBonusThree;
                    break;
                }
                case 4: {
                    q = SRPConfigSystems.phaseScentBonusFour;
                    break;
                }
                case 5: {
                    q = SRPConfigSystems.phaseScentBonusFive;
                    break;
                }
                case 6: {
                    q = SRPConfigSystems.phaseScentBonusSix;
                    break;
                }
                case 7: {
                    q = SRPConfigSystems.phaseScentBonusSeven;
                    break;
                }
                case 8: {
                    q = SRPConfigSystems.phaseScentBonusEight;
                }
            }
        }
        return q;
    }

    public static byte getScentReactionBonus(byte in) {
        byte q = SRPConfigSystems.scentGoActive;
        if (SRPConfigSystems.useEvolution) {
            switch (in) {
                case 0: {
                    q = SRPConfigSystems.phaseScentReactionZero;
                    break;
                }
                case 1: {
                    q = SRPConfigSystems.phaseScentReactionOne;
                    break;
                }
                case 2: {
                    q = SRPConfigSystems.phaseScentReactionTwo;
                    break;
                }
                case 3: {
                    q = SRPConfigSystems.phaseScentReactionThree;
                    break;
                }
                case 4: {
                    q = SRPConfigSystems.phaseScentReactionFour;
                    break;
                }
                case 5: {
                    q = SRPConfigSystems.phaseScentReactionFive;
                    break;
                }
                case 6: {
                    q = SRPConfigSystems.phaseScentReactionSix;
                    break;
                }
                case 7: {
                    q = SRPConfigSystems.phaseScentReactionSeven;
                    break;
                }
                case 8: {
                    q = SRPConfigSystems.phaseScentReactionEight;
                }
            }
        }
        return q;
    }

    public static void checkColony(World world, DamageSource cause, EntityPMalleable in) {
        if (in.isBurning() || !SRPConfigWorld.coloniesActivated) {
            return;
        }
        if (ParasiteEventWorld.numberofColonies(world) <= 0) {
            return;
        }
        double chance = 0.0;
        if (in.isPotionActive(SRPPotions.LINK_E)) {
            chance = (double)(in.getActivePotionEffect(SRPPotions.LINK_E).getAmplifier() + 1) * SRPConfigSystems.adapsChance;
        }
        if (ParasiteEventWorld.rangeOfColony(world, in.getPosition(), true) != null || world.rand.nextDouble() < chance) {
            String da;
            SRPWorldData data = SRPWorldData.get(world);
            if (in.colonySpawned) {
                in.removeCommonDamage(data.getMostCommonDamageS(), data.getMostCommonDamageI());
            }
            if ((da = in.getMostCommonDamage()) == null) {
                return;
            }
            data.addGlobalResistance(da);
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(in.posX, in.posY, in.posZ, in.width, in.height, 4));
        }
    }

    @Deprecated
    public static SRPExplosion createExplotion(World worldIn, @Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking) {
        ModCompatibility.warnAddonDeprecatedFunction("createExplotion(World worldIn,@Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking)", "createExplosion(World worldIn,@Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking)");
        SRPExplosion explosion = new SRPExplosion(worldIn, entityIn, x, y, z, strength, false, isSmoking);
        if (ForgeEventFactory.onExplosionStart((World)worldIn, (Explosion)explosion)) {
            return explosion;
        }
        explosion.doExplosionA();
        explosion.doExplosionB(false);
        return explosion;
    }

    public static SRPExplosion createExplosion(World worldIn, @Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking) {
        SRPExplosion explosion = new SRPExplosion(worldIn, entityIn, x, y, z, strength, false, isSmoking);
        if (ForgeEventFactory.onExplosionStart((World)worldIn, (Explosion)explosion)) {
            return explosion;
        }
        explosion.doExplosionA();
        explosion.doExplosionB(false);
        return explosion;
    }

    public static boolean teleportDigging(EntityParasiteBase in, float maxHardness, BlockPos posIn, int range, int mini) {
        if (!in.isPotionActive(MobEffects.SLOWNESS)) {
            in.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 80, 4, false, false));
            return false;
        }
        Random rand = new Random();
        double x = posIn.getX();
        double y = posIn.getY();
        double z = posIn.getZ();
        double randomx = rand.nextInt(range) + mini;
        double randomz = rand.nextInt(range) + mini;
        double negative = rand.nextInt(2);
        if (negative == 0.0) {
            randomx *= -1.0;
        }
        if ((negative = (double)rand.nextInt(2)) == 0.0) {
            randomz *= -1.0;
        }
        int limit = 0;
        boolean flag = true;
        while (flag) {
            if (limit >= 5) {
                return false;
            }
            BlockPos pos = new BlockPos(x + randomx, y, z + randomz);
            if ((pos = ParasiteEventEntity.getFloor(in.world, pos, 5)) != null && in.world.getBlockState(pos.down()).isFullCube()) {
                float bHard = 0.0f;
                for (int i = 1; i < 4; ++i) {
                    IBlockState state = in.world.getBlockState(pos.down(i));
                    float atm = state.getBlockHardness(in.world, pos.down(i));
                    if (atm <= 0.0f) {
                        return false;
                    }
                    bHard += atm;
                }
                if (bHard >= maxHardness) {
                    return false;
                }
                AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow(1.0);
                List moblist = in.world.getEntitiesWithinAABB(EntityNak.class, axisalignedbb);
                if (moblist.isEmpty()) {
                    in.setLocationAndAngles((double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, in.rotationYaw, in.rotationPitch);
                    flag = false;
                    return true;
                }
            }
            randomx = rand.nextInt(range) + mini;
            randomz = rand.nextInt(range) + mini;
            negative = rand.nextInt(2);
            if (negative == 0.0) {
                randomx *= -1.0;
            }
            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                randomz *= -1.0;
            }
            ++limit;
        }
        return false;
    }
}

