package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.CommandBlockListenerAbstract
@TrapTag
public interface CommandBlockListenerAbstract {
	public java.lang.String getName();
	public IChatBaseComponent h();
	public void b(java.lang.String arg0);
	public void b(NBTTagCompound arg0);
	public void b(IChatBaseComponent arg0);
	public void e();
	public void a(World arg0);
	public void a(java.lang.String arg0);
	public boolean a(int arg0, java.lang.String arg1);
	public void a(NBTTagCompound arg0);
	public int g();
	public java.lang.String i();
	public void sendMessage(IChatBaseComponent arg0);
	public IChatBaseComponent getScoreboardDisplayName();
}
