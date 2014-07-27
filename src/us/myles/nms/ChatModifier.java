package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.ChatModifier
@TrapTag
public interface ChatModifier {
	public boolean equals(java.lang.Object arg0);
	public java.lang.String toString();
	public int hashCode();
	public ChatModifier clone();
	public boolean c();
	public ChatClickable h();
	public ChatModifier m();
	public boolean b();
	public boolean e();
	public EnumChatFormat a();
	public ChatModifier a(ChatHoverable arg0);
	public ChatModifier a(ChatModifier arg0);
	public boolean d();
	public boolean g();
	public ChatHoverable i();
	public boolean f();
	public ChatModifier setChatClickable(ChatClickable arg0);
	public ChatModifier setColor(EnumChatFormat arg0);
	public ChatModifier setStrikethrough(java.lang.Boolean arg0);
	public ChatModifier setBold(java.lang.Boolean arg0);
	public ChatModifier setItalic(java.lang.Boolean arg0);
	public ChatModifier setUnderline(java.lang.Boolean arg0);
	public ChatModifier setRandom(java.lang.Boolean arg0);
}
