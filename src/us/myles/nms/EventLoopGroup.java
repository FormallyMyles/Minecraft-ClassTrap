package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.EventLoopGroup
@TrapTag
public interface EventLoopGroup {
	public ChannelFuture register(Channel arg0);
	public ChannelFuture register(Channel arg0, ChannelPromise arg1);
	public EventLoop next();
}
