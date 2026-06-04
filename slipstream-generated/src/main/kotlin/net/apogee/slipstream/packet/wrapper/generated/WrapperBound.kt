package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBound(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.ChatType\$Bound") }
        private val lookup = MethodHandles.lookup()

        val chatTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chatType", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val nameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "name", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val targetNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "targetName", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.network.chat.Component"), Class.forName("java.util.Optional")))
        }
    }

    val chatType: WrapperHolder
        get() = WrapperHolder(chatTypeHandle.invoke(handle))

    val name: WrapperComponent
        get() = WrapperComponent(nameHandle.invoke(handle))

    val targetName: Any
        get() = targetNameHandle.invoke(handle) as Any

    fun copy(chatType: WrapperHolder = this.chatType, name: WrapperComponent = this.name, targetName: Any = this.targetName): WrapperBound {
        return WrapperBound(constructorHandle.invoke(chatType.handle, name.handle, targetName))
    }

}
