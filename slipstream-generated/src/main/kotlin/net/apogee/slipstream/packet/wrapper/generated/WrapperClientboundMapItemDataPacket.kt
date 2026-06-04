package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundMapItemDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundMapItemDataPacket") }
        private val lookup = MethodHandles.lookup()

        val mapIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mapId", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapId")))
        }
        val scaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scale", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val lockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "locked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val decorationsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "decorations", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val colorPatchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "colorPatch", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.saveddata.maps.MapId"), Byte::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Optional"), Class.forName("java.util.Optional")))
        }
    }

    val mapId: WrapperMapId
        get() = WrapperMapId(mapIdHandle.invoke(handle))

    val scale: Byte
        get() = scaleHandle.invoke(handle) as Byte

    val locked: Boolean
        get() = lockedHandle.invoke(handle) as Boolean

    val decorations: Any
        get() = decorationsHandle.invoke(handle) as Any

    val colorPatch: Any
        get() = colorPatchHandle.invoke(handle) as Any

    fun copy(mapId: WrapperMapId = this.mapId, scale: Byte = this.scale, locked: Boolean = this.locked, decorations: Any = this.decorations, colorPatch: Any = this.colorPatch): WrapperClientboundMapItemDataPacket {
        return WrapperClientboundMapItemDataPacket(constructorHandle.invoke(mapId.handle, scale, locked, decorations, colorPatch))
    }

}
