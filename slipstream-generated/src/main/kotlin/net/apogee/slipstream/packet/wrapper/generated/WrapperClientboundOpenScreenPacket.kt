package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundOpenScreenPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundOpenScreenPacket") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.inventory.MenuType")))
        }
        val getTitleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTitle", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: Any
        get() = getTypeHandle.invoke(handle) as Any

    val title: Any
        get() = getTitleHandle.invoke(handle) as Any

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isClientboundOpenScreenPacket(): Boolean = WrapperClientboundOpenScreenPacket.packetClass.isInstance(this)
fun Any.asClientboundOpenScreenPacket(): WrapperClientboundOpenScreenPacket = WrapperClientboundOpenScreenPacket(this)
