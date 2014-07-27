package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IPlayerFileData
@TrapTag
public interface IPlayerFileData {
	public NBTTagCompound load(EntityHuman arg0);
	public void save(EntityHuman arg0);
	public java.lang.String[] getSeenPlayers();
}
