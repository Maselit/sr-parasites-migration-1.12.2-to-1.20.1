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
        ClassInheritanceMultiMap[] arrayE = world.func_175726_f(pos).func_177429_s();
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
        ResourceLocation enti = EntityList.func_191301_a((Entity)entity);
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
            Potion potionE = Potion.func_180142_b((String)here[3]);
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
                in.func_70690_d(new PotionEffect(potionE, duration, amp, false, false));
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
        if (entityin.field_70128_L) {
            return;
        }
        boolean flag = entityin.func_70027_ad();
        entityin.func_70106_y();
        entityout.func_70012_b(entityin.field_70165_t, entityin.field_70163_u, entityin.field_70161_v, entityin.field_70177_z, entityin.field_70125_A);
        entityout.func_180482_a(entityin.field_70170_p.func_175649_E(new BlockPos((Entity)entityout)), null);
        entityout.cannotDespawn(entityin.func_70692_ba());
        if (entityin.func_145818_k_()) {
            entityout.func_96094_a(entityin.func_95999_t());
            entityout.func_174805_g(entityin.func_174833_aM());
        }
        entityin.field_70170_p.func_72838_d((Entity)entityout);
        if (entityin instanceof EntityPMalleable && entityout instanceof EntityPMalleable) {
            ((EntityPMalleable)entityout).copyResistancesFrom((EntityPMalleable)entityin);
        }
        if (effects) {
            entityout.particleStatus((byte)7);
        }
        if (thunder && SRPConfig.thunderEnable) {
            entityout.field_70170_p.func_72942_c((Entity)new EntityLightningBolt(entityout.field_70170_p, entityout.field_70165_t, entityout.field_70163_u, entityout.field_70161_v, true));
        }
        if (flag) {
            entityout.func_70606_j(entityout.func_110138_aP() * 0.5f);
            entityout.func_70015_d(8);
        }
    }

    public static void spawnM(EntityParasiteBase entityin, String[] out, int particle, boolean cannotDespawn, String name) {
        if (!entityin.field_70170_p.field_72995_K) {
            Random rand = new Random();
            double x = entityin.field_70165_t;
            double y = entityin.field_70163_u;
            double z = entityin.field_70161_v;
            for (String s : out) {
                if (s == null) continue;
                String[] entityC = s.split(";");
                int max = Integer.parseInt(entityC[1]);
                int min = Integer.parseInt(entityC[2]);
                int total = min == max ? min : rand.nextInt(max - min + 1) + min;
                ResourceLocation entityR = new ResourceLocation(entityC[0]);
                for (int count = 0; count < total; ++count) {
                    EntityLiving entityout = (EntityLiving)EntityList.func_188429_b((ResourceLocation)entityR, (World)entityin.field_70170_p);
                    if (entityout == null) {
                        return;
                    }
                    entityout.func_70012_b(x, y + (double)(entityin.field_70131_O / 2.0f) + 0.5, z, entityin.field_70177_z, entityin.field_70125_A);
                    entityout.func_180482_a(entityin.field_70170_p.func_175649_E(new BlockPos((Entity)entityout)), null);
                    if (entityout instanceof EntityParasiteBase && cannotDespawn) {
                        EntityParasiteBase parasite = (EntityParasiteBase)entityout;
                        parasite.cannotDespawn(SRPConfig.convertedDespawn);
                        entityin.field_70170_p.func_72838_d((Entity)parasite);
                        continue;
                    }
                    entityin.field_70170_p.func_72838_d((Entity)entityout);
                }
            }
        }
    }

    public static boolean SummonM(EntityParasiteBase entityin, String[] out, int range, @Nullable EntityLivingBase target) {
        if (!entityin.field_70170_p.field_72995_K) {
            Random rand = new Random();
            double x = entityin.field_70165_t;
            double y = entityin.field_70163_u;
            double z = entityin.field_70161_v;
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
                        if (entityin.field_70170_p.func_180495_p(new BlockPos(x + randomx, y, z + randomz)).func_177230_c() == Blocks.field_150350_a && entityin.field_70170_p.func_180495_p(new BlockPos(x + randomx, y - 1.0, z + randomz)).func_177230_c() != Blocks.field_150350_a) {
                            EntityLiving entityout = (EntityLiving)EntityList.func_188429_b((ResourceLocation)new ResourceLocation(entityC[0]), (World)entityin.field_70170_p);
                            if (entityout == null) {
                                return false;
                            }
                            entityout.func_70012_b(x + randomx, y, z + randomz, entityin.field_70177_z, entityin.field_70125_A);
                            if (!entityin.field_70170_p.func_184144_a((Entity)entityout, entityout.func_174813_aQ()).isEmpty()) {
                                entityout.func_70106_y();
                                ++index;
                                continue;
                            }
                            entityout.func_180482_a(entityin.field_70170_p.func_175649_E(new BlockPos((Entity)entityout)), null);
                            if (entityin instanceof EntityCanSummon) {
                                EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                                int points = Integer.parseInt(entityC[2]);
                                if (father.getTotalParasites() - father.getActualParasites() < points) {
                                    entityout.func_70106_y();
                                    ++index;
                                    continue;
                                }
                                father.setActualParasites(points);
                                father.addID(entityout.func_145782_y(), points);
                            }
                            if (entityout instanceof EntityPStationaryArchitect) {
                                if (SRPConfigSystems.rsSky && !entityout.field_70170_p.func_175678_i(new BlockPos(entityout.field_70165_t, entityout.field_70163_u + (double)entityout.func_70047_e(), entityout.field_70161_v))) {
                                    randomx = rand.nextInt(range);
                                    randomz = rand.nextInt(range);
                                    negative = rand.nextInt(2);
                                    if (negative == 0.0) {
                                        randomx *= -1.0;
                                    }
                                    if ((negative = (double)rand.nextInt(2)) == 0.0) {
                                        randomz *= -1.0;
                                    }
                                    entityout.func_70106_y();
                                    ++index;
                                    continue;
                                }
                                Block looking = entityin.field_70170_p.func_180495_p(entityout.func_180425_c().func_177977_b()).func_177230_c();
                                if (looking == SRPBlocks.InfestedStain) {
                                    entityout.func_70106_y();
                                    return false;
                                }
                                switch (((EntityPStationaryArchitect)entityout).getParasiteIDRegister()) {
                                    case 16: {
                                        EntityVenkrol vOut = (EntityVenkrol)entityout;
                                        vOut.setRSSpawned(true);
                                        entityin.field_70170_p.func_72838_d((Entity)vOut);
                                        if (target != null) {
                                            vOut.func_70624_b(target);
                                        }
                                        entityin.field_70170_p.func_72960_a((Entity)vOut, (byte)50);
                                        flag = false;
                                        break;
                                    }
                                    case 18: {
                                        EntityVenkrolSII vOutii = (EntityVenkrolSII)entityout;
                                        vOutii.setRSSpawned(true);
                                        entityin.field_70170_p.func_72838_d((Entity)vOutii);
                                        if (target != null) {
                                            vOutii.func_70624_b(target);
                                        }
                                        entityin.field_70170_p.func_72960_a((Entity)vOutii, (byte)50);
                                        flag = false;
                                        break;
                                    }
                                    case 19: {
                                        EntityVenkrolSIII vOutiii = (EntityVenkrolSIII)entityout;
                                        vOutiii.setRSSpawned(true);
                                        entityin.field_70170_p.func_72838_d((Entity)vOutiii);
                                        if (target != null) {
                                            vOutiii.func_70624_b(target);
                                        }
                                        entityin.field_70170_p.func_72960_a((Entity)vOutiii, (byte)50);
                                        flag = false;
                                    }
                                }
                                return true;
                            }
                            entityin.field_70170_p.func_72838_d((Entity)entityout);
                            if (target != null) {
                                entityout.func_70624_b(target);
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
        if (!entityin.field_70170_p.field_72995_K) {
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
                        if (entityin.field_70170_p.func_180495_p(new BlockPos(tx + randomx, ty, tz + randomz)).func_177230_c() == Blocks.field_150350_a && entityin.field_70170_p.func_180495_p(new BlockPos(tx + randomx, ty - 1.0, tz + randomz)).func_177230_c() != Blocks.field_150350_a || pod) {
                            if (pod) {
                                EntityDropPod entityout2 = new EntityDropPod(entityin.field_70170_p);
                                entityout2.func_70012_b(tx + randomx, ty, tz + randomz, entityin.field_70177_z, entityin.field_70125_A);
                                entityout2.setOwner(entityin.getParasiteType());
                                entityin.field_70170_p.func_72838_d((Entity)entityout2);
                                flag = false;
                                return true;
                            }
                            EntityLiving entityout = (EntityLiving)EntityList.func_188429_b((ResourceLocation)new ResourceLocation(entityC[0]), (World)entityin.field_70170_p);
                            if (entityout == null) {
                                return false;
                            }
                            entityout.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(16.0);
                            entityout.func_70012_b(tx + randomx, ty, tz + randomz, entityin.field_70177_z, entityin.field_70125_A);
                            entityout.func_180482_a(entityin.field_70170_p.func_175649_E(new BlockPos((Entity)entityout)), null);
                            if (entityin instanceof EntityCanSummon) {
                                EntityCanSummon father = (EntityCanSummon)((Object)entityin);
                                int points = Integer.parseInt(entityC[2]);
                                if (father.getTotalParasites() - father.getActualParasites() < points) {
                                    ++index;
                                    continue;
                                }
                                father.setActualParasites(points);
                                father.addID(entityout.func_145782_y(), points);
                            }
                            if (entityout instanceof EntityVenkrol) {
                                Block looking = entityin.field_70170_p.func_180495_p(entityout.func_180425_c().func_177977_b()).func_177230_c();
                                if (looking == SRPBlocks.InfestedStain) {
                                    return false;
                                }
                                if (entityin.getParasiteIDRegister() == 41) {
                                    EntityPStationaryArchitect out2 = (EntityPStationaryArchitect)entityout;
                                    out2.setCanGrowTo(false);
                                }
                            }
                            entityin.field_70170_p.func_72838_d((Entity)entityout);
                            if (target != null) {
                                entityout.func_70624_b(target);
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
        EntityLiving entityout = (EntityLiving)EntityList.func_188429_b((ResourceLocation)new ResourceLocation(out[entityin.field_70170_p.field_73012_v.nextInt(out.length)]), (World)entityin.field_70170_p);
        if (entityout == null) {
            return;
        }
        entityout.func_82149_j(entityin);
        entityout.func_180482_a(entityin.field_70170_p.func_175649_E(new BlockPos((Entity)entityout)), null);
        entityin.field_70170_p.func_72838_d((Entity)entityout);
        if (target != null) {
            entityout.func_70624_b(target);
        }
    }

    public static boolean spawnBiomassFromProjectile(EntityParasiteBase entityin, String[] out, @Nullable EntityLivingBase target) {
        if (!entityin.field_70170_p.field_72995_K) {
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
                        Vec3d vec3d = entityin.func_70676_i(1.0f);
                        double d2 = target.field_70165_t - (entityin.field_70165_t + vec3d.field_72450_a);
                        double d3 = target.func_174813_aQ().field_72338_b + (double)(target.field_70131_O / 2.0f) - (0.5 + entityin.field_70163_u + (double)(entityin.field_70131_O / 2.0f));
                        double d4 = target.field_70161_v - (entityin.field_70161_v + vec3d.field_72449_c);
                        EntityProjectileBiomass entityout = new EntityProjectileBiomass(entityin.field_70170_p, (EntityLivingBase)entityin, d2, d3, d4);
                        entityout.field_70165_t = entityin.field_70165_t + vec3d.field_72450_a;
                        entityout.field_70163_u = entityin.field_70163_u + (double)entityin.func_70047_e() - 0.2;
                        entityout.field_70161_v = entityin.field_70161_v + vec3d.field_72449_c;
                        entityout.setParasite(entityC[0], points, 4);
                        father.setActualParasites(points);
                        father.addID(entityout.func_145782_y(), points);
                        entityin.field_70170_p.func_72838_d((Entity)entityout);
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
        if (!entityin.field_70170_p.field_72995_K) {
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
                        EntityBiomass entityout = new EntityBiomass(entityin.field_70170_p, entityin, target);
                        entityout.func_70012_b(entityin.field_70165_t, entityin.field_70163_u, entityin.field_70161_v, entityin.field_70177_z, entityin.field_70125_A);
                        float f19 = MathHelper.func_76126_a((float)(entityin.field_70177_z * ((float)Math.PI / 180) - entityin.field_70704_bt * 0.01f));
                        float f14 = 0.17453292f;
                        float f16 = MathHelper.func_76134_b((float)f14);
                        float f4 = MathHelper.func_76134_b((float)(entityin.field_70177_z * ((float)Math.PI / 180) - entityin.field_70704_bt * 0.01f));
                        entityout.field_70177_z = entityin.field_70177_z;
                        if (entityout.field_70170_p.func_180495_p(new BlockPos(entityin.field_70165_t + -1.0 * (double)(f19 * 3.0f * f16), entityin.field_70163_u + (double)entityin.func_70047_e(), entityin.field_70161_v - -1.0 * (double)(f4 * 3.0f * f16))).func_177230_c() != Blocks.field_150350_a) {
                            entityout.func_70106_y();
                            return false;
                        }
                        entityout.func_70107_b(entityin.field_70165_t + -1.0 * (double)(f19 * 3.0f * f16), entityin.field_70163_u + (double)entityin.func_70047_e(), entityin.field_70161_v - -1.0 * (double)(f4 * 3.0f * f16));
                        entityout.setFuse(80);
                        entityout.setParasite(entityC[0], points);
                        if (entityin instanceof EntityCanra) {
                            entityout.setSkin(5);
                        } else {
                            entityout.setSkin(6);
                        }
                        father.setActualParasites(points);
                        father.addID(entityout.func_145782_y(), points);
                        if (entityin.func_70027_ad()) {
                            entityout.func_70015_d(8);
                        }
                        entityin.field_70170_p.func_72838_d((Entity)entityout);
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
        if (!entityin.field_70170_p.field_72995_K) {
            String[] mobListG = ground;
            if (entityin.field_70163_u + 3.0 <= target.field_70163_u) {
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
                        EntityBiomass entityout = new EntityBiomass(entityin.field_70170_p, entityin, stage, target, payfather);
                        entityout.func_70012_b(entityin.field_70165_t, entityin.field_70163_u + ((double)entityin.func_70047_e() + b), entityin.field_70161_v, entityin.field_70177_z, entityin.field_70125_A);
                        double d0 = (float)entityin.field_70165_t + entityin.field_70170_p.field_73012_v.nextFloat();
                        double d1 = (float)entityin.field_70163_u + entityin.func_70047_e() + entityin.field_70170_p.field_73012_v.nextFloat();
                        double d2 = (float)entityin.field_70161_v + entityin.field_70170_p.field_73012_v.nextFloat();
                        double d3 = d0 - entityin.field_70165_t;
                        double d4 = d1 - entityin.field_70163_u;
                        double d5 = d2 - entityin.field_70161_v;
                        double d6 = MathHelper.func_76133_a((double)(d3 * d3 + d4 * d4 + d5 * d5));
                        d3 /= d6;
                        d4 /= d6;
                        d5 /= d6;
                        double d7 = 0.5 / (d6 / 4.0 + 0.1);
                        d7 *= (double)(entityin.field_70170_p.field_73012_v.nextFloat() * entityin.field_70170_p.field_73012_v.nextFloat() + 1.7f);
                        double k = 3.0;
                        if (stage == 3) {
                            k = 5.0;
                        }
                        entityout.setMotion(d3 *= d7 * k, d4 *= d7 * 2.0, d5 *= d7 * k, 0.4, 0.5);
                        entityout.setFuse(80);
                        entityout.setParasite(entityC[0], points);
                        entityout.setSkin(stage);
                        if (entityin.func_70027_ad()) {
                            entityout.func_70015_d(8);
                        }
                        entityin.field_70170_p.func_72838_d((Entity)entityout);
                        if (payfather) {
                            father.setActualParasites(points);
                            father.addID(entityout.func_145782_y(), points);
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
        if (SRPSaveData.get(entityin.field_70170_p).getEvolutionPhase(entityin.field_71093_bK) >= SRPConfigSystems.evolutionFeralNoSim && ParasiteEventEntity.convertEntityFeral(entityin, tags, true, list)) {
            return;
        }
        if (tags.func_74764_b("srpcothimmunity")) {
            String mobname;
            int key = tags.func_74762_e("srpcothimmunity");
            if (key == 0 && !ignoreKey) {
                entityin.func_184596_c(SRPPotions.COTH_E);
                return;
            }
            entityin.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 100, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entityin.field_70165_t, entityin.field_70163_u, entityin.field_70161_v, entityin.field_70130_N, entityin.field_70131_O, 1));
            tags.func_74768_a("srpcothimmunity", ++key);
            if (key < 3 && !ignoreKey) {
                return;
            }
            World world = entityin.field_70170_p;
            if (world.field_72995_K) {
                return;
            }
            try {
                mobname = EntityList.func_191301_a((Entity)entityin).toString();
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
                Entity outOne = EntityList.func_188429_b((ResourceLocation)new ResourceLocation(here[1]), (World)world);
                if (outOne == null) {
                    ParasiteEventEntity.spawnInsider(entityin, world, tags);
                    return;
                }
                if (outOne instanceof EntityPInfected) {
                    entityout = (EntityPInfected)outOne;
                    SRPSaveData.get(world).addNumberIDDataSpawn(entityout.getParasiteIDRegister());
                    entityout.func_82149_j((Entity)entityin);
                    world.func_72900_e((Entity)entityin);
                    entityout.setHost(mobname);
                    entityout.func_180482_a(world.func_175649_E(new BlockPos((Entity)entityout)), null);
                    if (entityin.func_145818_k_()) {
                        entityout.func_96094_a(entityin.func_95999_t());
                        entityout.func_174805_g(entityin.func_174833_aM());
                    }
                    world.func_72838_d((Entity)entityout);
                    world.func_180498_a(null, 1026, new BlockPos((Entity)entityout), 0);
                    entityout.particleStatus((byte)7);
                    entityout.cannotDespawn(SRPConfig.convertedDespawn);
                    if (key >= 10) {
                        entityout.func_70690_d(new PotionEffect(SRPPotions.EPEL_E, 600, 0, false, false));
                    }
                } else if (outOne instanceof EntityLiving) {
                    entityout = (EntityLiving)outOne;
                    entityout.func_82149_j((Entity)entityin);
                    world.func_72900_e((Entity)entityin);
                    entityout.func_180482_a(world.func_175649_E(new BlockPos((Entity)entityout)), null);
                    if (entityin.func_145818_k_()) {
                        entityout.func_96094_a(entityin.func_95999_t());
                        entityout.func_174805_g(entityin.func_174833_aM());
                    }
                    world.func_72838_d((Entity)entityout);
                    world.func_180498_a(null, 1026, new BlockPos((Entity)entityout), 0);
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
        List serverList = world.field_72996_f;
        int count = 0;
        for (Entity value : serverList) {
            if (!(value instanceof EntityInhooM) && !(value instanceof EntityInhooS)) continue;
            ++count;
        }
        if (count > SRPConfig.incompleteCap) {
            world.func_72900_e((Entity)entity);
            return;
        }
        if (tags.func_74764_b("srpcothimmunity")) {
            int key = tags.func_74762_e("srpcothimmunity");
            if (key == 0) {
                entity.func_184596_c(SRPPotions.COTH_E);
                return;
            }
            entity.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 100, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, entity.field_70130_N, entity.field_70131_O, 1));
            tags.func_74768_a("srpcothimmunity", ++key);
            if (key < 3) {
                return;
            }
            EntityPCrude out = new EntityInhooS(world);
            float mass = ParasiteEventEntity.getEntityArea(entity);
            if ((double)mass > 0.517) {
                out = new EntityInhooM(world);
            }
            out.func_82149_j((Entity)entity);
            world.func_72900_e((Entity)entity);
            world.func_72838_d((Entity)out);
            world.func_180498_a(null, 1026, new BlockPos((Entity)out), 0);
            out.particleStatus((byte)7);
            out.cannotDespawn(SRPConfig.convertedDespawn);
        }
    }

    private static float getEntityArea(EntityLivingBase entity) {
        return entity.field_70130_N * entity.field_70130_N * entity.field_70131_O;
    }

    public static boolean convertEntityFeral(EntityLivingBase entityin, NBTTagCompound tags, boolean ignoreKey, String[] list) {
        if (entityin == null) {
            return false;
        }
        if (tags.func_74764_b("srpcothimmunity")) {
            String mobname;
            int key = tags.func_74762_e("srpcothimmunity");
            if (key == 0 && !ignoreKey) {
                entityin.func_184596_c(SRPPotions.COTH_E);
                return false;
            }
            entityin.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 100, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entityin.field_70165_t, entityin.field_70163_u, entityin.field_70161_v, entityin.field_70130_N, entityin.field_70131_O, 1));
            tags.func_74768_a("srpcothimmunity", ++key);
            if (key < 3 && !ignoreKey) {
                return false;
            }
            World world = entityin.field_70170_p;
            if (world.field_72995_K) {
                return false;
            }
            try {
                mobname = EntityList.func_191301_a((Entity)entityin).toString();
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
                Entity outOne = EntityList.func_188429_b((ResourceLocation)new ResourceLocation(here[1]), (World)world);
                if (outOne == null) {
                    ParasiteEventEntity.spawnInsider(entityin, world, tags);
                    return false;
                }
                if (outOne instanceof EntityPInfected) {
                    EntityPFeral gaa = ((EntityPInfected)outOne).getFeral();
                    if (gaa != null) {
                        outOne.func_70106_y();
                        gaa.func_82149_j((Entity)entityin);
                        world.func_72900_e((Entity)entityin);
                        gaa.func_180482_a(world.func_175649_E(new BlockPos((Entity)gaa)), null);
                        if (entityin.func_145818_k_()) {
                            gaa.func_96094_a(entityin.func_95999_t());
                            gaa.func_174805_g(entityin.func_174833_aM());
                        }
                        world.func_72838_d((Entity)gaa);
                        world.func_180498_a(null, 1026, new BlockPos((Entity)gaa), 0);
                        gaa.particleStatus((byte)7);
                        gaa.cannotDespawn(SRPConfig.convertedDespawn);
                    } else {
                        EntityPInfected entityout = (EntityPInfected)outOne;
                        SRPSaveData.get(world).addNumberIDDataSpawn(entityout.getParasiteIDRegister());
                        entityout.func_82149_j((Entity)entityin);
                        world.func_72900_e((Entity)entityin);
                        entityout.setHost(mobname);
                        entityout.func_180482_a(world.func_175649_E(new BlockPos((Entity)entityout)), null);
                        if (entityin.func_145818_k_()) {
                            entityout.func_96094_a(entityin.func_95999_t());
                            entityout.func_174805_g(entityin.func_174833_aM());
                        }
                        world.func_72838_d((Entity)entityout);
                        world.func_180498_a(null, 1026, new BlockPos((Entity)entityout), 0);
                        entityout.particleStatus((byte)7);
                        entityout.cannotDespawn(SRPConfig.convertedDespawn);
                        if (key >= 10) {
                            entityout.func_70690_d(new PotionEffect(SRPPotions.EPEL_E, 600, 0, false, false));
                        }
                    }
                    return true;
                }
                if (outOne instanceof EntityLiving) {
                    EntityLiving entityout = (EntityLiving)outOne;
                    entityout.func_82149_j((Entity)entityin);
                    world.func_72900_e((Entity)entityin);
                    entityout.func_180482_a(world.func_175649_E(new BlockPos((Entity)entityout)), null);
                    if (entityin.func_145818_k_()) {
                        entityout.func_96094_a(entityin.func_95999_t());
                        entityout.func_174805_g(entityin.func_174833_aM());
                    }
                    world.func_72838_d((Entity)entityout);
                    world.func_180498_a(null, 1026, new BlockPos((Entity)entityout), 0);
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
        World world = entityin.field_70170_p;
        if (world.field_72995_K) {
            return false;
        }
        try {
            mobname = EntityList.func_191301_a((Entity)entityin).toString();
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
            Entity outOne = EntityList.func_188429_b((ResourceLocation)new ResourceLocation(here[1]), (World)world);
            if (outOne == null) {
                return false;
            }
            if (outOne instanceof EntityPHijacked) {
                entityout = (EntityPHijacked)outOne;
                SRPSaveData.get(world).addNumberIDDataSpawn(entityout.getParasiteIDRegister());
                entityout.func_82149_j((Entity)entityin);
                world.func_72900_e((Entity)entityin);
                entityout.func_180482_a(world.func_175649_E(new BlockPos((Entity)entityout)), null);
                if (entityin.func_145818_k_()) {
                    entityout.func_96094_a(entityin.func_95999_t());
                    entityout.func_174805_g(entityin.func_174833_aM());
                }
                world.func_72838_d((Entity)entityout);
                world.func_180498_a(null, 1026, new BlockPos((Entity)entityout), 0);
                entityout.particleStatus((byte)7);
                entityout.cannotDespawn(SRPConfig.convertedDespawn);
            } else if (outOne instanceof EntityLiving) {
                entityout = (EntityLiving)outOne;
                entityout.func_82149_j((Entity)entityin);
                world.func_72900_e((Entity)entityin);
                entityout.func_180482_a(world.func_175649_E(new BlockPos((Entity)entityout)), null);
                if (entityin.func_145818_k_()) {
                    entityout.func_96094_a(entityin.func_95999_t());
                    entityout.func_174805_g(entityin.func_174833_aM());
                }
                world.func_72838_d((Entity)entityout);
                world.func_180498_a(null, 1026, new BlockPos((Entity)entityout), 0);
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
                        SRPWorldData data = SRPWorldData.get(entityin.field_70170_p);
                        SRPSaveData.get(entityin.field_70170_p).setTotalKills(entityin.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueMerge, true, entityin.field_70170_p, true);
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
                    SRPSaveData.get(entityin.field_70170_p).setTotalKills(entityin.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueMerge, true, entityin.field_70170_p, true);
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
                        SRPSaveData.get(entityin.field_70170_p).setTotalKills(entityin.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueMerge, true, entityin.field_70170_p, true);
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
        if (worldIn.func_180495_p(pos).func_177230_c() == Blocks.field_150350_a) {
            if (worldIn.func_180495_p(pos.func_177977_b()).func_177230_c() != Blocks.field_150350_a) {
                return pos;
            }
            return ParasiteEventEntity.getFloor(worldIn, pos.func_177977_b(), loop);
        }
        return ParasiteEventEntity.getFloor(worldIn, pos.func_177984_a(), loop);
    }

    public static BlockPos getFloorBuilding(World worldIn, BlockPos pos, int loop) {
        if (loop <= 0) {
            return null;
        }
        --loop;
        if (!worldIn.func_180495_p(pos).func_185913_b()) {
            if (worldIn.func_180495_p(pos.func_177977_b()).func_185913_b() && !(worldIn.func_180495_p(pos.func_177977_b()).func_177230_c() instanceof BlockBush) && !(worldIn.func_180495_p(pos.func_177977_b()).func_177230_c() instanceof BlockLeaves) && !(worldIn.func_180495_p(pos.func_177977_b()).func_177230_c() instanceof BlockLog)) {
                return pos;
            }
            return ParasiteEventEntity.getFloorBuilding(worldIn, pos.func_177977_b(), loop);
        }
        if (worldIn.func_180495_p(pos).func_177230_c() instanceof BlockBush || worldIn.func_180495_p(pos).func_177230_c() instanceof BlockLeaves || worldIn.func_180495_p(pos).func_177230_c() instanceof BlockLog) {
            return ParasiteEventEntity.getFloorBuilding(worldIn, pos.func_177979_c(1), loop);
        }
        return ParasiteEventEntity.getFloorBuilding(worldIn, pos.func_177984_a(), loop);
    }

    public static boolean spawnTurrets(EntityLivingBase entityin, int range, byte type, int stage) {
        if (stage <= 2) {
            return false;
        }
        if (entityin.field_70170_p.func_175659_aa() == EnumDifficulty.PEACEFUL) {
            return false;
        }
        Random rand = new Random();
        World world = entityin.field_70170_p;
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
            BlockPos floor = ParasiteEventEntity.getFloor(world, new BlockPos(entityin.field_70165_t + randomx, entityin.field_70163_u, entityin.field_70161_v + randomz), 5);
            if (floor != null && world.func_180495_p(floor.func_177977_b()).func_177230_c() == SRPBlocks.InfestedStain) {
                int flag2 = 0;
                AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)floor.func_177958_n(), (double)floor.func_177956_o(), (double)floor.func_177952_p(), (double)(floor.func_177958_n() + 1), (double)(floor.func_177956_o() + 1), (double)(floor.func_177952_p() + 1)).func_72314_b(42.0, 5.0, 42.0);
                List moblist = world.func_72872_a(EntityParasiteBase.class, axisalignedbb);
                for (EntityParasiteBase mob : moblist) {
                    if (!mob.func_70089_S() || mob.getParasiteType() != 40) continue;
                    ++flag2;
                }
                if (flag2 < 3) {
                    EntityPStationary out;
                    if (type == 1) {
                        if (!SRPConfigMobs.unvoEnabled) {
                            return false;
                        }
                        out = new EntityUnvo(world);
                        out.func_70012_b(floor.func_177958_n(), floor.func_177956_o(), floor.func_177952_p(), 0.0f, 0.0f);
                        world.func_72838_d((Entity)out);
                        out.func_70624_b(entityin);
                        return true;
                    }
                    if (type == 2) {
                        if (!SRPConfigMobs.tonroEnabled) {
                            return false;
                        }
                        out = new EntityTonro(world);
                        out.func_70012_b(floor.func_177958_n(), floor.func_177956_o(), floor.func_177952_p(), 0.0f, 0.0f);
                        world.func_72838_d((Entity)out);
                        out.func_70624_b(entityin);
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
        List playerEntityList = worldIn.field_73010_i;
        for (EntityPlayer entityPlayer : playerEntityList) {
            entityPlayer.func_145747_a((ITextComponent)new TextComponentString(message));
            SRPMain.network.sendToDimension((IMessage)new SRPPacketMovingSound(warning), worldIn.field_73011_w.getDimension());
        }
        if (warning == -7 && message.equals("Phase decreased")) {
            List serverList = worldIn.field_72996_f;
            for (Entity entity : serverList) {
                if (!(entity instanceof EntityParasiteBase)) continue;
                ((EntityParasiteBase)entity).func_70690_d(new PotionEffect(SRPPotions.RAGE_E, 2400, 1, false, false));
            }
        }
    }

    public static void alertAllPlayerSer(String message, World w) {
        List playerEntityList = w.func_73046_m().func_184103_al().func_181057_v();
        for (EntityPlayerMP entityPlayerMP : playerEntityList) {
            entityPlayerMP.func_145747_a((ITextComponent)new TextComponentString(message));
        }
    }

    public static boolean spawnFromBlock(World world, String[] out, int range, BlockPos pos) {
        if (!world.field_72995_K) {
            Random rand = new Random();
            double x = pos.func_177958_n();
            double y = pos.func_177956_o();
            double z = pos.func_177952_p();
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
                            EntityLiving entityout = (EntityLiving)EntityList.func_188429_b((ResourceLocation)new ResourceLocation(entityC[0]), (World)world);
                            if (entityout == null) {
                                return false;
                            }
                            entityout.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(16.0);
                            entityout.func_70012_b((double)helper.func_177958_n(), (double)helper.func_177956_o(), (double)helper.func_177952_p(), 0.0f, 0.0f);
                            entityout.func_180482_a(world.func_175649_E(helper), null);
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
                            world.func_72838_d((Entity)entityout);
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
        if (in.field_70130_N <= 1.0f && in.field_70131_O <= 1.0f) {
            return;
        }
        if (SRPConfigSystems.rsEnabled) {
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(in.field_70165_t, in.field_70163_u, in.field_70161_v, in.field_70165_t + 1.0, in.field_70163_u + 1.0, in.field_70161_v + 1.0).func_72314_b((double)(SRPConfigMobs.venkrolsiiiRange - 1), (double)SRPConfigMobs.venkrolsiiiRangeY, (double)(SRPConfigMobs.venkrolsiiiRange - 1));
            List moblist = world.func_72872_a(EntityPStationaryArchitect.class, axisalignedbb);
            if (!moblist.isEmpty()) {
                return;
            }
            if (ParasiteEventEntity.entityChunkCount(world, in.func_180425_c(), EntityPStationaryArchitect.class) >= SRPConfigSystems.rsMaxVenkrolChunk) {
                return;
            }
            SRPWorldData data = SRPWorldData.get(world);
            if (SRPConfigSystems.rsPlayer) {
                if (cause.func_76346_g() instanceof EntityPlayer) {
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
        long worldT = world.func_72820_D();
        long seconds = (worldT - SRPAttributes.lastTimeD1) / 20L;
        Random rand = new Random();
        if (rand.nextDouble() < chance && data.getCurrentV() < SRPConfigSystems.rsMaxVenkrols && (long)SRPConfigSystems.rsCooldown < Math.abs(seconds) && ParasiteEventEntity.SummonM(in, new String[]{ParasiteEventEntity.getRSColony(data)}, 7, in.func_70638_az())) {
            if (SRPConfigSystems.rsSounds) {
                in.func_184185_a(SRPSounds.VENKROLSI, 4.0f, 1.0f);
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
        switch (SRPSaveData.get(world).getEvolutionPhase(world.field_73011_w.getDimension())) {
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
        switch (SRPSaveData.get(world).getEvolutionPhase(world.field_73011_w.getDimension())) {
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
        if (!target.func_70089_S()) {
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
        double d0 = pin.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111126_e();
        for (EntityParasiteBase entitycreature : world.func_72872_a(EntityParasiteBase.class, new AxisAlignedBB(pin.field_70165_t, pin.field_70163_u, pin.field_70161_v, pin.field_70165_t + 1.0, pin.field_70163_u + 1.0, pin.field_70161_v + 1.0).func_72314_b(d0, 10.0, d0))) {
            if (pin == entitycreature || !entitycreature.func_70089_S() || entitycreature instanceof IRangedAttackMob || entitycreature instanceof EntityPStationary || entitycreature instanceof EntityBiomass || entitycreature instanceof EntityCanFly || entitycreature.func_70638_az() != null && entitycreature.func_70638_az().func_70089_S()) continue;
            if (entitycreature.func_70685_l((Entity)target)) {
                if (SRPPotions.applySense((EntityLivingBase)entitycreature, 200, entitycreature.func_70068_e((Entity)target), cap)) {
                    entitycreature.func_70624_b(target);
                    ParasiteEventEntity.alertOthers(entitycreature, target, world, loop);
                    continue;
                }
                if (!SRPPotions.applySense((EntityLivingBase)entitycreature, 200, entitycreature.func_70068_e((Entity)pin), cap)) continue;
                entitycreature.func_70624_b((EntityLivingBase)pin);
                ParasiteEventEntity.alertOthers(entitycreature, target, world, loop);
                continue;
            }
            if (!SRPPotions.applySense((EntityLivingBase)entitycreature, 200, entitycreature.func_70068_e((Entity)pin), cap)) continue;
            entitycreature.func_70624_b((EntityLivingBase)pin);
            ParasiteEventEntity.alertOthers(entitycreature, target, world, loop);
        }
        return false;
    }

    public static void leaveScent(World world, DamageSource cause, EntityParasiteBase in) {
        if (!SRPConfigSystems.useScent) {
            return;
        }
        if (SRPConfigSystems.scentPlayer ? !(cause.func_76346_g() instanceof EntityPlayer) : !(cause.func_76346_g() instanceof EntityLivingBase)) {
            return;
        }
        if (world.field_73012_v.nextDouble() < SRPConfigSystems.scentDeathSpawning) {
            return;
        }
        if (SRPConfigSystems.useEvolution && in.getPhaseCreated() < SRPConfigSystems.evolutionOneMind) {
            return;
        }
        List serverList = world.field_72996_f;
        int count = 0;
        for (Entity entity : serverList) {
            if (!(entity instanceof EntityParasiticScent)) continue;
            ++count;
        }
        if (count > SRPConfigSystems.scentCap) {
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(in.field_70165_t, in.field_70163_u, in.field_70161_v, in.field_70165_t + 1.0, in.field_70163_u + 1.0, in.field_70161_v + 1.0).func_186662_g(64.0);
        List moblist1 = world.func_72872_a(EntityParasiticScent.class, axisalignedbb);
        for (EntityParasiticScent mob : moblist1) {
            if (!in.func_70685_l(mob)) continue;
            mob.increaseDanger(in.getCCDeathValue(), true);
            mob.increaseActivity(1, true);
            mob.setScentLife(mob.getScentLife() + 20 * SRPConfigSystems.scentLifeDeath);
            mob.setScentReaction(ParasiteEventEntity.getScentReactionBonus(in.getPhaseCreated()), false);
            mob.setTargetToKill((EntityLivingBase)cause.func_76346_g(), true);
            if (cause.func_76346_g() instanceof EntityPlayer) {
                ((EntityPlayer)cause.func_76346_g()).func_146105_b((ITextComponent)new TextComponentString("Closest Scent was notified"), true);
            }
            return;
        }
        axisalignedbb = new AxisAlignedBB(in.field_70165_t, in.field_70163_u, in.field_70161_v, in.field_70165_t + 1.0, in.field_70163_u + 1.0, in.field_70161_v + 1.0).func_186662_g(64.0);
        List moblist2 = world.func_72872_a(EntityParasiteBase.class, axisalignedbb);
        int dangerValue = in.getCCDeathValue() + ParasiteEventEntity.getScentBonus(in.getPhaseCreated());
        if (moblist2.size() <= 3 && in.getPhaseCreated() >= 0 && in.getCCDeathValue() > 2) {
            EntityParasiticScent nut = new EntityParasiticScent(world, 0, (EntityLivingBase)cause.func_76346_g());
            nut.func_82149_j(cause.func_76346_g());
            nut.setScentLife(SRPConfigSystems.scentLifeObserver * 20);
            nut.increaseDanger(dangerValue, true);
            nut.setScentReaction(ParasiteEventEntity.getScentReactionBonus(in.getPhaseCreated()), false);
            world.func_72838_d((Entity)nut);
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
        if (in.func_70027_ad() || !SRPConfigWorld.coloniesActivated) {
            return;
        }
        if (ParasiteEventWorld.numberofColonies(world) <= 0) {
            return;
        }
        double chance = 0.0;
        if (in.func_70644_a(SRPPotions.LINK_E)) {
            chance = (double)(in.func_70660_b(SRPPotions.LINK_E).func_76458_c() + 1) * SRPConfigSystems.adapsChance;
        }
        if (ParasiteEventWorld.rangeOfColony(world, in.func_180425_c(), true) != null || world.field_73012_v.nextDouble() < chance) {
            String da;
            SRPWorldData data = SRPWorldData.get(world);
            if (in.colonySpawned) {
                in.removeCommonDamage(data.getMostCommonDamageS(), data.getMostCommonDamageI());
            }
            if ((da = in.getMostCommonDamage()) == null) {
                return;
            }
            data.addGlobalResistance(da);
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(in.field_70165_t, in.field_70163_u, in.field_70161_v, in.field_70130_N, in.field_70131_O, 4));
        }
    }

    @Deprecated
    public static SRPExplosion createExplotion(World worldIn, @Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking) {
        ModCompatibility.warnAddonDeprecatedFunction("createExplotion(World worldIn,@Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking)", "createExplosion(World worldIn,@Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking)");
        SRPExplosion explosion = new SRPExplosion(worldIn, entityIn, x, y, z, strength, false, isSmoking);
        if (ForgeEventFactory.onExplosionStart((World)worldIn, (Explosion)explosion)) {
            return explosion;
        }
        explosion.func_77278_a();
        explosion.func_77279_a(false);
        return explosion;
    }

    public static SRPExplosion createExplosion(World worldIn, @Nullable Entity entityIn, double x, double y, double z, float strength, boolean isSmoking) {
        SRPExplosion explosion = new SRPExplosion(worldIn, entityIn, x, y, z, strength, false, isSmoking);
        if (ForgeEventFactory.onExplosionStart((World)worldIn, (Explosion)explosion)) {
            return explosion;
        }
        explosion.func_77278_a();
        explosion.func_77279_a(false);
        return explosion;
    }

    public static boolean teleportDigging(EntityParasiteBase in, float maxHardness, BlockPos posIn, int range, int mini) {
        if (!in.func_70644_a(MobEffects.field_76421_d)) {
            in.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 80, 4, false, false));
            return false;
        }
        Random rand = new Random();
        double x = posIn.func_177958_n();
        double y = posIn.func_177956_o();
        double z = posIn.func_177952_p();
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
            if ((pos = ParasiteEventEntity.getFloor(in.field_70170_p, pos, 5)) != null && in.field_70170_p.func_180495_p(pos.func_177977_b()).func_185917_h()) {
                float bHard = 0.0f;
                for (int i = 1; i < 4; ++i) {
                    IBlockState state = in.field_70170_p.func_180495_p(pos.func_177979_c(i));
                    float atm = state.func_185887_b(in.field_70170_p, pos.func_177979_c(i));
                    if (atm <= 0.0f) {
                        return false;
                    }
                    bHard += atm;
                }
                if (bHard >= maxHardness) {
                    return false;
                }
                AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), (double)(pos.func_177958_n() + 1), (double)(pos.func_177956_o() + 1), (double)(pos.func_177952_p() + 1)).func_186662_g(1.0);
                List moblist = in.field_70170_p.func_72872_a(EntityNak.class, axisalignedbb);
                if (moblist.isEmpty()) {
                    in.func_70012_b((double)pos.func_177958_n() + 0.5, pos.func_177956_o(), (double)pos.func_177952_p() + 0.5, in.field_70177_z, in.field_70125_A);
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

