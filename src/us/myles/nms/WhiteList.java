package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WhiteList
@TrapTag
public interface WhiteList {
	public java.lang.String[] getEntries();
	public GameProfile a(java.lang.String arg0);
	public boolean isWhitelisted(GameProfile arg0);
}
