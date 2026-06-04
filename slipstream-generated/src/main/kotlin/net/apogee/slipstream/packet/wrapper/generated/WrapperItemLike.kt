package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemLike(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ItemLike") }
        private val lookup = MethodHandles.lookup()

        val asItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asItem", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
    }

    val asItem: WrapperItem
        get() = WrapperItem(asItemHandle.invoke(handle))

}
