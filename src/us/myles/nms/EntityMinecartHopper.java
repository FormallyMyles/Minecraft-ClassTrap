package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityMinecartHopper
@TrapTag
public interface EntityMinecartHopper {
	public int getSize();
	public boolean c(EntityHuman arg0);
	public void h();
	public int m();
	public int s();
	public void a(DamageSource arg0);
	public void a(int arg0, int arg1, int arg2, boolean arg3);
	public boolean v();
	public World getWorld();
	public void n(int arg0);
	public void f(boolean arg0);
	public Block o();
	public double aC();
	public boolean aF();
	public double aE();
	public boolean aG();
	public double aD();
}
