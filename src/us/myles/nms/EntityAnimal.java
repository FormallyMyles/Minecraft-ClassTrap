package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityAnimal
@TrapTag
public interface EntityAnimal {
	public boolean c(ItemStack arg0);
	public EntityHuman cd();
	public void b(NBTTagCompound arg0);
	public void e();
	public void a(NBTTagCompound arg0);
	public boolean a(EntityHuman arg0);
	public float a(int arg0, int arg1, int arg2);
	public boolean damageEntity(DamageSource arg0, float arg1);
	public void f(EntityHuman arg0);
	public int q();
	public boolean canSpawn();
	public boolean ce();
	public void cf();
	public boolean mate(EntityAnimal arg0);
}
