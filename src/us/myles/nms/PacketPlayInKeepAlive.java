package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInKeepAlive
@TrapTag
public interface PacketPlayInKeepAlive {
	public void handle(PacketListener arg0);
	public int c();
	public void b(PacketDataSerializer arg0);
	public void a(PacketDataSerializer arg0);
	public boolean a();
	public void a(PacketPlayInListener arg0);
}
