package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.CrashReport
@TrapTag
public interface CrashReport {
	public java.lang.Throwable b();
	public java.lang.String e();
	public boolean a(java.io.File arg0);
	public CrashReportSystemDetails a(java.lang.String arg0);
	public CrashReportSystemDetails a(java.lang.String arg0, int arg1);
	public void a(java.lang.StringBuilder arg0);
	public java.lang.String a();
	public java.lang.String d();
	public CrashReportSystemDetails g();
}
