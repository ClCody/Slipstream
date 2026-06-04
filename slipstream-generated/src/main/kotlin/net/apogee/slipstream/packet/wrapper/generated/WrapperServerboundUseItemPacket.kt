package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundUseItemPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundUseItemPacket") }
        private val lookup = MethodHandles.lookup()

        val getSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
    }

    val sequence: Int
        get() = getSequenceHandle.invoke(handle) as Int

    val xRot: Float
        get() = getXRotHandle.invoke(handle) as Float

    val yRot: Float
        get() = getYRotHandle.invoke(handle) as Float

    val hand: Any
        get() = getHandHandle.invoke(handle) as Any

}

fun Any.isServerboundUseItemPacket(): Boolean = WrapperServerboundUseItemPacket.packetClass.isInstance(this)
fun Any.asServerboundUseItemPacket(): WrapperServerboundUseItemPacket = WrapperServerboundUseItemPacket(this)
