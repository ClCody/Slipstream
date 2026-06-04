package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperKey(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.GameRules\$Key") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(String::class.java))
        }
        val getCategoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCategory", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules\$Category")))
        }
        val getDescriptionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescriptionId", MethodType.methodType(String::class.java))
        }
    }

    val id: String
        get() = getIdHandle.invoke(handle) as String

    val category: Any
        get() = getCategoryHandle.invoke(handle) as Any

    val descriptionId: String
        get() = getDescriptionIdHandle.invoke(handle) as String

}
