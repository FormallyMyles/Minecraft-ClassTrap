package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.channel.MessageSizeEstimator
@TrapTag
public interface MessageSizeEstimator {
	public Handle newHandle();
}
