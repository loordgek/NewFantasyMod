package mod.dragonita.fantasymod.customthings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FullRainbowPickAxe extends PickaxeItem {

	public FullRainbowPickAxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos,
			LivingEntity entityLiving) {
		
		@SuppressWarnings("unused")
		BlockState FirstBlock = Block.getValidBlockForPosition(state, worldIn, pos);
		//state.get
		return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
	}
}
