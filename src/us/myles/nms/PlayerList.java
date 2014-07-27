package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PlayerList
@TrapTag
public interface PlayerList {
	public void c(EntityPlayer arg0);
	public int s();
	public void b(EntityPlayer arg0, WorldServer arg1);
	public java.util.List b(java.lang.String arg0);
	public java.lang.String b(boolean arg0);
	public MinecraftServer getServer();
	public NBTTagCompound t();
	public int getMaxPlayers();
	public void a(Packet arg0, int arg1);
	public java.util.List a(ChunkCoordinates arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.util.Map arg7, java.lang.String arg8, java.lang.String arg9, World arg10);
	public void a(NetworkManager arg0, EntityPlayer arg1);
	public ServerStatisticManager a(EntityHuman arg0);
	public void a(int arg0);
	public void a(Entity arg0, int arg1, WorldServer arg2, WorldServer arg3);
	public void a(EntityPlayer arg0, WorldServer arg1);
	public void a(ScoreboardServer arg0, EntityPlayer arg1);
	public NBTTagCompound a(EntityPlayer arg0);
	public void d(EntityPlayer arg0);
	public int d();
	public GameProfile[] g();
	public void changeDimension(EntityPlayer arg0, int arg1, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause arg2);
	public void sendMessage(IChatBaseComponent[] arg0);
	public void sendMessage(IChatBaseComponent arg0, boolean arg1);
	public void sendMessage(IChatBaseComponent arg0);
	public java.lang.String[] n();
	public java.lang.String disconnect(EntityPlayer arg0);
	public java.lang.String[] f();
	public EntityPlayer getPlayer(java.lang.String arg0);
	public OpList getOPs();
	public boolean isOp(GameProfile arg0);
	public void u();
	public org.bukkit.Location calculateTarget(org.bukkit.Location arg0, World arg1);
	public IpBanList getIPBans();
	public void savePlayers();
	public void tick();
	public void repositionEntity(Entity arg0, org.bukkit.Location arg1, boolean arg2);
	public void reloadWhitelist();
	public void sendPacketNearby(EntityHuman arg0, double arg1, double arg2, double arg3, double arg4, int arg5, Packet arg6);
	public void sendPacketNearby(double arg0, double arg1, double arg2, double arg3, int arg4, Packet arg5);
	public void addWhitelist(GameProfile arg0);
	public WhiteList getWhitelist();
	public void removeOp(GameProfile arg0);
	public void addOp(GameProfile arg0);
	public EntityPlayer moveToWorld(EntityPlayer arg0, int arg1, boolean arg2, org.bukkit.Location arg3, boolean arg4);
	public EntityPlayer moveToWorld(EntityPlayer arg0, int arg1, boolean arg2);
	public void removeWhitelist(GameProfile arg0);
	public boolean isWhitelisted(GameProfile arg0);
	public GameProfileBanList getProfileBans();
	public void setHasWhitelist(boolean arg0);
	public void updateClient(EntityPlayer arg0);
	public void setPlayerFileData(WorldServer[] arg0);
	public java.lang.String[] getSeenPlayers();
	public int getPlayerCount();
	public void sendAll(Packet arg0);
	public boolean getHasWhitelist();
	public java.lang.String[] getWhitelisted();
	public EntityPlayer attemptLogin(LoginListener arg0, GameProfile arg1, java.lang.String arg2);
	public EntityPlayer processLogin(GameProfile arg0, EntityPlayer arg1);
}
