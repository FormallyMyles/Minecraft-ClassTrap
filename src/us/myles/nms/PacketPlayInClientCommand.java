package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInClientCommand
@TrapTag
public interface PacketPlayInClientCommand {
	public void handle(PacketListener arg0);
	public EnumClientCommand c();
	public void b(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public void a(PacketDataSerializer arg0);
}
