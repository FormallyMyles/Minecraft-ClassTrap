package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.NBTTagList
@TrapTag
public interface NBTTagList {
	public void add(NBTBase arg0);
	public NBTTagCompound get(int arg0);
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public NBTBase clone();
	public int size();
	public int[] c(int arg0);
	public float e(int arg0);
	public int d();
	public double d(int arg0);
	public java.lang.String f(int arg0);
	public byte getTypeId();
}
