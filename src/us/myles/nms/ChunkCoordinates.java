package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ChunkCoordinates
@TrapTag
public interface ChunkCoordinates {
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public int compareTo(java.lang.Object arg0);
	public int compareTo(ChunkCoordinates arg0);
	public void b(int arg0, int arg1, int arg2);
	public float e(ChunkCoordinates arg0);
	public float e(int arg0, int arg1, int arg2);
}
