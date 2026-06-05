package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityTypeTest(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.entity.EntityTypeTest") }
        private val lookup = MethodHandles.lookup()

        val getBaseClassHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseClass", MethodType.methodType(Class.forName("java.lang.Class")))
        }
        val tryCastHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryCast", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("java.lang.Object")))
        }
    }

    val baseClass: Any
        get() = getBaseClassHandle.invoke(handle) as Any

    fun tryCast(arg0: Any): Any {
        return tryCastHandle.invoke(handle, arg0) as Any
    }

}
