package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerLoginPacketListenerImpl(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.network.ServerLoginPacketListenerImpl") }
        private val lookup = MethodHandles.lookup()

        val getProtocolHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProtocol", MethodType.methodType(Class.forName("net.minecraft.network.ConnectionProtocol")))
        }
        val isAcceptingMessagesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAcceptingMessages", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isTransferredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTransferred", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getUserNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUserName", MethodType.methodType(String::class.java))
        }
        val stateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("state")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val requestedUsernameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("requestedUsername")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val authenticatedProfileSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("authenticatedProfile")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("player")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val iKnowThisMayNotBeTheBestIdeaButPleaseDisableUsernameValidationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("iKnowThisMayNotBeTheBestIdeaButPleaseDisableUsernameValidation")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val velocityLoginMessageIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("velocityLoginMessageId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val protocol: Any
        get() = getProtocolHandle.invoke(handle) as Any

    val acceptingMessages: Boolean
        get() = isAcceptingMessagesHandle.invoke(handle) as Boolean

    val transferred: Boolean
        get() = isTransferredHandle.invoke(handle) as Boolean

    val userName: String
        get() = getUserNameHandle.invoke(handle) as String

    fun setState(value: Any) {
        stateSetterHandle.invoke(handle, value)
    }

    fun setTick(value: Int) {
        tickSetterHandle.invoke(handle, value)
    }

    fun setRequestedUsername(value: String) {
        requestedUsernameSetterHandle.invoke(handle, value)
    }

    fun setAuthenticatedProfile(value: Any) {
        authenticatedProfileSetterHandle.invoke(handle, value)
    }

    fun setPlayer(value: WrapperServerPlayer) {
        playerSetterHandle.invoke(handle, value.handle)
    }

    fun setIKnowThisMayNotBeTheBestIdeaButPleaseDisableUsernameValidation(value: Boolean) {
        iKnowThisMayNotBeTheBestIdeaButPleaseDisableUsernameValidationSetterHandle.invoke(handle, value)
    }

    fun setVelocityLoginMessageId(value: Int) {
        velocityLoginMessageIdSetterHandle.invoke(handle, value)
    }

}
