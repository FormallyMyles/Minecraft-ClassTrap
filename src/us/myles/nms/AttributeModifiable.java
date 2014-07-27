package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.AttributeModifiable
@TrapTag
public interface AttributeModifiable {
	public double getValue();
	public void setValue(double arg0);
	public java.util.Collection c();
	public double b();
	public void b(AttributeModifier arg0);
	public void a(AttributeModifier arg0);
	public IAttribute a();
	public java.util.Collection a(int arg0);
	public AttributeModifier a(java.util.UUID arg0);
}
