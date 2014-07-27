package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.mojang.authlib.ProfileLookupCallback
@TrapTag
public interface ProfileLookupCallback {
	public void onProfileLookupSucceeded(GameProfile arg0);
	public void onProfileLookupFailed(GameProfile arg0, java.lang.Exception arg1);
}
