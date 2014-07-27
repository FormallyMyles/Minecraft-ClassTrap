package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.InventorySubcontainer
@TrapTag
public interface InventorySubcontainer {
	public int getSize();
	public void update();
	public boolean b(int arg0, ItemStack arg1);
	public void b(IInventoryListener arg0);
	public void a(java.lang.String arg0);
	public void a(IInventoryListener arg0);
	public boolean a(EntityHuman arg0);
	public java.lang.String getInventoryName();
	public boolean k_();
	public void l_();
	public ItemStack getItem(int arg0);
	public ItemStack splitStack(int arg0, int arg1);
	public void setItem(int arg0, ItemStack arg1);
	public ItemStack splitWithoutUpdate(int arg0);
	public void startOpen();
	public int getMaxStackSize();
}
