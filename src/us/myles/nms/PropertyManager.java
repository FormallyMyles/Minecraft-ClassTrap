package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PropertyManager
@TrapTag
public interface PropertyManager {
	public boolean getBoolean(java.lang.String arg0, boolean arg1);
	public int getInt(java.lang.String arg0, int arg1);
	public java.io.File c();
	public java.lang.String getString(java.lang.String arg0, java.lang.String arg1);
	public void a(java.lang.String arg0, java.lang.Object arg1);
	public void a();
	public void savePropertiesFile();
}
