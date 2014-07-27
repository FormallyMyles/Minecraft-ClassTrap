package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.GameRules
@TrapTag
public interface GameRules {
	public java.lang.String get(java.lang.String arg0);
	public boolean getBoolean(java.lang.String arg0);
	public void set(java.lang.String arg0, java.lang.String arg1);
	public java.lang.String[] b();
	public boolean e(java.lang.String arg0);
	public NBTTagCompound a();
	public void a(java.lang.String arg0, java.lang.String arg1);
	public void a(NBTTagCompound arg0);
}
