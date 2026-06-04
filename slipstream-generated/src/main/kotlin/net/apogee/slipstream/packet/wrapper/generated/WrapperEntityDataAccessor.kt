package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityDataAccessor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.syncher.EntityDataAccessor") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val serializerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "serializer", MethodType.methodType(Class.forName("net.minecraft.network.syncher.EntityDataSerializer")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.syncher.EntityDataSerializer")))
        }
    }

    val id: Int
        get() = idHandle.invoke(handle) as Int

    val serializer: WrapperEntityDataSerializer
        get() = WrapperEntityDataSerializer(serializerHandle.invoke(handle))

    fun copy(id: Int = this.id, serializer: WrapperEntityDataSerializer = this.serializer): WrapperEntityDataAccessor {
        return WrapperEntityDataAccessor(constructorHandle.invoke(id, serializer.handle))
    }

}
