package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetEntityDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val packedItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packedItems", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("java.util.List")))
        }
    }

    val id: Int
        get() = idHandle.invoke(handle) as Int

    val packedItems: Any
        get() = packedItemsHandle.invoke(handle) as Any

    fun copy(id: Int = this.id, packedItems: Any = this.packedItems): WrapperClientboundSetEntityDataPacket {
        return WrapperClientboundSetEntityDataPacket(constructorHandle.invoke(id, packedItems))
    }

}
