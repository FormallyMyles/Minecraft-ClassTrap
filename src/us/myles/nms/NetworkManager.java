package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.NetworkManager
@TrapTag
public interface NetworkManager {
	public void handle(Packet arg0, GenericFutureListener[] arg1);
	public void close(IChatBaseComponent arg0);
	public boolean c();
	public boolean isConnected();
	public void a(EnumProtocol arg0);
	public void a();
	public void a(javax.crypto.SecretKey arg0);
	public void a(PacketListener arg0);
	public void g();
	public IChatBaseComponent f();
	public java.net.SocketAddress getSocketAddress();
	public void channelActive(ChannelHandlerContext arg0);
	public void channelInactive(ChannelHandlerContext arg0);
	public void exceptionCaught(ChannelHandlerContext arg0, java.lang.Throwable arg1);
	public PacketListener getPacketListener();
}
