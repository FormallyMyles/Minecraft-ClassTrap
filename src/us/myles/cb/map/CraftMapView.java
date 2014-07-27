package us.myles.cb.map;

import us.myles.classtrap.TrapTag;

//org.bukkit.craftbukkit.v1_7_R3.map.CraftMapView
@TrapTag
public interface CraftMapView {
	public short getId();
	public org.bukkit.World getWorld();
	public us.myles.cb.map.RenderData render(us.myles.cb.entity.CraftPlayer arg0);
	public void setWorld(org.bukkit.World arg0);
	public boolean removeRenderer(org.bukkit.map.MapRenderer arg0);
	public int getCenterX();
	public void setCenterZ(int arg0);
	public org.bukkit.map.MapView.Scale getScale();
	public void setCenterX(int arg0);
	public java.util.List getRenderers();
	public int getCenterZ();
	public boolean isVirtual();
	public void addRenderer(org.bukkit.map.MapRenderer arg0);
	public void setScale(org.bukkit.map.MapView.Scale arg0);
}
