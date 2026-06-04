package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRecipeSerializer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.crafting.RecipeSerializer") }
        private val lookup = MethodHandles.lookup()

        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("com.mojang.serialization.MapCodec")))
        }
        val streamCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "streamCodec", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
    }

    val codec: Any
        get() = codecHandle.invoke(handle) as Any

    val streamCodec: WrapperStreamCodec
        get() = WrapperStreamCodec(streamCodecHandle.invoke(handle))

}
