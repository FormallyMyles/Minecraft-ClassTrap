package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ScoreboardTeam
@TrapTag
public interface ScoreboardTeam {
	public java.lang.String getName();
	public java.lang.String getDisplayName();
	public boolean allowFriendlyFire();
	public java.lang.String getPrefix();
	public void setPrefix(java.lang.String arg0);
	public java.lang.String getSuffix();
	public void setSuffix(java.lang.String arg0);
	public java.lang.String getFormattedName(java.lang.String arg0);
	public void setDisplayName(java.lang.String arg0);
	public void setAllowFriendlyFire(boolean arg0);
	public boolean canSeeFriendlyInvisibles();
	public void setCanSeeFriendlyInvisibles(boolean arg0);
	public int packOptionData();
	public java.util.Collection getPlayerNameSet();
}
