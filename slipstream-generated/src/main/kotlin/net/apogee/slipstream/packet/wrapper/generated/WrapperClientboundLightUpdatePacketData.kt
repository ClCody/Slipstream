package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundLightUpdatePacketData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData") }
        private val lookup = MethodHandles.lookup()

        val getBlockUpdatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockUpdates", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getSkyUpdatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyUpdates", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getSkyYMaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyYMask", MethodType.methodType(Class.forName("java.util.BitSet")))
        }
        val getEmptySkyYMaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEmptySkyYMask", MethodType.methodType(Class.forName("java.util.BitSet")))
        }
        val getEmptyBlockYMaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEmptyBlockYMask", MethodType.methodType(Class.forName("java.util.BitSet")))
        }
        val getBlockYMaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockYMask", MethodType.methodType(Class.forName("java.util.BitSet")))
        }
    }

    val blockUpdates: Any
        get() = getBlockUpdatesHandle.invoke(handle) as Any

    val skyUpdates: Any
        get() = getSkyUpdatesHandle.invoke(handle) as Any

    val skyYMask: Any
        get() = getSkyYMaskHandle.invoke(handle) as Any

    val emptySkyYMask: Any
        get() = getEmptySkyYMaskHandle.invoke(handle) as Any

    val emptyBlockYMask: Any
        get() = getEmptyBlockYMaskHandle.invoke(handle) as Any

    val blockYMask: Any
        get() = getBlockYMaskHandle.invoke(handle) as Any

}
