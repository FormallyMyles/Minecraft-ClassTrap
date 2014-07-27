package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ItemFood
@TrapTag
public interface ItemFood {
	public ItemStack b(ItemStack arg0, World arg1, EntityHuman arg2);
	public ItemFood j();
	public ItemStack a(ItemStack arg0, World arg1, EntityHuman arg2);
	public ItemFood a(int arg0, int arg1, int arg2, float arg3);
	public EnumAnimation d(ItemStack arg0);
	public boolean i();
	public float getSaturationModifier(ItemStack arg0);
	public int d_(ItemStack arg0);
	public int getNutrition(ItemStack arg0);
}
