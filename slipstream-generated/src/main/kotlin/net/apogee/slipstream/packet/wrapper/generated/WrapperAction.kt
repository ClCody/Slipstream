package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAction(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.HoverEvent\$Action") }
        private val lookup = MethodHandles.lookup()

        val isAllowedFromServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowedFromServer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSerializedNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSerializedName", MethodType.methodType(String::class.java))
        }
    }

    val allowedFromServer: Boolean
        get() = isAllowedFromServerHandle.invoke(handle) as Boolean

    val serializedName: String
        get() = getSerializedNameHandle.invoke(handle) as String

}
