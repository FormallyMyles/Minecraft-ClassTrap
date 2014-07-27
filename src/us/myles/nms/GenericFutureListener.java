package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.concurrent.GenericFutureListener
@TrapTag
public interface GenericFutureListener {
	public void operationComplete(Future arg0);
}
