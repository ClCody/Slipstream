package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundGameEventPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundGameEventPacket") }
        private val lookup = MethodHandles.lookup()

        val getEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEvent", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundGameEventPacket\$Type")))
        }
        val getParamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParam", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val event: Any
        get() = getEventHandle.invoke(handle) as Any

    val param: Float
        get() = getParamHandle.invoke(handle) as Float

}

fun Any.isClientboundGameEventPacket(): Boolean = WrapperClientboundGameEventPacket.packetClass.isInstance(this)
fun Any.asClientboundGameEventPacket(): WrapperClientboundGameEventPacket = WrapperClientboundGameEventPacket(this)
