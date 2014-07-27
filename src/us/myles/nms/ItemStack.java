package us.myles.nms;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//net.minecraft.server.v1_7_R3.ItemStack
@TrapTag
public interface ItemStack {
	public java.lang.String toString();
	public EntityItemFrame B();
	public Multimap D();
	public java.lang.String getName();
	public NBTTagCompound save(NBTTagCompound arg0);
	public IChatBaseComponent E();
	public ItemStack c(java.lang.String arg0);
	public void c(NBTTagCompound arg0);
	public boolean x();
	public boolean A();
	public boolean hasName();
	public boolean b(Block arg0);
	public void b(World arg0, EntityHuman arg1, int arg2);
	public ItemStack b(World arg0, EntityHuman arg1);
	public int j();
	public void t();
	public int getData();
	public ItemStack a(int arg0);
	public java.lang.String a();
	public void a(World arg0, EntityHuman arg1, int arg2);
	public void a(World arg0, Entity arg1, int arg2, boolean arg3);
	public void a(World arg0, Block arg1, int arg2, int arg3, int arg4, EntityHuman arg5);
	public void a(EntityLiving arg0, EntityHuman arg1);
	public void a(EntityItemFrame arg0);
	public float a(Block arg0);
	public void a(java.lang.String arg0, NBTBase arg1);
	public ItemStack a(World arg0, EntityHuman arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "a")
	public boolean a2(EntityHuman arg0, EntityLiving arg1);
	public int l();
	public boolean g();
	public boolean z();
	public boolean i();
	public int n();
	public Item getItem();
	public EnumAnimation o();
	public boolean usesData();
	public EnumItemRarity w();
	public ItemStack cloneItemStack();
	public void setItem(Item arg0);
	public void setData(int arg0);
	public boolean doMaterialsMatch(ItemStack arg0);
	public boolean isStackable();
	public void damage(int arg0, EntityLiving arg1);
	public int getMaxStackSize();
	public boolean hasEnchantments();
	public void addEnchantment(Enchantment arg0, int arg1);
	public NBTTagList getEnchantments();
	public int getRepairCost();
	public void setRepairCost(int arg0);
	public NBTTagCompound getTag();
	public boolean hasTag();
	public boolean placeItem(EntityHuman arg0, World arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8);
	public boolean isDamaged(int arg0, java.util.Random arg1);
	public void setTag(NBTTagCompound arg0);
}
