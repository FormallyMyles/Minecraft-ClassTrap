package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.EventLoop
@TrapTag
public interface EventLoop {
	public EventLoopGroup parent();
}
