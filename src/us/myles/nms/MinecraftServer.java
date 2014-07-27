package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.MinecraftServer
@TrapTag
public interface MinecraftServer {
	public void run();
	public int C();
	public int D();
	public GameProfile[] F();
	public java.lang.String getName();
	public void az();
	public void stop();
	public void c(java.lang.String arg0);
	public void c(int arg0);
	public void c(boolean arg0);
	public void h(java.lang.String arg0);
	public boolean m();
	public void x();
	public java.lang.String A();
	public void b(MojangStatisticsGenerator arg0);
	public void b(boolean arg0);
	public CrashReport b(CrashReport arg0);
	public void warning(java.lang.String arg0);
	public void k(java.lang.String arg0);
	public void j(java.lang.String arg0);
	public java.lang.String getVersion();
	public void setPort(int arg0);
	public java.lang.String a(EnumGamemode arg0, boolean arg1);
	public void a(EnumDifficulty arg0);
	public boolean a(World arg0, int arg1, int arg2, int arg3, EntityHuman arg4);
	public void a(java.security.KeyPair arg0);
	public boolean a(int arg0, java.lang.String arg1);
	public void a(PlayerList arg0);
	public java.util.List a(ICommandListener arg0, java.lang.String arg1);
	public void a(EnumGamemode arg0);
	public void a(IUpdatePlayerListBox arg0);
	public void a(MojangStatisticsGenerator arg0);
	public java.lang.String y();
	public int l();
	public java.io.File d(java.lang.String arg0);
	public java.lang.String g(java.lang.String arg0);
	public int z();
	public void i(java.lang.String arg0);
	public PlayerList getPlayerList();
	public int getIdleTimeout();
	public int getSpawnProtection();
	public boolean getForceGamemode();
	public void v();
	public boolean X();
	public void sendMessage(IChatBaseComponent arg0);
	public World getWorld();
	public EnumGamemode getGamemode();
	public int L();
	public java.lang.String M();
	public boolean N();
	public ChunkCoordinates getChunkCoordinates();
	public IChatBaseComponent getScoreboardDisplayName();
	public java.net.Proxy aq();
	public boolean at();
	public int al();
	public ServerPing ay();
	public MinecraftSessionService av();
	public WorldServer getWorldServer(int arg0);
	public boolean getPvP();
	public boolean isHardcore();
	public java.lang.String getMotd();
	public boolean getOnlineMode();
	public EnumDifficulty getDifficulty();
	public java.lang.String[] getPlayers();
	public java.security.KeyPair K();
	public boolean R();
	public void U();
	public java.lang.String O();
	public ServerConnection ai();
	public boolean ak();
	public boolean getGenerateStructures();
	public boolean getAllowNether();
	public boolean getAllowFlight();
	public void setIdleTimeout(int arg0);
	public void setTexturePack(java.lang.String arg0);
	public void setAllowFlight(boolean arg0);
	public java.lang.String getServerIp();
	public boolean isStopped();
	public void safeShutdown();
	public void info(java.lang.String arg0);
	public java.lang.String getPlugins();
	public boolean isRunning();
	public void setMotd(java.lang.String arg0);
	public void am();
	public boolean isDebugging();
	public void setOnlineMode(boolean arg0);
	public UserCache getUserCache();
	public boolean getSpawnNPCs();
	public void setSpawnNPCs(boolean arg0);
	public void setPvP(boolean arg0);
	public PropertyManager getPropertyManager();
	public java.lang.String getResourcePack();
	public Convertable getConvertable();
	public java.lang.String getServerModName();
	public ICommandHandler getCommandHandler();
	public void setSpawnAnimals(boolean arg0);
	public boolean getSpawnAnimals();
	public int getMaxBuildHeight();
	public boolean getSnooperEnabled();
	public GameProfileRepository getGameProfileRepository();
	public void setForceGamemode(boolean arg0);
	public boolean getEnableCommandBlock();
}
