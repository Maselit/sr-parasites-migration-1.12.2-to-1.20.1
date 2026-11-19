/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  javax.annotation.Nullable
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.attributes.AttributeModifier
 *  net.minecraft.entity.effect.EntityLightningBolt
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.EnumRarity
 *  net.minecraft.item.IItemPropertyGetter
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.item.tool;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.item.tool.IHaveReach;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WeaponToolMeleeBase
extends ItemSword
implements IHaveReach {
    private float addReach;
    private float attackDamage;
    private byte effectHit;
    protected double attackSpeed;
    protected boolean calling;
    protected byte idTool;
    protected final UUID ATTACK_RANGE_MODIFIER = UUID.randomUUID();

    public WeaponToolMeleeBase(Item.ToolMaterial material, String name, double attackspeed, float range, float attackD, boolean fear, byte id) {
        super(material);
        this.setRegistryName("weapon_" + name);
        this.setTranslationKey("srparasites.weapon_" + name);
        this.setCreativeTab(SRPMain.SRP_CREATIVETAB);
        this.attackSpeed = attackspeed;
        this.addReach = range;
        this.attackDamage = attackD;
        this.calling = fear;
        this.idTool = id;
        this.addPropertyOverride(new ResourceLocation("vinni"), new IItemPropertyGetter(){

            @SideOnly(value=Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                if (SRPConfig.useVinniT) {
                    return 1.0f;
                }
                return 0.0f;
            }
        });
    }

    @Override
    public float getReach() {
        return this.addReach;
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap multimap = super.getItemAttributeModifiers(equipmentSlot);
        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.clear();
            multimap.put((Object)SharedMonsterAttributes.ATTACK_DAMAGE.getName(), (Object)new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
            multimap.put((Object)SharedMonsterAttributes.ATTACK_SPEED.getName(), (Object)new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", this.attackSpeed, 0));
            if (SRPConfig.weaponCancelPacket) {
                multimap.put((Object)EntityPlayer.REACH_DISTANCE.getName(), (Object)new AttributeModifier(this.ATTACK_RANGE_MODIFIER, "custom_reach", (double)this.addReach, 0));
            }
        }
        return multimap;
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        boolean flag = super.hitEntity(stack, target, attacker);
        if (flag && target.getHealth() <= 0.0f) {
            NBTTagCompound compound = stack.getTagCompound();
            if (compound == null) {
                compound = new NBTTagCompound();
            }
            if (compound.hasKey("srpkills")) {
                int key = (int)((float)compound.getInteger("srpkills") + target.getMaxHealth());
                compound.setInteger("srpkills", key);
            } else {
                compound.setInteger("srpkills", (int)target.getMaxHealth());
            }
            stack.setTagCompound(compound);
        }
        return flag;
    }

    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
        if (!worldIn.isRemote) {
            if (this.calling && SRPConfigSystems.useScent && worldIn.rand.nextInt(100) == 0 && entityIn.ticksExisted % 40 == 0) {
                ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(SRPPotions.PREY_E, 1200, 0, false, false));
            }
            if (entityIn.ticksExisted % 80 == 0) {
                int key = 0;
                NBTTagCompound compound = stack.getTagCompound();
                if (compound != null && this.getNext() != null) {
                    if (compound.hasKey("srpkills")) {
                        key = compound.getInteger("srpkills");
                    }
                    if (key > SRPConfig.weapon_livingSentient_HP_needed) {
                        compound.setInteger("srpkills", 0);
                        stack.shrink(1);
                        ItemStack stackW = new ItemStack(this.getNext(), 1);
                        EntityItem entityitem = new EntityItem(worldIn, entityIn.posX, entityIn.posY, entityIn.posZ, stackW);
                        entityitem.setDefaultPickupDelay();
                        worldIn.spawnEntity((Entity)entityitem);
                        if (SRPConfig.thunderEnable) {
                            worldIn.addWeatherEffect((Entity)new EntityLightningBolt(worldIn, entityIn.posX, entityIn.posY, entityIn.posZ, true));
                        }
                        return;
                    }
                }
            }
        }
    }

    public Item getNext() {
        return null;
    }

    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        super.onCreated(stack, worldIn, playerIn);
    }

    public EnumRarity getRarity(ItemStack stack) {
        return super.getRarity(stack);
    }

    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        NBTTagCompound compound = stack.getTagCompound();
        if (compound != null) {
            tooltip.add(TextFormatting.BLUE + "---> " + compound.getInteger("srpkills"));
            tooltip.add(TextFormatting.BLUE + "  ");
        }
    }
}

