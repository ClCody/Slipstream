package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMapItemSavedData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData") }
        private val lookup = MethodHandles.lookup()

        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getUpdatePacketHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUpdatePacket", MethodType.methodType(Class.forName("net.minecraft.network.protocol.Packet"), Class.forName("net.minecraft.world.level.saveddata.maps.MapId"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val isTrackedCountOverLimitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTrackedCountOverLimit", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val scaledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scaled", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData")))
        }
        val getBannersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBanners", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val toggleBannerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toggleBanner", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelAccessor"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val updateColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "updateColor", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Byte::class.javaPrimitiveType!!))
        }
        val isExplorationMapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isExplorationMap", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getHoldingPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHoldingPlayer", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData\$HoldingPlayer"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getDecorationsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDecorations", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val lockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "locked", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData")))
        }
        val centerXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("centerX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val centerZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("centerZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dimensionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dimension")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val trackingPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("trackingPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val unlimitedTrackingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("unlimitedTracking")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val scaleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("scale")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val colorsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("colors")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lockedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("locked")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val trackedDecorationCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("trackedDecorationCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val vanillaRenderSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("vanillaRender")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val serverSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("server")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val uniqueIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("uniqueId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val idSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("id")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun save(arg0: WrapperCompoundTag, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun getUpdatePacket(arg0: WrapperMapId, arg1: WrapperPlayer): WrapperPacket {
        return WrapperPacket(getUpdatePacketHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun isTrackedCountOverLimit(arg0: Int): Boolean {
        return isTrackedCountOverLimitHandle.invoke(handle, arg0) as Boolean
    }

    val scaled: WrapperMapItemSavedData
        get() = WrapperMapItemSavedData(scaledHandle.invoke(handle))

    val banners: Any
        get() = getBannersHandle.invoke(handle) as Any

    fun toggleBanner(arg0: WrapperLevelAccessor, arg1: WrapperBlockPos): Boolean {
        return toggleBannerHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun updateColor(arg0: Int, arg1: Int, arg2: Byte): Boolean {
        return updateColorHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    val explorationMap: Boolean
        get() = isExplorationMapHandle.invoke(handle) as Boolean

    fun getHoldingPlayer(arg0: WrapperPlayer): WrapperHoldingPlayer {
        return WrapperHoldingPlayer(getHoldingPlayerHandle.invoke(handle, arg0.handle))
    }

    val decorations: Any
        get() = getDecorationsHandle.invoke(handle) as Any

    val locked: WrapperMapItemSavedData
        get() = WrapperMapItemSavedData(lockedHandle.invoke(handle))

    fun setCenterX(value: Int) {
        centerXSetterHandle.invoke(handle, value)
    }

    fun setCenterZ(value: Int) {
        centerZSetterHandle.invoke(handle, value)
    }

    fun setDimension(value: WrapperResourceKey) {
        dimensionSetterHandle.invoke(handle, value.handle)
    }

    fun setTrackingPosition(value: Boolean) {
        trackingPositionSetterHandle.invoke(handle, value)
    }

    fun setUnlimitedTracking(value: Boolean) {
        unlimitedTrackingSetterHandle.invoke(handle, value)
    }

    fun setScale(value: Byte) {
        scaleSetterHandle.invoke(handle, value)
    }

    fun setColors(value: ByteArray) {
        colorsSetterHandle.invoke(handle, value)
    }

    fun setLocked(value: Boolean) {
        lockedSetterHandle.invoke(handle, value)
    }

    fun setTrackedDecorationCount(value: Int) {
        trackedDecorationCountSetterHandle.invoke(handle, value)
    }

    fun setVanillaRender(value: Any) {
        vanillaRenderSetterHandle.invoke(handle, value)
    }

    fun setServer(value: Any) {
        serverSetterHandle.invoke(handle, value)
    }

    fun setUniqueId(value: Any) {
        uniqueIdSetterHandle.invoke(handle, value)
    }

    fun setId(value: WrapperMapId) {
        idSetterHandle.invoke(handle, value.handle)
    }

}
