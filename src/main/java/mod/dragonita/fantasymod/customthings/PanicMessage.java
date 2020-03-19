package mod.dragonita.fantasymod.customthings;

import java.util.function.Supplier;

import org.apache.commons.lang3.tuple.Pair;

import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.NetworkInstance;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.simple.IndexedMessageCodec;

public class PanicMessage{
	private final int data;
	private final NetworkInstance instance;
	private final IndexedMessageCodec indexedCodec;
	
	public PanicMessage(PacketBuffer buf, NetworkInstance instance){
		this.data = buf.readInt();
		this.instance = instance;
		this.indexedCodec = new IndexedMessageCodec(instance);
	}
	
	public PanicMessage(int data, NetworkInstance instance) {
		this.data = data;
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
	
	public void handle(PanicMessage message ,Supplier<NetworkEvent.Context> context) {
		context.get().enqueueWork(() ->  {
			@SuppressWarnings("unused")
			ServerPlayerEntity sender = context.get().getSender();
		});
		context.get().setPacketHandled(true);
	}
	
	public void encode(PacketBuffer buf) {
		buf.writeInt(data);
	}
	
	public <MSG> int encodeMessage(MSG message, final PacketBuffer target) {
		return this.indexedCodec.build(message, target);
	}
	
}