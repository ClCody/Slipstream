package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHoldingPlayer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData\$HoldingPlayer") }
        private val lookup = MethodHandles.lookup()

        val dirtyDataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dirtyData")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val minDirtyXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("minDirtyX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val minDirtyYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("minDirtyY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxDirtyXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxDirtyX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxDirtyYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxDirtyY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dirtyDecorationsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dirtyDecorations")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val stepSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("step")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun setDirtyData(value: Boolean) {
        dirtyDataSetterHandle.invoke(handle, value)
    }

    fun setMinDirtyX(value: Int) {
        minDirtyXSetterHandle.invoke(handle, value)
    }

    fun setMinDirtyY(value: Int) {
        minDirtyYSetterHandle.invoke(handle, value)
    }

    fun setMaxDirtyX(value: Int) {
        maxDirtyXSetterHandle.invoke(handle, value)
    }

    fun setMaxDirtyY(value: Int) {
        maxDirtyYSetterHandle.invoke(handle, value)
    }

    fun setDirtyDecorations(value: Boolean) {
        dirtyDecorationsSetterHandle.invoke(handle, value)
    }

    fun setTick(value: Int) {
        tickSetterHandle.invoke(handle, value)
    }

    fun setStep(value: Int) {
        stepSetterHandle.invoke(handle, value)
    }

}
