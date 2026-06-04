package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelHeightAccessor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.LevelHeightAccessor") }
        private val lookup = MethodHandles.lookup()

        val isOutsideBuildHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOutsideBuildHeight", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSectionIndexFromSectionYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSectionIndexFromSectionY", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getSectionYFromSectionIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSectionYFromSectionIndex", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getMaxBuildHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxBuildHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSectionsCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSectionsCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSectionIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSectionIndex", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getMinSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinSection", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMaxSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxSection", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMinBuildHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinBuildHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    fun isOutsideBuildHeight(arg0: Int): Boolean {
        return isOutsideBuildHeightHandle.invoke(handle, arg0) as Boolean
    }

    val height: Int
        get() = getHeightHandle.invoke(handle) as Int

    fun getSectionIndexFromSectionY(arg0: Int): Int {
        return getSectionIndexFromSectionYHandle.invoke(handle, arg0) as Int
    }

    fun getSectionYFromSectionIndex(arg0: Int): Int {
        return getSectionYFromSectionIndexHandle.invoke(handle, arg0) as Int
    }

    val maxBuildHeight: Int
        get() = getMaxBuildHeightHandle.invoke(handle) as Int

    val sectionsCount: Int
        get() = getSectionsCountHandle.invoke(handle) as Int

    fun getSectionIndex(arg0: Int): Int {
        return getSectionIndexHandle.invoke(handle, arg0) as Int
    }

    val minSection: Int
        get() = getMinSectionHandle.invoke(handle) as Int

    val maxSection: Int
        get() = getMaxSectionHandle.invoke(handle) as Int

    val minBuildHeight: Int
        get() = getMinBuildHeightHandle.invoke(handle) as Int

}
