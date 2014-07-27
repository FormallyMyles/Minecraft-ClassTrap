package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.concurrent.Promise
@TrapTag
public interface Promise {
	public Promise sync();
	public Promise await();
	public Promise setSuccess(java.lang.Object arg0);
	public Promise setFailure(java.lang.Throwable arg0);
	public boolean tryFailure(java.lang.Throwable arg0);
	public boolean trySuccess(java.lang.Object arg0);
	public Promise addListeners(GenericFutureListener[] arg0);
	public Promise addListener(GenericFutureListener arg0);
	public Promise removeListeners(GenericFutureListener[] arg0);
	public boolean setUncancellable();
	public Promise removeListener(GenericFutureListener arg0);
	public Promise awaitUninterruptibly();
	public Promise syncUninterruptibly();
}
