package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.concurrent.Future
@TrapTag
public interface Future {
	public java.lang.Throwable cause();
	public Future sync();
	public boolean cancel(boolean arg0);
	public boolean isSuccess();
	public java.lang.Object getNow();
	public Future await();
	public boolean await(long arg0, java.util.concurrent.TimeUnit arg1);
	public boolean await(long arg0);
	public boolean isCancellable();
	public Future addListeners(GenericFutureListener[] arg0);
	public Future addListener(GenericFutureListener arg0);
	public Future removeListeners(GenericFutureListener[] arg0);
	public Future removeListener(GenericFutureListener arg0);
	public boolean awaitUninterruptibly(long arg0);
	public boolean awaitUninterruptibly(long arg0, java.util.concurrent.TimeUnit arg1);
	public Future awaitUninterruptibly();
	public Future syncUninterruptibly();
}
