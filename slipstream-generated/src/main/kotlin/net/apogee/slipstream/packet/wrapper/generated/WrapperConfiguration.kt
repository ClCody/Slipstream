package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperConfiguration(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.PalettedContainer\$Configuration") }
        private val lookup = MethodHandles.lookup()

        val factoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "factory", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.Palette\$Factory")))
        }
        val bitsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "bits", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.chunk.Palette\$Factory"), Int::class.javaPrimitiveType!!))
        }
    }

    val factory: WrapperFactory
        get() = WrapperFactory(factoryHandle.invoke(handle))

    val bits: Int
        get() = bitsHandle.invoke(handle) as Int

    fun copy(factory: WrapperFactory = this.factory, bits: Int = this.bits): WrapperConfiguration {
        return WrapperConfiguration(constructorHandle.invoke(factory.handle, bits))
    }

}
