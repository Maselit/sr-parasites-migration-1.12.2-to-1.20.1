/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockGore;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.EntityRemain;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIInfectedSearch;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSpawn;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPFeral;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityGore;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPInfected
extends EntityParasiteBase
implements EntityCanSpawn {
    private String host;
    private int check;
    private int timer;
    private int tiick;
    protected boolean thisMelting;

    public EntityPInfected(World worldIn) {
        super(worldIn);
        this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, true, false, null, SRPConfig.infectedSneakPen, SRPConfig.infectedInviPen));
        if (SRPConfig.mobattacking) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, true, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !(entity instanceof EntityVillager) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.infectedSneakPen, SRPConfig.infectedInviPen));
        }
        this.experienceValue = SRPAttributes.XP_INFECTED;
        this.damageCap = SRPConfig.infectedCap;
        this.canD = SRPConfig.infecteddespawn;
        this.MiniDamage = SRPConfig.infectedMinDamage;
        this.oneMindDeathValue = SRPConfig.infectedOneMindDeathV;
        this.foodSteal = 0.1f;
        this.tiick = 0;
        this.check = 0;
        this.timer = 0;
        this.host = "";
        this.valueEvDeath = SRPConfig.infectedLoosingEPValue;
        this.thisMelting = false;
    }

    @Override
    public int getIDSpawn() {
        return this.getParasiteIDRegister();
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        ++this.tiick;
        if (this.tiick >= 20 && !this.world.isRemote) {
            this.tiick = 0;
            if (ParasiteEventEntity.canSpawnNext) {
                EntityPFeral out;
                if (this.killcount > SRPConfig.primitiveKills) {
                    this.tasks.addTask(3, (EntityAIBase)new EntityAIInfectedSearch(this, 1.1, this.thisMelting));
                    this.killcount = 0.0;
                }
                if (this.killcount > SRPConfig.feralKills && (out = this.getFeral()) != null) {
                    ParasiteEventEntity.spawnNext(this, out, true, false);
                    return;
                }
            }
            if (this.host.length() != 0) {
                if (this.check == 0) {
                    EntityLivingBase entityout = (EntityLivingBase)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(this.host), (World)this.world);
                    if (entityout != null && !(entityout instanceof EntityMob) && SRPConfig.infectedAssimilation) {
                        this.check = 2;
                        this.world.setEntityState((Entity)this, (byte)14);
                    } else {
                        this.check = 1;
                        this.world.setEntityState((Entity)this, (byte)15);
                    }
                }
                ++this.timer;
                if (this.check >= 2 && this.timer > 20) {
                    if (SRPConfigSystems.useEvolution) {
                        if (this.phaseCreated < SRPConfigSystems.evolutionAssimilatedDehiding) {
                            this.transform();
                        }
                    } else {
                        this.transform();
                    }
                }
            }
            this.InfectNearby((EntityLivingBase)this, SRPConfigSystems.cothAura);
        }
        if (this.check >= 3 && this.world.isRemote) {
            this.spawnParticles(SRPEnumParticle.GSPLASH, 0, 0, 0);
        }
    }

    public void setAttackTarget(EntityLivingBase entitylivingbaseIn) {
        super.setAttackTarget(entitylivingbaseIn);
        this.check = 0;
        this.world.setEntityState((Entity)this, (byte)17);
    }

    @Override
    protected void fearPlayer(EntityLivingBase player) {
        try {
            if (player == null) {
                return;
            }
            if (!this.canEntityBeSeen((Entity)player)) {
                return;
            }
            if (!player.isPotionActive(SRPPotions.FEAR_E)) {
                player.addPotionEffect(new PotionEffect(SRPPotions.FEAR_E, 300, 0, false, false));
            } else if (player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() < 0) {
                player.addPotionEffect(new PotionEffect(SRPPotions.FEAR_E, 300, 0, false, false));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void transform() {
        if (this.getAttackTarget() != null || this.isPotionActive(SRPPotions.EPEL_E)) {
            this.timer = -200;
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(10.0, 3.0, 10.0);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        boolean flag = true;
        for (EntityLivingBase mob : moblist) {
            NBTTagCompound tags;
            EntityPlayer player;
            if (mob == this || mob instanceof EntityParasiteBase || mob instanceof EntityPlayer && (player = (EntityPlayer)mob).isCreative() || (tags = mob.getEntityData()).hasKey("srpcothimmunity") && tags.getInteger("srpcothimmunity") != 0) continue;
            flag = false;
            this.check = 2;
            this.timer = 0;
            this.world.setEntityState((Entity)this, (byte)14);
            break;
        }
        if (flag) {
            ++this.check;
            this.world.setEntityState((Entity)this, (byte)16);
            this.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(this.posX, this.posY, this.posZ, this.width, this.height, 1));
            if (this.timer < 25) {
                return;
            }
            EntityLivingBase entityout = (EntityLivingBase)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(this.host), (World)this.world);
            entityout.copyLocationAndAnglesFrom((Entity)this);
            this.particleStatus((byte)7);
            this.world.removeEntity((Entity)this);
            if (this.hasCustomName()) {
                entityout.setCustomNameTag(this.getCustomNameTag());
                entityout.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
            }
            entityout.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
            this.world.spawnEntity((Entity)entityout);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos((Entity)entityout), 0);
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        EntityLivingBase target;
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag && entityIn instanceof EntityLivingBase && this.rand.nextDouble() < (double)SRPConfigSystems.cothInfected && !(target = (EntityLivingBase)entityIn).isPotionActive(SRPPotions.COTH_E)) {
            if (target.isPotionActive(SRPPotions.EPEL_E)) {
                if (this.rand.nextDouble() >= SRPConfigSystems.epelChanceCOTH) {
                    target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                }
            } else {
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
        }
        return flag;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        this.timer = -200;
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
        this.particleStatus((byte)5);
        if (!this.world.isRemote && this.killcount > SRPConfig.primitiveKills) {
            this.tasks.addTask(3, (EntityAIBase)new EntityAIInfectedSearch(this, 1.1, this.thisMelting));
            this.killcount = 0.0;
        }
    }

    private void InfectNearby(EntityLivingBase entity, int range) {
        if (SRPConfigSystems.cothAura == 0) {
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entity.posX, entity.posY, entity.posZ, entity.posX + 1.0, entity.posY + 1.0, entity.posZ + 1.0).grow((double)range);
        List moblist = entity.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob == entity || mob.isPotionActive(SRPPotions.COTH_E)) continue;
            if (mob.isPotionActive(SRPPotions.EPEL_E)) {
                if (!(mob.world.rand.nextDouble() >= SRPConfigSystems.epelChanceCOTH)) continue;
                mob.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 4800, 0, false, false));
                continue;
            }
            mob.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 4800, 0, false, false));
        }
    }

    public void setHost(String mobname) {
        this.host = mobname;
    }

    public String getHost() {
        return this.host;
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand) {
        Item wea = player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem();
        if (wea == SRPItems.itemAssimilate && this.host.length() != 0 && hand == EnumHand.MAIN_HAND) {
            this.world.setEntityState((Entity)this, (byte)16);
            this.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 3, false, false));
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(this.posX, this.posY, this.posZ, this.width, this.height, 1));
            EntityLivingBase entityout = (EntityLivingBase)EntityList.createEntityByIDFromName((ResourceLocation)new ResourceLocation(this.host), (World)this.world);
            entityout.copyLocationAndAnglesFrom((Entity)this);
            this.particleStatus((byte)7);
            this.world.removeEntity((Entity)this);
            if (this.hasCustomName()) {
                entityout.setCustomNameTag(this.getCustomNameTag());
                entityout.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
            }
            entityout.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
            this.world.spawnEntity((Entity)entityout);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos((Entity)entityout), 0);
            return true;
        }
        return super.processInteract(player, hand);
    }

    public EntityPFeral getFeral() {
        return null;
    }

    @Override
    protected void spawnGore() {
        int range = 2;
        double i1 = MathHelper.floor((double)(this.posY + 0.1));
        double l1 = this.posX;
        double i2 = this.posZ;
        for (int k2 = -1 * range; k2 <= 1 * range && SRPConfig.paraGore; ++k2) {
            for (int l2 = -1 * range; l2 <= 1 * range; ++l2) {
                double i3 = l1 + (double)k2;
                double l = i2 + (double)l2;
                BlockPos blockpos = new BlockPos(i3, i1, l);
                Block block = this.world.getBlockState(blockpos).getBlock();
                Block blockDown = this.world.getBlockState(blockpos.down()).getBlock();
                if (block != Blocks.AIR || blockDown == Blocks.AIR || !this.world.getBlockState(blockpos.down()).isFullBlock() || blockDown == SRPBlocks.InfestedStain || this.world.rand.nextInt(6) != 0) continue;
                this.world.setBlockState(blockpos, SRPBlocks.Gore.getDefaultState().withProperty(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.SIM_FLAT)));
            }
        }
        if (this.world.getBlockState(this.getPosition().down()).isFullBlock() && (this.world.getBlockState(this.getPosition()).getBlock() instanceof BlockBush || this.world.getBlockState(this.getPosition()).getBlock() == Blocks.AIR)) {
            this.world.setBlockState(this.getPosition(), SRPBlocks.Gore.getDefaultState().withProperty(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.SIM_BIG)));
            EntityRemain nnn = new EntityRemain(this.world);
            nnn.setLocationAndAngles((double)this.getPosition().getX() + 0.5, this.getPosition().getY(), (double)this.getPosition().getZ() + 0.5, 0.0f, 0.0f);
            nnn.setParasite(EntityList.getKey((Entity)this).toString());
            nnn.setSkin((byte)this.getSkin());
            nnn.setGoal(20 * SRPConfig.infectedRemainValue);
            this.world.spawnEntity((Entity)nnn);
        }
        for (int i = 0; i < 3 && SRPConfig.paraGore; ++i) {
            double d0 = (float)this.posX + this.world.rand.nextFloat();
            double d1 = (float)this.posY + this.world.rand.nextFloat();
            double d2 = (float)this.posZ + this.world.rand.nextFloat();
            double d3 = d0 - this.posX;
            double d4 = d1 - this.posY;
            double d5 = d2 - this.posZ;
            double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
            d3 /= d6;
            d4 /= d6;
            d5 /= d6;
            double d7 = 0.5 / (d6 / 4.0 + 0.1);
            d4 = d4 * d7 * 2.0;
            EntityGore bomb = new EntityGore(this.world);
            bomb.setType((byte)1);
            bomb.copyLocationAndAnglesFrom((Entity)this);
            bomb.setMotion(d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3f)), d4, d5 *= d7, 0.1, 0.5);
            this.world.spawnEntity((Entity)bomb);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void spawnEffectsGore() {
        int i;
        for (i = 0; i <= 100; ++i) {
            if (i % 5 != 0) continue;
            this.spawnParticlesGore(SRPEnumParticle.GSPLASH, 0, -1, -1);
        }
        for (i = 0; i <= 20; ++i) {
            if (i % 5 == 0) {
                this.spawnParticles(SRPEnumParticle.GCLOUD, 127, 0, 0);
            }
            if (i % 5 != 0) continue;
            this.spawnParticles(SRPEnumParticle.GSPLASH, 0, -1, -1);
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setString("parasitehost", this.host);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("parasitehost", 8)) {
            this.setHost(compound.getString("parasitehost").toString());
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 14) {
            this.check = 2;
        } else if (id == 15) {
            this.check = 1;
        } else if (id == 16) {
            ++this.check;
        } else if (id == 17) {
            this.check = 0;
        } else {
            super.handleStatusUpdate(id);
        }
    }
}

