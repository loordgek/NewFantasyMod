package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.world.dimensions.FantasyModDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModDimensions{
	public static final DeferredRegister<ModDimension> DIMENSION = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, Main.MODID);
	
	public static final RegistryObject<ModDimension> RAINBOW_MOD_DIMENSION = DIMENSION.register("rainbow_dimension", () -> new FantasyModDimension());
}