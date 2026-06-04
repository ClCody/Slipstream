package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundRecipeBookSeenRecipePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundRecipeBookSeenRecipePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipe", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val recipe: WrapperResourceLocation
        get() = WrapperResourceLocation(getRecipeHandle.invoke(handle))

}
