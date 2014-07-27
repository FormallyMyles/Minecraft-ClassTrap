package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.CombatTracker
@TrapTag
public interface CombatTracker {
	public EntityLiving c();
	public IChatBaseComponent b();
	public void a();
	public void a(DamageSource arg0, float arg1, float arg2);
	public void g();
}
