package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketLoginInEncryptionBegin
@TrapTag
public interface PacketLoginInEncryptionBegin {
	public void handle(PacketListener arg0);
	public void b(PacketDataSerializer arg0);
	public byte[] b(java.security.PrivateKey arg0);
	public void a(PacketLoginInListener arg0);
	public javax.crypto.SecretKey a(java.security.PrivateKey arg0);
	public void a(PacketDataSerializer arg0);
}
