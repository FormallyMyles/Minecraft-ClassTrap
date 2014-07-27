package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IpBanList
@TrapTag
public interface IpBanList {
	public IpBanEntry get(java.net.SocketAddress arg0);
	public boolean isBanned(java.net.SocketAddress arg0);
}
