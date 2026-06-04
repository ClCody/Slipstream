package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.dimension.end.EndDragonFight\$Data") }
        private val lookup = MethodHandles.lookup()

        val needsStateScanningHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "needsStateScanning", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val dragonKilledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dragonKilled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val previouslyKilledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "previouslyKilled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isRespawningHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRespawning", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val dragonUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dragonUUID", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val exitPortalLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "exitPortalLocation", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val gatewaysHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gateways", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Optional"), Class.forName("java.util.Optional"), Class.forName("java.util.Optional")))
        }
    }

    val needsStateScanning: Boolean
        get() = needsStateScanningHandle.invoke(handle) as Boolean

    val dragonKilled: Boolean
        get() = dragonKilledHandle.invoke(handle) as Boolean

    val previouslyKilled: Boolean
        get() = previouslyKilledHandle.invoke(handle) as Boolean

    val isRespawning: Boolean
        get() = isRespawningHandle.invoke(handle) as Boolean

    val dragonUUID: Any
        get() = dragonUUIDHandle.invoke(handle) as Any

    val exitPortalLocation: Any
        get() = exitPortalLocationHandle.invoke(handle) as Any

    val gateways: Any
        get() = gatewaysHandle.invoke(handle) as Any

    fun copy(needsStateScanning: Boolean = this.needsStateScanning, dragonKilled: Boolean = this.dragonKilled, previouslyKilled: Boolean = this.previouslyKilled, isRespawning: Boolean = this.isRespawning, dragonUUID: Any = this.dragonUUID, exitPortalLocation: Any = this.exitPortalLocation, gateways: Any = this.gateways): WrapperData {
        return WrapperData(constructorHandle.invoke(needsStateScanning, dragonKilled, previouslyKilled, isRespawning, dragonUUID, exitPortalLocation, gateways))
    }

}
