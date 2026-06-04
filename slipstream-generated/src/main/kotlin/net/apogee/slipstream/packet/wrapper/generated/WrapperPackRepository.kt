package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPackRepository(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.repository.PackRepository") }
        private val lookup = MethodHandles.lookup()

        val openAllSelectedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "openAllSelected", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getAvailableIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAvailableIds", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getSelectedIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelectedIds", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getAvailablePacksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAvailablePacks", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getSelectedPacksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelectedPacks", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val isAvailableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAvailable", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val addPackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addPack", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val removePackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removePack", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val getPackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPack", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.Pack"), String::class.java))
        }
        val getRequestedFeatureFlagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRequestedFeatureFlags", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val availableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("available")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val selectedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("selected")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val openAllSelected: Any
        get() = openAllSelectedHandle.invoke(handle) as Any

    val availableIds: Any
        get() = getAvailableIdsHandle.invoke(handle) as Any

    val selectedIds: Any
        get() = getSelectedIdsHandle.invoke(handle) as Any

    val availablePacks: Any
        get() = getAvailablePacksHandle.invoke(handle) as Any

    val selectedPacks: Any
        get() = getSelectedPacksHandle.invoke(handle) as Any

    fun isAvailable(arg0: String): Boolean {
        return isAvailableHandle.invoke(handle, arg0) as Boolean
    }

    fun addPack(arg0: String): Boolean {
        return addPackHandle.invoke(handle, arg0) as Boolean
    }

    fun removePack(arg0: String): Boolean {
        return removePackHandle.invoke(handle, arg0) as Boolean
    }

    fun getPack(arg0: String): WrapperPack {
        return WrapperPack(getPackHandle.invoke(handle, arg0))
    }

    val requestedFeatureFlags: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(getRequestedFeatureFlagsHandle.invoke(handle))

    fun setAvailable(value: Any) {
        availableSetterHandle.invoke(handle, value)
    }

    fun setSelected(value: Any) {
        selectedSetterHandle.invoke(handle, value)
    }

}
