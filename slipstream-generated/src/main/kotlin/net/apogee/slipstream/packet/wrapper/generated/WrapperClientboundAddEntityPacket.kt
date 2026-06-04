package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundAddEntityPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundAddEntityPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityType")))
        }
        val getDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getData", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getYHeadRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYHeadRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUUID", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYa", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXa", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getZaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZa", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val getType: WrapperEntityType
        get() = WrapperEntityType(getTypeHandle.invoke(handle))

    val data: Int
        get() = getDataHandle.invoke(handle) as Int

    val yHeadRot: Float
        get() = getYHeadRotHandle.invoke(handle) as Float

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val uUID: Any
        get() = getUUIDHandle.invoke(handle) as Any

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

    val yRot: Float
        get() = getYRotHandle.invoke(handle) as Float

    val xRot: Float
        get() = getXRotHandle.invoke(handle) as Float

    val ya: Double
        get() = getYaHandle.invoke(handle) as Double

    val xa: Double
        get() = getXaHandle.invoke(handle) as Double

    val za: Double
        get() = getZaHandle.invoke(handle) as Double

}
