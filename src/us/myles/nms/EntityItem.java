package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityItem
@TrapTag
public interface EntityItem {
	public java.lang.String getName();
	public void h();
	public void b(NBTTagCompound arg0);
	public void b(int arg0);
	public void b(java.lang.String arg0);
	public java.lang.String j();
	public void e();
	public boolean a(EntityItem arg0);
	public void a(NBTTagCompound arg0);
	public void a(java.lang.String arg0);
	public java.lang.String i();
	public boolean damageEntity(DamageSource arg0, float arg1);
	public boolean M();
	public void b_(EntityHuman arg0);
	public boolean au();
	public ItemStack getItemStack();
	public void setItemStack(ItemStack arg0);
}
