package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHolderOwner(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderOwner") }
        private val lookup = MethodHandles.lookup()

        val canSerializeInHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSerializeIn", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.HolderOwner")))
        }
    }

    fun canSerializeIn(arg0: WrapperHolderOwner): Boolean {
        return canSerializeInHandle.invoke(handle, arg0.handle) as Boolean
    }

}
