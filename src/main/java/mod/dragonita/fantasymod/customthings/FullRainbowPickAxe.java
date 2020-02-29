package mod.dragonita.fantasymod.customthings;

import java.util.List;

import mod.dragonita.fantasymod.util.KeyboardHelper;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class FullRainbowPickAxe extends PickaxeItem {

	public FullRainbowPickAxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	private BlockPos getBlockPos(BlockPos BlockP, double dx, double dy, double dz) {
		BlockPos TargetBlock = BlockP.add(dx, dy, dz);
		return TargetBlock;
	}
	
	private BlockState getBlockState(World worldIn, BlockPos TargetBlockPos) {
		BlockState TargetBlockState = worldIn.getBlockState(TargetBlockPos);
		return TargetBlockState;
	}
	
	@SuppressWarnings("deprecation")
	private ItemStack getItemStack(BlockState Block) {
		return Item.getItemFromBlock(Block.getBlock()).getDefaultInstance();
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("This Pickaxe will destroy 9x9x9 Block"));
		}else {
			tooltip.add(new StringTextComponent("Hold SHIFT for more information"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
		
	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos,
			LivingEntity entityLiving) {
		BlockPos MiddleBlock = getBlockPos(pos, 0, 0, 0);
		BlockPos MiddleLeftBlock = getBlockPos(pos, 0, -1, 0);
		BlockPos MiddleRightBlock = getBlockPos(pos, 0, 1, 0);
		BlockPos MiddleUpperLeftBlock = getBlockPos(pos, 0, -1, 1);
		BlockPos MiddleDownLeftBlock = getBlockPos(pos, 0, -1, -1);
		BlockPos MiddleUpperRightBlock = getBlockPos(pos, 0, -1, 1);
		BlockPos MiddleDownRightBlock = getBlockPos(pos, 0, -1, -1);
		BlockPos UpperMiddleBlock = getBlockPos(pos, 0, 0, 1);
		BlockPos DownMiddleBlock = getBlockPos(pos, 0, 0, -1);
		
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleBlock)), worldIn, getBlockState(worldIn, MiddleBlock), MiddleBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleLeftBlock)), worldIn, getBlockState(worldIn, MiddleLeftBlock), MiddleLeftBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleRightBlock)), worldIn, getBlockState(worldIn, MiddleRightBlock), MiddleRightBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleUpperLeftBlock)), worldIn, getBlockState(worldIn, MiddleUpperLeftBlock), MiddleUpperLeftBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleDownLeftBlock)), worldIn, getBlockState(worldIn, MiddleDownLeftBlock), MiddleDownLeftBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleUpperRightBlock)), worldIn, getBlockState(worldIn, MiddleUpperRightBlock), MiddleUpperRightBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, MiddleDownRightBlock)), worldIn, getBlockState(worldIn, MiddleDownRightBlock), MiddleDownRightBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, UpperMiddleBlock)), worldIn, getBlockState(worldIn, UpperMiddleBlock), UpperMiddleBlock, entityLiving);
		super.onBlockDestroyed(getItemStack(getBlockState(worldIn, DownMiddleBlock)), worldIn, getBlockState(worldIn, DownMiddleBlock), DownMiddleBlock, entityLiving);
		return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
	}
}
