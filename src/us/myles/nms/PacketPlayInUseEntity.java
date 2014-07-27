package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInUseEntity
@TrapTag
public interface PacketPlayInUseEntity {
	public void handle(PacketListener arg0);
	public EnumEntityUseAction c();
	public void b(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public Entity a(World arg0);
	public void a(PacketDataSerializer arg0);
}
