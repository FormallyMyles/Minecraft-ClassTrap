package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PersistentScoreboard
@TrapTag
public interface PersistentScoreboard {
	public void b(NBTTagCompound arg0);
	public void a(NBTTagCompound arg0);
	public void a(Scoreboard arg0);
}
