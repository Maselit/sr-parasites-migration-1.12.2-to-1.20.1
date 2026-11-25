package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.entity.monster.adapted.*;
import com.dhanantry.scapeandrunparasites.entity.monster.ancient.*;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.*;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.*;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.*;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.*;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.*;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.head.*;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.*;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.*;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.*;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityDropPod;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.init.SRPEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class ItemMobSpawner extends ItemBase {
    private String name;

    public ItemMobSpawner(String name) {
        super("itemmobspawner_" + name, 64, 0);
        this.name = name;
    }

    @Override
    public InteractionResult useOn(net.minecraft.world.item.context.UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        ItemStack itemstack = context.getItemInHand();
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }
        if (player == null || !player.mayUseItemAt(pos.relative(context.getClickedFace()), context.getClickedFace(), itemstack)) {
            return InteractionResult.FAIL;
        }
        BlockPos blockpos = pos.relative(context.getClickedFace());
        double d0 = 0.0;
        Entity entity = this.spawnEntity(level, (double) blockpos.getX() + 0.5, (double) blockpos.getY() + d0, (double) blockpos.getZ() + 0.5, player);
        if (entity != null) {
            if (entity instanceof LivingEntity && itemstack.hasCustomHoverName()) {
                entity.setCustomName(itemstack.getHoverName());
            }
            ItemMobSpawner.applyItemEntityDataToEntity(level, player, itemstack, entity);
            if (player != null && !player.getAbilities().instabuild) {
                itemstack.shrink(1);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (level.isClientSide) {
            return net.minecraft.world.InteractionResultHolder.pass(itemstack);
        }
        HitResult ray = this.getPlayerPOVHitResult(level, player, net.minecraft.world.level.ClipContext.Fluid.SOURCE_ONLY);
        if (ray != null && ray.getType() == HitResult.Type.BLOCK) {
            BlockHitResult bhr = (BlockHitResult) ray;
            BlockPos blockpos = bhr.getBlockPos();
            if (!(level.getBlockState(blockpos).getBlock() instanceof net.minecraft.world.level.block.LiquidBlock)) {
                return net.minecraft.world.InteractionResultHolder.pass(itemstack);
            }
            if (player.mayUseItemAt(blockpos, bhr.getDirection(), itemstack)) {
                Entity entity = this.spawnEntity(level, (double) blockpos.getX() + 0.5, (double) blockpos.getY() + 0.5, (double) blockpos.getZ() + 0.5, player);
                if (entity == null) {
                    return net.minecraft.world.InteractionResultHolder.pass(itemstack);
                }
                if (entity instanceof LivingEntity && itemstack.hasCustomHoverName()) {
                    entity.setCustomName(itemstack.getHoverName());
                }
                ItemMobSpawner.applyItemEntityDataToEntity(level, player, itemstack, entity);
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                player.awardStat(Stats.ITEM_USED.get(this));
                return net.minecraft.world.InteractionResultHolder.success(itemstack);
            }
            return net.minecraft.world.InteractionResultHolder.fail(itemstack);
        }
        return net.minecraft.world.InteractionResultHolder.pass(itemstack);
    }

    public static void applyItemEntityDataToEntity(Level level, Player player, ItemStack stack, Entity targetEntity) {
        if (targetEntity == null) return;
        net.minecraft.nbt.CompoundTag nbt = stack.getTag();
        if (nbt != null && nbt.contains("EntityTag", 10)) {
            net.minecraft.nbt.CompoundTag merged = targetEntity.saveWithoutId(new net.minecraft.nbt.CompoundTag());
            merged.merge(nbt.getCompound("EntityTag"));
            targetEntity.load(merged);
        }
    }

    private Entity spawnEntity(Level worldIn, double x, double y, double z, Player playerIn) {
        Entity entity = new net.minecraft.world.entity.monster.Zombie(worldIn);
        if (!SRPConfig.allowMobs) {
            return entity;
        }
        if (this.name.equals("pod") && SRPConfigMobs.cruxaEnabled) {
            entity = SRPEntities.ENTITYDROPPOD.get().create(worldIn);
            y += 25.0;
        } else {
            if (this.name.equals("mes") && SRPConfigMobs.cruxaEnabled) {
                return this.spawnPlayer2(worldIn, x, y, z, playerIn);
            }
            if (this.name.equals("cruxa") && SRPConfigMobs.cruxaEnabled) {
                entity = SRPEntities.ENTITYCRUX.get().create(worldIn);
            } else if (this.name.equals("heed") && SRPConfigMobs.heedEnabled) {
                entity = SRPEntities.ENTITYHEED.get().create(worldIn);
            } else if (this.name.equals("jinjo") && SRPConfigMobs.jinjoEnabled) {
                entity = SRPEntities.ENTITYJINJO.get().create(worldIn);
            } else if (this.name.equals("elvia") && SRPConfigMobs.jinjoEnabled) {
                entity = SRPEntities.ENTITYELVIA.get().create(worldIn);
            } else if (this.name.equals("pheon") && SRPConfigMobs.jinjoEnabled) {
                entity = SRPEntities.ENTITYPHEON.get().create(worldIn);
            } else if (this.name.equals("lencia") && SRPConfigMobs.jinjoEnabled) {
                entity = SRPEntities.ENTITYLENCIA.get().create(worldIn);
            } else if (this.name.equals("vesta") && SRPConfigMobs.jinjoEnabled) {
                entity = SRPEntities.ENTITYVESTA.get().create(worldIn);
            } else if (this.name.equals("shyco") && SRPConfigMobs.shycoEnabled) {
                entity = SRPEntities.ENTITYSHYCO.get().create(worldIn);
            } else if (this.name.equals("shycoadapted") && SRPConfigMobs.shycoEnabled) {
                entity = SRPEntities.ENTITYSHYCOADAPTED.get().create(worldIn);
            } else if (this.name.equals("dorpa") && SRPConfigMobs.dorpaEnabled) {
                entity = SRPEntities.ENTITYDORPA.get().create(worldIn);
            } else if (this.name.equals("rathol") && SRPConfigMobs.ratholEnabled) {
                entity = SRPEntities.ENTITYRATHOL.get().create(worldIn);
            } else if (this.name.equals("gothol") && SRPConfigMobs.ratholEnabled) {
                entity = SRPEntities.ENTITYGOTHOL.get().create(worldIn);
            } else if (this.name.equals("emana") && SRPConfigMobs.emanaEnabled) {
                entity = SRPEntities.ENTITYEMANA.get().create(worldIn);
            } else if (this.name.equals("emanaadapted") && SRPConfigMobs.emanaEnabled) {
                entity = SRPEntities.ENTITYEMANAADAPTED.get().create(worldIn);
            } else if (this.name.equals("iki")) {
                entity = SRPEntities.ENTITYIKI.get().create(worldIn);
            } else if (this.name.equals("wymo")) {
                entity = SRPEntities.ENTITYWYMO.get().create(worldIn);
            } else if (this.name.equals("lodo") && SRPConfigMobs.lodoEnabled) {
                entity = SRPEntities.ENTITYLODO.get().create(worldIn);
            } else if (this.name.equals("mudo") && SRPConfigMobs.mudoEnabled) {
                entity = SRPEntities.ENTITYMUDO.get().create(worldIn);
            } else if (this.name.equals("nuuh") && SRPConfigMobs.mudoEnabled) {
                entity = SRPEntities.ENTITYNUUH.get().create(worldIn);
            } else if (this.name.equals("ata")) {
                entity = SRPEntities.ENTITYATA.get().create(worldIn);
            } else if (this.name.equals("venkrol") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYVENKROL.get().create(worldIn);
            } else if (this.name.equals("venkrolsii") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYVENKROLSII.get().create(worldIn);
            } else if (this.name.equals("venkrolsiii") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYVENKROLSIII.get().create(worldIn);
            } else if (this.name.equals("venkrolsiv") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYVENKROLSIV.get().create(worldIn);
            } else if (this.name.equals("venkrolsv") && SRPConfigSystems.rsEnabled) {
                entity = new EntityVenkrolSV(null, worldIn);
            } else if (this.name.equals("nak") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYNAK.get().create(worldIn);
            } else if (this.name.equals("leem") && SRPConfigSystems.rsEnabled) {
                entity = new EntityLeem(null, worldIn);
            } else if (this.name.equals("leemsii") && SRPConfigSystems.rsEnabled) {
                entity = new EntityLeemSII(null, worldIn);
            } else if (this.name.equals("leemsiii") && SRPConfigSystems.rsEnabled) {
                entity = new EntityLeemSIII(null, worldIn);
            } else if (this.name.equals("leemsiv") && SRPConfigSystems.rsEnabled) {
                entity = new EntityLeemSIV(null, worldIn);
            } else if (this.name.equals("dod") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYDOD.get().create(worldIn);
            } else if (this.name.equals("dodsii") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYDODSII.get().create(worldIn);
            } else if (this.name.equals("dodsiii") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYDODSIII.get().create(worldIn);
            } else if (this.name.equals("dodsiv") && SRPConfigSystems.rsEnabled) {
                entity = SRPEntities.ENTITYDODSIV.get().create(worldIn);
            } else if (this.name.equals("infhuman") && SRPConfigMobs.infhumanEnabled) {
                entity = SRPEntities.ENTITYINFHUMAN.get().create(worldIn);
            } else if (this.name.equals("infhumanhead") && SRPConfigMobs.infhumanEnabled) {
                entity = SRPEntities.ENTITYINFHUMANHEAD.get().create(worldIn);
            } else if (this.name.equals("infcow") && SRPConfigMobs.infcowEnabled) {
                entity = SRPEntities.ENTITYINFCOW.get().create(worldIn);
            } else if (this.name.equals("infcowhead") && SRPConfigMobs.infcowEnabled) {
                entity = SRPEntities.ENTITYINFCOWHEAD.get().create(worldIn);
            } else if (this.name.equals("infsheep") && SRPConfigMobs.infsheepEnabled) {
                entity = SRPEntities.ENTITYINFSHEEP.get().create(worldIn);
            } else if (this.name.equals("infsquid") && SRPConfigMobs.infsquidEnabled) {
                entity = SRPEntities.ENTITYINFSQUID.get().create(worldIn);
            } else if (this.name.equals("infsheephead") && SRPConfigMobs.infsheepEnabled) {
                entity = SRPEntities.ENTITYINFSHEEPHEAD.get().create(worldIn);
            } else if (this.name.equals("infwolf") && SRPConfigMobs.infwolfEnabled) {
                entity = SRPEntities.ENTITYINFWOLF.get().create(worldIn);
            } else if (this.name.equals("infwolfhead") && SRPConfigMobs.infwolfEnabled) {
                entity = SRPEntities.ENTITYINFWOLFHEAD.get().create(worldIn);
            } else if (this.name.equals("infpig") && SRPConfigMobs.infpigEnabled) {
                entity = SRPEntities.ENTITYINFPIG.get().create(worldIn);
            } else if (this.name.equals("infpighead") && SRPConfigMobs.infpigEnabled) {
                entity = SRPEntities.ENTITYINFPIGHEAD.get().create(worldIn);
            } else if (this.name.equals("infvillager") && SRPConfigMobs.infvillagerEnabled) {
                entity = SRPEntities.ENTITYINFVILLAGER.get().create(worldIn);
            } else if (this.name.equals("infvillagerhead") && SRPConfigMobs.infvillagerEnabled) {
                entity = SRPEntities.ENTITYINFVILLAGERHEAD.get().create(worldIn);
            } else {
                if (this.name.equals("infplayer") && SRPConfigMobs.infadventurerEnabled) {
                    return this.spawnPlayer(worldIn, x, y, z, playerIn);
                }
                if (this.name.equals("infplayerhead") && SRPConfigMobs.infadventurerEnabled) {
                    return this.spawnPlayerHead(worldIn, x, y, z, playerIn);
                }
                if (this.name.equals("inhoos")) {
                    entity = SRPEntities.ENTITYINHOOS.get().create(worldIn);
                } else if (this.name.equals("inhoom")) {
                    entity = SRPEntities.ENTITYINHOOM.get().create(worldIn);
                } else if (this.name.equals("infhorse") && SRPConfigMobs.infhorseEnabled) {
                    entity = SRPEntities.ENTITYINFHORSE.get().create(worldIn);
                } else if (this.name.equals("infhorsehead") && SRPConfigMobs.infhorseEnabled) {
                    entity = SRPEntities.ENTITYINFHORSEHEAD.get().create(worldIn);
                } else if (this.name.equals("infenderman") && SRPConfigMobs.infendermanEnabled) {
                    entity = SRPEntities.ENTITYINFENDERMAN.get().create(worldIn);
                } else if (this.name.equals("infendermanhead") && SRPConfigSystems.rsEnabled) {
                    entity = SRPEntities.ENTITYINFENDERMANHEAD.get().create(worldIn);
                } else if (this.name.equals("infbear") && SRPConfigMobs.infbearEnabled) {
                    entity = SRPEntities.ENTITYINFBEAR.get().create(worldIn);
                } else if (this.name.equals("infdragone")) {
                    entity = SRPEntities.ENTITYINFDRAGONE.get().create(worldIn);
                } else if (this.name.equals("infdragonehead") && SRPConfigSystems.rsEnabled) {
                    entity = SRPEntities.ENTITYINFDRAGONEHEAD.get().create(worldIn);
                } else if (this.name.equals("host") && SRPConfigMobs.hostEnabled) {
                    entity = SRPEntities.ENTITYHOST.get().create(worldIn);
                } else if (this.name.equals("hostii") && SRPConfigMobs.hostEnabled) {
                    entity = SRPEntities.ENTITYHOSTII.get().create(worldIn);
                } else if (this.name.equals("hull") && SRPConfigMobs.hullEnabled) {
                    entity = SRPEntities.ENTITYHULL.get().create(worldIn);
                } else if (this.name.equals("hulladapted") && SRPConfigMobs.hullEnabled) {
                    entity = SRPEntities.ENTITYHULLADAPTED.get().create(worldIn);
                } else if (this.name.equals("canra") && SRPConfigMobs.canraEnabled) {
                    entity = SRPEntities.ENTITYCANRA.get().create(worldIn);
                } else if (this.name.equals("canraadapted") && SRPConfigMobs.canraEnabled) {
                    entity = SRPEntities.ENTITYCANRAADAPTED.get().create(worldIn);
                } else if (this.name.equals("buthol") && SRPConfigMobs.butholEnabled) {
                    entity = SRPEntities.ENTITYBUTHOL.get().create(worldIn);
                } else if (this.name.equals("alafha") && SRPConfigMobs.alafhaEnabled) {
                    entity = SRPEntities.ENTITYALAFHA.get().create(worldIn);
                } else if (this.name.equals("nogla") && SRPConfigMobs.noglaEnabled) {
                    entity = SRPEntities.ENTITYNOGLA.get().create(worldIn);
                } else if (this.name.equals("noglaadapted") && SRPConfigMobs.noglaEnabled) {
                    entity = SRPEntities.ENTITYNOGLAADAPTED.get().create(worldIn);
                } else if (this.name.equals("bano") && SRPConfigMobs.zetmoEnabled) {
                    entity = SRPEntities.ENTITYBANO.get().create(worldIn);
                } else if (this.name.equals("banoadapted") && SRPConfigMobs.zetmoEnabled) {
                    entity = SRPEntities.ENTITYBANOADAPTED.get().create(worldIn);
                } else if (this.name.equals("oronco") && SRPConfigMobs.oroncoEnabled) {
                    entity = SRPEntities.ENTITYORONCO.get().create(worldIn);
                } else if (this.name.equals("terla") && SRPConfigMobs.terlaEnabled) {
                    entity = SRPEntities.ENTITYTERLA.get().create(worldIn);
                } else if (this.name.equals("anged") && SRPConfigMobs.angedEnabled) {
                    entity = SRPEntities.ENTITYANGED.get().create(worldIn);
                } else if (this.name.equals("lesh")) {
                    entity = SRPEntities.ENTITYLESH.get().create(worldIn);
                } else if (this.name.equals("tonro") && SRPConfigMobs.tonroEnabled) {
                    entity = SRPEntities.ENTITYTONRO.get().create(worldIn);
                } else if (this.name.equals("unvo") && SRPConfigMobs.unvoEnabled) {
                    entity = SRPEntities.ENTITYUNVO.get().create(worldIn);
                } else if (this.name.equals("ganro") && SRPConfigMobs.ganroEnabled) {
                    entity = SRPEntities.ENTITYGANRO.get().create(worldIn);
                } else if (this.name.equals("omboo") && SRPConfigMobs.ombooEnabled) {
                    entity = SRPEntities.ENTITYOMBOO.get().create(worldIn);
                } else if (this.name.equals("esor") && SRPConfigMobs.esorEnabled) {
                    entity = SRPEntities.ENTITYESOR.get().create(worldIn);
                } else if (this.name.equals("orch") && SRPConfigMobs.esorEnabled) {
                    entity = SRPEntities.ENTITYORCH.get().create(worldIn);
                } else if (this.name.equals("flog") && SRPConfigMobs.flogEnabled) {
                    entity = SRPEntities.ENTITYFLOG.get().create(worldIn);
                } else if (this.name.equals("wymoadapted") && SRPConfigMobs.canraEnabled) {
                    entity = SRPEntities.ENTITYCANRAADAPTED.get().create(worldIn);
                } else if (this.name.equals("ranrac") && SRPConfigMobs.arachnidaEnabled) {
                    entity = SRPEntities.ENTITYRANRAC.get().create(worldIn);
                } else if (this.name.equals("ranracadapted") && SRPConfigMobs.arachnidaEnabled) {
                    entity = SRPEntities.ENTITYRANRACADAPTED.get().create(worldIn);
                } else if (this.name.equals("lum") && SRPConfigMobs.arachnidaEnabled) {
                    entity = SRPEntities.ENTITYLUM.get().create(worldIn);
                } else if (!(this.name.equals("soo") && SRPConfigMobs.arachnidaEnabled || this.name.equals("tenn") && SRPConfigMobs.arachnidaEnabled)) {
                    if (this.name.equals("ferbear") && SRPConfigMobs.ferbearEnabled) {
                        entity = SRPEntities.ENTITYFERBEAR.get().create(worldIn);
                    } else if (this.name.equals("fercow") && SRPConfigMobs.fercowEnabled) {
                        entity = SRPEntities.ENTITYFERCOW.get().create(worldIn);
                    } else if (this.name.equals("ferenderman") && SRPConfigMobs.ferendermanEnabled) {
                        entity = SRPEntities.ENTITYFERENDERMAN.get().create(worldIn);
                    } else if (this.name.equals("ferhuman") && SRPConfigMobs.ferhumanEnabled) {
                        entity = SRPEntities.ENTITYFERHUMAN.get().create(worldIn);
                    } else if (this.name.equals("ferhorse") && SRPConfigMobs.ferhorseEnabled) {
                        entity = SRPEntities.ENTITYFERHORSE.get().create(worldIn);
                    } else if (this.name.equals("fersheep") && SRPConfigMobs.fersheepEnabled) {
                        entity = SRPEntities.ENTITYFERSHEEP.get().create(worldIn);
                    } else if (this.name.equals("ferpig") && SRPConfigMobs.ferpigEnabled) {
                        entity = SRPEntities.ENTITYFERPIG.get().create(worldIn);
                    } else if (this.name.equals("higolem") && SRPConfigMobs.higolemEnabled) {
                        entity = SRPEntities.ENTITYHIGOLEM.get().create(worldIn);
                    } else if (this.name.equals("fervillager") && SRPConfigMobs.fersheepEnabled) {
                        entity = SRPEntities.ENTITYFERVILLAGER.get().create(worldIn);
                    } else if (!this.name.equals("heblu") || SRPConfigMobs.hebluEnabled) {
                    }
                }
            }
        }
        entity.moveTo(x, y, z, net.minecraft.util.Mth.wrapDegrees(worldIn.random.nextFloat() * 360.0f), 0.0f);
        entity.setYRot(entity.getYRot());
        if (entity instanceof Mob) {
            ((Mob) entity).finalizeSpawn((net.minecraft.server.level.ServerLevel) worldIn, ((net.minecraft.server.level.ServerLevel) worldIn).getCurrentDifficultyAt(new BlockPos((int) x, (int) y, (int) z)), MobSpawnType.SPAWNER, null, null);
        }
        worldIn.addFreshEntity(entity);
        return entity;
    }

    private Entity spawnPlayer(Level worldIn, double x, double y, double z, Player playerIn) {
        EntityInfPlayer entity = SRPEntities.ENTITYINFPLAYER.get().create(worldIn);
        net.minecraft.world.item.ItemStack head = new net.minecraft.world.item.ItemStack(playerIn.getItemBySlot(net.minecraft.world.entity.EquipmentSlot.HEAD).getItem());
        net.minecraft.world.item.ItemStack legs = new net.minecraft.world.item.ItemStack(playerIn.getItemBySlot(net.minecraft.world.entity.EquipmentSlot.LEGS).getItem());
        net.minecraft.world.item.ItemStack feet = new net.minecraft.world.item.ItemStack(playerIn.getItemBySlot(net.minecraft.world.entity.EquipmentSlot.FEET).getItem());
        if (!head.isEmpty()) {
            entity.setItemSlot(net.minecraft.world.entity.EquipmentSlot.HEAD, head);
        }
        entity.setItemSlot(net.minecraft.world.entity.EquipmentSlot.LEGS, legs);
        entity.setItemSlot(net.minecraft.world.entity.EquipmentSlot.FEET, feet);
        entity.moveTo(x, y, z, net.minecraft.util.Mth.wrapDegrees(worldIn.random.nextFloat() * 360.0f), 0.0f);
        entity.setYRot(entity.getYRot());
        if (entity instanceof Mob) {
            ((Mob) entity).finalizeSpawn((net.minecraft.server.level.ServerLevel) worldIn, ((net.minecraft.server.level.ServerLevel) worldIn).getCurrentDifficultyAt(new BlockPos((int) x, (int) y, (int) z)), MobSpawnType.SPAWNER, null, null);
        }
        entity.setCustomName(playerIn.getDisplayName());
        entity.setCustomNameVisible(true);
        worldIn.addFreshEntity(entity);
        return entity;
    }

    private Entity spawnPlayer2(Level worldIn, double x, double y, double z, Player playerIn) {
        EntityMes entity = SRPEntities.ENTITYMES.get().create(worldIn);
        entity.moveTo(x, y, z, net.minecraft.util.Mth.wrapDegrees(worldIn.random.nextFloat() * 360.0f), 0.0f);
        entity.setYRot(entity.getYRot());
        if (entity instanceof Mob) {
            ((Mob) entity).finalizeSpawn((net.minecraft.server.level.ServerLevel) worldIn, ((net.minecraft.server.level.ServerLevel) worldIn).getCurrentDifficultyAt(new BlockPos((int) x, (int) y, (int) z)), MobSpawnType.SPAWNER, null, null);
        }
        entity.setCustomName(playerIn.getDisplayName());
        entity.setCustomNameVisible(true);
        worldIn.addFreshEntity(entity);
        return entity;
    }

    private Entity spawnPlayerHead(Level worldIn, double x, double y, double z, Player playerIn) {
        EntityInfPlayerHead entity = SRPEntities.ENTITYINFPLAYERHEAD.get().create(worldIn);
        entity.moveTo(x, y, z, net.minecraft.util.Mth.wrapDegrees(worldIn.random.nextFloat() * 360.0f), 0.0f);
        entity.setYRot(entity.getYRot());
        if (entity instanceof Mob) {
            ((Mob) entity).finalizeSpawn((net.minecraft.server.level.ServerLevel) worldIn, ((net.minecraft.server.level.ServerLevel) worldIn).getCurrentDifficultyAt(new BlockPos((int) x, (int) y, (int) z)), MobSpawnType.SPAWNER, null, null);
        }
        entity.setCustomName(playerIn.getDisplayName());
        entity.setCustomNameVisible(true);
        worldIn.addFreshEntity(entity);
        return entity;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, java.util.List<net.minecraft.network.chat.Component> tooltip, net.minecraft.world.item.TooltipFlag flagIn) {
    }
}
