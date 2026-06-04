package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStateDefinition(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.StateDefinition") }
        private val lookup = MethodHandles.lookup()

        val getPropertyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProperty", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.properties.Property"), String::class.java))
        }
        val getPropertiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProperties", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwner", MethodType.methodType(Class.forName("java.lang.Object")))
        }
        val anyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "any", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.StateHolder")))
        }
        val getPossibleStatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPossibleStates", MethodType.methodType(Class.forName("com.google.common.collect.ImmutableList")))
        }
    }

    fun getProperty(arg0: String): WrapperProperty {
        return WrapperProperty(getPropertyHandle.invoke(handle, arg0))
    }

    val properties: Any
        get() = getPropertiesHandle.invoke(handle) as Any

    val owner: Any
        get() = getOwnerHandle.invoke(handle) as Any

    val any: WrapperStateHolder
        get() = WrapperStateHolder(anyHandle.invoke(handle))

    val possibleStates: Any
        get() = getPossibleStatesHandle.invoke(handle) as Any

}
