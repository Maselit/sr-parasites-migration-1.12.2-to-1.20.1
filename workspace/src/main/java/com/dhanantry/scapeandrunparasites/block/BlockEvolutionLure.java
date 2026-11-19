package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.List;

/**
 * Migracion de BlockEvolutionLure a 1.20.1.
 * El senuelo de evolucion: al activarlo con la mano vacia consume puntos de
 * evolucion (o activa una cuenta atras) si hay cuatro senuelos formando un
 * cuadrado de 3x3.
 */
public class BlockEvolutionLure extends BlockBase implements IMetaName
{
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockEvolutionLure(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.ONE));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide || !SRPConfigSystems.useEvolution) {
            return InteractionResult.PASS;
        }
        ItemStack held = player.getItemInHand(InteractionHand.MAIN_HAND);
        if (!held.isEmpty()) {
            return InteractionResult.PASS;
        }
        EnumType variant = state.getValue(VARIANT);
        SRPSaveData data = SRPSaveData.get(level);
        if (data == null) {
            return InteractionResult.PASS;
        }
        int dimension = SRPSaveData.dimensionId(level);
        if (this.checkBlocks(level, pos, variant)) {
            level.setBlockAndUpdate(pos.north(3).east(3), Blocks.AIR.defaultBlockState());
            level.setBlockAndUpdate(pos.north(3).west(3), Blocks.AIR.defaultBlockState());
            level.setBlockAndUpdate(pos.south(3).east(3), Blocks.AIR.defaultBlockState());
            level.setBlockAndUpdate(pos.south(3).west(3), Blocks.AIR.defaultBlockState());
            // TODO: sistema de particulas migrado en otro lote (SRPPacketParticle)
            player.displayClientMessage(Component.translatable("message.srparasites.lurec"), true);
            switch (variant) {
                case EIGHT:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueEightCool, true, level, true);
                    break;
                case FIVE:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueFiveCool, true, level, true);
                    break;
                case FOUR:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueFourCool, true, level, true);
                    break;
                case ONE:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueOneCool, true, level, true);
                    break;
                case SEVEN:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueSevenCool, true, level, true);
                    break;
                case SIX:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueSixCool, true, level, true);
                    break;
                case THREE:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueThreeCool, true, level, true);
                    break;
                case TWO:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueTwoCool, true, level, true);
                    break;
                case NINE:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueNineCool, true, level, true);
                    break;
                case TEN:
                    data.setTotalKills(dimension, -SRPConfigSystems.luredValueTenCool, true, level, true);
                    break;
                default:
                    break;
            }
            // TODO: entidades migradas en otro lote (EntityParasiticScent y su nivel de
            // despliegue por variante: SRPConfigSystems.oneLevelDeploy ... tenLevelDeploy)
            if (level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
                LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                if (bolt != null) {
                    bolt.moveTo(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
                    bolt.setVisualOnly(true);
                    serverLevel.addFreshEntity(bolt);
                }
            }
        } else {
            if (data.getEvolutionPhase(dimension) <= -1) {
                return InteractionResult.PASS;
            }
            // Nota: en 1.12.2 los casos TWO y NINE caian al siguiente (fall-through).
            switch (variant) {
                case EIGHT:
                    data.setCooldown(SRPConfigSystems.luredValueEight, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case FIVE:
                    data.setCooldown(SRPConfigSystems.luredValueFive, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case FOUR:
                    data.setCooldown(SRPConfigSystems.luredValueFour, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case ONE:
                    data.setCooldown(SRPConfigSystems.luredValueOne, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case SEVEN:
                    data.setCooldown(SRPConfigSystems.luredValueSeven, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case SIX:
                    data.setCooldown(SRPConfigSystems.luredValueSix, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case THREE:
                    data.setCooldown(SRPConfigSystems.luredValueThree, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                case TWO:
                    data.setCooldown(SRPConfigSystems.luredValueTwo, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                case NINE:
                    data.setCooldown(SRPConfigSystems.luredValueNine, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                case TEN:
                    data.setCooldown(SRPConfigSystems.luredValueTen, level, dimension);
                    player.displayClientMessage(Component.translatable("message.srparasites.lureb"), true);
                    break;
                default:
                    break;
            }
        }
        level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        // TODO: sistema de particulas migrado en otro lote (SRPPacketParticle)
        return InteractionResult.CONSUME;
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, Player player) {
        // La variante ya no se guarda en el ItemStack (en 1.20.1 no hay metadata):
        // vive en el BlockState y la consume la capa de items.
        return new ItemStack(this);
    }

    @Override
    public void appendHoverText(ItemStack stack, BlockGetter level, List<Component> tooltip, net.minecraft.world.item.TooltipFlag flag) {
        // En 1.12.2 la variante se leia del metadata del ItemStack; en 1.20.1 el
        // ItemStack no guarda metadata, por lo que se usa el estado por defecto.
        // TODO: tooltip por variante migrado en otro lote (capa de items)
        EnumType variant = this.defaultBlockState().getValue(VARIANT);
        int i = 0;
        switch (variant) {
            case ONE:
                i = SRPConfigSystems.luredValueOne;
                break;
            case TWO:
                i = SRPConfigSystems.luredValueTwo;
                break;
            case THREE:
                i = SRPConfigSystems.luredValueThree;
                break;
            case FOUR:
                i = SRPConfigSystems.luredValueFour;
                break;
            case FIVE:
                i = SRPConfigSystems.luredValueFive;
                break;
            case SIX:
                i = SRPConfigSystems.luredValueSix;
                break;
            case SEVEN:
                i = SRPConfigSystems.luredValueSeven;
                break;
            case EIGHT:
                i = SRPConfigSystems.luredValueEight;
                break;
            case NINE:
                i = SRPConfigSystems.luredValueEight;
                break;
            case TEN:
                i = SRPConfigSystems.luredValueEight;
                break;
            default:
                break;
        }
        tooltip.add(Component.translatable("tooltip." + this.getDescriptionId(), i));
    }

    @Override
    public Enum<?>[] getVariants() {
        return EnumType.values();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(VARIANT);
    }

    private boolean checkBlocks(Level level, BlockPos pos, EnumType t) {
        BlockPos base = pos;
        return level.getBlockState(base.north(3).east(3)).getBlock() == SRPBlocks.evolutionLure.get()
            && level.getBlockState(base.north(3).west(3)).getBlock() == SRPBlocks.evolutionLure.get()
            && level.getBlockState(base.south(3).east(3)).getBlock() == SRPBlocks.evolutionLure.get()
            && level.getBlockState(base.south(3).west(3)).getBlock() == SRPBlocks.evolutionLure.get();
    }

    public static enum EnumType implements StringRepresentable
    {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN;

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
