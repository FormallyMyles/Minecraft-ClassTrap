package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.Channel$Unsafe
@TrapTag
public interface Unsafe {
	public void register(EventLoop arg0, ChannelPromise arg1);
	public void write(java.lang.Object arg0, ChannelPromise arg1);
	public void close(ChannelPromise arg0);
	public void flush();
	public void bind(java.net.SocketAddress arg0, ChannelPromise arg1);
	public void connect(java.net.SocketAddress arg0, java.net.SocketAddress arg1, ChannelPromise arg2);
	public java.net.SocketAddress localAddress();
	public void disconnect(ChannelPromise arg0);
	public ChannelPromise voidPromise();
	public void closeForcibly();
	public void beginRead();
	public void deregister(ChannelPromise arg0);
	public java.net.SocketAddress remoteAddress();
	public ChannelOutboundBuffer outboundBuffer();
}
