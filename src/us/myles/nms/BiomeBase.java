package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.BiomeBase
@TrapTag
public interface BiomeBase {
	public int h();
	public EnumTemperature m();
	public void b(World arg0, java.util.Random arg1, Block[] arg2, byte[] arg3, int arg4, int arg5, double arg6);
	public WorldGenerator b(java.util.Random arg0);
	public boolean j();
	public boolean e();
	public float a(int arg0, int arg1, int arg2);
	public void a(World arg0, java.util.Random arg1, int arg2, int arg3);
	public void a(World arg0, java.util.Random arg1, Block[] arg2, byte[] arg3, int arg4, int arg5, double arg6);
	public boolean a(BiomeBase arg0);
	public WorldGenTreeAbstract a(java.util.Random arg0);
	public java.lang.String a(java.util.Random arg0, int arg1, int arg2, int arg3);
	public java.lang.Class l();
	public boolean d();
	public float g();
	public boolean f();
	public java.util.List getMobs(EnumCreatureType arg0);
}
