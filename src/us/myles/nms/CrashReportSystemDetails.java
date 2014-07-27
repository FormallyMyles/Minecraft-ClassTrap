package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.CrashReportSystemDetails
@TrapTag
public interface CrashReportSystemDetails {
	public void b(int arg0);
	public boolean a(java.lang.StackTraceElement arg0, java.lang.StackTraceElement arg1);
	public void a(java.lang.StringBuilder arg0);
	public java.lang.StackTraceElement[] a();
	public void a(java.lang.String arg0, java.util.concurrent.Callable arg1);
	public void a(java.lang.String arg0, java.lang.Object arg1);
	public void a(java.lang.String arg0, java.lang.Throwable arg1);
	public int a(int arg0);
}
