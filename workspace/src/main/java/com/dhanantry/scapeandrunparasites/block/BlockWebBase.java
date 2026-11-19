package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WebBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.HitResult;

import java.util.Collections;
import java.util.List;

/**
 * Migracion de BlockWebBase a 1.20.1.
 * BlockWeb -> WebBlock. La red se autodestruye pasados unos segundos y hace
 * daño a los vivos que la atraviesan.
 */
public class BlockWebBase extends WebBlock implements IMetaName
{
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockWebBase(BlockBehaviour.Properties properties) {
        // tickRandomly(true) de 1.12.2
        super(properties.randomTicks());
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.ONE));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.decay(state, level, pos, random);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.decay(state, level, pos, random);
    }

    private void decay(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isClientSide) {
            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            if (entity.tickCount % 20 != 0) {
                return;
            }
            // TODO: entidades migradas en otro lote (EntityParasiteBase)
            if (entity instanceof LivingEntity target) {
                switch (state.getValue(VARIANT)) {
                    case THREE:
                        target.hurt(level.damageSources().cactus(), 8.0F);
                        break;
                    case TWO:
                        target.hurt(level.damageSources().cactus(), 4.0F);
                        break;
                    default:
                        break;
                }
            }
        }
        super.entityInside(state, level, pos, entity);
    }

    @Override
    public boolean isShearable(ItemStack item, Level level, BlockPos pos) {
        // canShearable == false en 1.12.2
        return false;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        // getItemDropped devolvia null en 1.12.2
        return Collections.emptyList();
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, net.minecraft.world.entity.player.Player player) {
        // La variante ya no se guarda en el ItemStack (en 1.20.1 no hay metadata):
        // vive en el BlockState y la consume la capa de items.
        return new ItemStack(this);
    }

    @Override
    public Enum<?>[] getVariants() {
        return EnumType.values();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(VARIANT);
    }

    public static enum EnumType implements StringRepresentable
    {
        ONE,
        TWO,
        THREE;

        @Override
        public String getSerializedName() {
            return this.name().toLowerCase();
        }

        public String getName() {
            return this.getSerializedName();
        }

        @Override
        public String toString() {
            return this.getSerializedName();
        }
    }
}
