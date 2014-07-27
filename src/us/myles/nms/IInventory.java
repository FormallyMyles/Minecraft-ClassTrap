package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IInventory
@TrapTag
public interface IInventory {
	public int getSize();
	public org.bukkit.inventory.InventoryHolder getOwner();
	public void update();
	public boolean b(int arg0, ItemStack arg1);
	public boolean a(EntityHuman arg0);
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
