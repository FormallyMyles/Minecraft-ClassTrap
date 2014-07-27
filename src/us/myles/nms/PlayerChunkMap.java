package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PlayerChunkMap
@TrapTag
public interface PlayerChunkMap {
	public void flush();
	public void b(EntityPlayer arg0);
	public boolean a(EntityPlayer arg0, int arg1, int arg2);
	public void a(int arg0);
	public boolean a(int arg0, int arg1);
	public WorldServer a();
	public boolean isChunkInUse(int arg0, int arg1);
	public void removePlayer(EntityPlayer arg0);
	public void movePlayer(EntityPlayer arg0);
	public void flagDirty(int arg0, int arg1, int arg2);
	public void addPlayer(EntityPlayer arg0);
}
