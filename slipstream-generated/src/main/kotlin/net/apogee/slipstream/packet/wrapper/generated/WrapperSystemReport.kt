package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSystemReport(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.SystemReport") }
        private val lookup = MethodHandles.lookup()

        val toLineSeparatedStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toLineSeparatedString", MethodType.methodType(String::class.java))
        }
    }

    val toLineSeparatedString: String
        get() = toLineSeparatedStringHandle.invoke(handle) as String

}
