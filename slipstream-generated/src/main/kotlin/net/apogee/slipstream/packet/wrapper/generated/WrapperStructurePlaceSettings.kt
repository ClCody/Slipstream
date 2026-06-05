package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructurePlaceSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings") }
        private val lookup = MethodHandles.lookup()

        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings")))
        }
        val getBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox")))
        }
        val isIgnoreEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isIgnoreEntities", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotation", MethodType.methodType(Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val setBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox")))
        }
        val setRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setRotation", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val setRotationPivotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setRotationPivot", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val setLiquidSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setLiquidSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.LiquidSettings")))
        }
        val popProcessorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "popProcessor", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor")))
        }
        val setKnownShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setKnownShape", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Boolean::class.javaPrimitiveType!!))
        }
        val setMirrorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMirror", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.block.Mirror")))
        }
        val setRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setRandom", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.util.RandomSource")))
        }
        val clearProcessorsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clearProcessors", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings")))
        }
        val addProcessorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addProcessor", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor")))
        }
        val setIgnoreEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setIgnoreEntities", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Boolean::class.javaPrimitiveType!!))
        }
        val getRandomPaletteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomPalette", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate\$Palette"), Class.forName("java.util.List"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getProcessorsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProcessors", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getKnownShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnownShape", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRotationPivotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotationPivot", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val shouldFinalizeEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldFinalizeEntities", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldApplyWaterloggingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldApplyWaterlogging", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val setFinalizeEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setFinalizeEntities", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"), Boolean::class.javaPrimitiveType!!))
        }
        val getMirrorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMirror", MethodType.methodType(Class.forName("net.minecraft.world.level.block.Mirror")))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val paletteSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("palette")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val copy: WrapperStructurePlaceSettings
        get() = WrapperStructurePlaceSettings(copyHandle.invoke(handle))

    val boundingBox: WrapperBoundingBox
        get() = WrapperBoundingBox(getBoundingBoxHandle.invoke(handle))

    val ignoreEntities: Boolean
        get() = isIgnoreEntitiesHandle.invoke(handle) as Boolean

    val rotation: Any
        get() = getRotationHandle.invoke(handle) as Any

    fun setBoundingBox(arg0: WrapperBoundingBox): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setBoundingBoxHandle.invoke(handle, arg0.handle))
    }

    fun setRotation(arg0: Any): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setRotationHandle.invoke(handle, arg0))
    }

    fun setRotationPivot(arg0: WrapperBlockPos): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setRotationPivotHandle.invoke(handle, arg0.handle))
    }

    fun setLiquidSettings(arg0: Any): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setLiquidSettingsHandle.invoke(handle, arg0))
    }

    fun popProcessor(arg0: WrapperStructureProcessor): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(popProcessorHandle.invoke(handle, arg0.handle))
    }

    fun setKnownShape(arg0: Boolean): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setKnownShapeHandle.invoke(handle, arg0))
    }

    fun setMirror(arg0: Any): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setMirrorHandle.invoke(handle, arg0))
    }

    fun setRandom(arg0: WrapperRandomSource): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setRandomHandle.invoke(handle, arg0.handle))
    }

    val clearProcessors: WrapperStructurePlaceSettings
        get() = WrapperStructurePlaceSettings(clearProcessorsHandle.invoke(handle))

    fun addProcessor(arg0: WrapperStructureProcessor): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(addProcessorHandle.invoke(handle, arg0.handle))
    }

    fun setIgnoreEntities(arg0: Boolean): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setIgnoreEntitiesHandle.invoke(handle, arg0))
    }

    fun getRandomPalette(arg0: Any, arg1: WrapperBlockPos): WrapperPalette {
        return WrapperPalette(getRandomPaletteHandle.invoke(handle, arg0, arg1.handle))
    }

    val processors: Any
        get() = getProcessorsHandle.invoke(handle) as Any

    val knownShape: Boolean
        get() = getKnownShapeHandle.invoke(handle) as Boolean

    val rotationPivot: WrapperBlockPos
        get() = WrapperBlockPos(getRotationPivotHandle.invoke(handle))

    val shouldFinalizeEntities: Boolean
        get() = shouldFinalizeEntitiesHandle.invoke(handle) as Boolean

    val shouldApplyWaterlogging: Boolean
        get() = shouldApplyWaterloggingHandle.invoke(handle) as Boolean

    fun setFinalizeEntities(arg0: Boolean): WrapperStructurePlaceSettings {
        return WrapperStructurePlaceSettings(setFinalizeEntitiesHandle.invoke(handle, arg0))
    }

    val mirror: Any
        get() = getMirrorHandle.invoke(handle) as Any

    fun getRandom(arg0: WrapperBlockPos): WrapperRandomSource {
        return WrapperRandomSource(getRandomHandle.invoke(handle, arg0.handle))
    }

    fun setPalette(value: Int) {
        paletteSetterHandle.invoke(handle, value)
    }

}
