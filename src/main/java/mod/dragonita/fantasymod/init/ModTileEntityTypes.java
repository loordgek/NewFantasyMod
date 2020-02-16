package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.tileentity.InfuserTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModTileEntityTypes {
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Main.MODID);
	
	public static final RegistryObject<TileEntityType<InfuserTileEntity>> INFUSER = TILE_ENTITY_TYPES.register("heat_collector", () ->
	TileEntityType.Builder.create(InfuserTileEntity::new, ModBlocks.INFUSER.get())
			.build(null)
);
}