package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.ChannelHandler
@TrapTag
public interface ChannelHandler {
	public void handlerAdded(ChannelHandlerContext arg0);
	public void exceptionCaught(ChannelHandlerContext arg0, java.lang.Throwable arg1);
	public void handlerRemoved(ChannelHandlerContext arg0);
}
