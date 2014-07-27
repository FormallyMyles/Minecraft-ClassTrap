package us.myles.cb.inventory;

import us.myles.classtrap.TrapTag;

//org.bukkit.craftbukkit.v1_7_R3.inventory.CraftItemFactory
@TrapTag
public interface CraftItemFactory {
	public boolean equals(org.bukkit.inventory.meta.ItemMeta arg0, org.bukkit.inventory.meta.ItemMeta arg1);
	public org.bukkit.inventory.meta.ItemMeta getItemMeta(org.bukkit.Material arg0);
	public org.bukkit.Color getDefaultLeatherColor();
	public boolean isApplicable(org.bukkit.inventory.meta.ItemMeta arg0, org.bukkit.Material arg1);
	public boolean isApplicable(org.bukkit.inventory.meta.ItemMeta arg0, org.bukkit.inventory.ItemStack arg1);
	public org.bukkit.inventory.meta.ItemMeta asMetaFor(org.bukkit.inventory.meta.ItemMeta arg0, org.bukkit.Material arg1);
	public org.bukkit.inventory.meta.ItemMeta asMetaFor(org.bukkit.inventory.meta.ItemMeta arg0, org.bukkit.inventory.ItemStack arg1);
}
