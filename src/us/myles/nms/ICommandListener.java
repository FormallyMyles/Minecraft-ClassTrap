package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ICommandListener
@TrapTag
public interface ICommandListener {
	public java.lang.String getName();
	public boolean a(int arg0, java.lang.String arg1);
	public void sendMessage(IChatBaseComponent arg0);
	public World getWorld();
	public ChunkCoordinates getChunkCoordinates();
	public IChatBaseComponent getScoreboardDisplayName();
}
