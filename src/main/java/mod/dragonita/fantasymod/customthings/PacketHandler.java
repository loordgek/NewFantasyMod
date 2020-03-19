package mod.dragonita.fantasymod.customthings;

import mod.dragonita.fantasymod.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class PacketHandler {
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(Main.MODID, "main"), 
		() -> PROTOCOL_VERSION, 
		PROTOCOL_VERSION::equals, 
		PROTOCOL_VERSION::equals
	);
}