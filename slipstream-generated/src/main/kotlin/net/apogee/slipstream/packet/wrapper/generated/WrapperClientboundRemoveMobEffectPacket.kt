package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundRemoveMobEffectPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundRemoveMobEffectPacket") }
        private val lookup = MethodHandles.lookup()

        val entityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val effectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "effect", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
    }

    val entityId: Int
        get() = entityIdHandle.invoke(handle) as Int

    val effect: WrapperHolder
        get() = WrapperHolder(effectHandle.invoke(handle))

    fun copy(entityId: Int = this.entityId, effect: WrapperHolder = this.effect): WrapperClientboundRemoveMobEffectPacket {
        return WrapperClientboundRemoveMobEffectPacket(constructorHandle.invoke(entityId, effect.handle))
    }

}
