package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.server.v1_7_R3.Convertable
@TrapTag
public interface Convertable {
	public boolean e(java.lang.String arg0);
	public IDataManager a(java.lang.String arg0, boolean arg1);
	public void d();
	public boolean convert(java.lang.String arg0, IProgressUpdate arg1);
	public boolean isConvertable(java.lang.String arg0);
}
