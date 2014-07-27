package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.MobEffect
@TrapTag
public interface MobEffect {
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public void b(EntityLiving arg0);
	public void a(MobEffect arg0);
	public NBTTagCompound a(NBTTagCompound arg0);
	public java.lang.String f();
	public int getDuration();
	public int getAmplifier();
	public int getEffectId();
	public boolean tick(EntityLiving arg0);
	public boolean isAmbient();
	public void setSplash(boolean arg0);
}
