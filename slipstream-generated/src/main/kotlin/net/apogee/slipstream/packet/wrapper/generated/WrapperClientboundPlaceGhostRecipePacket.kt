package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPlaceGhostRecipePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlaceGhostRecipePacket") }
        private val lookup = MethodHandles.lookup()

        val getRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipe", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val recipe: Any
        get() = getRecipeHandle.invoke(handle) as Any

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isClientboundPlaceGhostRecipePacket(): Boolean = WrapperClientboundPlaceGhostRecipePacket.packetClass.isInstance(this)
fun Any.asClientboundPlaceGhostRecipePacket(): WrapperClientboundPlaceGhostRecipePacket = WrapperClientboundPlaceGhostRecipePacket(this)
