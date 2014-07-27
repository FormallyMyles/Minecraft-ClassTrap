package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.InventoryEnderChest
@TrapTag
public interface InventoryEnderChest {
	public NBTTagList h();
	public org.bukkit.inventory.InventoryHolder getOwner();
	public void a(TileEntityEnderChest arg0);
	public void a(NBTTagList arg0);
	public boolean a(EntityHuman arg0);
	public void l_();
	public void setMaxStackSize(int arg0);
	public void startOpen();
	public ItemStack[] getContents();
	public java.util.List getViewers();
	public void onOpen(us.myles.cb.entity.CraftHumanEntity arg0);
	public void onClose(us.myles.cb.entity.CraftHumanEntity arg0);
	public int getMaxStackSize();
}
