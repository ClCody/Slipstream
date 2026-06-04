package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSerializableTickContainer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.ticks.SerializableTickContainer") }
        private val lookup = MethodHandles.lookup()

        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Long::class.javaPrimitiveType!!, Class.forName("java.util.function.Function")))
        }
    }

    fun save(arg0: Long, arg1: Any): WrapperTag {
        return WrapperTag(saveHandle.invoke(handle, arg0, arg1))
    }

}
