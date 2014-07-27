package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.google.common.collect.Multimap
@TrapTag
public interface Multimap {
	public boolean remove(java.lang.Object arg0, java.lang.Object arg1);
	public java.util.Collection get(java.lang.Object arg0);
	public boolean put(java.lang.Object arg0, java.lang.Object arg1);
	public boolean equals(java.lang.Object arg0);
	public java.util.Collection values();
	public int hashCode();
	public void clear();
	public boolean isEmpty();
	public int size();
	public boolean putAll(java.lang.Object arg0, java.lang.Iterable arg1);
	public boolean putAll(Multimap arg0);
	public java.util.Set keySet();
	public Multiset keys();
	public boolean containsKey(java.lang.Object arg0);
	public boolean containsValue(java.lang.Object arg0);
	public java.util.Collection removeAll(java.lang.Object arg0);
	public java.util.Collection entries();
	public java.util.Collection replaceValues(java.lang.Object arg0, java.lang.Iterable arg1);
	public boolean containsEntry(java.lang.Object arg0, java.lang.Object arg1);
	public java.util.Map asMap();
}
