package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.mojang.authlib.minecraft.MinecraftSessionService
@TrapTag
public interface MinecraftSessionService {
	public java.util.Map getTextures(GameProfile arg0, boolean arg1);
	public void joinServer(GameProfile arg0, java.lang.String arg1, java.lang.String arg2);
	public GameProfile fillProfileProperties(GameProfile arg0, boolean arg1);
	public GameProfile hasJoinedServer(GameProfile arg0, java.lang.String arg1);
}
