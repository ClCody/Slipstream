package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWorldBorder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.border.WorldBorder") }
        private val lookup = MethodHandles.lookup()

        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val isWithinBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isWithinBounds", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getDistanceToBorderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDistanceToBorder", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val isInsideCloseToBorderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInsideCloseToBorder", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val getAbsoluteMaxSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAbsoluteMaxSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWarningBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningBlocks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWarningTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getLerpTargetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpTarget", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getCollisionShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCollisionShape", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape")))
        }
        val clampToBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clampToBounds", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val isBlockInBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBlockInBounds", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getLerpSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpSpeed", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val isChunkInBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isChunkInBounds", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getMinZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getMaxXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getMinXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getMaxZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStatus", MethodType.methodType(Class.forName("net.minecraft.world.level.border.BorderStatus")))
        }
        val getCenterZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenterZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getCenterXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenterX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getLerpRemainingTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpRemainingTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getDamageSafeZoneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDamageSafeZone", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getDamagePerBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDamagePerBlock", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val createSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.border.WorldBorder\$Settings")))
        }
        val damagePerBlockSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("damagePerBlock")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val damageSafeZoneSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("damageSafeZone")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val warningTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("warningTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val warningBlocksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("warningBlocks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val centerXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("centerX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val centerZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("centerZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val absoluteMaxSizeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("absoluteMaxSize")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val extentSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("extent")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val worldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("world")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val size: Double
        get() = getSizeHandle.invoke(handle) as Double

    fun isWithinBounds(arg0: Double, arg1: Double, arg2: Double): Boolean {
        return isWithinBoundsHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun getDistanceToBorder(arg0: Double, arg1: Double): Double {
        return getDistanceToBorderHandle.invoke(handle, arg0, arg1) as Double
    }

    fun isInsideCloseToBorder(arg0: WrapperEntity, arg1: WrapperAABB): Boolean {
        return isInsideCloseToBorderHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val absoluteMaxSize: Int
        get() = getAbsoluteMaxSizeHandle.invoke(handle) as Int

    val warningBlocks: Int
        get() = getWarningBlocksHandle.invoke(handle) as Int

    val warningTime: Int
        get() = getWarningTimeHandle.invoke(handle) as Int

    val lerpTarget: Double
        get() = getLerpTargetHandle.invoke(handle) as Double

    val collisionShape: WrapperVoxelShape
        get() = WrapperVoxelShape(getCollisionShapeHandle.invoke(handle))

    fun clampToBounds(arg0: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(clampToBoundsHandle.invoke(handle, arg0.handle))
    }

    fun isBlockInBounds(arg0: Int, arg1: Int): Boolean {
        return isBlockInBoundsHandle.invoke(handle, arg0, arg1) as Boolean
    }

    val lerpSpeed: Double
        get() = getLerpSpeedHandle.invoke(handle) as Double

    fun isChunkInBounds(arg0: Int, arg1: Int): Boolean {
        return isChunkInBoundsHandle.invoke(handle, arg0, arg1) as Boolean
    }

    val minZ: Double
        get() = getMinZHandle.invoke(handle) as Double

    val maxX: Double
        get() = getMaxXHandle.invoke(handle) as Double

    val minX: Double
        get() = getMinXHandle.invoke(handle) as Double

    val maxZ: Double
        get() = getMaxZHandle.invoke(handle) as Double

    val status: Any
        get() = getStatusHandle.invoke(handle) as Any

    val centerZ: Double
        get() = getCenterZHandle.invoke(handle) as Double

    val centerX: Double
        get() = getCenterXHandle.invoke(handle) as Double

    val lerpRemainingTime: Long
        get() = getLerpRemainingTimeHandle.invoke(handle) as Long

    val damageSafeZone: Double
        get() = getDamageSafeZoneHandle.invoke(handle) as Double

    val damagePerBlock: Double
        get() = getDamagePerBlockHandle.invoke(handle) as Double

    val createSettings: WrapperSettings
        get() = WrapperSettings(createSettingsHandle.invoke(handle))

    fun setDamagePerBlock(value: Double) {
        damagePerBlockSetterHandle.invoke(handle, value)
    }

    fun setDamageSafeZone(value: Double) {
        damageSafeZoneSetterHandle.invoke(handle, value)
    }

    fun setWarningTime(value: Int) {
        warningTimeSetterHandle.invoke(handle, value)
    }

    fun setWarningBlocks(value: Int) {
        warningBlocksSetterHandle.invoke(handle, value)
    }

    fun setCenterX(value: Double) {
        centerXSetterHandle.invoke(handle, value)
    }

    fun setCenterZ(value: Double) {
        centerZSetterHandle.invoke(handle, value)
    }

    fun setAbsoluteMaxSize(value: Int) {
        absoluteMaxSizeSetterHandle.invoke(handle, value)
    }

    fun setExtent(value: Any) {
        extentSetterHandle.invoke(handle, value)
    }

    fun setWorld(value: WrapperServerLevel) {
        worldSetterHandle.invoke(handle, value.handle)
    }

}
