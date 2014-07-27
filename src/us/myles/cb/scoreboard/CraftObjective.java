package us.myles.cb.scoreboard;

import us.myles.classtrap.TrapTag;

//org.bukkit.craftbukkit.v1_7_R3.scoreboard.CraftObjective
@TrapTag
public interface CraftObjective {
	public java.lang.String getName();
	public java.lang.String getDisplayName();
	public org.bukkit.scoreboard.Scoreboard getScoreboard();
	public org.bukkit.scoreboard.Score getScore(org.bukkit.OfflinePlayer arg0);
	public org.bukkit.scoreboard.Score getScore(java.lang.String arg0);
	public void setDisplayName(java.lang.String arg0);
	public void setDisplaySlot(org.bukkit.scoreboard.DisplaySlot arg0);
	public java.lang.String getCriteria();
	public void unregister();
	public boolean isModifiable();
	public org.bukkit.scoreboard.DisplaySlot getDisplaySlot();
}
