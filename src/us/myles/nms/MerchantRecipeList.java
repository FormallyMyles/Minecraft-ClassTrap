package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.MerchantRecipeList
@TrapTag
public interface MerchantRecipeList {
	public void a(NBTTagCompound arg0);
	public void a(PacketDataSerializer arg0);
	public NBTTagCompound a();
	public void a(MerchantRecipe arg0);
	public MerchantRecipe a(ItemStack arg0, ItemStack arg1, int arg2);
}
