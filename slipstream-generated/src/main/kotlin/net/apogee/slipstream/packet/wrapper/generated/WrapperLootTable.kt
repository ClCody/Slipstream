package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLootTable(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.loot.LootTable") }
        private val lookup = MethodHandles.lookup()

        val getRandomItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomItems", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.objects.ObjectArrayList"), Class.forName("net.minecraft.world.level.storage.loot.LootParams")))
        }
        val getParamSetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParamSet", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParamSet")))
        }
        val craftLootTableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("craftLootTable")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getRandomItems(arg0: WrapperLootParams): Any {
        return getRandomItemsHandle.invoke(handle, arg0.handle) as Any
    }

    val paramSet: WrapperLootContextParamSet
        get() = WrapperLootContextParamSet(getParamSetHandle.invoke(handle))

    fun setCraftLootTable(value: Any) {
        craftLootTableSetterHandle.invoke(handle, value)
    }

}
