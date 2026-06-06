package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundInteractPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundInteractPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getTargetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTarget", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val isAttackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAttack", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEntityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isUsingSecondaryActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUsingSecondaryAction", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    fun getTarget(arg0: WrapperServerLevel): WrapperEntity {
        return WrapperEntity(getTargetHandle.invoke(handle, arg0.handle))
    }

    val attack: Boolean
        get() = isAttackHandle.invoke(handle) as Boolean

    val entityId: Int
        get() = getEntityIdHandle.invoke(handle) as Int

    val usingSecondaryAction: Boolean
        get() = isUsingSecondaryActionHandle.invoke(handle) as Boolean

}
