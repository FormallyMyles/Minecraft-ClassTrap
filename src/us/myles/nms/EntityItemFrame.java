package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityItemFrame
@TrapTag
public interface EntityItemFrame {
	public boolean c(EntityHuman arg0);
	public void b(Entity arg0);
	public void b(Entity arg0, boolean arg1);
	public void b(NBTTagCompound arg0);
	public void a(NBTTagCompound arg0);
	public int i();
	public boolean damageEntity(DamageSource arg0, float arg1);
	public ItemStack getItem();
	public int f();
	public void setItem(ItemStack arg0);
	public void setRotation(int arg0);
	public int getRotation();
}
