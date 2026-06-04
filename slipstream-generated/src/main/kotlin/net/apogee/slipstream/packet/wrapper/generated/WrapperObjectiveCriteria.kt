package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperObjectiveCriteria(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val isReadOnlyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReadOnly", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDefaultRenderTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultRenderType", MethodType.methodType(Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria\$RenderType")))
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val readOnly: Boolean
        get() = isReadOnlyHandle.invoke(handle) as Boolean

    val defaultRenderType: Any
        get() = getDefaultRenderTypeHandle.invoke(handle) as Any

}
