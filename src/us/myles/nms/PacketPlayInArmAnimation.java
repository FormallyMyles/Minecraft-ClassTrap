package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInArmAnimation
@TrapTag
public interface PacketPlayInArmAnimation {
	public void handle(PacketListener arg0);
	public java.lang.String b();
	public void b(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public void a(PacketDataSerializer arg0);
	public int d();
}
