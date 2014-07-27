package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.MerchantRecipe
@TrapTag
public interface MerchantRecipe {
	public boolean b(MerchantRecipe arg0);
	public void a(int arg0);
	public boolean a(MerchantRecipe arg0);
	public void a(NBTTagCompound arg0);
	public boolean g();
	public NBTTagCompound i();
	public void f();
	public boolean hasSecondItem();
	public ItemStack getBuyItem2();
	public ItemStack getBuyItem1();
	public ItemStack getBuyItem3();
}
