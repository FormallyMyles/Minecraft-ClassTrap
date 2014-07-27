package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WorldProvider
@TrapTag
public interface WorldProvider {
	public java.lang.String getName();
	public ChunkCoordinates h();
	public boolean e();
	public int a(long arg0);
	public void a(World arg0);
	public float a(long arg0, float arg1);
	public boolean d();
	public boolean canSpawn(int arg0, int arg1);
	public int getSeaLevel();
	public IChunkProvider getChunkProvider();
}
