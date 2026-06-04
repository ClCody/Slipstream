package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundRespawnPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundRespawnPacket") }
        private val lookup = MethodHandles.lookup()

        val commonPlayerSpawnInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "commonPlayerSpawnInfo", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.CommonPlayerSpawnInfo")))
        }
        val dataToKeepHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dataToKeep", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.protocol.game.CommonPlayerSpawnInfo"), Byte::class.javaPrimitiveType!!))
        }
    }

    val commonPlayerSpawnInfo: WrapperCommonPlayerSpawnInfo
        get() = WrapperCommonPlayerSpawnInfo(commonPlayerSpawnInfoHandle.invoke(handle))

    val dataToKeep: Byte
        get() = dataToKeepHandle.invoke(handle) as Byte

    fun copy(commonPlayerSpawnInfo: WrapperCommonPlayerSpawnInfo = this.commonPlayerSpawnInfo, dataToKeep: Byte = this.dataToKeep): WrapperClientboundRespawnPacket {
        return WrapperClientboundRespawnPacket(constructorHandle.invoke(commonPlayerSpawnInfo.handle, dataToKeep))
    }

}
