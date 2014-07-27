package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInSettings
@TrapTag
public interface PacketPlayInSettings {
	public void handle(PacketListener arg0);
	public java.lang.String c();
	public boolean h();
	public void b(PacketDataSerializer arg0);
	public java.lang.String b();
	public EnumChatVisibility e();
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public int d();
	public EnumDifficulty g();
	public boolean f();
}
