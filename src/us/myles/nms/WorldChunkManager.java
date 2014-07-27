package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WorldChunkManager
@TrapTag
public interface WorldChunkManager {
	public void b();
	public boolean a(int arg0, int arg1, int arg2, java.util.List arg3);
	public java.util.List a();
	public ChunkPosition a(int arg0, int arg1, int arg2, java.util.List arg3, java.util.Random arg4);
	public BiomeBase[] a(BiomeBase[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
	public BiomeBase getBiome(int arg0, int arg1);
	public float[] getWetness(float[] arg0, int arg1, int arg2, int arg3, int arg4);
	public BiomeBase[] getBiomes(BiomeBase[] arg0, int arg1, int arg2, int arg3, int arg4);
	public BiomeBase[] getBiomeBlock(BiomeBase[] arg0, int arg1, int arg2, int arg3, int arg4);
}
