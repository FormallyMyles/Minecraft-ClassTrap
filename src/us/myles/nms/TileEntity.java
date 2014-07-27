package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.TileEntity
@TrapTag
public interface TileEntity {
	public int p();
	public boolean r();
	public boolean c(int arg0, int arg1);
	public void h();
	public void s();
	public org.bukkit.inventory.InventoryHolder getOwner();
	public void update();
	public void b(NBTTagCompound arg0);
	public void t();
	public void a(World arg0);
	public void a(CrashReportSystemDetails arg0);
	public void a(NBTTagCompound arg0);
	public Packet getUpdatePacket();
	public World getWorld();
	public boolean o();
	public Block q();
	public void u();
}
