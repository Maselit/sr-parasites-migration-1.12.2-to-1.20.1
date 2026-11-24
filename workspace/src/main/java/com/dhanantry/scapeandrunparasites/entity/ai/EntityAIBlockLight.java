package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;

/**
 * Migracion de EntityAIBlockLight a 1.20.1 (Goal).
 */
public class EntityAIBlockLight extends Goal {
    private final EntityParasiteBase parent;
    private int ticks = 0;
    private final int range;
    private final int lightTrigger;
    private BlockPos target;
    private int progressB;
    private int idle;
    private int neededTime;
    private net.minecraft.world.level.block.Block block;
    private int disss;
    private int prevProgressB = -1;
    private final java.util.ArrayList<Long> cant = new java.util.ArrayList<>();

    public EntityAIBlockLight(EntityParasiteBase in, int range, int lightLook) {
        this.parent = in;
        this.range = range;
        this.lightTrigger = lightLook;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        ++this.ticks;
        if (this.ticks < 40) {
            return false;
        }
        this.ticks = 0;
        if (!this.parent.level().getGameRules().getBoolean(net.minecraft.world.level.GameRules.RULE_MOBGRIEFING) || this.parent.getTarget() != null) {
            return false;
        }
        BlockPos ll = this.findSource();
        if (ll != null) {
            this.target = ll;
            return true;
        }
        return false;
    }

    @Override
    public boolean canContinueToUse() {
        return this.target != null && this.parent.level().getBlockState(this.target).getBlock() == this.block && this.parent.getTarget() == null;
    }

    @Override
    public void start() {
        this.progressB = 0;
        this.idle = 0;
        this.block = this.parent.level().getBlockState(this.target).getBlock();
        float multiplier = 10.0f;
        this.neededTime = (int) (this.parent.level().getBlockState(this.target).getDestroyProgress(null, this.parent.level(), this.target) * Math.max(0.0f, multiplier));
        if (this.neededTime <= 0) this.neededTime = 1;
    }

    @Override
    public void stop() {
        this.parent.getNavigation().stop();
        this.prevProgressB = -1;
        this.target = null;
    }

    @Override
    public void tick() {
        double r = 5.0;
        double distance = this.realdistanceSq(this.target, this.parent.getX(), this.parent.getY(), this.parent.getZ());
        if (distance > r) {
            this.parent.getNavigation().moveTo((double) this.target.getX(), (double) this.target.getY(), (double) this.target.getZ(), 1.1);
        }
        if (this.parent.isPassenger()) {
            this.stop();
            return;
        }
        ++this.idle;
        this.idle = (int) Math.round(distance) == this.disss ? ++this.idle : 0;
        if (this.idle == 120) {
            this.parent.skillBreakBlocks();
        }
        if (this.idle >= 240) {
            boolean canAdd = true;
            for (int p = 0; p < this.cant.size(); ++p) {
                if (this.cant.get(p).longValue() != this.target.asLong()) continue;
                canAdd = false;
            }
            if (canAdd) {
                this.cant.add(this.target.asLong());
            }
            this.stop();
            this.ticks += 30;
            return;
        }
        this.disss = (int) Math.round(distance);
        if (distance <= r && this.target != null) {
            this.parent.getNavigation().moveTo((double) this.target.getX(), (double) this.target.getY(), (double) this.target.getZ(), 0.0);
            ++this.progressB;
            this.idle = 0;
            int i = (int) ((float) this.progressB / (float) this.neededTime);
            if (i != this.prevProgressB) {
                this.parent.level().destroyBlockProgress(this.parent.getId(), this.target, i);
                this.prevProgressB = i;
            }
            if (this.progressB >= this.neededTime) {
                this.parent.level().destroyBlock(this.target, true);
                this.progressB = 0;
                this.ticks += 30;
            }
        }
    }

    private BlockPos findSource() {
        net.minecraft.world.level.Level world = this.parent.level();
        if (world.getBrightness(net.minecraft.world.level.LightLayer.BLOCK, this.parent.blockPosition()) < this.lightTrigger && world.getRandom().nextInt(3) != 0) {
            return null;
        }
        double distanceM = 40000.0;
        BlockPos light = null;
        if (this.parent.isPassenger()) {
            return light;
        }
        java.util.ArrayList<BlockPos> sources = new java.util.ArrayList<>();
        for (int i = -this.range; i <= this.range; ++i) {
            int j = -4;
            while ((float) j <= this.parent.getBbHeight()) {
                for (int k = -this.range; k <= this.range; ++k) {
                    BlockPos atm = new BlockPos((int) (this.parent.getX() + (double) i), (int) (this.parent.getY() + (double) j), (int) (this.parent.getZ() + (double) k));
                    net.minecraft.world.level.block.state.BlockState state = world.getBlockState(atm);
                    net.minecraft.world.level.block.Block block = state.getBlock();
                    if (block instanceof net.minecraft.world.level.block.LiquidBlock || block instanceof net.minecraft.world.level.block.EndGatewayBlock || block instanceof net.minecraft.world.level.block.EndPortalFrameBlock || ParasiteEventEntity.checkName(block.toString(), SRPConfig.parasiteGriefingBlackList, SRPConfig.parasiteGriefingWhite) || state.getLightEmission() < this.lightTrigger) continue;
                    if (this.cant.isEmpty()) {
                        sources.add(atm);
                        continue;
                    }
                    boolean canAdd = true;
                    for (int p = 0; p < this.cant.size(); ++p) {
                        if (this.cant.get(p).longValue() != atm.asLong()) continue;
                        canAdd = false;
                        break;
                    }
                    if (!canAdd) continue;
                    sources.add(atm);
                }
                ++j;
            }
        }
        for (BlockPos pos : sources) {
            double distance = pos.distSqr(this.parent.blockPosition());
            if (!(distance < distanceM)) continue;
            light = pos;
            distanceM = distance;
        }
        return light;
    }

    private double realdistanceSq(BlockPos pos, double toX, double toY, double toZ) {
        double d0 = (double) pos.getX() + 0.5 - toX;
        double d1 = (double) pos.getY() + 0.5 - toY;
        double d2 = (double) pos.getZ() + 0.5 - toZ;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }
}