package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInChat
@TrapTag
public interface PacketPlayInChat {
	public void handle(PacketListener arg0);
	public java.lang.String c();
	public void b(PacketDataSerializer arg0);
	public java.lang.String b();
	public void a(PacketDataSerializer arg0);
	public boolean a();
	public void a(PacketPlayInListener arg0);
}
