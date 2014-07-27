package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.ChannelFuture
@TrapTag
public interface ChannelFuture {
	public Channel channel();
	public ChannelFuture sync();
	public ChannelFuture await();
	public ChannelFuture addListeners(GenericFutureListener[] arg0);
	public ChannelFuture addListener(GenericFutureListener arg0);
	public ChannelFuture removeListeners(GenericFutureListener[] arg0);
	public ChannelFuture removeListener(GenericFutureListener arg0);
	public ChannelFuture awaitUninterruptibly();
	public ChannelFuture syncUninterruptibly();
}
