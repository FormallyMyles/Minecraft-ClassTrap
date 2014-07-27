package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WorldGenerator
@TrapTag
public interface WorldGenerator {
	public void a(double arg0, double arg1, double arg2);
	public boolean a(World arg0, java.util.Random arg1, int arg2, int arg3, int arg4);
}
