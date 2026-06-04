package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperUpdate(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.LastSeenMessages\$Update") }
        private val lookup = MethodHandles.lookup()

        val offsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offset", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val acknowledgedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acknowledged", MethodType.methodType(Class.forName("java.util.BitSet")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("java.util.BitSet")))
        }
    }

    val offset: Int
        get() = offsetHandle.invoke(handle) as Int

    val acknowledged: Any
        get() = acknowledgedHandle.invoke(handle) as Any

    fun copy(offset: Int = this.offset, acknowledged: Any = this.acknowledged): WrapperUpdate {
        return WrapperUpdate(constructorHandle.invoke(offset, acknowledged))
    }

}
