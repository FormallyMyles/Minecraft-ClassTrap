package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Item
@TrapTag
public interface Item {
	public java.lang.String getName();
	public Item c(java.lang.String arg0);
	public int c();
	public Item c(Item arg0);
	public boolean h();
	public boolean m(ItemStack arg0);
	public boolean s();
	public ItemStack b(ItemStack arg0, World arg1, EntityHuman arg2);
	public Multimap k();
	public java.lang.String k(ItemStack arg0);
	public Item e(int arg0);
	public Item t();
	public Item a(CreativeModeTab arg0);
	public boolean a(ItemStack arg0, ItemStack arg1);
	public void a(ItemStack arg0, World arg1, EntityHuman arg2, int arg3);
	public java.lang.String a(ItemStack arg0);
	public void a(ItemStack arg0, World arg1, Entity arg2, int arg3, boolean arg4);
	public boolean a(ItemStack arg0, EntityLiving arg1, EntityLiving arg2);
	public boolean a(ItemStack arg0, World arg1, Block arg2, int arg3, int arg4, int arg5, EntityLiving arg6);
	public ItemStack a(ItemStack arg0, World arg1, EntityHuman arg2);
	public boolean a(ItemStack arg0, EntityHuman arg1, EntityLiving arg2);
	public boolean l(ItemStack arg0);
	public void d(ItemStack arg0, World arg1, EntityHuman arg2);
	public EnumAnimation d(ItemStack arg0);
	public java.lang.String i(ItemStack arg0);
	public boolean v();
	public java.lang.String n(ItemStack arg0);
	public boolean n();
	public EnumItemRarity f(ItemStack arg0);
	public boolean e_(ItemStack arg0);
	public Item q();
	public boolean u();
	public int getMaxStackSize();
	public boolean usesDurability();
	public float getDestroySpeed(ItemStack arg0, Block arg1);
	public int getMaxDurability();
	public boolean canDestroySpecialBlock(Block arg0);
	public int filterData(int arg0);
	public boolean interactWith(ItemStack arg0, EntityHuman arg1, World arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9);
	public int d_(ItemStack arg0);
}
