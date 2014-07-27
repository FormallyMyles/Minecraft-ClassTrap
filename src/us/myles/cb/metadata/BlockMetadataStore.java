package us.myles.cb.metadata;

import us.myles.classtrap.TrapTag;

//org.bukkit.craftbukkit.v1_7_R3.metadata.BlockMetadataStore
@TrapTag
public interface BlockMetadataStore {
	public void setMetadata(java.lang.Object arg0, java.lang.String arg1, org.bukkit.metadata.MetadataValue arg2);
	public void setMetadata(org.bukkit.block.Block arg0, java.lang.String arg1, org.bukkit.metadata.MetadataValue arg2);
	public boolean hasMetadata(org.bukkit.block.Block arg0, java.lang.String arg1);
	public boolean hasMetadata(java.lang.Object arg0, java.lang.String arg1);
	public java.util.List getMetadata(org.bukkit.block.Block arg0, java.lang.String arg1);
	public java.util.List getMetadata(java.lang.Object arg0, java.lang.String arg1);
	public void removeMetadata(java.lang.Object arg0, java.lang.String arg1, org.bukkit.plugin.Plugin arg2);
	public void removeMetadata(org.bukkit.block.Block arg0, java.lang.String arg1, org.bukkit.plugin.Plugin arg2);
}
