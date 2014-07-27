package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInAbilities
@TrapTag
public interface PacketPlayInAbilities {
	public void handle(PacketListener arg0);
	public boolean c();
	public void c(boolean arg0);
	public float h();
	public void b(PacketDataSerializer arg0);
	public void b(boolean arg0);
	public void b(float arg0);
	public java.lang.String b();
	public boolean e();
	public void a(float arg0);
	public void a(PacketPlayInListener arg0);
	public void a(boolean arg0);
	public void a(PacketDataSerializer arg0);
	public void d(boolean arg0);
	public float g();
	public boolean f();
	public boolean isFlying();
}
