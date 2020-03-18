package mod.dragonita.fantasymod.customthings;

import java.util.function.Supplier;

import mod.dragonita.fantasymod.Main;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class ModidPacketHandler {
	private static final String PROTOCOL_VERSION = "1";
	private final int data;
	public final ModidPacketHandler ClassItSelf = this;
	public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(Main.MODID, "main"), 
		() -> PROTOCOL_VERSION, 
		PROTOCOL_VERSION::equals, 
		PROTOCOL_VERSION::equals
	);
	
	public ModidPacketHandler(PacketBuffer buf){
		this.data = buf.readInt();
	}
	
	public ModidPacketHandler(int data) {
		this.data = data;
	}
	
	public void handle(Supplier<NetworkEvent.Context> context) {
	}
	
	public void encode(PacketBuffer buf) {
		buf.writeInt(data);
	}
}