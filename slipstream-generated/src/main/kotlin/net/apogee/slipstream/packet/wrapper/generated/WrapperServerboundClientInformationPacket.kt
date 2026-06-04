package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundClientInformationPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ServerboundClientInformationPacket") }
        private val lookup = MethodHandles.lookup()

        val informationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "information", MethodType.methodType(Class.forName("net.minecraft.server.level.ClientInformation")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.server.level.ClientInformation")))
        }
    }

    val information: WrapperClientInformation
        get() = WrapperClientInformation(informationHandle.invoke(handle))

    fun copy(information: WrapperClientInformation = this.information): WrapperServerboundClientInformationPacket {
        return WrapperServerboundClientInformationPacket(constructorHandle.invoke(information.handle))
    }

}
