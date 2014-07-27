package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.FoodMetaData
@TrapTag
public interface FoodMetaData {
	public boolean c();
	public void b(NBTTagCompound arg0);
	public float e();
	public void a(float arg0);
	public void a(NBTTagCompound arg0);
	public int a();
	public void a(ItemFood arg0, ItemStack arg1);
	public void a(EntityHuman arg0);
	public void eat(int arg0, float arg1);
}
