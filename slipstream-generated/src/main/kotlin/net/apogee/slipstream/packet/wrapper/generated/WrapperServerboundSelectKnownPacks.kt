package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSelectKnownPacks(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.configuration.ServerboundSelectKnownPacks") }
        private val lookup = MethodHandles.lookup()

        val knownPacksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "knownPacks", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List")))
        }
    }

    val knownPacks: Any
        get() = knownPacksHandle.invoke(handle) as Any

    fun copy(knownPacks: Any = this.knownPacks): WrapperServerboundSelectKnownPacks {
        return WrapperServerboundSelectKnownPacks(constructorHandle.invoke(knownPacks))
    }

}
