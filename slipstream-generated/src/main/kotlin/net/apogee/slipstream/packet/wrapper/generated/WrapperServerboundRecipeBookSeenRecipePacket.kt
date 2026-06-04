package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundRecipeBookSeenRecipePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundRecipeBookSeenRecipePacket") }
        private val lookup = MethodHandles.lookup()

        val getRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipe", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val recipe: Any
        get() = getRecipeHandle.invoke(handle) as Any

}

fun Any.isServerboundRecipeBookSeenRecipePacket(): Boolean = WrapperServerboundRecipeBookSeenRecipePacket.packetClass.isInstance(this)
fun Any.asServerboundRecipeBookSeenRecipePacket(): WrapperServerboundRecipeBookSeenRecipePacket = WrapperServerboundRecipeBookSeenRecipePacket(this)
