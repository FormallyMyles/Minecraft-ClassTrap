package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.mojang.authlib.GameProfileRepository
@TrapTag
public interface GameProfileRepository {
	public void findProfilesByNames(java.lang.String[] arg0, Agent arg1, ProfileLookupCallback arg2);
}
