package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperInteractionResultHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.InteractionResultHolder") }
        private val lookup = MethodHandles.lookup()

        val getObjectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObject", MethodType.methodType(Class.forName("java.lang.Object")))
        }
        val getResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResult", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult")))
        }
    }

    val `object`: Any
        get() = getObjectHandle.invoke(handle) as Any

    val result: Any
        get() = getResultHandle.invoke(handle) as Any

}
