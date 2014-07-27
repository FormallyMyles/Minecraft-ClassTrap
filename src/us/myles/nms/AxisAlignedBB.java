package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.AxisAlignedBB
@TrapTag
public interface AxisAlignedBB {
	public java.lang.String toString();
	public AxisAlignedBB clone();
	public AxisAlignedBB grow(double arg0, double arg1, double arg2);
	public AxisAlignedBB c(double arg0, double arg1, double arg2);
	public double c(AxisAlignedBB arg0, double arg1);
	public boolean b(AxisAlignedBB arg0);
	public AxisAlignedBB b(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5);
	public double b(AxisAlignedBB arg0, double arg1);
	public MovingObjectPosition a(Vec3D arg0, Vec3D arg1);
	public double a();
	public AxisAlignedBB a(double arg0, double arg1, double arg2);
	public AxisAlignedBB a(AxisAlignedBB arg0);
	public double a(AxisAlignedBB arg0, double arg1);
	public boolean a(Vec3D arg0);
	public AxisAlignedBB d(double arg0, double arg1, double arg2);
	public void d(AxisAlignedBB arg0);
	public AxisAlignedBB shrink(double arg0, double arg1, double arg2);
}
