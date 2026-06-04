package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBelowZeroRetrogen(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.BelowZeroRetrogen") }
        private val lookup = MethodHandles.lookup()

        val hasBedrockHoleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasBedrockHole", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val hasBedrockHolesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasBedrockHoles", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val targetStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "targetStatus", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
    }

    fun hasBedrockHole(arg0: Int, arg1: Int): Boolean {
        return hasBedrockHoleHandle.invoke(handle, arg0, arg1) as Boolean
    }

    val bedrockHoles: Boolean
        get() = hasBedrockHolesHandle.invoke(handle) as Boolean

    val targetStatus: WrapperChunkStatus
        get() = WrapperChunkStatus(targetStatusHandle.invoke(handle))

}
