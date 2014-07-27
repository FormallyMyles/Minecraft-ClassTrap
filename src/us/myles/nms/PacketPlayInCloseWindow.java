package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInCloseWindow
@TrapTag
public interface PacketPlayInCloseWindow {
	public void handle(PacketListener arg0);
	public void b(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public void a(PacketDataSerializer arg0);
}
