package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockState(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.BlockState") }
        private val lookup = MethodHandles.lookup()

        val getBukkitMaterialHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitMaterial", MethodType.methodType(Class.forName("org.bukkit.Material")))
        }
        val cachedMaterialSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedMaterial")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val bukkitMaterial: Any
        get() = getBukkitMaterialHandle.invoke(handle) as Any

    fun setCachedMaterial(value: Any) {
        cachedMaterialSetterHandle.invoke(handle, value)
    }

}
