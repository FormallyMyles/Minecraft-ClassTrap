package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.com.google.common.collect.Multiset
@TrapTag
public interface Multiset {
	public boolean add(java.lang.Object arg0);
	public int add(java.lang.Object arg0, int arg1);
	public boolean remove(java.lang.Object arg0);
	public int remove(java.lang.Object arg0, int arg1);
	public int count(java.lang.Object arg0);
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public boolean contains(java.lang.Object arg0);
	public java.util.Set entrySet();
	public java.util.Iterator iterator();
	public boolean containsAll(java.util.Collection arg0);
	public boolean removeAll(java.util.Collection arg0);
	public boolean retainAll(java.util.Collection arg0);
	public java.util.Set elementSet();
	public boolean setCount(java.lang.Object arg0, int arg1, int arg2);
	public int setCount(java.lang.Object arg0, int arg1);
}
