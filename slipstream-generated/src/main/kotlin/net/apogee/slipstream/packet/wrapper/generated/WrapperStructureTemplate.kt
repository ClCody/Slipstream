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
        val placeInWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "placeInWorld", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ServerLevelAccessor"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.util.RandomSource"), Int::class.javaPrimitiveType!!))
        }
        val getAuthorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAuthor", MethodType.methodType(String::class.java))
        }
        val calculateConnectedPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "calculateConnectedPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val filterBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filterBlocks", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.objects.ObjectArrayList"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.block.Block"), Boolean::class.javaPrimitiveType!!))
        }
        val getBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.core.BlockPos")))
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

    fun placeInWorld(arg0: WrapperServerLevelAccessor, arg1: WrapperBlockPos, arg2: WrapperBlockPos, arg3: WrapperStructurePlaceSettings, arg4: WrapperRandomSource, arg5: Int): Boolean {
        return placeInWorldHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle, arg5) as Boolean
    }

    val author: String
        get() = getAuthorHandle.invoke(handle) as String

    fun calculateConnectedPosition(arg0: WrapperStructurePlaceSettings, arg1: WrapperBlockPos, arg2: WrapperStructurePlaceSettings, arg3: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(calculateConnectedPositionHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle))
    }

    fun filterBlocks(arg0: WrapperBlockPos, arg1: WrapperStructurePlaceSettings, arg2: WrapperBlock, arg3: Boolean): Any {
        return filterBlocksHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3) as Any
    }

    fun getBoundingBox(arg0: WrapperStructurePlaceSettings, arg1: WrapperBlockPos): WrapperBoundingBox {
        return WrapperBoundingBox(getBoundingBoxHandle.invoke(handle, arg0.handle, arg1.handle))
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
