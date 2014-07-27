package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Slot
@TrapTag
public interface Slot {
	public void set(ItemStack arg0);
	public boolean a(IInventory arg0, int arg1);
	public ItemStack a(int arg0);
	public void a(ItemStack arg0, ItemStack arg1);
	public void a(EntityHuman arg0, ItemStack arg1);
	public ItemStack getItem();
	public void f();
	public boolean isAllowed(ItemStack arg0);
	public boolean isAllowed(EntityHuman arg0);
	public boolean hasItem();
	public int getMaxStackSize();
}
