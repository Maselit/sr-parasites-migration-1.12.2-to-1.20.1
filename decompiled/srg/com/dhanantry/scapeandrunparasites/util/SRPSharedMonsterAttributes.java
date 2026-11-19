/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.attributes.IAttribute
 *  net.minecraft.entity.ai.attributes.RangedAttribute
 */
package com.dhanantry.scapeandrunparasites.util;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;

public class SRPSharedMonsterAttributes
extends SharedMonsterAttributes {
    public static final IAttribute SRPMAX_HEALTH = new RangedAttribute((IAttribute)null, "generic.maxHealth", 20.0, (double)1.4E-45f, 3.4028234663852886E38).func_111117_a("Max Health").func_111112_a(true);
    public static final IAttribute SRPFOLLOW_RANGE = new RangedAttribute((IAttribute)null, "generic.followRange", 32.0, 0.0, 2048.0).func_111117_a("Follow Range");
    public static final IAttribute SRPKNOCKBACK_RESISTANCE = new RangedAttribute((IAttribute)null, "generic.knockbackResistance", 0.0, 0.0, 1.0).func_111117_a("Knockback Resistance");
    public static final IAttribute SRPMOVEMENT_SPEED = new RangedAttribute((IAttribute)null, "generic.movementSpeed", (double)0.7f, 0.0, 1024.0).func_111117_a("Movement Speed").func_111112_a(true);
    public static final IAttribute SRPATTACK_DAMAGE = new RangedAttribute((IAttribute)null, "generic.attackDamage", 2.0, 0.0, 3.4028234663852886E38);
    public static final IAttribute SRPARMOR = new RangedAttribute((IAttribute)null, "generic.armor", 0.0, 0.0, 500.0).func_111112_a(true);
    public static final IAttribute SRPARMOR_TOUGHNESS = new RangedAttribute((IAttribute)null, "generic.armorToughness", 0.0, 0.0, 3.4028234663852886E38).func_111112_a(true);
}

