package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.concurrent.EventExecutorGroup
@TrapTag
public interface EventExecutorGroup {
	public void shutdown();
	public java.util.Iterator iterator();
	public EventExecutor next();
	public Future submit(java.lang.Runnable arg0, java.lang.Object arg1);
	public Future submit(java.util.concurrent.Callable arg0);
	public Future submit(java.lang.Runnable arg0);
	public java.util.List shutdownNow();
	public ScheduledFuture schedule(java.lang.Runnable arg0, long arg1, java.util.concurrent.TimeUnit arg2);
	public ScheduledFuture schedule(java.util.concurrent.Callable arg0, long arg1, java.util.concurrent.TimeUnit arg2);
	public ScheduledFuture scheduleAtFixedRate(java.lang.Runnable arg0, long arg1, long arg2, java.util.concurrent.TimeUnit arg3);
	public Future terminationFuture();
	public Future shutdownGracefully();
	public Future shutdownGracefully(long arg0, long arg1, java.util.concurrent.TimeUnit arg2);
	public boolean isShuttingDown();
	public ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable arg0, long arg1, long arg2, java.util.concurrent.TimeUnit arg3);
}
