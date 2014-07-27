package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Container
@TrapTag
public interface Container {
	public Slot getSlot(int arg0);
	public boolean c(EntityHuman arg0);
	public boolean b(Slot arg0);
	public ItemStack b(EntityHuman arg0, int arg1);
	public void b();
	public void b(EntityHuman arg0);
	public boolean a(EntityHuman arg0);
	public void a(EntityHuman arg0, boolean arg1);
	public java.util.List a();
	public boolean a(EntityHuman arg0, int arg1);
	public Slot a(IInventory arg0, int arg1);
	public boolean a(ItemStack arg0, Slot arg1);
	public void a(IInventory arg0);
	public void addSlotListener(ICrafting arg0);
	public org.bukkit.inventory.InventoryView getBukkitView();
	public void setItem(int arg0, ItemStack arg1);
	public void transferTo(Container arg0, us.myles.cb.entity.CraftHumanEntity arg1);
	public ItemStack clickItem(int arg0, int arg1, int arg2, EntityHuman arg3);
}
