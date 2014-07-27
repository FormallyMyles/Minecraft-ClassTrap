package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ChunkSection
@TrapTag
public interface ChunkSection {
	public boolean isEmpty();
	public int getData(int arg0, int arg1, int arg2);
	public void setTypeId(int arg0, int arg1, int arg2, Block arg3);
	public void setData(int arg0, int arg1, int arg2, int arg3);
	public Block getTypeId(int arg0, int arg1, int arg2);
	public int getYPosition();
	public boolean shouldTick();
	public int getEmittedLight(int arg0, int arg1, int arg2);
	public void setEmittedLight(int arg0, int arg1, int arg2, int arg3);
	public int getSkyLight(int arg0, int arg1, int arg2);
	public void setSkyLight(int arg0, int arg1, int arg2, int arg3);
	public void recalcBlockCounts();
	public byte[] getIdArray();
	public NibbleArray getDataArray();
	public void setIdArray(byte[] arg0);
	public void setDataArray(NibbleArray arg0);
	public NibbleArray getSkyLightArray();
	public NibbleArray getEmittedLightArray();
	public void setExtendedIdArray(NibbleArray arg0);
	public NibbleArray getExtendedIdArray();
	public void old_recalcBlockCounts();
	public void setEmittedLightArray(NibbleArray arg0);
	public void setSkyLightArray(NibbleArray arg0);
}
