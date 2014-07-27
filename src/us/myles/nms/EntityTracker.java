package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.EntityTracker
@TrapTag
public interface EntityTracker {
	public void a(Entity arg0, Packet arg1);
	public void a(EntityPlayer arg0, Chunk arg1);
	public void sendPacketToEntity(Entity arg0, Packet arg1);
	public void addEntity(Entity arg0, int arg1, int arg2);
	public void addEntity(Entity arg0, int arg1, int arg2, boolean arg3);
	public void track(Entity arg0);
	public void untrackEntity(Entity arg0);
	public void updatePlayers();
	public void untrackPlayer(EntityPlayer arg0);
}
