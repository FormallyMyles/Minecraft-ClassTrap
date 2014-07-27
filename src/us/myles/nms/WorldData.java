package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.WorldData
@TrapTag
public interface WorldData {
	public java.lang.String getName();
	public void setName(java.lang.String arg0);
	public WorldType getType();
	public int c();
	public long getTime();
	public void setTime(long arg0);
	public int j();
	public void e(int arg0);
	public int e();
	public NBTTagCompound a();
	public void a(CrashReportSystemDetails arg0);
	public NBTTagCompound a(NBTTagCompound arg0);
	public int l();
	public EnumGamemode getGameType();
	public int d();
	public void d(boolean arg0);
	public NBTTagCompound i();
	public GameRules getGameRules();
	public long getDayTime();
	public boolean hasStorm();
	public boolean isInitialized();
	public void setStorm(boolean arg0);
	public void setThundering(boolean arg0);
	public boolean isThundering();
	public void setSpawn(int arg0, int arg1, int arg2);
	public long getSeed();
	public void setDayTime(long arg0);
	public boolean isHardcore();
	public void setThunderDuration(int arg0);
	public int getWeatherDuration();
	public void setWeatherDuration(int arg0);
	public int getThunderDuration();
	public java.lang.String getGeneratorOptions();
	public void setGameType(EnumGamemode arg0);
	public boolean allowCommands();
	public boolean shouldGenerateMapFeatures();
	public void setType(WorldType arg0);
}
