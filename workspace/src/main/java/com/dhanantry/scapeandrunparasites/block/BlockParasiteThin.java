package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.LeadItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Migracion de BlockParasiteThin a 1.20.1.
 * Vena/delgada del parasito: se conecta con las venas vecinas y con bloques
 * solidos. Los estados NORTH/EAST/SOUTH/WEST/UP/DOWN sustituyen a los
 * metadatos de 1.12.2.
 */
public class BlockParasiteThin extends Block
{
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;

    protected static final VoxelShape PILLAR_AABB = Block.box(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.375D, 0.0D, 0.0D, 0.625D, 1.5D, 0.375D);
    protected static final VoxelShape EAST_AABB = Block.box(0.625D, 0.0D, 0.375D, 1.0D, 1.5D, 0.625D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.375D, 0.0D, 0.625D, 0.625D, 1.5D, 1.0D);
    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 0.0D, 0.375D, 0.375D, 1.5D, 0.625D);

    public BlockParasiteThin(BlockBehaviour.Properties properties) {
        // Material.WOOD + setHarvestLevel("axe", 0) de 1.12.2
        super(properties.sound(SoundType.WOOD).requiresCorrectToolForDrops());
        this.registerDefaultState(this.defaultBlockState()
            .setValue(NORTH, Boolean.FALSE)
            .setValue(EAST, Boolean.FALSE)
            .setValue(SOUTH, Boolean.FALSE)
            .setValue(WEST, Boolean.FALSE)
            .setValue(UP, Boolean.FALSE)
            .setValue(DOWN, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.buildShape(this.getActualState(state, level, pos));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.buildShape(this.getActualState(state, level, pos));
    }

    private VoxelShape buildShape(BlockState state) {
        VoxelShape shape = PILLAR_AABB;
        if (state.getValue(NORTH)) {
            shape = Shapes.or(shape, NORTH_AABB);
        }
        if (state.getValue(EAST)) {
            shape = Shapes.or(shape, EAST_AABB);
        }
        if (state.getValue(SOUTH)) {
            shape = Shapes.or(shape, SOUTH_AABB);
        }
        if (state.getValue(WEST)) {
            shape = Shapes.or(shape, WEST_AABB);
        }
        return shape;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.updateConnections(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos());
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighbour, LevelAccessor level, BlockPos pos, BlockPos neighbourPos) {
        if (direction.getAxis().isHorizontal()) {
            return state.setValue(this.propertyFor(direction), this.canFenceConnectTo(level, neighbourPos, direction.getOpposite()));
        }
        return super.updateShape(state, direction, neighbour, level, pos, neighbourPos);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        BlockState updated = this.updateConnections(state, level, pos);
        if (!updated.equals(state)) {
            level.setBlock(pos, updated, 3);
        }
    }

    private BlockState updateConnections(BlockState state, BlockGetter level, BlockPos pos) {
        return state
            .setValue(NORTH, this.canFenceConnectTo(level, pos, Direction.NORTH))
            .setValue(EAST, this.canFenceConnectTo(level, pos, Direction.EAST))
            .setValue(SOUTH, this.canFenceConnectTo(level, pos, Direction.SOUTH))
            .setValue(WEST, this.canFenceConnectTo(level, pos, Direction.WEST))
            .setValue(UP, this.canFenceConnectTo(level, pos, Direction.UP))
            .setValue(DOWN, this.canFenceConnectTo(level, pos, Direction.DOWN));
    }

    /**
     * Estado real de las conexiones (equivalente a getActualState de 1.12.2):
     * se recalcula a partir de los vecinos del mundo.
     */
    private BlockState getActualState(BlockState state, BlockGetter level, BlockPos pos) {
        return this.updateConnections(state, level, pos);
    }

    private BooleanProperty propertyFor(Direction direction) {
        switch (direction) {
            case NORTH:
                return NORTH;
            case EAST:
                return EAST;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            default:
                return UP;
        }
    }

    public boolean canConnectTo(BlockGetter level, BlockPos pos, Direction facing) {
        BlockState state = level.getBlockState(pos);
        Block block = state.getBlock();
        boolean solid = state.isCollisionShapeFullBlock(level, pos);
        boolean sameBlock = block == SRPBlocks.ParasiteThin.get();
        return (!Block.isExceptionForConnection(state) && solid) || sameBlock;
    }

    public boolean canBeConnectedTo(BlockGetter level, BlockPos pos, Direction facing) {
        return this.canConnectTo(level, pos.relative(facing), facing.getOpposite());
    }

    private boolean canFenceConnectTo(BlockGetter level, BlockPos pos, Direction facing) {
        BlockPos other = pos.relative(facing);
        return this.canConnectTo(level, other, facing.getOpposite());
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            return LeadItem.bindPlayerMobs(player, level, pos);
        }
        ItemStack itemstack = player.getItemInHand(hand);
        return itemstack.is(Items.LEAD) ? InteractionResult.SUCCESS : InteractionResult.PASS;
    }

    @Override
    public BlockState rotate(BlockState state, net.minecraft.world.level.block.Rotation rot) {
        switch (rot) {
            case CLOCKWISE_180:
                return state.setValue(NORTH, state.getValue(SOUTH))
                    .setValue(EAST, state.getValue(WEST))
                    .setValue(SOUTH, state.getValue(NORTH))
                    .setValue(WEST, state.getValue(EAST));
            case COUNTERCLOCKWISE_90:
                return state.setValue(NORTH, state.getValue(EAST))
                    .setValue(EAST, state.getValue(SOUTH))
                    .setValue(SOUTH, state.getValue(WEST))
                    .setValue(WEST, state.getValue(NORTH));
            case CLOCKWISE_90:
                return state.setValue(NORTH, state.getValue(WEST))
                    .setValue(EAST, state.getValue(NORTH))
                    .setValue(SOUTH, state.getValue(EAST))
                    .setValue(WEST, state.getValue(SOUTH));
            default:
                return state;
        }
    }

    @Override
    public BlockState mirror(BlockState state, net.minecraft.world.level.block.Mirror mirror) {
        switch (mirror) {
            case LEFT_RIGHT:
                return state.setValue(NORTH, state.getValue(SOUTH)).setValue(SOUTH, state.getValue(NORTH));
            case FRONT_BACK:
                return state.setValue(EAST, state.getValue(WEST)).setValue(WEST, state.getValue(EAST));
            default:
                return state;
        }
    }
}
