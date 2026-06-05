package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperVoxelShape(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.shapes.VoxelShape") }
        private val lookup = MethodHandles.lookup()

        val minHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "min", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val maxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "max", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis")))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val boundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "bounds", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB")))
        }
        val optimizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "optimize", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape")))
        }
        val collideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "collide", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis"), Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val moveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "move", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val closestPointToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "closestPointTo", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getCoordsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCoords", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.doubles.DoubleList"), Class.forName("net.minecraft.core.Direction\$Axis")))
        }
        val `moonrise$occludesFullBlockIfCachedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$occludesFullBlockIfCached", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getCachedVoxelDataHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getCachedVoxelData", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.collisions.shape.CachedShapeData")))
        }
        val `moonrise$getFaceShapeClampedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getFaceShapeClamped", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.core.Direction")))
        }
        val `moonrise$offsetXHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$offsetX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val `moonrise$offsetYHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$offsetY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val `moonrise$offsetZHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$offsetZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val singleEncompassingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "singleEncompassing", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape")))
        }
        val `moonrise$isFullBlockHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isFullBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$occludesFullBlockHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$occludesFullBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFaceShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFaceShape", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.core.Direction")))
        }
        val clipHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clip", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val toAabbsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toAabbs", MethodType.methodType(Class.forName("java.util.List")))
        }
        val `moonrise$getSingleAABBRepresentationHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSingleAABBRepresentation", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB")))
        }
        val `moonrise$rootCoordinatesXHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$rootCoordinatesX", MethodType.methodType(Class.forName("[D")))
        }
        val `moonrise$rootCoordinatesYHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$rootCoordinatesY", MethodType.methodType(Class.forName("[D")))
        }
        val `moonrise$rootCoordinatesZHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$rootCoordinatesZ", MethodType.methodType(Class.forName("[D")))
        }
        val `moonrise$orUnoptimizedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$orUnoptimized", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.phys.shapes.VoxelShape")))
        }
        val facesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("faces")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val offsetXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("offsetX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val offsetYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("offsetY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val offsetZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("offsetZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val singleAABBRepresentationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("singleAABBRepresentation")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val rootCoordinatesXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("rootCoordinatesX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val rootCoordinatesYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("rootCoordinatesY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val rootCoordinatesZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("rootCoordinatesZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedShapeDataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedShapeData")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isEmptySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isEmpty")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedToAABBsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedToAABBs")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedBoundsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedBounds")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isFullBlockSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isFullBlock")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val occludesFullBlockSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("occludesFullBlock")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val mergedORCacheSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("mergedORCache")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val faceShapeClampedCacheSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("faceShapeClampedCache")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun min(arg0: Any, arg1: Double, arg2: Double): Double {
        return minHandle.invoke(handle, arg0, arg1, arg2) as Double
    }

    fun max(arg0: Any): Double {
        return maxHandle.invoke(handle, arg0) as Double
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val bounds: WrapperAABB
        get() = WrapperAABB(boundsHandle.invoke(handle))

    val optimize: WrapperVoxelShape
        get() = WrapperVoxelShape(optimizeHandle.invoke(handle))

    fun collide(arg0: Any, arg1: WrapperAABB, arg2: Double): Double {
        return collideHandle.invoke(handle, arg0, arg1.handle, arg2) as Double
    }

    fun move(arg0: Double, arg1: Double, arg2: Double): WrapperVoxelShape {
        return WrapperVoxelShape(moveHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun closestPointTo(arg0: WrapperVec3): Any {
        return closestPointToHandle.invoke(handle, arg0.handle) as Any
    }

    fun getCoords(arg0: Any): Any {
        return getCoordsHandle.invoke(handle, arg0) as Any
    }

    val `moonrise$occludesFullBlockIfCached`: Boolean
        get() = `moonrise$occludesFullBlockIfCachedHandle`.invoke(handle) as Boolean

    val `moonrise$getCachedVoxelData`: Any
        get() = `moonrise$getCachedVoxelDataHandle`.invoke(handle) as Any

    fun `moonrise$getFaceShapeClamped`(arg0: Any): WrapperVoxelShape {
        return WrapperVoxelShape(`moonrise$getFaceShapeClampedHandle`.invoke(handle, arg0))
    }

    val `moonrise$offsetX`: Double
        get() = `moonrise$offsetXHandle`.invoke(handle) as Double

    val `moonrise$offsetY`: Double
        get() = `moonrise$offsetYHandle`.invoke(handle) as Double

    val `moonrise$offsetZ`: Double
        get() = `moonrise$offsetZHandle`.invoke(handle) as Double

    val singleEncompassing: WrapperVoxelShape
        get() = WrapperVoxelShape(singleEncompassingHandle.invoke(handle))

    val `moonrise$isFullBlock`: Boolean
        get() = `moonrise$isFullBlockHandle`.invoke(handle) as Boolean

    val `moonrise$occludesFullBlock`: Boolean
        get() = `moonrise$occludesFullBlockHandle`.invoke(handle) as Boolean

    fun getFaceShape(arg0: Any): WrapperVoxelShape {
        return WrapperVoxelShape(getFaceShapeHandle.invoke(handle, arg0))
    }

    fun clip(arg0: WrapperVec3, arg1: WrapperVec3, arg2: WrapperBlockPos): WrapperBlockHitResult {
        return WrapperBlockHitResult(clipHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    val toAabbs: Any
        get() = toAabbsHandle.invoke(handle) as Any

    val `moonrise$getSingleAABBRepresentation`: WrapperAABB
        get() = WrapperAABB(`moonrise$getSingleAABBRepresentationHandle`.invoke(handle))

    val `moonrise$rootCoordinatesX`: Any
        get() = `moonrise$rootCoordinatesXHandle`.invoke(handle) as Any

    val `moonrise$rootCoordinatesY`: Any
        get() = `moonrise$rootCoordinatesYHandle`.invoke(handle) as Any

    val `moonrise$rootCoordinatesZ`: Any
        get() = `moonrise$rootCoordinatesZHandle`.invoke(handle) as Any

    fun `moonrise$orUnoptimized`(arg0: WrapperVoxelShape): WrapperVoxelShape {
        return WrapperVoxelShape(`moonrise$orUnoptimizedHandle`.invoke(handle, arg0.handle))
    }

    fun setFaces(value: Any) {
        facesSetterHandle.invoke(handle, value)
    }

    fun setOffsetX(value: Double) {
        offsetXSetterHandle.invoke(handle, value)
    }

    fun setOffsetY(value: Double) {
        offsetYSetterHandle.invoke(handle, value)
    }

    fun setOffsetZ(value: Double) {
        offsetZSetterHandle.invoke(handle, value)
    }

    fun setSingleAABBRepresentation(value: WrapperAABB) {
        singleAABBRepresentationSetterHandle.invoke(handle, value.handle)
    }

    fun setRootCoordinatesX(value: Any) {
        rootCoordinatesXSetterHandle.invoke(handle, value)
    }

    fun setRootCoordinatesY(value: Any) {
        rootCoordinatesYSetterHandle.invoke(handle, value)
    }

    fun setRootCoordinatesZ(value: Any) {
        rootCoordinatesZSetterHandle.invoke(handle, value)
    }

    fun setCachedShapeData(value: Any) {
        cachedShapeDataSetterHandle.invoke(handle, value)
    }

    fun setIsEmpty(value: Boolean) {
        isEmptySetterHandle.invoke(handle, value)
    }

    fun setCachedToAABBs(value: Any) {
        cachedToAABBsSetterHandle.invoke(handle, value)
    }

    fun setCachedBounds(value: WrapperAABB) {
        cachedBoundsSetterHandle.invoke(handle, value.handle)
    }

    fun setIsFullBlock(value: Any) {
        isFullBlockSetterHandle.invoke(handle, value)
    }

    fun setOccludesFullBlock(value: Any) {
        occludesFullBlockSetterHandle.invoke(handle, value)
    }

    fun setMergedORCache(value: Any) {
        mergedORCacheSetterHandle.invoke(handle, value)
    }

    fun setFaceShapeClampedCache(value: Any) {
        faceShapeClampedCacheSetterHandle.invoke(handle, value)
    }

}
