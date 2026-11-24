package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIGiveEffectsArea a 1.20.1 (Goal).
 */
public class EntityAIGiveEffectsArea extends Goal {
    private final EntityParasiteBase parent;
    private int attackTimer = 0;
    private final int bRange;
    private final int bCooldown;
    private final String[] effects;

    public EntityAIGiveEffectsArea(EntityParasiteBase parent, int cooldown, int range, String[] in) {
        this.parent = parent;
        this.bRange = range;
        this.bCooldown = cooldown;
        this.effects = in;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void tick() {
        ++this.attackTimer;
        if (this.attackTimer >= 60) {
            this.buffParasites();
            this.attackTimer -= this.bCooldown;
        }
    }

    protected void buffParasites() {
        String[] here = new String[3];
        net.minecraft.world.phys.AABB axisalignedbb = this.parent.getBoundingBox().inflate(this.bRange);
        java.util.List<EntityParasiteBase> moblist = this.parent.level().getEntitiesOfClass(EntityParasiteBase.class, axisalignedbb);
        for (String i : this.effects) {
            here = i.split(";");
            net.minecraft.world.effect.MobEffect potionE = net.minecraft.core.registries.BuiltInRegistries.MOB_EFFECT.get(new net.minecraft.resources.ResourceLocation(here[2]));
            if (potionE == null) continue;
            int duration = Integer.parseInt(here[0]) * 20;
            int amp = Integer.parseInt(here[1]);
            for (EntityParasiteBase mob : moblist) {
                if (mob == this.parent) continue;
                mob.addEffect(new net.minecraft.world.effect.MobEffectInstance(potionE, duration, amp));
            }
        }
    }
}