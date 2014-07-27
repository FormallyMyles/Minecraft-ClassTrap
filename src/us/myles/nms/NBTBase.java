package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.NBTBase
@TrapTag
public interface NBTBase {
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public NBTBase clone();
	public byte getTypeId();
}
