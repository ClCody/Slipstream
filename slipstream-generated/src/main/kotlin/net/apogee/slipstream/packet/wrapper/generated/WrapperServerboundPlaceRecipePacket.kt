package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundPlaceRecipePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlaceRecipePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipe", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val isShiftDownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShiftDown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

    val recipe: WrapperResourceLocation
        get() = WrapperResourceLocation(getRecipeHandle.invoke(handle))

    val shiftDown: Boolean
        get() = isShiftDownHandle.invoke(handle) as Boolean

}
