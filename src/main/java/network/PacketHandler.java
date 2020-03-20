package network;

import mod.dragonita.fantasymod.Main;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class PacketHandler {
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(new ResourceLocation(Main.MODID, "main"),
		() -> PROTOCOL_VERSION, 
		PROTOCOL_VERSION::equals, 
		PROTOCOL_VERSION::equals
	);
	private static int ID;

	public static void init(){
		//int ID; you can also use a local var because it gets called only 1 time
		//CHANNEL.registerMessage(ID++, PanicMessage.class, PanicMessage::encode, PanicMessage::new, PanicMessageHandler::handle);
	}

	public static <MSG> void sentToClient(MSG msg, ServerPlayerEntity playerEntity){
		CHANNEL.sendTo(msg, playerEntity.connection.netManager, NetworkDirection.PLAY_TO_CLIENT);
	}
}