package us.myles.cb.entity;

import us.myles.classtrap.TrapTag;

//org.bukkit.craftbukkit.v1_7_R3.entity.CraftEntity
@TrapTag
public interface CraftEntity {
	public void remove();
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public boolean isEmpty();
	public org.bukkit.Location getLocation();
	public org.bukkit.Location getLocation(org.bukkit.Location arg0);
	public us.myles.nms.Entity getHandle();
	public void setHandle(us.myles.nms.Entity arg0);
	public boolean isValid();
	public org.bukkit.Server getServer();
	public void setVelocity(org.bukkit.util.Vector arg0);
	public org.bukkit.util.Vector getVelocity();
	public boolean isOnGround();
	public boolean teleport(org.bukkit.entity.Entity arg0);
	public boolean teleport(org.bukkit.Location arg0);
	public boolean teleport(org.bukkit.entity.Entity arg0, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause arg1);
	public boolean teleport(org.bukkit.Location arg0, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause arg1);
	public boolean setPassenger(org.bukkit.entity.Entity arg0);
	public void setTicksLived(int arg0);
	public void setMetadata(java.lang.String arg0, org.bukkit.metadata.MetadataValue arg1);
	public boolean hasMetadata(java.lang.String arg0);
	public int getEntityId();
	public org.bukkit.entity.Entity getPassenger();
	public void playEffect(org.bukkit.EntityEffect arg0);
	public java.util.UUID getUniqueId();
	public boolean leaveVehicle();
	public org.bukkit.entity.Entity getVehicle();
	public void setFireTicks(int arg0);
	public int getTicksLived();
	public boolean isDead();
	public java.util.List getMetadata(java.lang.String arg0);
	public boolean eject();
	public int getFireTicks();
	public org.bukkit.World getWorld();
	public void setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent arg0);
	public int getMaxFireTicks();
	public float getFallDistance();
	public void setFallDistance(float arg0);
	public org.bukkit.event.entity.EntityDamageEvent getLastDamageCause();
	public java.util.List getNearbyEntities(double arg0, double arg1, double arg2);
	public boolean isInsideVehicle();
	public void removeMetadata(java.lang.String arg0, org.bukkit.plugin.Plugin arg1);
	public org.bukkit.util.Vector getMomentum();
	public void setMomentum(org.bukkit.util.Vector arg0);
}
