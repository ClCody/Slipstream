package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundUpdateMobEffectPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket") }
        private val lookup = MethodHandles.lookup()

        val getEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffect", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getEntityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isEffectAmbientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEffectAmbient", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isEffectVisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEffectVisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEffectAmplifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffectAmplifier", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getEffectDurationTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffectDurationTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val effect: Any
        get() = getEffectHandle.invoke(handle) as Any

    val entityId: Int
        get() = getEntityIdHandle.invoke(handle) as Int

    val effectAmbient: Boolean
        get() = isEffectAmbientHandle.invoke(handle) as Boolean

    val effectVisible: Boolean
        get() = isEffectVisibleHandle.invoke(handle) as Boolean

    val effectAmplifier: Int
        get() = getEffectAmplifierHandle.invoke(handle) as Int

    val effectDurationTicks: Int
        get() = getEffectDurationTicksHandle.invoke(handle) as Int

}

fun Any.isClientboundUpdateMobEffectPacket(): Boolean = WrapperClientboundUpdateMobEffectPacket.packetClass.isInstance(this)
fun Any.asClientboundUpdateMobEffectPacket(): WrapperClientboundUpdateMobEffectPacket = WrapperClientboundUpdateMobEffectPacket(this)
