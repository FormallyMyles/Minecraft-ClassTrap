package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.TileEntityBeacon
@TrapTag
public interface TileEntityBeacon {
	public int getSize();
	public void h();
	public boolean b(int arg0, ItemStack arg1);
	public void b(NBTTagCompound arg0);
	public int k();
	public int j();
	public void e(int arg0);
	public void a(java.lang.String arg0);
	public void a(NBTTagCompound arg0);
	public boolean a(EntityHuman arg0);
	public int l();
	public void d(int arg0);
	public Packet getUpdatePacket();
	public java.lang.String getInventoryName();
	public boolean k_();
	public void l_();
	public ItemStack getItem(int arg0);
	public ItemStack splitStack(int arg0, int arg1);
	public void setItem(int arg0, ItemStack arg1);
	public ItemStack splitWithoutUpdate(int arg0);
	public void setMaxStackSize(int arg0);
	public void startOpen();
	public ItemStack[] getContents();
	public java.util.List getViewers();
	public void onOpen(us.myles.cb.entity.CraftHumanEntity arg0);
	public void onClose(us.myles.cb.entity.CraftHumanEntity arg0);
	public int getMaxStackSize();
}
