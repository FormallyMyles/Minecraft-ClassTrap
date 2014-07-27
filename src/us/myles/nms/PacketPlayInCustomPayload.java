package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInCustomPayload
@TrapTag
public interface PacketPlayInCustomPayload {
	public void handle(PacketListener arg0);
	public java.lang.String c();
	public void b(PacketDataSerializer arg0);
	public byte[] e();
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
}
