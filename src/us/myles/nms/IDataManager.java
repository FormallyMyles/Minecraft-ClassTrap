package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IDataManager
@TrapTag
public interface IDataManager {
	public void a();
	public java.lang.String g();
	public WorldData getWorldData();
	public void checkSession();
	public java.util.UUID getUUID();
	public IChunkLoader createChunkLoader(WorldProvider arg0);
	public void saveWorldData(WorldData arg0);
	public void saveWorldData(WorldData arg0, NBTTagCompound arg1);
	public IPlayerFileData getPlayerFileData();
	public java.io.File getDirectory();
	public java.io.File getDataFile(java.lang.String arg0);
}
