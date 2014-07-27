package us.myles.nms;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//net.minecraft.server.v1_7_R3.DedicatedPlayerList
@TrapTag
public interface DedicatedPlayerList {
	public DedicatedServer getServer();
	@TrapTag(type = TrapTagType.METHOD, value = "getServer")
	public MinecraftServer getServer2();
	public void reloadWhitelist();
	public void addWhitelist(GameProfile arg0);
	public void removeOp(GameProfile arg0);
	public void addOp(GameProfile arg0);
	public void removeWhitelist(GameProfile arg0);
	public boolean isWhitelisted(GameProfile arg0);
	public void setHasWhitelist(boolean arg0);
}
