package us.myles.cb.scoreboard;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//org.bukkit.craftbukkit.v1_7_R3.scoreboard.CraftScoreboardManager
@TrapTag
public interface CraftScoreboardManager {
	public java.util.Collection getScoreboardScores(us.myles.nms.IScoreboardCriteria arg0, java.lang.String arg1, java.util.Collection arg2);
	public void updateAllScoresForList(us.myles.nms.IScoreboardCriteria arg0, java.lang.String arg1, java.util.List arg2);
	public org.bukkit.scoreboard.Scoreboard getMainScoreboard();
	@TrapTag(type = TrapTagType.METHOD, value = "getMainScoreboard")
	public us.myles.cb.scoreboard.CraftScoreboard getMainScoreboard2();
	public us.myles.cb.scoreboard.CraftScoreboard getPlayerBoard(us.myles.cb.entity.CraftPlayer arg0);
	public void setPlayerBoard(us.myles.cb.entity.CraftPlayer arg0, org.bukkit.scoreboard.Scoreboard arg1);
	public void removePlayer(org.bukkit.entity.Player arg0);
	public org.bukkit.scoreboard.Scoreboard getNewScoreboard();
	@TrapTag(type = TrapTagType.METHOD, value = "getNewScoreboard")
	public us.myles.cb.scoreboard.CraftScoreboard getNewScoreboard2();
}
