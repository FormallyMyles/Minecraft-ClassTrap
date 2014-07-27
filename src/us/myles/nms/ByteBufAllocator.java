package us.myles.nms;

import us.myles.classtrap.TrapTag;

//net.minecraft.util.io.netty.buffer.ByteBufAllocator
@TrapTag
public interface ByteBufAllocator {
	public ByteBuf buffer(int arg0, int arg1);
	public ByteBuf buffer(int arg0);
	public ByteBuf buffer();
	public CompositeByteBuf compositeHeapBuffer();
	public CompositeByteBuf compositeHeapBuffer(int arg0);
	public CompositeByteBuf compositeDirectBuffer();
	public CompositeByteBuf compositeDirectBuffer(int arg0);
	public boolean isDirectBufferPooled();
	public CompositeByteBuf compositeBuffer();
	public CompositeByteBuf compositeBuffer(int arg0);
	public ByteBuf directBuffer();
	public ByteBuf directBuffer(int arg0, int arg1);
	public ByteBuf directBuffer(int arg0);
	public ByteBuf ioBuffer(int arg0, int arg1);
	public ByteBuf ioBuffer(int arg0);
	public ByteBuf ioBuffer();
	public ByteBuf heapBuffer();
	public ByteBuf heapBuffer(int arg0);
	public ByteBuf heapBuffer(int arg0, int arg1);
}
