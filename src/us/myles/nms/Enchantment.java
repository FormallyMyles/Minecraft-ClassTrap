package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Enchantment
@TrapTag
public interface Enchantment {
	public java.lang.String c(int arg0);
	public int b(int arg0);
	public Enchantment b(java.lang.String arg0);
	public void b(EntityLiving arg0, Entity arg1, int arg2);
	public java.lang.String a();
	public boolean a(Enchantment arg0);
	public void a(EntityLiving arg0, Entity arg1, int arg2);
	public int a(int arg0);
	public float a(int arg0, EnumMonsterType arg1);
	public int a(int arg0, DamageSource arg1);
	public int getRandomWeight();
	public int getMaxLevel();
	public boolean canEnchant(ItemStack arg0);
	public int getStartLevel();
}
