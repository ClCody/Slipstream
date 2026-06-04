package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPackedData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.PalettedContainerRO\$PackedData") }
        private val lookup = MethodHandles.lookup()

        val paletteEntriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "paletteEntries", MethodType.methodType(Class.forName("java.util.List")))
        }
        val storageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "storage", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List"), Class.forName("java.util.Optional")))
        }
    }

    val paletteEntries: Any
        get() = paletteEntriesHandle.invoke(handle) as Any

    val storage: Any
        get() = storageHandle.invoke(handle) as Any

    fun copy(paletteEntries: Any = this.paletteEntries, storage: Any = this.storage): WrapperPackedData {
        return WrapperPackedData(constructorHandle.invoke(paletteEntries, storage))
    }

}
