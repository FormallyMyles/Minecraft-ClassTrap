package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ScoreboardObjective
@TrapTag
public interface ScoreboardObjective {
	public java.lang.String getName();
	public java.lang.String getDisplayName();
	public void setDisplayName(java.lang.String arg0);
	public IScoreboardCriteria getCriteria();
}
