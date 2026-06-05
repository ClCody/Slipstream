package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundInitializeBorderPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundInitializeBorderPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getWarningBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningBlocks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWarningTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getNewCenterXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getLerpTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getNewCenterZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getOldSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOldSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewAbsoluteMaxSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewAbsoluteMaxSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val warningBlocks: Int
        get() = getWarningBlocksHandle.invoke(handle) as Int

    val warningTime: Int
        get() = getWarningTimeHandle.invoke(handle) as Int

    val newCenterX: Double
        get() = getNewCenterXHandle.invoke(handle) as Double

    val lerpTime: Long
        get() = getLerpTimeHandle.invoke(handle) as Long

    val newCenterZ: Double
        get() = getNewCenterZHandle.invoke(handle) as Double

    val oldSize: Double
        get() = getOldSizeHandle.invoke(handle) as Double

    val newSize: Double
        get() = getNewSizeHandle.invoke(handle) as Double

    val newAbsoluteMaxSize: Int
        get() = getNewAbsoluteMaxSizeHandle.invoke(handle) as Int

}
