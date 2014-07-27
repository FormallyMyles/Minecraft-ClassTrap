package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.concurrent.EventExecutor
@TrapTag
public interface EventExecutor {
	public EventExecutorGroup parent();
	public EventExecutor next();
	public Promise newPromise();
	public boolean inEventLoop(java.lang.Thread arg0);
	public boolean inEventLoop();
	public ProgressivePromise newProgressivePromise();
	public Future newFailedFuture(java.lang.Throwable arg0);
	public Future newSucceededFuture(java.lang.Object arg0);
}
