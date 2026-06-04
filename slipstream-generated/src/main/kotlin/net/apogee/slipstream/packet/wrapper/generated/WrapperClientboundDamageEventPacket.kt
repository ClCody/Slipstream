package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundDamageEventPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundDamageEventPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSource", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.level.Level")))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

    fun getSource(arg0: Any): Any {
        return getSourceHandle.invoke(handle, arg0) as Any
    }

}

fun Any.isClientboundDamageEventPacket(): Boolean = WrapperClientboundDamageEventPacket.packetClass.isInstance(this)
fun Any.asClientboundDamageEventPacket(): WrapperClientboundDamageEventPacket = WrapperClientboundDamageEventPacket(this)
