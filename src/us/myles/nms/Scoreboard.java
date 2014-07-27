package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Scoreboard
@TrapTag
public interface Scoreboard {
	public java.util.Collection getObjectivesForCriteria(IScoreboardCriteria arg0);
	public ScoreboardScore getPlayerScoreForObjective(java.lang.String arg0, ScoreboardObjective arg1);
	public ScoreboardTeam getPlayerTeam(java.lang.String arg0);
	public java.util.Collection getPlayers();
	public void handleTeamChanged(ScoreboardTeam arg0);
	public boolean removePlayerFromTeam(java.lang.String arg0);
	public void removePlayerFromTeam(java.lang.String arg0, ScoreboardTeam arg1);
	public void handleObjectiveAdded(ScoreboardObjective arg0);
	public java.util.Map getPlayerObjectives(java.lang.String arg0);
	public java.util.Collection getScoresForObjective(ScoreboardObjective arg0);
	public ScoreboardObjective getObjectiveForSlot(int arg0);
	public void handlePlayerRemoved(java.lang.String arg0);
	public void setDisplaySlot(int arg0, ScoreboardObjective arg1);
	public void handleScoreChanged(ScoreboardScore arg0);
	public void handleObjectiveChanged(ScoreboardObjective arg0);
	public void handleTeamAdded(ScoreboardTeam arg0);
	public void resetPlayerScores(java.lang.String arg0);
	public void unregisterObjective(ScoreboardObjective arg0);
	public void handleObjectiveRemoved(ScoreboardObjective arg0);
	public ScoreboardObjective registerObjective(java.lang.String arg0, IScoreboardCriteria arg1);
	public void handleTeamRemoved(ScoreboardTeam arg0);
	public boolean addPlayerToTeam(java.lang.String arg0, java.lang.String arg1);
	public ScoreboardObjective getObjective(java.lang.String arg0);
	public java.util.Collection getObjectives();
	public java.util.Collection getTeamNames();
	public java.util.Collection getScores();
	public java.util.Collection getTeams();
	public ScoreboardTeam getTeam(java.lang.String arg0);
	public void removeTeam(ScoreboardTeam arg0);
	public ScoreboardTeam createTeam(java.lang.String arg0);
}
