package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundUpdateRecipesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateRecipesPacket") }
        private val lookup = MethodHandles.lookup()

        val getRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipes", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val recipes: Any
        get() = getRecipesHandle.invoke(handle) as Any

}

fun Any.isClientboundUpdateRecipesPacket(): Boolean = WrapperClientboundUpdateRecipesPacket.packetClass.isInstance(this)
fun Any.asClientboundUpdateRecipesPacket(): WrapperClientboundUpdateRecipesPacket = WrapperClientboundUpdateRecipesPacket(this)
