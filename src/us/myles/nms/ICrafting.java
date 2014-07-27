package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ICrafting
@TrapTag
public interface ICrafting {
	public void a(Container arg0, java.util.List arg1);
	public void a(Container arg0, int arg1, ItemStack arg2);
	public void setContainerData(Container arg0, int arg1, int arg2);
}
