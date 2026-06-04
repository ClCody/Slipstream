package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFeatureFlagSet(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.flag.FeatureFlagSet") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val joinHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "join", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet"), Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.flag.FeatureFlag")))
        }
        val subtractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "subtract", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet"), Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val intersectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "intersects", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val isSubsetOfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSubsetOf", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun join(arg0: WrapperFeatureFlagSet): WrapperFeatureFlagSet {
        return WrapperFeatureFlagSet(joinHandle.invoke(handle, arg0.handle))
    }

    fun contains(arg0: WrapperFeatureFlag): Boolean {
        return containsHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun subtract(arg0: WrapperFeatureFlagSet): WrapperFeatureFlagSet {
        return WrapperFeatureFlagSet(subtractHandle.invoke(handle, arg0.handle))
    }

    fun intersects(arg0: WrapperFeatureFlagSet): Boolean {
        return intersectsHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isSubsetOf(arg0: WrapperFeatureFlagSet): Boolean {
        return isSubsetOfHandle.invoke(handle, arg0.handle) as Boolean
    }

}
