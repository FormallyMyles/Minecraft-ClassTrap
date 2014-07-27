package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WorldType
@TrapTag
public interface WorldType {
	public java.lang.String name();
	public int getVersion();
	public WorldType a(int arg0);
	public int g();
	public boolean f();
}
