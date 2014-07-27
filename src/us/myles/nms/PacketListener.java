package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketListener
@TrapTag
public interface PacketListener {
	public void a(IChatBaseComponent arg0);
	public void a(EnumProtocol arg0, EnumProtocol arg1);
	public void a();
}
