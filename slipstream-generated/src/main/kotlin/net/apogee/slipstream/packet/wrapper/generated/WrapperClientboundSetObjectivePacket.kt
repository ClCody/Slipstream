package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetObjectivePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetObjectivePacket") }
        private val lookup = MethodHandles.lookup()

        val getMethodHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMethod", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getNumberFormatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNumberFormat", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getRenderTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRenderType", MethodType.methodType(Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria\$RenderType")))
        }
        val getObjectiveNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObjectiveName", MethodType.methodType(String::class.java))
        }
    }

    val method: Int
        get() = getMethodHandle.invoke(handle) as Int

    val displayName: Any
        get() = getDisplayNameHandle.invoke(handle) as Any

    val numberFormat: Any
        get() = getNumberFormatHandle.invoke(handle) as Any

    val renderType: Any
        get() = getRenderTypeHandle.invoke(handle) as Any

    val objectiveName: String
        get() = getObjectiveNameHandle.invoke(handle) as String

}

fun Any.isClientboundSetObjectivePacket(): Boolean = WrapperClientboundSetObjectivePacket.packetClass.isInstance(this)
fun Any.asClientboundSetObjectivePacket(): WrapperClientboundSetObjectivePacket = WrapperClientboundSetObjectivePacket(this)
