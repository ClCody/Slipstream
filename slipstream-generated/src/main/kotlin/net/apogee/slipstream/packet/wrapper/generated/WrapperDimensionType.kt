package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDimensionType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.dimension.DimensionType") }
        private val lookup = MethodHandles.lookup()

        val fixedTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fixedTime", MethodType.methodType(Class.forName("java.util.OptionalLong")))
        }
        val hasSkyLightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasSkyLight", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasCeilingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasCeiling", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val ultraWarmHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "ultraWarm", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val naturalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "natural", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val coordinateScaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "coordinateScale", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val bedWorksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "bedWorks", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val respawnAnchorWorksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "respawnAnchorWorks", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val minYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val heightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "height", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val logicalHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "logicalHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val infiniburnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "infiniburn", MethodType.methodType(Class.forName("net.minecraft.tags.TagKey")))
        }
        val effectsLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "effectsLocation", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val ambientLightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "ambientLight", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val monsterSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "monsterSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.DimensionType\$MonsterSettings")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.OptionalLong"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey"), Class.forName("net.minecraft.resources.ResourceLocation"), Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.dimension.DimensionType\$MonsterSettings")))
        }
    }

    val fixedTime: Any
        get() = fixedTimeHandle.invoke(handle) as Any

    val hasSkyLight: Boolean
        get() = hasSkyLightHandle.invoke(handle) as Boolean

    val hasCeiling: Boolean
        get() = hasCeilingHandle.invoke(handle) as Boolean

    val ultraWarm: Boolean
        get() = ultraWarmHandle.invoke(handle) as Boolean

    val natural: Boolean
        get() = naturalHandle.invoke(handle) as Boolean

    val coordinateScale: Double
        get() = coordinateScaleHandle.invoke(handle) as Double

    val bedWorks: Boolean
        get() = bedWorksHandle.invoke(handle) as Boolean

    val respawnAnchorWorks: Boolean
        get() = respawnAnchorWorksHandle.invoke(handle) as Boolean

    val minY: Int
        get() = minYHandle.invoke(handle) as Int

    val height: Int
        get() = heightHandle.invoke(handle) as Int

    val logicalHeight: Int
        get() = logicalHeightHandle.invoke(handle) as Int

    val infiniburn: WrapperTagKey
        get() = WrapperTagKey(infiniburnHandle.invoke(handle))

    val effectsLocation: WrapperResourceLocation
        get() = WrapperResourceLocation(effectsLocationHandle.invoke(handle))

    val ambientLight: Float
        get() = ambientLightHandle.invoke(handle) as Float

    val monsterSettings: WrapperMonsterSettings
        get() = WrapperMonsterSettings(monsterSettingsHandle.invoke(handle))

    fun copy(fixedTime: Any = this.fixedTime, hasSkyLight: Boolean = this.hasSkyLight, hasCeiling: Boolean = this.hasCeiling, ultraWarm: Boolean = this.ultraWarm, natural: Boolean = this.natural, coordinateScale: Double = this.coordinateScale, bedWorks: Boolean = this.bedWorks, respawnAnchorWorks: Boolean = this.respawnAnchorWorks, minY: Int = this.minY, height: Int = this.height, logicalHeight: Int = this.logicalHeight, infiniburn: WrapperTagKey = this.infiniburn, effectsLocation: WrapperResourceLocation = this.effectsLocation, ambientLight: Float = this.ambientLight, monsterSettings: WrapperMonsterSettings = this.monsterSettings): WrapperDimensionType {
        return WrapperDimensionType(constructorHandle.invoke(fixedTime, hasSkyLight, hasCeiling, ultraWarm, natural, coordinateScale, bedWorks, respawnAnchorWorks, minY, height, logicalHeight, infiniburn.handle, effectsLocation.handle, ambientLight, monsterSettings.handle))
    }

}
