package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundDamageEventPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundDamageEventPacket") }
        private val lookup = MethodHandles.lookup()

        val entityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val sourceTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sourceType", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val sourceCauseIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sourceCauseId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val sourceDirectIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sourceDirectId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val sourcePositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sourcePosition", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.util.Optional")))
        }
    }

    val entityId: Int
        get() = entityIdHandle.invoke(handle) as Int

    val sourceType: WrapperHolder
        get() = WrapperHolder(sourceTypeHandle.invoke(handle))

    val sourceCauseId: Int
        get() = sourceCauseIdHandle.invoke(handle) as Int

    val sourceDirectId: Int
        get() = sourceDirectIdHandle.invoke(handle) as Int

    val sourcePosition: Any
        get() = sourcePositionHandle.invoke(handle) as Any

    fun copy(entityId: Int = this.entityId, sourceType: WrapperHolder = this.sourceType, sourceCauseId: Int = this.sourceCauseId, sourceDirectId: Int = this.sourceDirectId, sourcePosition: Any = this.sourcePosition): WrapperClientboundDamageEventPacket {
        return WrapperClientboundDamageEventPacket(constructorHandle.invoke(entityId, sourceType.handle, sourceCauseId, sourceDirectId, sourcePosition))
    }

}
