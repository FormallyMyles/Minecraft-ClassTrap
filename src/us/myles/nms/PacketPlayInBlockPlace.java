package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInBlockPlace
@TrapTag
public interface PacketPlayInBlockPlace {
	public void handle(PacketListener arg0);
	public int c();
	public float h();
	public void b(PacketDataSerializer arg0);
	public float j();
	public int e();
	public void a(PacketDataSerializer arg0);
	public void a(PacketPlayInListener arg0);
	public int d();
	public float i();
	public ItemStack getItemStack();
	public int getFace();
}
