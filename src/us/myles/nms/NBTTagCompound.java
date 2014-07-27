package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.NBTTagCompound
@TrapTag
public interface NBTTagCompound {
	public void remove(java.lang.String arg0);
	public NBTBase get(java.lang.String arg0);
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public NBTBase clone();
	public boolean getBoolean(java.lang.String arg0);
	public byte getByte(java.lang.String arg0);
	public short getShort(java.lang.String arg0);
	public int getInt(java.lang.String arg0);
	public long getLong(java.lang.String arg0);
	public float getFloat(java.lang.String arg0);
	public double getDouble(java.lang.String arg0);
	public boolean isEmpty();
	public void set(java.lang.String arg0, NBTBase arg1);
	public void setBoolean(java.lang.String arg0, boolean arg1);
	public void setByte(java.lang.String arg0, byte arg1);
	public void setDouble(java.lang.String arg0, double arg1);
	public void setFloat(java.lang.String arg0, float arg1);
	public void setInt(java.lang.String arg0, int arg1);
	public void setLong(java.lang.String arg0, long arg1);
	public void setShort(java.lang.String arg0, short arg1);
	public java.util.Set c();
	public java.lang.String getString(java.lang.String arg0);
	public byte b(java.lang.String arg0);
	public boolean hasKeyOfType(java.lang.String arg0, int arg1);
	public void setString(java.lang.String arg0, java.lang.String arg1);
	public NBTTagList getList(java.lang.String arg0, int arg1);
	public boolean hasKey(java.lang.String arg0);
	public byte getTypeId();
	public int[] getIntArray(java.lang.String arg0);
	public void setByteArray(java.lang.String arg0, byte[] arg1);
	public NBTTagCompound getCompound(java.lang.String arg0);
	public byte[] getByteArray(java.lang.String arg0);
	public void setIntArray(java.lang.String arg0, int[] arg1);
}
