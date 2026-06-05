package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureStart(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart") }
        private val lookup = MethodHandles.lookup()

        val isValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox")))
        }
        val createTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext"), Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val getPiecesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPieces", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStructure", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.Structure")))
        }
        val getReferencesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getReferences", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getChunkPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkPos", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val canBeReferencedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeReferenced", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val referencesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("references")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedBoundingBoxSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedBoundingBox")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val persistentDataContainerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("persistentDataContainer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val generationEventCauseSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("generationEventCause")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val valid: Boolean
        get() = isValidHandle.invoke(handle) as Boolean

    val boundingBox: WrapperBoundingBox
        get() = WrapperBoundingBox(getBoundingBoxHandle.invoke(handle))

    fun createTag(arg0: WrapperStructurePieceSerializationContext, arg1: WrapperChunkPos): WrapperCompoundTag {
        return WrapperCompoundTag(createTagHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val pieces: Any
        get() = getPiecesHandle.invoke(handle) as Any

    val structure: WrapperStructure
        get() = WrapperStructure(getStructureHandle.invoke(handle))

    val references: Int
        get() = getReferencesHandle.invoke(handle) as Int

    val chunkPos: WrapperChunkPos
        get() = WrapperChunkPos(getChunkPosHandle.invoke(handle))

    val canBeReferenced: Boolean
        get() = canBeReferencedHandle.invoke(handle) as Boolean

    fun setReferences(value: Int) {
        referencesSetterHandle.invoke(handle, value)
    }

    fun setCachedBoundingBox(value: WrapperBoundingBox) {
        cachedBoundingBoxSetterHandle.invoke(handle, value.handle)
    }

    fun setPersistentDataContainer(value: Any) {
        persistentDataContainerSetterHandle.invoke(handle, value)
    }

    fun setGenerationEventCause(value: Any) {
        generationEventCauseSetterHandle.invoke(handle, value)
    }

}
