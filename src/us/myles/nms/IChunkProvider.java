package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IChunkProvider
@TrapTag
public interface IChunkProvider {
	public java.lang.String getName();
	public void c();
	public void getChunkAt(IChunkProvider arg0, int arg1, int arg2);
	public Chunk getChunkAt(int arg0, int arg1);
	public int getLoadedChunks();
	public boolean isChunkLoaded(int arg0, int arg1);
	public Chunk getOrCreateChunk(int arg0, int arg1);
	public ChunkPosition findNearestMapFeature(World arg0, java.lang.String arg1, int arg2, int arg3, int arg4);
	public boolean unloadChunks();
	public java.util.List getMobsFor(EnumCreatureType arg0, int arg1, int arg2, int arg3);
	public boolean saveChunks(boolean arg0, IProgressUpdate arg1);
	public boolean canSave();
	public void recreateStructures(int arg0, int arg1);
}
