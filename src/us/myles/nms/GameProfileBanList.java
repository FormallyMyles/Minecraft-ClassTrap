package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.GameProfileBanList
@TrapTag
public interface GameProfileBanList {
	public java.lang.String[] getEntries();
	public GameProfile a(java.lang.String arg0);
	public boolean isBanned(GameProfile arg0);
}
