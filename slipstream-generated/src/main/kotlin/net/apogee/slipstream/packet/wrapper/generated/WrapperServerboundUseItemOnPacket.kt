package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundUseItemOnPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundUseItemOnPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getHitResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHitResult", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult")))
        }
        val getSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
        val timestampSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("timestamp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val hitResult: WrapperBlockHitResult
        get() = WrapperBlockHitResult(getHitResultHandle.invoke(handle))

    val sequence: Int
        get() = getSequenceHandle.invoke(handle) as Int

    val hand: Any
        get() = getHandHandle.invoke(handle) as Any

    fun setTimestamp(value: Long) {
        timestampSetterHandle.invoke(handle, value)
    }

}
