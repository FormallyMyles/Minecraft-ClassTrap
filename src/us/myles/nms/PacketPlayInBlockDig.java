package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInBlockDig
@TrapTag
public interface PacketPlayInBlockDig {
	public void handle(PacketListener arg0);
	public int c();
	public void b(PacketDataSerializer arg0);
	public int e();
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public int d();
	public int g();
	public int f();
}
