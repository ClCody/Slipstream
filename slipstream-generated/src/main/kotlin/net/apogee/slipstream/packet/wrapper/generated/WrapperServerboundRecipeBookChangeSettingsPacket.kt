package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundRecipeBookChangeSettingsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundRecipeBookChangeSettingsPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val isOpenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOpen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBookTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBookType", MethodType.methodType(Class.forName("net.minecraft.world.inventory.RecipeBookType")))
        }
        val isFilteringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFiltering", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val open: Boolean
        get() = isOpenHandle.invoke(handle) as Boolean

    val bookType: Any
        get() = getBookTypeHandle.invoke(handle) as Any

    val filtering: Boolean
        get() = isFilteringHandle.invoke(handle) as Boolean

}
