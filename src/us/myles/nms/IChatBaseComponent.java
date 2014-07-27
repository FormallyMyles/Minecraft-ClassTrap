package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.IChatBaseComponent
@TrapTag
public interface IChatBaseComponent {
	public java.lang.String c();
	public java.lang.String e();
	public java.util.List a();
	public IChatBaseComponent a(IChatBaseComponent arg0);
	public IChatBaseComponent a(java.lang.String arg0);
	public IChatBaseComponent f();
	public ChatModifier getChatModifier();
	public IChatBaseComponent setChatModifier(ChatModifier arg0);
}
