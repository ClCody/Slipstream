package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlendingData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.blending.BlendingData") }
        private val lookup = MethodHandles.lookup()

        val getAreaWithOldGenerationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAreaWithOldGeneration", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelHeightAccessor")))
        }
        val hasCalculatedDataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasCalculatedData")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val areaWithOldGeneration: WrapperLevelHeightAccessor
        get() = WrapperLevelHeightAccessor(getAreaWithOldGenerationHandle.invoke(handle))

    fun setHasCalculatedData(value: Boolean) {
        hasCalculatedDataSetterHandle.invoke(handle, value)
    }

}
