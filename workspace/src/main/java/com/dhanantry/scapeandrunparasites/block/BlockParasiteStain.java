package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.HitResult;

/**
 * Migracion de BlockParasiteStain a 1.20.1.
 */
public class BlockParasiteStain extends BlockBase implements IMetaName
{
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockParasiteStain(BlockBehaviour.Properties properties) {
        // setHarvestLevel("shovel", 0) de 1.12.2 -> requiresCorrectToolForDrops()
        // (en 1.20.1 la herramienta se define con el tag mineable/shovel)
        // TODO: sonidos migrados en otro lote (SRPSounds.BLOCKINFEST_*)
        super(properties.sound(SoundType.GRAVEL).requiresCorrectToolForDrops());
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.DIRT));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.spread(state, level, pos, random);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.spread(state, level, pos, random);
    }

    private void spread(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        if (level.getBiome(pos).value() == SRPBiomes.BIOME_INFESTED.get()) {
            ParasiteEventWorld.spreadBiomeBlockStain(level, pos, random);
        } else {
            int heart = ParasiteEventWorld.canBiomeStillExist(level, pos, true);
            if (heart > 0) {
                ParasiteEventWorld.SpreadBiome(level, pos, heart);
            }
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        // TODO: sistema de particulas migrado en otro lote (ParticleSpawner / SRPEnumParticle)
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
        builder.add(VARIANT);
    }

    public static enum EnumType implements StringRepresentable
    {
        DIRT,
        MUD,
        FLESH,
        FEELER;

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
