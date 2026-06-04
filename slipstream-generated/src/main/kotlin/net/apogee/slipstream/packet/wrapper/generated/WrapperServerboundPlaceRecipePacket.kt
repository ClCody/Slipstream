package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPlaceRecipePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlaceRecipePacket") }
        private val lookup = MethodHandles.lookup()

        val getRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipe", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val isShiftDownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShiftDown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val recipe: Any
        get() = getRecipeHandle.invoke(handle) as Any

    val shiftDown: Boolean
        get() = isShiftDownHandle.invoke(handle) as Boolean

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isServerboundPlaceRecipePacket(): Boolean = WrapperServerboundPlaceRecipePacket.packetClass.isInstance(this)
fun Any.asServerboundPlaceRecipePacket(): WrapperServerboundPlaceRecipePacket = WrapperServerboundPlaceRecipePacket(this)
