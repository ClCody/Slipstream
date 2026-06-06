package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundUpdateMobEffectPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getEffectDurationTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffectDurationTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getEntityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getEffectAmplifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffectAmplifier", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isEffectAmbientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEffectAmbient", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val effectShowsIconHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "effectShowsIcon", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldBlendHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldBlend", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isEffectVisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEffectVisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffect", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val effectDurationTicks: Int
        get() = getEffectDurationTicksHandle.invoke(handle) as Int

    val entityId: Int
        get() = getEntityIdHandle.invoke(handle) as Int

    val effectAmplifier: Int
        get() = getEffectAmplifierHandle.invoke(handle) as Int

    val effectAmbient: Boolean
        get() = isEffectAmbientHandle.invoke(handle) as Boolean

    val effectShowsIcon: Boolean
        get() = effectShowsIconHandle.invoke(handle) as Boolean

    val shouldBlend: Boolean
        get() = shouldBlendHandle.invoke(handle) as Boolean

    val effectVisible: Boolean
        get() = isEffectVisibleHandle.invoke(handle) as Boolean

    val effect: WrapperHolder
        get() = WrapperHolder(getEffectHandle.invoke(handle))

}
