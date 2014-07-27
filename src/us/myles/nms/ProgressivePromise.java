package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.concurrent.ProgressivePromise
@TrapTag
public interface ProgressivePromise {
	public ProgressivePromise sync();
	public ProgressivePromise await();
	public ProgressivePromise setSuccess(java.lang.Object arg0);
	public ProgressivePromise setFailure(java.lang.Throwable arg0);
	public boolean tryProgress(long arg0, long arg1);
	public ProgressivePromise setProgress(long arg0, long arg1);
	public ProgressivePromise addListeners(GenericFutureListener[] arg0);
	public ProgressivePromise addListener(GenericFutureListener arg0);
	public ProgressivePromise removeListeners(GenericFutureListener[] arg0);
	public ProgressivePromise removeListener(GenericFutureListener arg0);
	public ProgressivePromise awaitUninterruptibly();
	public ProgressivePromise syncUninterruptibly();
}
