package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Vec3D
@TrapTag
public interface Vec3D {
	public Vec3D add(double arg0, double arg1, double arg2);
	public java.lang.String toString();
	public Vec3D c(Vec3D arg0, double arg1);
	public double b();
	public Vec3D b(Vec3D arg0, double arg1);
	public double b(Vec3D arg0);
	public void b(float arg0);
	public void a(float arg0);
	public Vec3D a();
	public double d(double arg0, double arg1, double arg2);
	public double d(Vec3D arg0);
	public Vec3D d(Vec3D arg0, double arg1);
	public double distanceSquared(Vec3D arg0);
}
