package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSoundEvent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.sounds.SoundEvent") }
        private val lookup = MethodHandles.lookup()

        val getLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocation", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRange", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
    }

    val location: WrapperResourceLocation
        get() = WrapperResourceLocation(getLocationHandle.invoke(handle))

    fun getRange(arg0: Float): Float {
        return getRangeHandle.invoke(handle, arg0) as Float
    }

}
