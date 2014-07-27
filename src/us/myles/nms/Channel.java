package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.Channel
@TrapTag
public interface Channel {
	public Channel parent();
	public boolean isRegistered();
	public Channel flush();
	public Unsafe unsafe();
	public Channel read();
	public boolean isOpen();
	public java.net.SocketAddress localAddress();
	public boolean isWritable();
	public ChannelConfig config();
	public boolean isActive();
	public ChannelMetadata metadata();
	public ChannelFuture closeFuture();
	public java.net.SocketAddress remoteAddress();
	public EventLoop eventLoop();
}
