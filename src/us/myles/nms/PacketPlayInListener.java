package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.PacketPlayInListener
@TrapTag
public interface PacketPlayInListener {
	public void a(PacketPlayInEntityAction arg0);
	public void a(PacketPlayInBlockDig arg0);
	public void a(PacketPlayInAbilities arg0);
	public void a(PacketPlayInFlying arg0);
	public void a(PacketPlayInKeepAlive arg0);
	public void a(PacketPlayInUseEntity arg0);
	public void a(PacketPlayInBlockPlace arg0);
	public void a(PacketPlayInUpdateSign arg0);
	public void a(PacketPlayInSetCreativeSlot arg0);
	public void a(PacketPlayInHeldItemSlot arg0);
	public void a(PacketPlayInSteerVehicle arg0);
	public void a(PacketPlayInSettings arg0);
	public void a(PacketPlayInClientCommand arg0);
	public void a(PacketPlayInTabComplete arg0);
	public void a(PacketPlayInChat arg0);
	public void a(PacketPlayInArmAnimation arg0);
	public void a(PacketPlayInCustomPayload arg0);
	public void a(PacketPlayInCloseWindow arg0);
	public void a(PacketPlayInWindowClick arg0);
	public void a(PacketPlayInEnchantItem arg0);
	public void a(PacketPlayInTransaction arg0);
}
