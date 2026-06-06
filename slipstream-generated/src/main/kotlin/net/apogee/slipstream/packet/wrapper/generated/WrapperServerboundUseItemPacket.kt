package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundUseItemPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundUseItemPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
        val getYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val timestampSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("timestamp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val hand: Any
        get() = getHandHandle.invoke(handle) as Any

    val yRot: Float
        get() = getYRotHandle.invoke(handle) as Float

    val xRot: Float
        get() = getXRotHandle.invoke(handle) as Float

    val sequence: Int
        get() = getSequenceHandle.invoke(handle) as Int

    fun setTimestamp(value: Long) {
        timestampSetterHandle.invoke(handle, value)
    }

}
