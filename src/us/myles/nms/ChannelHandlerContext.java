package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.ChannelHandlerContext
@TrapTag
public interface ChannelHandlerContext {
	public java.lang.String name();
	public ChannelHandlerContext flush();
	public Channel channel();
	public ChannelHandler handler();
	public EventExecutor executor();
	public boolean isRemoved();
	public ChannelHandlerContext fireChannelInactive();
	public ChannelHandlerContext fireChannelRead(java.lang.Object arg0);
	public ChannelHandlerContext fireUserEventTriggered(java.lang.Object arg0);
	public ChannelHandlerContext fireChannelActive();
	public ChannelHandlerContext fireExceptionCaught(java.lang.Throwable arg0);
	public ChannelHandlerContext fireChannelReadComplete();
	public ChannelHandlerContext fireChannelWritabilityChanged();
	public ChannelHandlerContext fireChannelUnregistered();
	public ChannelHandlerContext fireChannelRegistered();
}
