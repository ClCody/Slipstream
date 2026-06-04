package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCooldownPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundCooldownPacket") }
        private val lookup = MethodHandles.lookup()

        val itemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "item", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
        val durationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "duration", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.item.Item"), Int::class.javaPrimitiveType!!))
        }
    }

    val item: WrapperItem
        get() = WrapperItem(itemHandle.invoke(handle))

    val duration: Int
        get() = durationHandle.invoke(handle) as Int

    fun copy(item: WrapperItem = this.item, duration: Int = this.duration): WrapperClientboundCooldownPacket {
        return WrapperClientboundCooldownPacket(constructorHandle.invoke(item.handle, duration))
    }

}
