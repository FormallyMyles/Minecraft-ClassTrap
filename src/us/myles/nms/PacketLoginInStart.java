package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketLoginInStart
@TrapTag
public interface PacketLoginInStart {
	public void handle(PacketListener arg0);
	public GameProfile c();
	public void b(PacketDataSerializer arg0);
	public void a(PacketLoginInListener arg0);
	public void a(PacketDataSerializer arg0);
}
