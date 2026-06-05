package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAttributeMap(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.ai.attributes.AttributeMap") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val getInstanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInstance", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.attributes.AttributeInstance"), Class.forName("net.minecraft.core.Holder")))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag")))
        }
        val getBaseValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseValue", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val hasModifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasModifier", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getAttributesToSyncHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttributesToSync", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getSyncableAttributesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSyncableAttributes", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getAttributesToUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttributesToUpdate", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val hasAttributeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasAttribute", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val getModifierValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getModifierValue", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    fun getValue(arg0: WrapperHolder): Double {
        return getValueHandle.invoke(handle, arg0.handle) as Double
    }

    fun getInstance(arg0: WrapperHolder): WrapperAttributeInstance {
        return WrapperAttributeInstance(getInstanceHandle.invoke(handle, arg0.handle))
    }

    val save: WrapperListTag
        get() = WrapperListTag(saveHandle.invoke(handle))

    fun getBaseValue(arg0: WrapperHolder): Double {
        return getBaseValueHandle.invoke(handle, arg0.handle) as Double
    }

    fun hasModifier(arg0: WrapperHolder, arg1: WrapperResourceLocation): Boolean {
        return hasModifierHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val attributesToSync: Any
        get() = getAttributesToSyncHandle.invoke(handle) as Any

    val syncableAttributes: Any
        get() = getSyncableAttributesHandle.invoke(handle) as Any

    val attributesToUpdate: Any
        get() = getAttributesToUpdateHandle.invoke(handle) as Any

    fun hasAttribute(arg0: WrapperHolder): Boolean {
        return hasAttributeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getModifierValue(arg0: WrapperHolder, arg1: WrapperResourceLocation): Double {
        return getModifierValueHandle.invoke(handle, arg0.handle, arg1.handle) as Double
    }

}
