package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAttributeInstance(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.ai.attributes.AttributeInstance") }
        private val lookup = MethodHandles.lookup()

        val getModifiersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getModifiers", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getAttributeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttribute", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getBaseValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseValue", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getModifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getModifier", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.attributes.AttributeModifier"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val removeModifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeModifier", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val hasModifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasModifier", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val baseValueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("baseValue")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dirtySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dirty")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedValueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedValue")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val modifiers: Any
        get() = getModifiersHandle.invoke(handle) as Any

    val value: Double
        get() = getValueHandle.invoke(handle) as Double

    val save: WrapperCompoundTag
        get() = WrapperCompoundTag(saveHandle.invoke(handle))

    val attribute: WrapperHolder
        get() = WrapperHolder(getAttributeHandle.invoke(handle))

    val baseValue: Double
        get() = getBaseValueHandle.invoke(handle) as Double

    fun getModifier(arg0: WrapperResourceLocation): WrapperAttributeModifier {
        return WrapperAttributeModifier(getModifierHandle.invoke(handle, arg0.handle))
    }

    fun removeModifier(arg0: WrapperResourceLocation): Boolean {
        return removeModifierHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun hasModifier(arg0: WrapperResourceLocation): Boolean {
        return hasModifierHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setBaseValue(value: Double) {
        baseValueSetterHandle.invoke(handle, value)
    }

    fun setDirty(value: Boolean) {
        dirtySetterHandle.invoke(handle, value)
    }

    fun setCachedValue(value: Double) {
        cachedValueSetterHandle.invoke(handle, value)
    }

}
