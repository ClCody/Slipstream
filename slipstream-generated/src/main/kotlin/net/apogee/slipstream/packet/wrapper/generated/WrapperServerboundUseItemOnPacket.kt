package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundUseItemOnPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundUseItemOnPacket") }
        private val lookup = MethodHandles.lookup()

        val getSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHitResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHitResult", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult")))
        }
        val getHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
    }

    val sequence: Int
        get() = getSequenceHandle.invoke(handle) as Int

    val hitResult: Any
        get() = getHitResultHandle.invoke(handle) as Any

    val hand: Any
        get() = getHandHandle.invoke(handle) as Any

}

fun Any.isServerboundUseItemOnPacket(): Boolean = WrapperServerboundUseItemOnPacket.packetClass.isInstance(this)
fun Any.asServerboundUseItemOnPacket(): WrapperServerboundUseItemOnPacket = WrapperServerboundUseItemOnPacket(this)
