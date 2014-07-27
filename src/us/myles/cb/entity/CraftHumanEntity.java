package us.myles.cb.entity;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//org.bukkit.craftbukkit.v1_7_R3.entity.CraftHumanEntity
@TrapTag
public interface CraftHumanEntity {
	public java.lang.String toString();
	public java.lang.String getName();
	public us.myles.nms.Entity getHandle();
	@TrapTag(type = TrapTagType.METHOD, value = "getHandle")
	public us.myles.nms.EntityHuman getHandle2();
	@TrapTag(type = TrapTagType.METHOD, value = "getHandle")
	public us.myles.nms.EntityLiving getHandle3();
	public void setHandle(us.myles.nms.EntityHuman arg0);
	public void closeInventory();
	public boolean isSleeping();
	public void setGameMode(org.bukkit.GameMode arg0);
	public org.bukkit.GameMode getGameMode();
	public boolean isBlocking();
	public org.bukkit.inventory.ItemStack getItemInHand();
	public boolean isOp();
	public org.bukkit.inventory.Inventory getInventory();
	@TrapTag(type = TrapTagType.METHOD, value = "getInventory")
	public org.bukkit.inventory.PlayerInventory getInventory2();
	public int getExpToLevel();
	public org.bukkit.inventory.Inventory getEnderChest();
	public org.bukkit.inventory.EntityEquipment getEquipment();
	public org.bukkit.inventory.ItemStack getItemOnCursor();
	public void removeAttachment(org.bukkit.permissions.PermissionAttachment arg0);
	public void recalculatePermissions();
	public java.util.Set getEffectivePermissions();
	public org.bukkit.inventory.InventoryView getOpenInventory();
	public void setItemOnCursor(org.bukkit.inventory.ItemStack arg0);
	public boolean isPermissionSet(org.bukkit.permissions.Permission arg0);
	public boolean isPermissionSet(java.lang.String arg0);
	public boolean setWindowProperty(org.bukkit.inventory.InventoryView.Property arg0, int arg1);
	public org.bukkit.inventory.InventoryView openEnchanting(org.bukkit.Location arg0, boolean arg1);
	public void setOp(boolean arg0);
	public boolean hasPermission(org.bukkit.permissions.Permission arg0);
	public boolean hasPermission(java.lang.String arg0);
	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin arg0, java.lang.String arg1, boolean arg2, int arg3);
	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin arg0, int arg1);
	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin arg0);
	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin arg0, java.lang.String arg1, boolean arg2);
	public void openInventory(org.bukkit.inventory.InventoryView arg0);
	public org.bukkit.inventory.InventoryView openInventory(org.bukkit.inventory.Inventory arg0);
	public org.bukkit.inventory.InventoryView openWorkbench(org.bukkit.Location arg0, boolean arg1);
	public int getSleepTicks();
	public void setItemInHand(org.bukkit.inventory.ItemStack arg0);
}
