package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IChunkLoader
@TrapTag
public interface IChunkLoader {
	public void b();
	public void b(World arg0, Chunk arg1);
	public Chunk a(World arg0, int arg1, int arg2);
	public void a();
	public void a(World arg0, Chunk arg1);
}
