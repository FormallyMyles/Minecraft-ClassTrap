package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInEnchantItem
@TrapTag
public interface PacketPlayInEnchantItem {
	public void handle(PacketListener arg0);
	public int c();
	public java.lang.String b();
	public void b(PacketDataSerializer arg0);
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public int d();
}
