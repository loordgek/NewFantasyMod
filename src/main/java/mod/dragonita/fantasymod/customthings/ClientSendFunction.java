package mod.dragonita.fantasymod.customthings;

import org.apache.commons.lang3.tuple.Pair;

import io.netty.buffer.Unpooled;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkInstance;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.simple.IndexedMessageCodec;

public class ClientSendFunction {
	private final NetworkInstance instance;
	private final IndexedMessageCodec indexedCodec;
	
	public ClientSendFunction(NetworkInstance instance) {
		this.instance = instance;
		this.indexedCodec = new IndexedMessageCodec(instance);
	}
	
	public <MSG> void send(PacketDistributor.PacketTarget target, MSG message) {
		target.send(toVanillaPacket(message, target.getDirection()));
	}
	
	private <MSG> IPacket<?> toVanillaPacket(MSG message, NetworkDirection direction) {
		return direction.buildPacket(toBuffer(message), instance.getChannelName()).getThis();
	}

	private <MSG> Pair<PacketBuffer,Integer> toBuffer(MSG msg) {
		final PacketBuffer bufIn = new PacketBuffer(Unpooled.buffer());
		int index = this.encodeMessage(msg ,bufIn);
		return Pair.of(bufIn, index);
	}
	
	public <MSG> int encodeMessage(MSG message, final PacketBuffer target) {
		return this.indexedCodec.build(message, target);
	}
	
}