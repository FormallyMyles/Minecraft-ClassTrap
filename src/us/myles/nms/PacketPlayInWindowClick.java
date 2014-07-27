package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInWindowClick
@TrapTag
public interface PacketPlayInWindowClick {
	public void handle(PacketListener arg0);
	public int c();
	public int h();
	public void b(PacketDataSerializer arg0);
	public java.lang.String b();
	public int e();
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public int d();
	public ItemStack g();
	public short f();
}
