package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.ChannelConfig
@TrapTag
public interface ChannelConfig {
	public java.lang.Object getOption(ChannelOption arg0);
	public boolean setOption(ChannelOption arg0, java.lang.Object arg1);
	public ChannelConfig setAllocator(ByteBufAllocator arg0);
	public java.util.Map getOptions();
	public boolean setOptions(java.util.Map arg0);
	public ByteBufAllocator getAllocator();
	public boolean isAutoRead();
	public ChannelConfig setAutoRead(boolean arg0);
	public int getConnectTimeoutMillis();
	public ChannelConfig setConnectTimeoutMillis(int arg0);
	public int getMaxMessagesPerRead();
	public ChannelConfig setWriteSpinCount(int arg0);
	public ChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator arg0);
	public int getWriteSpinCount();
	public int getWriteBufferLowWaterMark();
	public ChannelConfig setMessageSizeEstimator(MessageSizeEstimator arg0);
	public ChannelConfig setMaxMessagesPerRead(int arg0);
	public RecvByteBufAllocator getRecvByteBufAllocator();
	public int getWriteBufferHighWaterMark();
	public ChannelConfig setWriteBufferLowWaterMark(int arg0);
	public ChannelConfig setWriteBufferHighWaterMark(int arg0);
	public MessageSizeEstimator getMessageSizeEstimator();
}
