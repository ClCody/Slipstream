package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSpawnState(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.NaturalSpawner\$SpawnState") }
        private val lookup = MethodHandles.lookup()

        val getSpawnableChunkCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnableChunkCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMobCategoryCountsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMobCategoryCounts", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.objects.Object2IntMap")))
        }
        val lastCheckedPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastCheckedPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastCheckedTypeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastCheckedType")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastChargeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastCharge")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val spawnableChunkCount: Int
        get() = getSpawnableChunkCountHandle.invoke(handle) as Int

    val mobCategoryCounts: Any
        get() = getMobCategoryCountsHandle.invoke(handle) as Any

    fun setLastCheckedPos(value: WrapperBlockPos) {
        lastCheckedPosSetterHandle.invoke(handle, value.handle)
    }

    fun setLastCheckedType(value: WrapperEntityType) {
        lastCheckedTypeSetterHandle.invoke(handle, value.handle)
    }

    fun setLastCharge(value: Double) {
        lastChargeSetterHandle.invoke(handle, value)
    }

}
