package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IBlockAccess
@TrapTag
public interface IBlockAccess {
	public Block getType(int arg0, int arg1, int arg2);
	public int getData(int arg0, int arg1, int arg2);
	public TileEntity getTileEntity(int arg0, int arg1, int arg2);
	public int getBlockPower(int arg0, int arg1, int arg2, int arg3);
}
