package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PathEntity
@TrapTag
public interface PathEntity {
	public PathPoint c();
	public void c(int arg0);
	public boolean b(Vec3D arg0);
	public void b(int arg0);
	public boolean b();
	public int e();
	public void a();
	public boolean a(PathEntity arg0);
	public Vec3D a(Entity arg0);
	public PathPoint a(int arg0);
	public Vec3D a(Entity arg0, int arg1);
	public int d();
}
