package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperProfilePublicKey(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.player.ProfilePublicKey") }
        private val lookup = MethodHandles.lookup()

        val dataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "data", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.ProfilePublicKey\$Data")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.entity.player.ProfilePublicKey\$Data")))
        }
    }

    val data: WrapperData
        get() = WrapperData(dataHandle.invoke(handle))

    fun copy(data: WrapperData = this.data): WrapperProfilePublicKey {
        return WrapperProfilePublicKey(constructorHandle.invoke(data.handle))
    }

}
