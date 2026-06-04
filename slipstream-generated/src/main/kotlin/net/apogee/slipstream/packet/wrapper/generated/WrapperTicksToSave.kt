package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTicksToSave(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.ChunkAccess\$TicksToSave") }
        private val lookup = MethodHandles.lookup()

        val blocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blocks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.SerializableTickContainer")))
        }
        val fluidsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fluids", MethodType.methodType(Class.forName("net.minecraft.world.ticks.SerializableTickContainer")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.ticks.SerializableTickContainer"), Class.forName("net.minecraft.world.ticks.SerializableTickContainer")))
        }
    }

    val blocks: WrapperSerializableTickContainer
        get() = WrapperSerializableTickContainer(blocksHandle.invoke(handle))

    val fluids: WrapperSerializableTickContainer
        get() = WrapperSerializableTickContainer(fluidsHandle.invoke(handle))

    fun copy(blocks: WrapperSerializableTickContainer = this.blocks, fluids: WrapperSerializableTickContainer = this.fluids): WrapperTicksToSave {
        return WrapperTicksToSave(constructorHandle.invoke(blocks.handle, fluids.handle))
    }

}
