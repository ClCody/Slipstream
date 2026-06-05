package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.StructureAccess") }
        private val lookup = MethodHandles.lookup()

        val getAllReferencesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllReferences", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getStartForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStartForStructure", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure")))
        }
        val getReferencesForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getReferencesForStructure", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.longs.LongSet"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure")))
        }
    }

    val allReferences: Any
        get() = getAllReferencesHandle.invoke(handle) as Any

    fun getStartForStructure(arg0: WrapperStructure): WrapperStructureStart {
        return WrapperStructureStart(getStartForStructureHandle.invoke(handle, arg0.handle))
    }

    fun getReferencesForStructure(arg0: WrapperStructure): Any {
        return getReferencesForStructureHandle.invoke(handle, arg0.handle) as Any
    }

}
