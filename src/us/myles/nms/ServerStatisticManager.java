package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ServerStatisticManager
@TrapTag
public interface ServerStatisticManager {
	public java.util.Set c();
	public void b();
	public boolean e();
	public void a(EntityPlayer arg0);
	public void a();
	public java.util.Map a(java.lang.String arg0);
	public void d();
	public void setStatistic(EntityHuman arg0, Statistic arg1, int arg2);
	public void updateStatistics(EntityPlayer arg0);
}
