package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.DedicatedServer
@TrapTag
public interface DedicatedServer {
	public boolean m();
	public java.lang.String b();
	public CrashReport b(CrashReport arg0);
	public java.lang.String a(java.lang.String arg0, java.lang.String arg1);
	public boolean a(World arg0, int arg1, int arg2, int arg3, EntityHuman arg4);
	public int a(java.lang.String arg0, int arg1);
	public void a(MojangStatisticsGenerator arg0);
	public java.lang.String a(EnumGamemode arg0, boolean arg1);
	public void a(java.lang.String arg0, java.lang.Object arg1);
	public void a();
	public boolean a(java.lang.String arg0, boolean arg1);
	public int l();
	public PlayerList getPlayerList();
	public int getSpawnProtection();
	public void v();
	public boolean X();
	public EnumGamemode getGamemode();
	public DedicatedPlayerList aC();
	public void aB();
	public boolean at();
	public void aD();
	public boolean isHardcore();
	public EnumDifficulty getDifficulty();
	public boolean ak();
	public boolean getGenerateStructures();
	public boolean getAllowNether();
	public void setIdleTimeout(int arg0);
	public PropertyManager getPropertyManager();
	public boolean getSpawnMonsters();
	public boolean getSnooperEnabled();
	public boolean getEnableCommandBlock();
	public void issueCommand(java.lang.String arg0, ICommandListener arg1);
}
