package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFriendlyByteBuf(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.FriendlyByteBuf") }
        private val lookup = MethodHandles.lookup()

        val compareToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compareTo", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("io.netty.buffer.ByteBuf")))
        }
        val indexOfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "indexOf", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Byte::class.javaPrimitiveType!!))
        }
        val getBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoolean", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getByte", MethodType.methodType(Byte::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShort", MethodType.methodType(Short::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getCharHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChar", MethodType.methodType(Char::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInt", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLong", MethodType.methodType(Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFloat", MethodType.methodType(Float::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDouble", MethodType.methodType(Double::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val clearHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clear", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val getBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBytes", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.nio.channels.FileChannel"), Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isDirectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDirect", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasArray", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val arrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "array", MethodType.methodType(ByteArray::class.java))
        }
        val arrayOffsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "arrayOffset", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val writeIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeInt", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readInt", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val setBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBoolean", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val setByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setByte", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setCharHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setChar", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setShort", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setInt", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setLong", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!))
        }
        val setFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setFloat", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val setDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setDouble", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val unwrapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrap", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf")))
        }
        val capacityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "capacity", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val releaseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "release", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isReadOnlyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReadOnly", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val sliceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "slice", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf")))
        }
        val duplicateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "duplicate", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf")))
        }
        val readBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readBytes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.nio.channels.FileChannel"), Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val writeBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeBytes", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), ByteArray::class.java, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val orderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "order", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf"), Class.forName("java.nio.ByteOrder")))
        }
        val writeCharHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeChar", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readCharHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readChar", MethodType.methodType(Char::class.javaPrimitiveType!!))
        }
        val writeFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeFloat", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Float::class.javaPrimitiveType!!))
        }
        val readFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readFloat", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val skipBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "skipBytes", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readBoolean", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val readByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readByte", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val readUnsignedByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedByte", MethodType.methodType(Short::class.javaPrimitiveType!!))
        }
        val readShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readShort", MethodType.methodType(Short::class.javaPrimitiveType!!))
        }
        val readUnsignedShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedShort", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val readLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readLong", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val readDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readDouble", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getUnsignedShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedShort", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val writeBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeBoolean", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Boolean::class.javaPrimitiveType!!))
        }
        val writeByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeByte", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val writeShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeShort", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val writeLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeLong", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Long::class.javaPrimitiveType!!))
        }
        val writeDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeDouble", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Double::class.javaPrimitiveType!!))
        }
        val isReadableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReadable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isWritableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isWritable", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readUtfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUtf", MethodType.methodType(String::class.java))
        }
        val readByteArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readByteArray", MethodType.methodType(ByteArray::class.java, Int::class.javaPrimitiveType!!))
        }
        val readBlockHitResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readBlockHitResult", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult")))
        }
        val readJsonWithCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readJsonWithCodec", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("com.mojang.serialization.Codec")))
        }
        val readableBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readableBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val writeByteArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeByteArray", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), ByteArray::class.java))
        }
        val writeResourceLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeResourceLocation", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val readResourceLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readResourceLocation", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val readRegistryKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readRegistryKey", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val writeVarIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeVarInt", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readOptionalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readOptional", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.network.codec.StreamDecoder")))
        }
        val readByIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readById", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("java.util.function.IntFunction")))
        }
        val writeByIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeById", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("java.util.function.ToIntFunction"), Class.forName("java.lang.Object")))
        }
        val readWithCodecTrustedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readWithCodecTrusted", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("com.mojang.serialization.DynamicOps"), Class.forName("com.mojang.serialization.Codec")))
        }
        val readUnsignedIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedInt", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val allocHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "alloc", MethodType.methodType(Class.forName("io.netty.buffer.ByteBufAllocator")))
        }
        val getLongLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLongLE", MethodType.methodType(Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readVec3Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readVec3", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val setShortLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setShortLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setIntLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setIntLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readBitSetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readBitSet", MethodType.methodType(Class.forName("java.util.BitSet")))
        }
        val asReadOnlyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asReadOnly", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf")))
        }
        val getShortLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShortLE", MethodType.methodType(Short::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getMediumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMedium", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getIntLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIntLE", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setMediumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMedium", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setLongLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setLongLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!))
        }
        val writeDateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeDate", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("java.util.Date")))
        }
        val setBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBytes", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Class.forName("io.netty.buffer.ByteBuf")))
        }
        val setZeroHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setZero", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readDateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readDate", MethodType.methodType(Class.forName("java.util.Date")))
        }
        val writeIntLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeIntLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readSliceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readSlice", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val touchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "touch", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("java.lang.Object")))
        }
        val refCntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "refCnt", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val retainHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "retain", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val readMediumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readMedium", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val writeZeroHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeZero", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val nioBufferHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nioBuffer", MethodType.methodType(Class.forName("java.nio.ByteBuffer")))
        }
        val nioBuffersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nioBuffers", MethodType.methodType(Class.forName("[Ljava.nio.ByteBuffer;"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readIntLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readIntLE", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val readLongLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readLongLE", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val writeVarLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeVarLong", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Long::class.javaPrimitiveType!!))
        }
        val readChunkPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readChunkPos", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val readVarLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readVarLong", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val writeChunkPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeChunkPos", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val readNullableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readNullable", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.network.codec.StreamDecoder")))
        }
        val readCollectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readCollection", MethodType.methodType(Class.forName("java.util.Collection"), Class.forName("java.util.function.IntFunction"), Class.forName("net.minecraft.network.codec.StreamDecoder")))
        }
        val readBlockPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readBlockPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val writeBlockPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeBlockPos", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val readLongArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readLongArray", MethodType.methodType(Class.forName("[J"), Class.forName("[J"), Int::class.javaPrimitiveType!!))
        }
        val writeLongArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeLongArray", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("[J")))
        }
        val readIntIdListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readIntIdList", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.ints.IntList")))
        }
        val maxFastWritableBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxFastWritableBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val readUnsignedShortLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedShortLE", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val readUnsignedMediumLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedMediumLE", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val discardSomeReadBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "discardSomeReadBytes", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val getUnsignedMediumLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedMediumLE", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val forEachByteDescHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forEachByteDesc", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("io.netty.util.ByteProcessor")))
        }
        val readUnsignedMediumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedMedium", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val internalNioBufferHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "internalNioBuffer", MethodType.methodType(Class.forName("java.nio.ByteBuffer"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val retainedSliceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "retainedSlice", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val retainedDuplicateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "retainedDuplicate", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf")))
        }
        val getUnsignedShortLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedShortLE", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val nioBufferCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nioBufferCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMediumLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMediumLE", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readShortLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readShortLE", MethodType.methodType(Short::class.javaPrimitiveType!!))
        }
        val readUnsignedIntLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUnsignedIntLE", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getUnsignedMediumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedMedium", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readRetainedSliceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readRetainedSlice", MethodType.methodType(Class.forName("io.netty.buffer.ByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val setCharSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setCharSequence", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.lang.CharSequence"), Class.forName("java.nio.charset.Charset")))
        }
        val setMediumLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMediumLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getUnsignedIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedInt", MethodType.methodType(Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val bytesBeforeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "bytesBefore", MethodType.methodType(Int::class.javaPrimitiveType!!, Byte::class.javaPrimitiveType!!))
        }
        val readMediumLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readMediumLE", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val forEachByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forEachByte", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("io.netty.util.ByteProcessor")))
        }
        val readCharSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readCharSequence", MethodType.methodType(Class.forName("java.lang.CharSequence"), Int::class.javaPrimitiveType!!, Class.forName("java.nio.charset.Charset")))
        }
        val writeLongLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeLongLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Long::class.javaPrimitiveType!!))
        }
        val hasMemoryAddressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasMemoryAddress", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val writeShortLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeShortLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val writeCharSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeCharSequence", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.lang.CharSequence"), Class.forName("java.nio.charset.Charset")))
        }
        val memoryAddressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "memoryAddress", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getUnsignedIntLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedIntLE", MethodType.methodType(Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val writeMediumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeMedium", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val getCharSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCharSequence", MethodType.methodType(Class.forName("java.lang.CharSequence"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.nio.charset.Charset")))
        }
        val writeMediumLEHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeMediumLE", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readQuaternionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readQuaternion", MethodType.methodType(Class.forName("org.joml.Quaternionf")))
        }
        val writePublicKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writePublicKey", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("java.security.PublicKey")))
        }
        val writableBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writableBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxWritableBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxWritableBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val resetReaderIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "resetReaderIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val markWriterIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "markWriterIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val resetWriterIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "resetWriterIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val ensureWritableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "ensureWritable", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val getUnsignedByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUnsignedByte", MethodType.methodType(Short::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val readSectionPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readSectionPos", MethodType.methodType(Class.forName("net.minecraft.core.SectionPos")))
        }
        val readVector3fHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readVector3f", MethodType.methodType(Class.forName("org.joml.Vector3f")))
        }
        val markReaderIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "markReaderIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val readGlobalPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readGlobalPos", MethodType.methodType(Class.forName("net.minecraft.core.GlobalPos")))
        }
        val discardReadBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "discardReadBytes", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val writerIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writerIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val readFixedBitSetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readFixedBitSet", MethodType.methodType(Class.forName("java.util.BitSet"), Int::class.javaPrimitiveType!!))
        }
        val writeSectionPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeSectionPos", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("net.minecraft.core.SectionPos")))
        }
        val readWithCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readWithCodec", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("com.mojang.serialization.DynamicOps"), Class.forName("com.mojang.serialization.Codec"), Class.forName("net.minecraft.nbt.NbtAccounter")))
        }
        val writeWithCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeWithCodec", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("com.mojang.serialization.DynamicOps"), Class.forName("com.mojang.serialization.Codec"), Class.forName("java.lang.Object")))
        }
        val readPublicKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readPublicKey", MethodType.methodType(Class.forName("java.security.PublicKey")))
        }
        val maxCapacityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxCapacity", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val readerIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readerIndex", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Int::class.javaPrimitiveType!!))
        }
        val isContiguousHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isContiguous", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val writeVarIntArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeVarIntArray", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), IntArray::class.java))
        }
        val readInstantHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readInstant", MethodType.methodType(Class.forName("java.time.Instant")))
        }
        val readNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readNbt", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val writeNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeNbt", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("net.minecraft.nbt.Tag")))
        }
        val writeUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeUUID", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("java.util.UUID")))
        }
        val readVarIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readVarInt", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val writeUtfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeUtf", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), String::class.java))
        }
        val readMapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readMap", MethodType.methodType(Class.forName("java.util.Map"), Class.forName("net.minecraft.network.codec.StreamDecoder"), Class.forName("net.minecraft.network.codec.StreamDecoder")))
        }
        val writeEnumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "writeEnum", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf"), Class.forName("java.lang.Enum")))
        }
        val readUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readUUID", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val readEnumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readEnum", MethodType.methodType(Class.forName("java.lang.Enum"), Class.forName("java.lang.Class")))
        }
        val readListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readList", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.network.codec.StreamDecoder")))
        }
        val readVarIntArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readVarIntArray", MethodType.methodType(IntArray::class.java))
        }
        val readEnumSetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readEnumSet", MethodType.methodType(Class.forName("java.util.EnumSet"), Class.forName("java.lang.Class")))
        }
        val readResourceKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readResourceKey", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
    }

    fun compareTo(arg0: Any): Int {
        return compareToHandle.invoke(handle, arg0) as Int
    }

    fun indexOf(arg0: Int, arg1: Int, arg2: Byte): Int {
        return indexOfHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    fun getBoolean(arg0: Int): Boolean {
        return getBooleanHandle.invoke(handle, arg0) as Boolean
    }

    fun getByte(arg0: Int): Byte {
        return getByteHandle.invoke(handle, arg0) as Byte
    }

    fun getShort(arg0: Int): Short {
        return getShortHandle.invoke(handle, arg0) as Short
    }

    fun getChar(arg0: Int): Char {
        return getCharHandle.invoke(handle, arg0) as Char
    }

    fun getInt(arg0: Int): Int {
        return getIntHandle.invoke(handle, arg0) as Int
    }

    fun getLong(arg0: Int): Long {
        return getLongHandle.invoke(handle, arg0) as Long
    }

    fun getFloat(arg0: Int): Float {
        return getFloatHandle.invoke(handle, arg0) as Float
    }

    fun getDouble(arg0: Int): Double {
        return getDoubleHandle.invoke(handle, arg0) as Double
    }

    val clear: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(clearHandle.invoke(handle))

    fun getBytes(arg0: Int, arg1: Any, arg2: Long, arg3: Int): Int {
        return getBytesHandle.invoke(handle, arg0, arg1, arg2, arg3) as Int
    }

    val direct: Boolean
        get() = isDirectHandle.invoke(handle) as Boolean

    val hasArray: Boolean
        get() = hasArrayHandle.invoke(handle) as Boolean

    val array: ByteArray
        get() = arrayHandle.invoke(handle) as ByteArray

    val arrayOffset: Int
        get() = arrayOffsetHandle.invoke(handle) as Int

    fun writeInt(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeIntHandle.invoke(handle, arg0))
    }

    val readInt: Int
        get() = readIntHandle.invoke(handle) as Int

    fun setBoolean(arg0: Int, arg1: Boolean): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setBooleanHandle.invoke(handle, arg0, arg1))
    }

    fun setByte(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setByteHandle.invoke(handle, arg0, arg1))
    }

    fun setChar(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setCharHandle.invoke(handle, arg0, arg1))
    }

    fun setShort(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setShortHandle.invoke(handle, arg0, arg1))
    }

    fun setInt(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setIntHandle.invoke(handle, arg0, arg1))
    }

    fun setLong(arg0: Int, arg1: Long): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setLongHandle.invoke(handle, arg0, arg1))
    }

    fun setFloat(arg0: Int, arg1: Float): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setFloatHandle.invoke(handle, arg0, arg1))
    }

    fun setDouble(arg0: Int, arg1: Double): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setDoubleHandle.invoke(handle, arg0, arg1))
    }

    fun copy(arg0: Int, arg1: Int): Any {
        return copyHandle.invoke(handle, arg0, arg1) as Any
    }

    val unwrap: Any
        get() = unwrapHandle.invoke(handle) as Any

    fun capacity(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(capacityHandle.invoke(handle, arg0))
    }

    val release: Boolean
        get() = releaseHandle.invoke(handle) as Boolean

    val readOnly: Boolean
        get() = isReadOnlyHandle.invoke(handle) as Boolean

    val slice: Any
        get() = sliceHandle.invoke(handle) as Any

    val duplicate: Any
        get() = duplicateHandle.invoke(handle) as Any

    fun readBytes(arg0: Any, arg1: Long, arg2: Int): Int {
        return readBytesHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    fun writeBytes(arg0: ByteArray, arg1: Int, arg2: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeBytesHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun order(arg0: Any): Any {
        return orderHandle.invoke(handle, arg0) as Any
    }

    fun writeChar(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeCharHandle.invoke(handle, arg0))
    }

    val readChar: Char
        get() = readCharHandle.invoke(handle) as Char

    fun writeFloat(arg0: Float): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeFloatHandle.invoke(handle, arg0))
    }

    val readFloat: Float
        get() = readFloatHandle.invoke(handle) as Float

    fun skipBytes(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(skipBytesHandle.invoke(handle, arg0))
    }

    val readBoolean: Boolean
        get() = readBooleanHandle.invoke(handle) as Boolean

    val readByte: Byte
        get() = readByteHandle.invoke(handle) as Byte

    val readUnsignedByte: Short
        get() = readUnsignedByteHandle.invoke(handle) as Short

    val readShort: Short
        get() = readShortHandle.invoke(handle) as Short

    val readUnsignedShort: Int
        get() = readUnsignedShortHandle.invoke(handle) as Int

    val readLong: Long
        get() = readLongHandle.invoke(handle) as Long

    val readDouble: Double
        get() = readDoubleHandle.invoke(handle) as Double

    fun getUnsignedShort(arg0: Int): Int {
        return getUnsignedShortHandle.invoke(handle, arg0) as Int
    }

    fun writeBoolean(arg0: Boolean): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeBooleanHandle.invoke(handle, arg0))
    }

    fun writeByte(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeByteHandle.invoke(handle, arg0))
    }

    fun writeShort(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeShortHandle.invoke(handle, arg0))
    }

    fun writeLong(arg0: Long): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeLongHandle.invoke(handle, arg0))
    }

    fun writeDouble(arg0: Double): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeDoubleHandle.invoke(handle, arg0))
    }

    val readable: Boolean
        get() = isReadableHandle.invoke(handle) as Boolean

    fun isWritable(arg0: Int): Boolean {
        return isWritableHandle.invoke(handle, arg0) as Boolean
    }

    fun setIndex(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setIndexHandle.invoke(handle, arg0, arg1))
    }

    val readUtf: String
        get() = readUtfHandle.invoke(handle) as String

    fun readByteArray(arg0: Int): ByteArray {
        return readByteArrayHandle.invoke(handle, arg0) as ByteArray
    }

    val readBlockHitResult: WrapperBlockHitResult
        get() = WrapperBlockHitResult(readBlockHitResultHandle.invoke(handle))

    fun readJsonWithCodec(arg0: Any): Any {
        return readJsonWithCodecHandle.invoke(handle, arg0) as Any
    }

    val readableBytes: Int
        get() = readableBytesHandle.invoke(handle) as Int

    fun writeByteArray(arg0: ByteArray): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeByteArrayHandle.invoke(handle, arg0))
    }

    fun writeResourceLocation(arg0: WrapperResourceLocation): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeResourceLocationHandle.invoke(handle, arg0.handle))
    }

    val readResourceLocation: WrapperResourceLocation
        get() = WrapperResourceLocation(readResourceLocationHandle.invoke(handle))

    val readRegistryKey: WrapperResourceKey
        get() = WrapperResourceKey(readRegistryKeyHandle.invoke(handle))

    fun writeVarInt(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeVarIntHandle.invoke(handle, arg0))
    }

    fun readOptional(arg0: WrapperStreamDecoder): Any {
        return readOptionalHandle.invoke(handle, arg0.handle) as Any
    }

    fun readById(arg0: Any): Any {
        return readByIdHandle.invoke(handle, arg0) as Any
    }

    fun writeById(arg0: Any, arg1: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeByIdHandle.invoke(handle, arg0, arg1))
    }

    fun readWithCodecTrusted(arg0: Any, arg1: Any): Any {
        return readWithCodecTrustedHandle.invoke(handle, arg0, arg1) as Any
    }

    val readUnsignedInt: Long
        get() = readUnsignedIntHandle.invoke(handle) as Long

    val alloc: Any
        get() = allocHandle.invoke(handle) as Any

    fun getLongLE(arg0: Int): Long {
        return getLongLEHandle.invoke(handle, arg0) as Long
    }

    val readVec3: WrapperVec3
        get() = WrapperVec3(readVec3Handle.invoke(handle))

    fun setShortLE(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setShortLEHandle.invoke(handle, arg0, arg1))
    }

    fun setIntLE(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setIntLEHandle.invoke(handle, arg0, arg1))
    }

    val readBitSet: Any
        get() = readBitSetHandle.invoke(handle) as Any

    val asReadOnly: Any
        get() = asReadOnlyHandle.invoke(handle) as Any

    fun getShortLE(arg0: Int): Short {
        return getShortLEHandle.invoke(handle, arg0) as Short
    }

    fun getMedium(arg0: Int): Int {
        return getMediumHandle.invoke(handle, arg0) as Int
    }

    fun getIntLE(arg0: Int): Int {
        return getIntLEHandle.invoke(handle, arg0) as Int
    }

    fun setMedium(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setMediumHandle.invoke(handle, arg0, arg1))
    }

    fun setLongLE(arg0: Int, arg1: Long): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setLongLEHandle.invoke(handle, arg0, arg1))
    }

    fun writeDate(arg0: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeDateHandle.invoke(handle, arg0))
    }

    fun setBytes(arg0: Int, arg1: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setBytesHandle.invoke(handle, arg0, arg1))
    }

    fun setZero(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setZeroHandle.invoke(handle, arg0, arg1))
    }

    val readDate: Any
        get() = readDateHandle.invoke(handle) as Any

    fun writeIntLE(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeIntLEHandle.invoke(handle, arg0))
    }

    fun readSlice(arg0: Int): Any {
        return readSliceHandle.invoke(handle, arg0) as Any
    }

    fun touch(arg0: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(touchHandle.invoke(handle, arg0))
    }

    val refCnt: Int
        get() = refCntHandle.invoke(handle) as Int

    val retain: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(retainHandle.invoke(handle))

    val readMedium: Int
        get() = readMediumHandle.invoke(handle) as Int

    fun writeZero(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeZeroHandle.invoke(handle, arg0))
    }

    val nioBuffer: Any
        get() = nioBufferHandle.invoke(handle) as Any

    fun nioBuffers(arg0: Int, arg1: Int): Any {
        return nioBuffersHandle.invoke(handle, arg0, arg1) as Any
    }

    val readIntLE: Int
        get() = readIntLEHandle.invoke(handle) as Int

    val readLongLE: Long
        get() = readLongLEHandle.invoke(handle) as Long

    fun writeVarLong(arg0: Long): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeVarLongHandle.invoke(handle, arg0))
    }

    val readChunkPos: WrapperChunkPos
        get() = WrapperChunkPos(readChunkPosHandle.invoke(handle))

    val readVarLong: Long
        get() = readVarLongHandle.invoke(handle) as Long

    fun writeChunkPos(arg0: WrapperChunkPos): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeChunkPosHandle.invoke(handle, arg0.handle))
    }

    fun readNullable(arg0: WrapperStreamDecoder): Any {
        return readNullableHandle.invoke(handle, arg0.handle) as Any
    }

    fun readCollection(arg0: Any, arg1: WrapperStreamDecoder): Any {
        return readCollectionHandle.invoke(handle, arg0, arg1.handle) as Any
    }

    val readBlockPos: WrapperBlockPos
        get() = WrapperBlockPos(readBlockPosHandle.invoke(handle))

    fun writeBlockPos(arg0: WrapperBlockPos): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeBlockPosHandle.invoke(handle, arg0.handle))
    }

    fun readLongArray(arg0: Any, arg1: Int): Any {
        return readLongArrayHandle.invoke(handle, arg0, arg1) as Any
    }

    fun writeLongArray(arg0: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeLongArrayHandle.invoke(handle, arg0))
    }

    val readIntIdList: Any
        get() = readIntIdListHandle.invoke(handle) as Any

    val maxFastWritableBytes: Int
        get() = maxFastWritableBytesHandle.invoke(handle) as Int

    val readUnsignedShortLE: Int
        get() = readUnsignedShortLEHandle.invoke(handle) as Int

    val readUnsignedMediumLE: Int
        get() = readUnsignedMediumLEHandle.invoke(handle) as Int

    val discardSomeReadBytes: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(discardSomeReadBytesHandle.invoke(handle))

    fun getUnsignedMediumLE(arg0: Int): Int {
        return getUnsignedMediumLEHandle.invoke(handle, arg0) as Int
    }

    fun forEachByteDesc(arg0: Int, arg1: Int, arg2: Any): Int {
        return forEachByteDescHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    val readUnsignedMedium: Int
        get() = readUnsignedMediumHandle.invoke(handle) as Int

    fun internalNioBuffer(arg0: Int, arg1: Int): Any {
        return internalNioBufferHandle.invoke(handle, arg0, arg1) as Any
    }

    fun retainedSlice(arg0: Int, arg1: Int): Any {
        return retainedSliceHandle.invoke(handle, arg0, arg1) as Any
    }

    val retainedDuplicate: Any
        get() = retainedDuplicateHandle.invoke(handle) as Any

    fun getUnsignedShortLE(arg0: Int): Int {
        return getUnsignedShortLEHandle.invoke(handle, arg0) as Int
    }

    val nioBufferCount: Int
        get() = nioBufferCountHandle.invoke(handle) as Int

    fun getMediumLE(arg0: Int): Int {
        return getMediumLEHandle.invoke(handle, arg0) as Int
    }

    val readShortLE: Short
        get() = readShortLEHandle.invoke(handle) as Short

    val readUnsignedIntLE: Long
        get() = readUnsignedIntLEHandle.invoke(handle) as Long

    fun getUnsignedMedium(arg0: Int): Int {
        return getUnsignedMediumHandle.invoke(handle, arg0) as Int
    }

    fun readRetainedSlice(arg0: Int): Any {
        return readRetainedSliceHandle.invoke(handle, arg0) as Any
    }

    fun setCharSequence(arg0: Int, arg1: Any, arg2: Any): Int {
        return setCharSequenceHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    fun setMediumLE(arg0: Int, arg1: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(setMediumLEHandle.invoke(handle, arg0, arg1))
    }

    fun getUnsignedInt(arg0: Int): Long {
        return getUnsignedIntHandle.invoke(handle, arg0) as Long
    }

    fun bytesBefore(arg0: Byte): Int {
        return bytesBeforeHandle.invoke(handle, arg0) as Int
    }

    val readMediumLE: Int
        get() = readMediumLEHandle.invoke(handle) as Int

    fun forEachByte(arg0: Any): Int {
        return forEachByteHandle.invoke(handle, arg0) as Int
    }

    fun readCharSequence(arg0: Int, arg1: Any): Any {
        return readCharSequenceHandle.invoke(handle, arg0, arg1) as Any
    }

    fun writeLongLE(arg0: Long): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeLongLEHandle.invoke(handle, arg0))
    }

    val hasMemoryAddress: Boolean
        get() = hasMemoryAddressHandle.invoke(handle) as Boolean

    fun writeShortLE(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeShortLEHandle.invoke(handle, arg0))
    }

    fun writeCharSequence(arg0: Any, arg1: Any): Int {
        return writeCharSequenceHandle.invoke(handle, arg0, arg1) as Int
    }

    val memoryAddress: Long
        get() = memoryAddressHandle.invoke(handle) as Long

    fun getUnsignedIntLE(arg0: Int): Long {
        return getUnsignedIntLEHandle.invoke(handle, arg0) as Long
    }

    fun writeMedium(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeMediumHandle.invoke(handle, arg0))
    }

    fun getCharSequence(arg0: Int, arg1: Int, arg2: Any): Any {
        return getCharSequenceHandle.invoke(handle, arg0, arg1, arg2) as Any
    }

    fun writeMediumLE(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeMediumLEHandle.invoke(handle, arg0))
    }

    val readQuaternion: Any
        get() = readQuaternionHandle.invoke(handle) as Any

    fun writePublicKey(arg0: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writePublicKeyHandle.invoke(handle, arg0))
    }

    val writableBytes: Int
        get() = writableBytesHandle.invoke(handle) as Int

    val maxWritableBytes: Int
        get() = maxWritableBytesHandle.invoke(handle) as Int

    val resetReaderIndex: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(resetReaderIndexHandle.invoke(handle))

    val markWriterIndex: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(markWriterIndexHandle.invoke(handle))

    val resetWriterIndex: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(resetWriterIndexHandle.invoke(handle))

    fun ensureWritable(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(ensureWritableHandle.invoke(handle, arg0))
    }

    fun getUnsignedByte(arg0: Int): Short {
        return getUnsignedByteHandle.invoke(handle, arg0) as Short
    }

    val readSectionPos: WrapperSectionPos
        get() = WrapperSectionPos(readSectionPosHandle.invoke(handle))

    val readVector3f: Any
        get() = readVector3fHandle.invoke(handle) as Any

    val markReaderIndex: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(markReaderIndexHandle.invoke(handle))

    val readGlobalPos: WrapperGlobalPos
        get() = WrapperGlobalPos(readGlobalPosHandle.invoke(handle))

    val discardReadBytes: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(discardReadBytesHandle.invoke(handle))

    fun writerIndex(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writerIndexHandle.invoke(handle, arg0))
    }

    fun readFixedBitSet(arg0: Int): Any {
        return readFixedBitSetHandle.invoke(handle, arg0) as Any
    }

    fun writeSectionPos(arg0: WrapperSectionPos): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeSectionPosHandle.invoke(handle, arg0.handle))
    }

    fun readWithCodec(arg0: Any, arg1: Any, arg2: WrapperNbtAccounter): Any {
        return readWithCodecHandle.invoke(handle, arg0, arg1, arg2.handle) as Any
    }

    fun writeWithCodec(arg0: Any, arg1: Any, arg2: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeWithCodecHandle.invoke(handle, arg0, arg1, arg2))
    }

    val readPublicKey: Any
        get() = readPublicKeyHandle.invoke(handle) as Any

    val maxCapacity: Int
        get() = maxCapacityHandle.invoke(handle) as Int

    fun readerIndex(arg0: Int): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(readerIndexHandle.invoke(handle, arg0))
    }

    val contiguous: Boolean
        get() = isContiguousHandle.invoke(handle) as Boolean

    fun writeVarIntArray(arg0: IntArray): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeVarIntArrayHandle.invoke(handle, arg0))
    }

    val readInstant: Any
        get() = readInstantHandle.invoke(handle) as Any

    val readNbt: WrapperCompoundTag
        get() = WrapperCompoundTag(readNbtHandle.invoke(handle))

    fun writeNbt(arg0: WrapperTag): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeNbtHandle.invoke(handle, arg0.handle))
    }

    fun writeUUID(arg0: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeUUIDHandle.invoke(handle, arg0))
    }

    val readVarInt: Int
        get() = readVarIntHandle.invoke(handle) as Int

    fun writeUtf(arg0: String): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeUtfHandle.invoke(handle, arg0))
    }

    fun readMap(arg0: WrapperStreamDecoder, arg1: WrapperStreamDecoder): Any {
        return readMapHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    fun writeEnum(arg0: Any): WrapperFriendlyByteBuf {
        return WrapperFriendlyByteBuf(writeEnumHandle.invoke(handle, arg0))
    }

    val readUUID: Any
        get() = readUUIDHandle.invoke(handle) as Any

    fun readEnum(arg0: Any): Any {
        return readEnumHandle.invoke(handle, arg0) as Any
    }

    fun readList(arg0: WrapperStreamDecoder): Any {
        return readListHandle.invoke(handle, arg0.handle) as Any
    }

    val readVarIntArray: IntArray
        get() = readVarIntArrayHandle.invoke(handle) as IntArray

    fun readEnumSet(arg0: Any): Any {
        return readEnumSetHandle.invoke(handle, arg0) as Any
    }

    fun readResourceKey(arg0: WrapperResourceKey): WrapperResourceKey {
        return WrapperResourceKey(readResourceKeyHandle.invoke(handle, arg0.handle))
    }

}
