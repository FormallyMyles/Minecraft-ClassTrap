package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.RecvByteBufAllocator$Handle
@TrapTag
public interface Handle {
	public ByteBuf allocate(ByteBufAllocator arg0);
	public void record(int arg0);
	public int guess();
}
