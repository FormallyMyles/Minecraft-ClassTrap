package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.DataWatcher
@TrapTag
public interface DataWatcher {
	public byte getByte(int arg0);
	public short getShort(int arg0);
	public int getInt(int arg0);
	public float getFloat(int arg0);
	public java.util.List c();
	public void h(int arg0);
	public java.lang.String getString(int arg0);
	public java.util.List b();
	public void e();
	public void a(PacketDataSerializer arg0);
	public void a(int arg0, int arg1);
	public void a(int arg0, java.lang.Object arg1);
	public boolean a();
	public boolean d();
	public void watch(int arg0, java.lang.Object arg1);
	public ItemStack getItemStack(int arg0);
}
