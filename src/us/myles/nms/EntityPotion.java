package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityPotion
@TrapTag
public interface EntityPotion {
	public void b(NBTTagCompound arg0);
	public void a(NBTTagCompound arg0);
	public int getPotionValue();
	public void setPotionValue(int arg0);
}
