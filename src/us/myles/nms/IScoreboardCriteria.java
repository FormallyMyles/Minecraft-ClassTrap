package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IScoreboardCriteria
@TrapTag
public interface IScoreboardCriteria {
	public java.lang.String getName();
	public boolean isReadOnly();
	public int getScoreModifier(java.util.List arg0);
}
