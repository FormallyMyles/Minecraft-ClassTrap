package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ScoreboardScore
@TrapTag
public interface ScoreboardScore {
	public void incrementScore();
	public Scoreboard f();
	public int getScore();
	public void setScore(int arg0);
	public void addScore(int arg0);
	public ScoreboardObjective getObjective();
	public java.lang.String getPlayerName();
	public void removeScore(int arg0);
	public void updateForList(java.util.List arg0);
}
