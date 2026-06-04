package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundInitializeBorderPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundInitializeBorderPacket") }
        private val lookup = MethodHandles.lookup()

        val getNewSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getOldSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOldSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getWarningTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWarningBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningBlocks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getLerpTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getNewCenterXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewCenterZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewAbsoluteMaxSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewAbsoluteMaxSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val newSize: Double
        get() = getNewSizeHandle.invoke(handle) as Double

    val oldSize: Double
        get() = getOldSizeHandle.invoke(handle) as Double

    val warningTime: Int
        get() = getWarningTimeHandle.invoke(handle) as Int

    val warningBlocks: Int
        get() = getWarningBlocksHandle.invoke(handle) as Int

    val lerpTime: Long
        get() = getLerpTimeHandle.invoke(handle) as Long

    val newCenterX: Double
        get() = getNewCenterXHandle.invoke(handle) as Double

    val newCenterZ: Double
        get() = getNewCenterZHandle.invoke(handle) as Double

    val newAbsoluteMaxSize: Int
        get() = getNewAbsoluteMaxSizeHandle.invoke(handle) as Int

}

fun Any.isClientboundInitializeBorderPacket(): Boolean = WrapperClientboundInitializeBorderPacket.packetClass.isInstance(this)
fun Any.asClientboundInitializeBorderPacket(): WrapperClientboundInitializeBorderPacket = WrapperClientboundInitializeBorderPacket(this)
