package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundHurtAnimationPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundHurtAnimationPacket") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val yawHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "yaw", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = idHandle.invoke(handle) as Int

    val yaw: Float
        get() = yawHandle.invoke(handle) as Float

    fun copy(id: Int = this.id, yaw: Float = this.yaw): WrapperClientboundHurtAnimationPacket {
        return WrapperClientboundHurtAnimationPacket(constructorHandle.invoke(id, yaw))
    }

}
