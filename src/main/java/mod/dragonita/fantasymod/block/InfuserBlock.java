package mod.dragonita.fantasymod.block;

import mod.dragonita.fantasymod.init.ModTileEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class InfuserBlock extends HorizontalBlock {

	public InfuserBlock(final Properties properties) {
		super(properties);
	}

	@Override
	public boolean hasTileEntity(final BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
		return ModTileEntityTypes.INFUSER.get().create();
	}

}