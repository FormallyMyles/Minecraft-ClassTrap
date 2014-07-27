package us.myles.nms;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//net.minecraft.server.v1_7_R3.EntityPlayer
@TrapTag
public interface EntityPlayer {
	public java.lang.String toString();
	public void reset();
	public WorldServer r();
	public void c(Entity arg0);
	public void h();
	public void m();
	public java.lang.String s();
	public void b(double arg0, boolean arg1);
	public void b(NBTTagCompound arg0);
	public void b(IChatBaseComponent arg0);
	public void b(Entity arg0);
	public void b(int arg0);
	public void a(Statistic arg0, int arg1);
	public boolean a(int arg0, java.lang.String arg1);
	public void a(EnumGamemode arg0);
	public void a(Container arg0, java.util.List arg1);
	public void a(ItemStack arg0, int arg1);
	public void a(Container arg0, int arg1, ItemStack arg2);
	public void a(NBTTagCompound arg0);
	public void a(boolean arg0, boolean arg1, boolean arg2);
	public EnumBedResult a(int arg0, int arg1, int arg2);
	public void a(PacketPlayInSettings arg0);
	public void a(float arg0, float arg1, boolean arg2, boolean arg3);
	public void a(TileEntity arg0);
	public boolean a(EntityHuman arg0);
	public void d(Entity arg0);
	public void i();
	public int nextContainerCounter();
	public void startEnchanting(int arg0, int arg1, int arg2, java.lang.String arg3);
	public void setPassengerOf(Entity arg0);
	public us.myles.cb.entity.CraftPlayer getBukkitEntity();
	@TrapTag(type = TrapTagType.METHOD, value = "getBukkitEntity")
	public us.myles.cb.entity.CraftHumanEntity getBukkitEntity2();
	@TrapTag(type = TrapTagType.METHOD, value = "getBukkitEntity")
	public us.myles.cb.entity.CraftEntity getBukkitEntity3();
	public ServerStatisticManager getStatisticManager();
	public void closeInventory();
	public void openHorseInventory(EntityHorse arg0, IInventory arg1);
	public void openMinecartHopper(EntityMinecartHopper arg0);
	public void openBrewingStand(TileEntityBrewingStand arg0);
	public void updateInventory(Container arg0);
	public void openContainer(IInventory arg0);
	public void v();
	public void openBeacon(TileEntityBeacon arg0);
	public void mount(Entity arg0);
	public void openAnvil(int arg0, int arg1, int arg2);
	public void openHopper(TileEntityHopper arg0);
	public void openFurnace(TileEntityFurnace arg0);
	public void openTrade(IMerchant arg0, java.lang.String arg1);
	public void openDispenser(TileEntityDispenser arg0);
	public boolean damageEntity(DamageSource arg0, float arg1);
	public void receive(Entity arg0, int arg1);
	public void startCrafting(int arg0, int arg1, int arg2);
	public void sendMessage(IChatBaseComponent[] arg0);
	public void sendMessage(IChatBaseComponent arg0);
	public void syncInventory();
	public float getHeadHeight();
	public void die(DamageSource arg0);
	public void levelDown(int arg0);
	public void n();
	public void spawnIn(World arg0);
	public void copyTo(EntityHuman arg0, boolean arg1);
	public EnumChatVisibility getChatFlags();
	public long getPlayerTime();
	public void triggerHealthUpdate();
	public void broadcastCarriedItem();
	public void setContainerData(Container arg0, int arg1, int arg2);
	public void setPlayerWeather(org.bukkit.WeatherType arg0, boolean arg1);
	public void setResourcePack(java.lang.String arg0);
	public void resetPlayerWeather();
	public void updateAbilities();
	public ChunkCoordinates getChunkCoordinates();
	public org.bukkit.WeatherType getPlayerWeather();
	public void enderTeleportTo(double arg0, double arg1, double arg2);
}
