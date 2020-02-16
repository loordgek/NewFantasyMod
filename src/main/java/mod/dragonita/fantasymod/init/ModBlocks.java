package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.block.InfuserBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);
	
	public static final RegistryObject<Block> RAINBOW_ORE = BLOCKS.register("rainbow_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> RAINBOW_BLOCK = BLOCKS.register("rainbow_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
	public static final RegistryObject<Block> INFUSER = BLOCKS.register("infuser", () -> new InfuserBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
}