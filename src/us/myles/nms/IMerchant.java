package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IMerchant
@TrapTag
public interface IMerchant {
	public EntityHuman b();
	public void a(MerchantRecipe arg0);
	public MerchantRecipeList getOffers(EntityHuman arg0);
	public void a_(ItemStack arg0);
	public void a_(EntityHuman arg0);
}
