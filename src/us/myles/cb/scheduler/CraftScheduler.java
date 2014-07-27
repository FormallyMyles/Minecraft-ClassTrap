package us.myles.cb.scheduler;

import us.myles.classtrap.TrapTag;

//org.bukkit.craftbukkit.v1_7_R3.scheduler.CraftScheduler
@TrapTag
public interface CraftScheduler {
	public java.lang.String toString();
	public boolean isQueued(int arg0);
	public java.util.List getActiveWorkers();
	public void mainThreadHeartbeat(int arg0);
	public int scheduleAsyncRepeatingTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2, long arg3);
	public void cancelAllTasks();
	public java.util.concurrent.Future callSyncMethod(org.bukkit.plugin.Plugin arg0, java.util.concurrent.Callable arg1);
	public int scheduleSyncRepeatingTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2, long arg3);
	public org.bukkit.scheduler.BukkitTask runTaskLaterAsynchronously(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2);
	public org.bukkit.scheduler.BukkitTask runTaskTimerAsynchronously(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2, long arg3);
	public int scheduleSyncDelayedTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2);
	public int scheduleSyncDelayedTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1);
	public int scheduleAsyncDelayedTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1);
	public int scheduleAsyncDelayedTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2);
	public boolean isCurrentlyRunning(int arg0);
	public org.bukkit.scheduler.BukkitTask runTaskAsynchronously(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1);
	public java.util.List getPendingTasks();
	public void cancelTasks(org.bukkit.plugin.Plugin arg0);
	public void cancelTask(int arg0);
	public org.bukkit.scheduler.BukkitTask runTask(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1);
	public org.bukkit.scheduler.BukkitTask runTaskLater(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2);
	public org.bukkit.scheduler.BukkitTask runTaskTimer(org.bukkit.plugin.Plugin arg0, java.lang.Runnable arg1, long arg2, long arg3);
}
