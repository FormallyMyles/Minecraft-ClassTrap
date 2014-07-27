package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Material
@TrapTag
public interface Material {
	public MaterialMapColor r();
	public boolean k();
	public Material i();
	public boolean q();
	public boolean isLiquid();
	public boolean isBuildable();
	public boolean isReplaceable();
	public boolean isSolid();
	public boolean isBurnable();
	public int getPushReaction();
	public boolean isAlwaysDestroyable();
	public boolean blocksLight();
}
