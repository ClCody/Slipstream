package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEnderChestBlockEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.entity.EnderChestBlockEntity") }
        private val lookup = MethodHandles.lookup()

        val stillValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stillValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val triggerEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "triggerEvent", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getOpenNessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOpenNess", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
    }

    fun stillValid(arg0: WrapperPlayer): Boolean {
        return stillValidHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun triggerEvent(arg0: Int, arg1: Int): Boolean {
        return triggerEventHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getOpenNess(arg0: Float): Float {
        return getOpenNessHandle.invoke(handle, arg0) as Float
    }

}
