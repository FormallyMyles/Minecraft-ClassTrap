package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.mojang.authlib.Agent
@TrapTag
public interface Agent {
	public java.lang.String toString();
	public java.lang.String getName();
	public int getVersion();
}
