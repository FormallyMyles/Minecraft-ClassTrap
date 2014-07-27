package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.util.ReferenceCounted
@TrapTag
public interface ReferenceCounted {
	public boolean release(int arg0);
	public boolean release();
	public int refCnt();
	public ReferenceCounted retain();
	public ReferenceCounted retain(int arg0);
}
