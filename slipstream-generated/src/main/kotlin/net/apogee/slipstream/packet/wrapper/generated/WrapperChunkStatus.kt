package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkStatus(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val getParentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParent", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val getIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIndex", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isAfterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAfter", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val isBeforeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBefore", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val isOrAfterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOrAfter", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val `moonrise$isEmptyLoadStatusHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isEmptyLoadStatus", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$isParallelCapableHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isParallelCapable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getNextStatusHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getNextStatus", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val `moonrise$isEmptyGenStatusHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isEmptyGenStatus", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getWriteRadiusHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getWriteRadius", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getChunkTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkType", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkType")))
        }
        val heightmapsAfterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "heightmapsAfter", MethodType.methodType(Class.forName("java.util.EnumSet")))
        }
        val `moonrise$getWarnedAboutNoImmediateCompleteHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getWarnedAboutNoImmediateComplete", MethodType.methodType(Class.forName("java.util.concurrent.atomic.AtomicBoolean")))
        }
        val isOrBeforeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOrBefore", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val isParallelCapableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isParallelCapable")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val emptyLoadTaskSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("emptyLoadTask")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val writeRadiusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("writeRadius")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val nextStatusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nextStatus")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val warnedAboutNoImmediateCompleteSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("warnedAboutNoImmediateComplete")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val parent: WrapperChunkStatus
        get() = WrapperChunkStatus(getParentHandle.invoke(handle))

    val index: Int
        get() = getIndexHandle.invoke(handle) as Int

    fun isAfter(arg0: WrapperChunkStatus): Boolean {
        return isAfterHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isBefore(arg0: WrapperChunkStatus): Boolean {
        return isBeforeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isOrAfter(arg0: WrapperChunkStatus): Boolean {
        return isOrAfterHandle.invoke(handle, arg0.handle) as Boolean
    }

    val `moonrise$isEmptyLoadStatus`: Boolean
        get() = `moonrise$isEmptyLoadStatusHandle`.invoke(handle) as Boolean

    val `moonrise$isParallelCapable`: Boolean
        get() = `moonrise$isParallelCapableHandle`.invoke(handle) as Boolean

    val `moonrise$getNextStatus`: WrapperChunkStatus
        get() = WrapperChunkStatus(`moonrise$getNextStatusHandle`.invoke(handle))

    val `moonrise$isEmptyGenStatus`: Boolean
        get() = `moonrise$isEmptyGenStatusHandle`.invoke(handle) as Boolean

    val `moonrise$getWriteRadius`: Int
        get() = `moonrise$getWriteRadiusHandle`.invoke(handle) as Int

    val chunkType: Any
        get() = getChunkTypeHandle.invoke(handle) as Any

    val heightmapsAfter: Any
        get() = heightmapsAfterHandle.invoke(handle) as Any

    val `moonrise$getWarnedAboutNoImmediateComplete`: Any
        get() = `moonrise$getWarnedAboutNoImmediateCompleteHandle`.invoke(handle) as Any

    fun isOrBefore(arg0: WrapperChunkStatus): Boolean {
        return isOrBeforeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setIsParallelCapable(value: Boolean) {
        isParallelCapableSetterHandle.invoke(handle, value)
    }

    fun setEmptyLoadTask(value: Boolean) {
        emptyLoadTaskSetterHandle.invoke(handle, value)
    }

    fun setWriteRadius(value: Int) {
        writeRadiusSetterHandle.invoke(handle, value)
    }

    fun setNextStatus(value: WrapperChunkStatus) {
        nextStatusSetterHandle.invoke(handle, value.handle)
    }

    fun setWarnedAboutNoImmediateComplete(value: Any) {
        warnedAboutNoImmediateCompleteSetterHandle.invoke(handle, value)
    }

}
