package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperConnection(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.Connection") }
        private val lookup = MethodHandles.lookup()

        val isEncryptedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEncrypted", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRemoteAddressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemoteAddress", MethodType.methodType(Class.forName("java.net.SocketAddress")))
        }
        val isConnectingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isConnecting", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPacketListenerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPacketListener", MethodType.methodType(Class.forName("net.minecraft.network.PacketListener")))
        }
        val getReceivingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getReceiving", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketFlow")))
        }
        val isMemoryConnectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isMemoryConnection", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isConnectedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isConnected", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAverageReceivedPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAverageReceivedPackets", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getAverageSentPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAverageSentPackets", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getDisconnectionDetailsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisconnectionDetails", MethodType.methodType(Class.forName("net.minecraft.network.DisconnectionDetails")))
        }
        val getLoggableAddressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLoggableAddress", MethodType.methodType(String::class.java, Boolean::class.javaPrimitiveType!!))
        }
        val getPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayer", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getSendingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSending", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketFlow")))
        }
        val sendLoginDisconnectSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sendLoginDisconnect")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val channelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("channel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val addressSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("address")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spoofedUUIDSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spoofedUUID")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spoofedProfileSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spoofedProfile")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val preparingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("preparing")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val disconnectListenerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("disconnectListener")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val packetListenerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("packetListener")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val disconnectionDetailsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("disconnectionDetails")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val encryptedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("encrypted")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val disconnectionHandledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("disconnectionHandled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val receivedPacketsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("receivedPackets")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sentPacketsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sentPackets")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val averageReceivedPacketsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("averageReceivedPackets")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val averageSentPacketsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("averageSentPackets")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val handlingFaultSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("handlingFault")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val delayedDisconnectSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("delayedDisconnect")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bandwidthDebugMonitorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bandwidthDebugMonitor")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hostnameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hostname")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val protocolVersionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("protocolVersion")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val virtualHostSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("virtualHost")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isPendingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isPending")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val queueImmunitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("queueImmunity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val stopReadingPacketsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("stopReadingPackets")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val haProxyAddressSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("haProxyAddress")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val encrypted: Boolean
        get() = isEncryptedHandle.invoke(handle) as Boolean

    val remoteAddress: Any
        get() = getRemoteAddressHandle.invoke(handle) as Any

    val connecting: Boolean
        get() = isConnectingHandle.invoke(handle) as Boolean

    val packetListener: WrapperPacketListener
        get() = WrapperPacketListener(getPacketListenerHandle.invoke(handle))

    val receiving: Any
        get() = getReceivingHandle.invoke(handle) as Any

    val memoryConnection: Boolean
        get() = isMemoryConnectionHandle.invoke(handle) as Boolean

    val connected: Boolean
        get() = isConnectedHandle.invoke(handle) as Boolean

    val averageReceivedPackets: Float
        get() = getAverageReceivedPacketsHandle.invoke(handle) as Float

    val averageSentPackets: Float
        get() = getAverageSentPacketsHandle.invoke(handle) as Float

    val disconnectionDetails: WrapperDisconnectionDetails
        get() = WrapperDisconnectionDetails(getDisconnectionDetailsHandle.invoke(handle))

    fun getLoggableAddress(arg0: Boolean): String {
        return getLoggableAddressHandle.invoke(handle, arg0) as String
    }

    val player: WrapperServerPlayer
        get() = WrapperServerPlayer(getPlayerHandle.invoke(handle))

    val sending: Any
        get() = getSendingHandle.invoke(handle) as Any

    fun setSendLoginDisconnect(value: Boolean) {
        sendLoginDisconnectSetterHandle.invoke(handle, value)
    }

    fun setChannel(value: Any) {
        channelSetterHandle.invoke(handle, value)
    }

    fun setAddress(value: Any) {
        addressSetterHandle.invoke(handle, value)
    }

    fun setSpoofedUUID(value: Any) {
        spoofedUUIDSetterHandle.invoke(handle, value)
    }

    fun setSpoofedProfile(value: Any) {
        spoofedProfileSetterHandle.invoke(handle, value)
    }

    fun setPreparing(value: Boolean) {
        preparingSetterHandle.invoke(handle, value)
    }

    fun setDisconnectListener(value: WrapperPacketListener) {
        disconnectListenerSetterHandle.invoke(handle, value.handle)
    }

    fun setPacketListener(value: WrapperPacketListener) {
        packetListenerSetterHandle.invoke(handle, value.handle)
    }

    fun setDisconnectionDetails(value: WrapperDisconnectionDetails) {
        disconnectionDetailsSetterHandle.invoke(handle, value.handle)
    }

    fun setEncrypted(value: Boolean) {
        encryptedSetterHandle.invoke(handle, value)
    }

    fun setDisconnectionHandled(value: Boolean) {
        disconnectionHandledSetterHandle.invoke(handle, value)
    }

    fun setReceivedPackets(value: Int) {
        receivedPacketsSetterHandle.invoke(handle, value)
    }

    fun setSentPackets(value: Int) {
        sentPacketsSetterHandle.invoke(handle, value)
    }

    fun setAverageReceivedPackets(value: Float) {
        averageReceivedPacketsSetterHandle.invoke(handle, value)
    }

    fun setAverageSentPackets(value: Float) {
        averageSentPacketsSetterHandle.invoke(handle, value)
    }

    fun setTickCount(value: Int) {
        tickCountSetterHandle.invoke(handle, value)
    }

    fun setHandlingFault(value: Boolean) {
        handlingFaultSetterHandle.invoke(handle, value)
    }

    fun setDelayedDisconnect(value: WrapperDisconnectionDetails) {
        delayedDisconnectSetterHandle.invoke(handle, value.handle)
    }

    fun setBandwidthDebugMonitor(value: Any) {
        bandwidthDebugMonitorSetterHandle.invoke(handle, value)
    }

    fun setHostname(value: String) {
        hostnameSetterHandle.invoke(handle, value)
    }

    fun setProtocolVersion(value: Int) {
        protocolVersionSetterHandle.invoke(handle, value)
    }

    fun setVirtualHost(value: Any) {
        virtualHostSetterHandle.invoke(handle, value)
    }

    fun setIsPending(value: Boolean) {
        isPendingSetterHandle.invoke(handle, value)
    }

    fun setQueueImmunity(value: Boolean) {
        queueImmunitySetterHandle.invoke(handle, value)
    }

    fun setStopReadingPackets(value: Boolean) {
        stopReadingPacketsSetterHandle.invoke(handle, value)
    }

    fun setHaProxyAddress(value: Any) {
        haProxyAddressSetterHandle.invoke(handle, value)
    }

}
