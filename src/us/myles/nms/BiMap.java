package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.google.common.collect.BiMap
@TrapTag
public interface BiMap {
	public java.lang.Object put(java.lang.Object arg0, java.lang.Object arg1);
	public java.util.Set values();
	public void putAll(java.util.Map arg0);
	public BiMap inverse();
	public java.lang.Object forcePut(java.lang.Object arg0, java.lang.Object arg1);
}
