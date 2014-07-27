package us.myles.cb.scoreboard;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//org.bukkit.craftbukkit.v1_7_R3.scoreboard.CraftScoreboard
@TrapTag
public interface CraftScoreboard {
	public us.myles.nms.Scoreboard getHandle();
	public com.google.common.collect.ImmutableSet getEntries();
	@TrapTag(type = TrapTagType.METHOD, value = "getEntries")
	public java.util.Set getEntries2();
	public org.bukkit.scoreboard.Team getPlayerTeam(org.bukkit.OfflinePlayer arg0);
	public java.util.Set getPlayers();
	@TrapTag(type = TrapTagType.METHOD, value = "getPlayers")
	public com.google.common.collect.ImmutableSet getPlayers2();
	public org.bukkit.scoreboard.Objective getObjective(java.lang.String arg0);
	public org.bukkit.scoreboard.Objective getObjective(org.bukkit.scoreboard.DisplaySlot arg0);
	public com.google.common.collect.ImmutableSet getObjectives();
	@TrapTag(type = TrapTagType.METHOD, value = "getObjectives")
	public java.util.Set getObjectives2();
	public com.google.common.collect.ImmutableSet getScores(org.bukkit.OfflinePlayer arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "getScores")
	public java.util.Set getScores2(org.bukkit.OfflinePlayer arg0);
	public com.google.common.collect.ImmutableSet getScores(java.lang.String arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "getScores")
	public java.util.Set getScores2(java.lang.String arg0);
	public java.util.Set getTeams();
	@TrapTag(type = TrapTagType.METHOD, value = "getTeams")
	public com.google.common.collect.ImmutableSet getTeams2();
	public org.bukkit.scoreboard.Team getTeam(java.lang.String arg0);
	public org.bukkit.scoreboard.Team registerNewTeam(java.lang.String arg0);
	public us.myles.cb.scoreboard.CraftObjective registerNewObjective(java.lang.String arg0, java.lang.String arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "registerNewObjective")
	public org.bukkit.scoreboard.Objective registerNewObjective2(java.lang.String arg0, java.lang.String arg1);
	public com.google.common.collect.ImmutableSet getObjectivesByCriteria(java.lang.String arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "getObjectivesByCriteria")
	public java.util.Set getObjectivesByCriteria2(java.lang.String arg0);
	public void resetScores(org.bukkit.OfflinePlayer arg0);
	public void resetScores(java.lang.String arg0);
	public void clearSlot(org.bukkit.scoreboard.DisplaySlot arg0);
}
