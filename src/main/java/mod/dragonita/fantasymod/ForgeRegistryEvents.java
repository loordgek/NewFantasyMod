package mod.dragonita.fantasymod;

import mod.dragonita.fantasymod.init.ModDimensions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Main.MODID, bus = Bus.FORGE)
public class ForgeRegistryEvents {
	@SubscribeEvent
	public static void registerDimension(final RegisterDimensionsEvent event) {
		if(DimensionType.byName(Main.DIMENSION_TYPE) == null) {
			DimensionManager.registerDimension(Main.DIMENSION_TYPE, ModDimensions.RAINBOW_MOD_DIMENSION.get(), null, true);
		}
		Main.LOGGER.info("Dimension Registered");
	}
}