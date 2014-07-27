package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ScoreboardServer
@TrapTag
public interface ScoreboardServer {
	public int h(ScoreboardObjective arg0);
	public void e(ScoreboardObjective arg0);
	public void a(PersistentScoreboard arg0);
	public void g(ScoreboardObjective arg0);
	public java.util.List f(ScoreboardObjective arg0);
	public void handleTeamChanged(ScoreboardTeam arg0);
	public java.util.List getScoreboardScorePacketsForObjective(ScoreboardObjective arg0);
	public void removePlayerFromTeam(java.lang.String arg0, ScoreboardTeam arg1);
	public void handleObjectiveAdded(ScoreboardObjective arg0);
	public void handlePlayerRemoved(java.lang.String arg0);
	public void setDisplaySlot(int arg0, ScoreboardObjective arg1);
	public void handleScoreChanged(ScoreboardScore arg0);
	public void handleObjectiveChanged(ScoreboardObjective arg0);
	public void handleTeamAdded(ScoreboardTeam arg0);
	public void handleObjectiveRemoved(ScoreboardObjective arg0);
	public void handleTeamRemoved(ScoreboardTeam arg0);
	public boolean addPlayerToTeam(java.lang.String arg0, java.lang.String arg1);
}
