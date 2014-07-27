package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInTabComplete
@TrapTag
public interface PacketPlayInTabComplete {
	public void handle(PacketListener arg0);
	public java.lang.String c();
	public java.lang.String b();
	public void b(PacketDataSerializer arg0);
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
}
