package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.mojang.authlib.GameProfile
@TrapTag
public interface GameProfile {
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public java.lang.String getName();
	public PropertyMap getProperties();
	public java.util.UUID getId();
	public boolean isLegacy();
	public boolean isComplete();
}
