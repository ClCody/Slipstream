package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundRemoveMobEffectPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundRemoveMobEffectPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.Level")))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

    fun getEntity(arg0: Any): Any {
        return getEntityHandle.invoke(handle, arg0) as Any
    }

}

fun Any.isClientboundRemoveMobEffectPacket(): Boolean = WrapperClientboundRemoveMobEffectPacket.packetClass.isInstance(this)
fun Any.asClientboundRemoveMobEffectPacket(): WrapperClientboundRemoveMobEffectPacket = WrapperClientboundRemoveMobEffectPacket(this)
