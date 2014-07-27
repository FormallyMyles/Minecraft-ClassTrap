package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.LoginListener
@TrapTag
public interface LoginListener {
	public java.lang.String getName();
	public void c();
	public void a(IChatBaseComponent arg0);
	public void a(EnumProtocol arg0, EnumProtocol arg1);
	public void a(PacketLoginInEncryptionBegin arg0);
	public void a(PacketLoginInStart arg0);
	public void a();
	public void disconnect(java.lang.String arg0);
}
