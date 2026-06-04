package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPlayerActionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerActionPacket") }
        private val lookup = MethodHandles.lookup()

        val getDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerActionPacket\$Action")))
        }
        val getSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val direction: Any
        get() = getDirectionHandle.invoke(handle) as Any

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val action: Any
        get() = getActionHandle.invoke(handle) as Any

    val sequence: Int
        get() = getSequenceHandle.invoke(handle) as Int

}

fun Any.isServerboundPlayerActionPacket(): Boolean = WrapperServerboundPlayerActionPacket.packetClass.isInstance(this)
fun Any.asServerboundPlayerActionPacket(): WrapperServerboundPlayerActionPacket = WrapperServerboundPlayerActionPacket(this)
