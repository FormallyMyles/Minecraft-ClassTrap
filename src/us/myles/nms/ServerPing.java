package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ServerPing
@TrapTag
public interface ServerPing {
	public ServerPingServerData c();
	public ServerPingPlayerSample b();
	public IChatBaseComponent a();
	public java.lang.String d();
	public void setMOTD(IChatBaseComponent arg0);
	public void setServerInfo(ServerPingServerData arg0);
	public void setFavicon(java.lang.String arg0);
	public void setPlayerSample(ServerPingPlayerSample arg0);
}
