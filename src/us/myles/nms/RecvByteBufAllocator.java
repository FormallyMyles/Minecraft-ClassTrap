package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.RecvByteBufAllocator
@TrapTag
public interface RecvByteBufAllocator {
	public Handle newHandle();
}
