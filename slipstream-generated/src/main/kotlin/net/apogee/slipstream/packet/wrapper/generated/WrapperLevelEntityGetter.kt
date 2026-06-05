package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelEntityGetter(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.entity.LevelEntityGetter") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.world.level.entity.EntityAccess"), Class.forName("java.util.UUID")))
        }
        val getAllHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAll", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
    }

    fun get(arg0: Any): WrapperEntityAccess {
        return WrapperEntityAccess(getHandle.invoke(handle, arg0))
    }

    val all: Any
        get() = getAllHandle.invoke(handle) as Any

}
