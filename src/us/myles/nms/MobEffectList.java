package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.MobEffectList
@TrapTag
public interface MobEffectList {
	public int getId();
	public void b(EntityLiving arg0, AttributeMapBase arg1, int arg2);
	public MobEffectList b(java.lang.String arg0);
	public int j();
	public void a(EntityLiving arg0, AttributeMapBase arg1, int arg2);
	public java.lang.String a();
	public double a(int arg0, AttributeModifier arg1);
	public MobEffectList a(IAttribute arg0, java.lang.String arg1, double arg2, int arg3);
	public boolean a(int arg0, int arg1);
	public boolean i();
	public void tick(EntityLiving arg0, int arg1);
	public void applyInstantEffect(EntityLiving arg0, EntityLiving arg1, int arg2, double arg3);
	public void applyInstantEffect(EntityLiving arg0, EntityLiving arg1, int arg2, double arg3, EntityPotion arg4);
	public double getDurationModifier();
	public boolean isInstant();
}
