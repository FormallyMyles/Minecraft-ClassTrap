package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.buffer.ByteBufProcessor
@TrapTag
public interface ByteBufProcessor {
	public boolean process(byte arg0);
}
