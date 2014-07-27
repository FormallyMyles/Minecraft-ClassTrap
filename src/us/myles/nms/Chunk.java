package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Chunk
@TrapTag
public interface Chunk {
	public boolean isEmpty();
	public Block getType(int arg0, int arg1, int arg2);
	public void p();
	public boolean c(int arg0, int arg1);
	public int h();
	public byte[] m();
	public void b(Entity arg0);
	public int b(int arg0, int arg1);
	public int b(int arg0, int arg1, int arg2, int arg3);
	public void b(boolean arg0);
	public int b(int arg0, int arg1, int arg2);
	public boolean k();
	public TileEntity e(int arg0, int arg1, int arg2);
	public void e();
	public int getData(int arg0, int arg1, int arg2);
	public java.util.Random a(long arg0);
	public boolean a(boolean arg0);
	public void a(java.lang.Class arg0, AxisAlignedBB arg1, java.util.List arg2, IEntitySelector arg3);
	public void a(Entity arg0, AxisAlignedBB arg1, java.util.List arg2, IEntitySelector arg3);
	public void a(ChunkSection[] arg0);
	public BiomeBase a(int arg0, int arg1, WorldChunkManager arg2);
	public void a(byte[] arg0);
	public void a(IChunkProvider arg0, IChunkProvider arg1, int arg2, int arg3);
	public boolean a(int arg0, int arg1);
	public void a(Entity arg0, int arg1);
	public void a(Entity arg0);
	public boolean a(int arg0, int arg1, int arg2, int arg3);
	public boolean a(int arg0, int arg1, int arg2, Block arg3, int arg4);
	public void a(EnumSkyBlock arg0, int arg1, int arg2, int arg3, int arg4);
	public void a(int arg0, int arg1, int arg2, TileEntity arg3);
	public void a(TileEntity arg0);
	public ChunkCoordIntPair l();
	public boolean d(int arg0, int arg1, int arg2);
	public int d(int arg0, int arg1);
	public ChunkSection[] i();
	public void n();
	public void f(int arg0, int arg1, int arg2);
	public void o();
	public int getBrightness(EnumSkyBlock arg0, int arg1, int arg2, int arg3);
	public void removeEntities();
	public void addEntities();
	public void initLighting();
}
