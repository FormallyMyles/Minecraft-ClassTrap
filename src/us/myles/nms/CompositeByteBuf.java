package us.myles.nms;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//net.minecraft.util.io.netty.buffer.CompositeByteBuf
@TrapTag
public interface CompositeByteBuf {
	public java.lang.String toString();
	public byte getByte(int arg0);
	public CompositeByteBuf clear();
	@TrapTag(type = TrapTagType.METHOD, value = "clear")
	public ByteBuf clear2();
	public int getBytes(int arg0, java.nio.channels.GatheringByteChannel arg1, int arg2);
	public CompositeByteBuf getBytes(int arg0, ByteBuf arg1, int arg2, int arg3);
	public CompositeByteBuf getBytes(int arg0, java.io.OutputStream arg1, int arg2);
	public ByteBuf getBytes(int arg0, byte[] arg1);
	public ByteBuf getBytes(int arg0, ByteBuf arg1, int arg2);
	public CompositeByteBuf getBytes(int arg0, byte[] arg1, int arg2, int arg3);
	public CompositeByteBuf getBytes(int arg0, java.nio.ByteBuffer arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public CompositeByteBuf getBytes2(int arg0, byte[] arg1);
	public ByteBuf getBytes(int arg0, ByteBuf arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public ByteBuf getBytes2(int arg0, java.nio.ByteBuffer arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public ByteBuf getBytes2(int arg0, byte[] arg1, int arg2, int arg3);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public ByteBuf getBytes2(int arg0, ByteBuf arg1, int arg2, int arg3);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public ByteBuf getBytes2(int arg0, java.io.OutputStream arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public CompositeByteBuf getBytes2(int arg0, ByteBuf arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "getBytes")
	public CompositeByteBuf getBytes2(int arg0, ByteBuf arg1);
	public java.util.Iterator iterator();
	public byte[] array();
	public int arrayOffset();
	public boolean hasArray();
	public boolean isDirect();
	public CompositeByteBuf writeInt(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeInt")
	public ByteBuf writeInt2(int arg0);
	public ByteBuf copy(int arg0, int arg1);
	public CompositeByteBuf setBoolean(int arg0, boolean arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setBoolean")
	public ByteBuf setBoolean2(int arg0, boolean arg1);
	public ByteBuf setByte(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setByte")
	public CompositeByteBuf setByte2(int arg0, int arg1);
	public ByteBuf setChar(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setChar")
	public CompositeByteBuf setChar2(int arg0, int arg1);
	public CompositeByteBuf setDouble(int arg0, double arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setDouble")
	public ByteBuf setDouble2(int arg0, double arg1);
	public ByteBuf setFloat(int arg0, float arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setFloat")
	public CompositeByteBuf setFloat2(int arg0, float arg1);
	public ByteBuf setInt(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setInt")
	public CompositeByteBuf setInt2(int arg0, int arg1);
	public ByteBuf setLong(int arg0, long arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setLong")
	public CompositeByteBuf setLong2(int arg0, long arg1);
	public ByteBuf setShort(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setShort")
	public CompositeByteBuf setShort2(int arg0, int arg1);
	public ByteBuf unwrap();
	public CompositeByteBuf capacity(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "capacity")
	public ByteBuf capacity2(int arg0);
	public int capacity();
	public ByteBuf readBytes(java.nio.ByteBuffer arg0);
	public CompositeByteBuf readBytes(java.io.OutputStream arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public ByteBuf readBytes2(java.io.OutputStream arg0, int arg1);
	public CompositeByteBuf readBytes(ByteBuf arg0, int arg1);
	public CompositeByteBuf readBytes(ByteBuf arg0, int arg1, int arg2);
	public CompositeByteBuf readBytes(byte[] arg0);
	public CompositeByteBuf readBytes(byte[] arg0, int arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public CompositeByteBuf readBytes2(java.nio.ByteBuffer arg0);
	public CompositeByteBuf readBytes(ByteBuf arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public ByteBuf readBytes2(ByteBuf arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public ByteBuf readBytes2(byte[] arg0, int arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public ByteBuf readBytes2(byte[] arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public ByteBuf readBytes2(ByteBuf arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "readBytes")
	public ByteBuf readBytes2(ByteBuf arg0, int arg1, int arg2);
	public ByteBuf writeBytes(ByteBuf arg0);
	public ByteBuf writeBytes(byte[] arg0);
	public ByteBuf writeBytes(byte[] arg0, int arg1, int arg2);
	public CompositeByteBuf writeBytes(java.nio.ByteBuffer arg0);
	public ByteBuf writeBytes(ByteBuf arg0, int arg1);
	public ByteBuf writeBytes(ByteBuf arg0, int arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBytes")
	public ByteBuf writeBytes2(java.nio.ByteBuffer arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBytes")
	public CompositeByteBuf writeBytes2(byte[] arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBytes")
	public CompositeByteBuf writeBytes2(ByteBuf arg0, int arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBytes")
	public CompositeByteBuf writeBytes2(ByteBuf arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBytes")
	public CompositeByteBuf writeBytes2(ByteBuf arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBytes")
	public CompositeByteBuf writeBytes2(byte[] arg0, int arg1, int arg2);
	public java.nio.ByteOrder order();
	public ByteBuf writeChar(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeChar")
	public CompositeByteBuf writeChar2(int arg0);
	public CompositeByteBuf writeFloat(float arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeFloat")
	public ByteBuf writeFloat2(float arg0);
	public ByteBuf component(int arg0);
	public ByteBuf writeBoolean(boolean arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeBoolean")
	public CompositeByteBuf writeBoolean2(boolean arg0);
	public ByteBuf writeShort(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeShort")
	public CompositeByteBuf writeShort2(int arg0);
	public ByteBuf writeDouble(double arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeDouble")
	public CompositeByteBuf writeDouble2(double arg0);
	public CompositeByteBuf resetWriterIndex();
	@TrapTag(type = TrapTagType.METHOD, value = "resetWriterIndex")
	public ByteBuf resetWriterIndex2();
	public CompositeByteBuf discardSomeReadBytes();
	@TrapTag(type = TrapTagType.METHOD, value = "discardSomeReadBytes")
	public ByteBuf discardSomeReadBytes2();
	public CompositeByteBuf resetReaderIndex();
	@TrapTag(type = TrapTagType.METHOD, value = "resetReaderIndex")
	public ByteBuf resetReaderIndex2();
	public CompositeByteBuf ensureWritable(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "ensureWritable")
	public ByteBuf ensureWritable2(int arg0);
	public int nioBufferCount();
	public java.nio.ByteBuffer internalNioBuffer(int arg0, int arg1);
	public CompositeByteBuf discardReadBytes();
	@TrapTag(type = TrapTagType.METHOD, value = "discardReadBytes")
	public ByteBuf discardReadBytes2();
	public CompositeByteBuf markWriterIndex();
	@TrapTag(type = TrapTagType.METHOD, value = "markWriterIndex")
	public ByteBuf markWriterIndex2();
	public boolean hasMemoryAddress();
	public CompositeByteBuf markReaderIndex();
	@TrapTag(type = TrapTagType.METHOD, value = "markReaderIndex")
	public ByteBuf markReaderIndex2();
	public ByteBuf setBytes(int arg0, byte[] arg1);
	public ByteBuf setBytes(int arg0, ByteBuf arg1, int arg2);
	public ByteBuf setBytes(int arg0, ByteBuf arg1);
	public ByteBuf setBytes(int arg0, ByteBuf arg1, int arg2, int arg3);
	public ByteBuf setBytes(int arg0, java.nio.ByteBuffer arg1);
	public ByteBuf setBytes(int arg0, byte[] arg1, int arg2, int arg3);
	@TrapTag(type = TrapTagType.METHOD, value = "setBytes")
	public CompositeByteBuf setBytes2(int arg0, byte[] arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setBytes")
	public CompositeByteBuf setBytes2(int arg0, byte[] arg1, int arg2, int arg3);
	@TrapTag(type = TrapTagType.METHOD, value = "setBytes")
	public CompositeByteBuf setBytes2(int arg0, java.nio.ByteBuffer arg1);
	public int setBytes(int arg0, java.io.InputStream arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "setBytes")
	public CompositeByteBuf setBytes2(int arg0, ByteBuf arg1, int arg2, int arg3);
	public int setBytes(int arg0, java.nio.channels.ScatteringByteChannel arg1, int arg2);
	@TrapTag(type = TrapTagType.METHOD, value = "setBytes")
	public CompositeByteBuf setBytes2(int arg0, ByteBuf arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setBytes")
	public CompositeByteBuf setBytes2(int arg0, ByteBuf arg1, int arg2);
	public ByteBuf writeZero(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeZero")
	public CompositeByteBuf writeZero2(int arg0);
	public java.nio.ByteBuffer nioBuffer(int arg0, int arg1);
	public ByteBuf setIndex(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setIndex")
	public CompositeByteBuf setIndex2(int arg0, int arg1);
	public CompositeByteBuf skipBytes(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "skipBytes")
	public ByteBuf skipBytes2(int arg0);
	public CompositeByteBuf readerIndex(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "readerIndex")
	public ByteBuf readerIndex2(int arg0);
	public CompositeByteBuf writeLong(long arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeLong")
	public ByteBuf writeLong2(long arg0);
	public long memoryAddress();
	public java.nio.ByteBuffer[] nioBuffers();
	public java.nio.ByteBuffer[] nioBuffers(int arg0, int arg1);
	public ByteBufAllocator alloc();
	public CompositeByteBuf writerIndex(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writerIndex")
	public ByteBuf writerIndex2(int arg0);
	public CompositeByteBuf setZero(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setZero")
	public ByteBuf setZero2(int arg0, int arg1);
	public ByteBuf writeMedium(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeMedium")
	public CompositeByteBuf writeMedium2(int arg0);
	public ReferenceCounted retain();
	@TrapTag(type = TrapTagType.METHOD, value = "retain")
	public ByteBuf retain2();
	@TrapTag(type = TrapTagType.METHOD, value = "retain")
	public CompositeByteBuf retain3();
	public CompositeByteBuf retain(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "retain")
	public ByteBuf retain2(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "retain")
	public ReferenceCounted retain3(int arg0);
	public ByteBuf setMedium(int arg0, int arg1);
	@TrapTag(type = TrapTagType.METHOD, value = "setMedium")
	public CompositeByteBuf setMedium2(int arg0, int arg1);
	public ByteBuf writeByte(int arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "writeByte")
	public CompositeByteBuf writeByte2(int arg0);
	public int toComponentIndex(int arg0);
	public ByteBuf internalComponent(int arg0);
	public CompositeByteBuf removeComponent(int arg0);
	public ByteBuf internalComponentAtOffset(int arg0);
	public ByteBuf componentAtOffset(int arg0);
	public CompositeByteBuf discardReadComponents();
	public CompositeByteBuf removeComponents(int arg0, int arg1);
	public int maxNumComponents();
	public CompositeByteBuf addComponents(java.lang.Iterable arg0);
	public CompositeByteBuf addComponents(int arg0, java.lang.Iterable arg1);
	public CompositeByteBuf addComponents(int arg0, ByteBuf[] arg1);
	public CompositeByteBuf addComponents(ByteBuf[] arg0);
	public CompositeByteBuf addComponent(int arg0, ByteBuf arg1);
	public CompositeByteBuf addComponent(ByteBuf arg0);
	public int numComponents();
	public java.util.List decompose(int arg0, int arg1);
	public CompositeByteBuf consolidate(int arg0, int arg1);
	public CompositeByteBuf consolidate();
	public int toByteIndex(int arg0);
}
