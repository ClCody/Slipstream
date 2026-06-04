package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMapId(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.saveddata.maps.MapId") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = idHandle.invoke(handle) as Int

    fun copy(id: Int = this.id): WrapperMapId {
        return WrapperMapId(constructorHandle.invoke(id))
    }

}
