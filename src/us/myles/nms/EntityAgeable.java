package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityAgeable
@TrapTag
public interface EntityAgeable {
	public void b(NBTTagCompound arg0);
	public void e();
	public void a(NBTTagCompound arg0);
	public void a(boolean arg0);
	public boolean a(EntityHuman arg0);
	public void a(int arg0);
	public boolean isBaby();
	public EntityAgeable createChild(EntityAgeable arg0);
	public void setAge(int arg0);
	public int getAge();
}
