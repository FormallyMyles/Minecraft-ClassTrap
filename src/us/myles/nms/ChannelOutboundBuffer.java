package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.ChannelOutboundBuffer
@TrapTag
public interface ChannelOutboundBuffer {
	public boolean remove(java.lang.Throwable arg0);
	public boolean remove();
	public boolean isEmpty();
	public int size();
	public java.lang.Object current();
	public void current(java.lang.Object arg0);
	public int nioBufferCount();
	public java.nio.ByteBuffer[] nioBuffers();
	public void progress(long arg0);
	public void recycle();
	public long nioBufferSize();
}
