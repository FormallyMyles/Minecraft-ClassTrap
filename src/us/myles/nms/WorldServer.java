package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WorldServer
@TrapTag
public interface WorldServer {
	public void save(boolean arg0, IProgressUpdate arg1);
	public void b(int arg0, int arg1, int arg2, Block arg3, int arg4, int arg5);
	public java.util.List a(Chunk arg0, boolean arg1);
	public void a(java.lang.String arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6, double arg7, double arg8);
	public BiomeMeta a(EnumCreatureType arg0, int arg1, int arg2, int arg3);
	public boolean a(EntityHuman arg0, int arg1, int arg2, int arg3);
	public boolean a(boolean arg0);
	public boolean a(int arg0, int arg1, int arg2, Block arg3);
	public void a(int arg0, int arg1, int arg2, Block arg3, int arg4);
	public void a(int arg0, int arg1, int arg2, Block arg3, int arg4, int arg5);
	public void i();
	public Entity getEntity(int arg0);
	public EntityTracker getTracker();
	public void everyoneSleeping();
	public MinecraftServer getMinecraftServer();
	public void broadcastEntityEffect(Entity arg0, byte arg1);
	public PortalTravelAgent getTravelAgent();
	public TileEntity getTileEntity(int arg0, int arg1, int arg2);
	public void doTick();
	public void playNote(int arg0, int arg1, int arg2, Block arg3, int arg4, int arg5);
	public int getTypeId(int arg0, int arg1, int arg2);
	public void tickEntities();
	public boolean strikeLightning(Entity arg0);
	public Explosion createExplosion(Entity arg0, double arg1, double arg2, double arg3, float arg4, boolean arg5, boolean arg6);
	public java.util.List getTileEntities(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
	public ChunkCoordinates getDimensionSpawn();
	public PlayerChunkMap getPlayerChunkMap();
	public boolean everyoneDeeplySleeping();
	public void saveLevel();
	public void flushSave();
}
