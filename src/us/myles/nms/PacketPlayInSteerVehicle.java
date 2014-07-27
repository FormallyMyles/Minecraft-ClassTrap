package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInSteerVehicle
@TrapTag
public interface PacketPlayInSteerVehicle {
	public void handle(PacketListener arg0);
	public float c();
	public void b(PacketDataSerializer arg0);
	public boolean e();
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public float d();
	public boolean f();
}
