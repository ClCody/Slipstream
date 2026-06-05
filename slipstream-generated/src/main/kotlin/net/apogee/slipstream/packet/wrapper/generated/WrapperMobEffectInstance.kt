package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMobEffectInstance(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.effect.MobEffectInstance") }
        private val lookup = MethodHandles.lookup()

        val compareToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compareTo", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.effect.MobEffectInstance")))
        }
        val updateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "update", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.effect.MobEffectInstance")))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag")))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val tickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tick", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("java.lang.Runnable")))
        }
        val getDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDuration", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDescriptionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescriptionId", MethodType.methodType(String::class.java))
        }
        val getAmplifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmplifier", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isInfiniteDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInfiniteDuration", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBlendFactorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlendFactor", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.LivingEntity"), Float::class.javaPrimitiveType!!))
        }
        val mapDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mapDuration", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("it.unimi.dsi.fastutil.ints.Int2IntFunction")))
        }
        val endsWithinHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "endsWithin", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffect", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val isAmbientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAmbient", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isVisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val showIconHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "showIcon", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getParticleOptionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParticleOptions", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
        val durationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("duration")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val amplifierSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("amplifier")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ambientSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ambient")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val visibleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("visible")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val showIconSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("showIcon")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hiddenEffectSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hiddenEffect")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun compareTo(arg0: WrapperMobEffectInstance): Int {
        return compareToHandle.invoke(handle, arg0.handle) as Int
    }

    fun update(arg0: WrapperMobEffectInstance): Boolean {
        return updateHandle.invoke(handle, arg0.handle) as Boolean
    }

    val save: WrapperTag
        get() = WrapperTag(saveHandle.invoke(handle))

    fun `is`(arg0: WrapperHolder): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun tick(arg0: WrapperLivingEntity, arg1: Any): Boolean {
        return tickHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val duration: Int
        get() = getDurationHandle.invoke(handle) as Int

    val descriptionId: String
        get() = getDescriptionIdHandle.invoke(handle) as String

    val amplifier: Int
        get() = getAmplifierHandle.invoke(handle) as Int

    val infiniteDuration: Boolean
        get() = isInfiniteDurationHandle.invoke(handle) as Boolean

    fun getBlendFactor(arg0: WrapperLivingEntity, arg1: Float): Float {
        return getBlendFactorHandle.invoke(handle, arg0.handle, arg1) as Float
    }

    fun mapDuration(arg0: Any): Int {
        return mapDurationHandle.invoke(handle, arg0) as Int
    }

    fun endsWithin(arg0: Int): Boolean {
        return endsWithinHandle.invoke(handle, arg0) as Boolean
    }

    val effect: WrapperHolder
        get() = WrapperHolder(getEffectHandle.invoke(handle))

    val ambient: Boolean
        get() = isAmbientHandle.invoke(handle) as Boolean

    val visible: Boolean
        get() = isVisibleHandle.invoke(handle) as Boolean

    val showIcon: Boolean
        get() = showIconHandle.invoke(handle) as Boolean

    val particleOptions: WrapperParticleOptions
        get() = WrapperParticleOptions(getParticleOptionsHandle.invoke(handle))

    fun setDuration(value: Int) {
        durationSetterHandle.invoke(handle, value)
    }

    fun setAmplifier(value: Int) {
        amplifierSetterHandle.invoke(handle, value)
    }

    fun setAmbient(value: Boolean) {
        ambientSetterHandle.invoke(handle, value)
    }

    fun setVisible(value: Boolean) {
        visibleSetterHandle.invoke(handle, value)
    }

    fun setShowIcon(value: Boolean) {
        showIconSetterHandle.invoke(handle, value)
    }

    fun setHiddenEffect(value: WrapperMobEffectInstance) {
        hiddenEffectSetterHandle.invoke(handle, value.handle)
    }

}
