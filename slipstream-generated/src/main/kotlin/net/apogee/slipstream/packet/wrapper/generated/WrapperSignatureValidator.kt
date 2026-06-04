package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSignatureValidator(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.SignatureValidator") }
        private val lookup = MethodHandles.lookup()

        val validateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "validate", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.util.SignatureUpdater"), ByteArray::class.java))
        }
    }

    fun validate(arg0: Any, arg1: ByteArray): Boolean {
        return validateHandle.invoke(handle, arg0, arg1) as Boolean
    }

}
