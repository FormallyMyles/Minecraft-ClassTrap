package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.DamageSource
@TrapTag
public interface DamageSource {
	public java.lang.String p();
	public boolean r();
	public boolean h();
	public boolean s();
	public DamageSource b();
	public DamageSource t();
	public boolean a();
	public DamageSource d();
	public Entity i();
	public Entity getEntity();
	public float f();
	public boolean o();
	public boolean ignoresInvulnerability();
	public boolean ignoresArmor();
	public DamageSource q();
	public boolean isExplosion();
	public IChatBaseComponent getLocalizedDeathMessage(EntityLiving arg0);
}
