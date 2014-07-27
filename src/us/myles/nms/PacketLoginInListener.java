package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketLoginInListener
@TrapTag
public interface PacketLoginInListener {
	public void a(PacketLoginInStart arg0);
	public void a(PacketLoginInEncryptionBegin arg0);
}
