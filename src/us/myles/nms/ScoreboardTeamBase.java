package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ScoreboardTeamBase
@TrapTag
public interface ScoreboardTeamBase {
	public java.lang.String getName();
	public boolean allowFriendlyFire();
	public boolean isAlly(ScoreboardTeamBase arg0);
	public java.lang.String getFormattedName(java.lang.String arg0);
}
