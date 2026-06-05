package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMetadataSectionSerializer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.metadata.MetadataSectionSerializer") }
        private val lookup = MethodHandles.lookup()

        val getMetadataSectionNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMetadataSectionName", MethodType.methodType(String::class.java))
        }
        val fromJsonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fromJson", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("com.google.gson.JsonObject")))
        }
    }

    val metadataSectionName: String
        get() = getMetadataSectionNameHandle.invoke(handle) as String

    fun fromJson(arg0: Any): Any {
        return fromJsonHandle.invoke(handle, arg0) as Any
    }

}
