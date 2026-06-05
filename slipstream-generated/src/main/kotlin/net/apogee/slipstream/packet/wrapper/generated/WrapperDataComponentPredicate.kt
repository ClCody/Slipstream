package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataComponentPredicate(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.DataComponentPredicate") }
        private val lookup = MethodHandles.lookup()

        val testHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "test", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val alwaysMatchesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "alwaysMatches", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val asPatchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asPatch", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentPatch")))
        }
    }

    fun test(arg0: WrapperDataComponentMap): Boolean {
        return testHandle.invoke(handle, arg0.handle) as Boolean
    }

    val alwaysMatches: Boolean
        get() = alwaysMatchesHandle.invoke(handle) as Boolean

    val asPatch: WrapperDataComponentPatch
        get() = WrapperDataComponentPatch(asPatchHandle.invoke(handle))

}
