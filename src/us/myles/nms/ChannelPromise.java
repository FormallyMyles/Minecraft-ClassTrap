package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.ChannelPromise
@TrapTag
public interface ChannelPromise {
	public Channel channel();
	public ChannelPromise sync();
	public ChannelPromise await();
	public ChannelPromise setSuccess(java.lang.Void arg0);
	public ChannelPromise setSuccess();
	public ChannelPromise setFailure(java.lang.Throwable arg0);
	public boolean trySuccess();
	public ChannelPromise addListeners(GenericFutureListener[] arg0);
	public ChannelPromise addListener(GenericFutureListener arg0);
	public ChannelPromise removeListeners(GenericFutureListener[] arg0);
	public ChannelPromise removeListener(GenericFutureListener arg0);
	public ChannelPromise awaitUninterruptibly();
	public ChannelPromise syncUninterruptibly();
}
