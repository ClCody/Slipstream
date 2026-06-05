package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlayerEnderChestContainer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.inventory.PlayerEnderChestContainer") }
        private val lookup = MethodHandles.lookup()

        val getLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocation", MethodType.methodType(Class.forName("org.bukkit.Location")))
        }
        val stillValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stillValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val createTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createTag", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val isActiveChestHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isActiveChest", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.entity.EnderChestBlockEntity")))
        }
        val getBukkitOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitOwner", MethodType.methodType(Class.forName("org.bukkit.inventory.InventoryHolder")))
        }
        val activeChestSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("activeChest")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val location: Any
        get() = getLocationHandle.invoke(handle) as Any

    fun stillValid(arg0: WrapperPlayer): Boolean {
        return stillValidHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun createTag(arg0: WrapperProvider): WrapperListTag {
        return WrapperListTag(createTagHandle.invoke(handle, arg0.handle))
    }

    fun isActiveChest(arg0: WrapperEnderChestBlockEntity): Boolean {
        return isActiveChestHandle.invoke(handle, arg0.handle) as Boolean
    }

    val bukkitOwner: Any
        get() = getBukkitOwnerHandle.invoke(handle) as Any

    fun setActiveChest(value: WrapperEnderChestBlockEntity) {
        activeChestSetterHandle.invoke(handle, value.handle)
    }

}
