package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureTemplate(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate") }
        private val lookup = MethodHandles.lookup()

        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val getBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.Rotation"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.Mirror")))
        }
        val getAuthorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAuthor", MethodType.methodType(String::class.java))
        }
        val filterBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filterBlocks", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.block.Block")))
        }
        val calculateConnectedPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "calculateConnectedPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val placeInWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "placeInWorld", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ServerLevelAccessor"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.util.RandomSource"), Int::class.javaPrimitiveType!!))
        }
        val getZeroPositionWithTransformHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZeroPositionWithTransform", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.Mirror"), Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val sizeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("size")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val authorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("author")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val persistentDataContainerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("persistentDataContainer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun save(arg0: WrapperCompoundTag): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle))
    }

    fun getSize(arg0: Any): WrapperVec3i {
        return WrapperVec3i(getSizeHandle.invoke(handle, arg0))
    }

    fun getBoundingBox(arg0: WrapperBlockPos, arg1: Any, arg2: WrapperBlockPos, arg3: Any): WrapperBoundingBox {
        return WrapperBoundingBox(getBoundingBoxHandle.invoke(handle, arg0.handle, arg1, arg2.handle, arg3))
    }

    val author: String
        get() = getAuthorHandle.invoke(handle) as String

    fun filterBlocks(arg0: WrapperBlockPos, arg1: WrapperStructurePlaceSettings, arg2: WrapperBlock): Any {
        return filterBlocksHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Any
    }

    fun calculateConnectedPosition(arg0: WrapperStructurePlaceSettings, arg1: WrapperBlockPos, arg2: WrapperStructurePlaceSettings, arg3: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(calculateConnectedPositionHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle))
    }

    fun placeInWorld(arg0: WrapperServerLevelAccessor, arg1: WrapperBlockPos, arg2: WrapperBlockPos, arg3: WrapperStructurePlaceSettings, arg4: WrapperRandomSource, arg5: Int): Boolean {
        return placeInWorldHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle, arg5) as Boolean
    }

    fun getZeroPositionWithTransform(arg0: WrapperBlockPos, arg1: Any, arg2: Any): WrapperBlockPos {
        return WrapperBlockPos(getZeroPositionWithTransformHandle.invoke(handle, arg0.handle, arg1, arg2))
    }

    fun setSize(value: WrapperVec3i) {
        sizeSetterHandle.invoke(handle, value.handle)
    }

    fun setAuthor(value: String) {
        authorSetterHandle.invoke(handle, value)
    }

    fun setPersistentDataContainer(value: Any) {
        persistentDataContainerSetterHandle.invoke(handle, value)
    }

}
