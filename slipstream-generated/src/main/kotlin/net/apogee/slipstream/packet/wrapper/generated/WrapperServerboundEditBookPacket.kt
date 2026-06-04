package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundEditBookPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundEditBookPacket") }
        private val lookup = MethodHandles.lookup()

        val slotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "slot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val pagesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pages", MethodType.methodType(Class.forName("java.util.List")))
        }
        val titleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "title", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("java.util.List"), Class.forName("java.util.Optional")))
        }
    }

    val slot: Int
        get() = slotHandle.invoke(handle) as Int

    val pages: Any
        get() = pagesHandle.invoke(handle) as Any

    val title: Any
        get() = titleHandle.invoke(handle) as Any

    fun copy(slot: Int = this.slot, pages: Any = this.pages, title: Any = this.title): WrapperServerboundEditBookPacket {
        return WrapperServerboundEditBookPacket(constructorHandle.invoke(slot, pages, title))
    }

}
