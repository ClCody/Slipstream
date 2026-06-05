package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.border.WorldBorder\$Settings") }
        private val lookup = MethodHandles.lookup()

        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getWarningBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningBlocks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWarningTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSafeZoneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSafeZone", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getSizeLerpTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSizeLerpTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getSizeLerpTargetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSizeLerpTarget", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getCenterZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenterZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getCenterXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenterX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getDamagePerBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDamagePerBlock", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val size: Double
        get() = getSizeHandle.invoke(handle) as Double

    val warningBlocks: Int
        get() = getWarningBlocksHandle.invoke(handle) as Int

    val warningTime: Int
        get() = getWarningTimeHandle.invoke(handle) as Int

    val safeZone: Double
        get() = getSafeZoneHandle.invoke(handle) as Double

    val sizeLerpTime: Long
        get() = getSizeLerpTimeHandle.invoke(handle) as Long

    val sizeLerpTarget: Double
        get() = getSizeLerpTargetHandle.invoke(handle) as Double

    val centerZ: Double
        get() = getCenterZHandle.invoke(handle) as Double

    val centerX: Double
        get() = getCenterXHandle.invoke(handle) as Double

    val damagePerBlock: Double
        get() = getDamagePerBlockHandle.invoke(handle) as Double

}
