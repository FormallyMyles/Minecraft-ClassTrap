package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInFlying
@TrapTag
public interface PacketPlayInFlying {
	public void handle(PacketListener arg0);
	public double c();
	public float h();
	public void b(PacketDataSerializer arg0);
	public boolean k();
	public boolean j();
	public double e();
	public void a(PacketDataSerializer arg0);
	public void a(boolean arg0);
	public void a(PacketPlayInListener arg0);
	public double d();
	public float g();
	public boolean i();
	public double f();
}
