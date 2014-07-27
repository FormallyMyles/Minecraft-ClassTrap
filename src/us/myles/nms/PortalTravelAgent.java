package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PortalTravelAgent
@TrapTag
public interface PortalTravelAgent {
	public boolean b(Entity arg0, double arg1, double arg2, double arg3, float arg4);
	public boolean a(Entity arg0);
	public void a(long arg0);
	public void a(Entity arg0, double arg1, double arg2, double arg3, float arg4);
	public ChunkCoordinates findPortal(double arg0, double arg1, double arg2, int arg3);
	public void adjustExit(Entity arg0, org.bukkit.Location arg1, org.bukkit.util.Vector arg2);
	public boolean createPortal(double arg0, double arg1, double arg2, int arg3);
}
