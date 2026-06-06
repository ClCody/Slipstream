package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemFrame(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.decoration.ItemFrame") }
        private val lookup = MethodHandles.lookup()

        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.entity.SlotAccess"), Int::class.javaPrimitiveType!!))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getPlaceSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlaceSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val interactHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interact", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val getVisualRotationYInDegreesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisualRotationYInDegrees", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getAddEntityPacketHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAddEntityPacket", MethodType.methodType(Class.forName("net.minecraft.network.protocol.Packet"), Class.forName("net.minecraft.server.level.ServerEntity")))
        }
        val getPickResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickResult", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val shouldRenderAtSqrDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRenderAtSqrDistance", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val spawnAtLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spawnAtLocation", MethodType.methodType(Class.forName("net.minecraft.world.entity.item.ItemEntity"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val getRemoveItemSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemoveItemSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getAnalogOutputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAnalogOutput", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAddItemSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAddItemSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getFramedMapIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFramedMapId", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapId"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getBreakSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBreakSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val hasFramedMapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasFramedMap", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRotateItemSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotateItemSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val survivesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "survives", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotation", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val dropChanceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dropChance")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fixedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fixed")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedMapIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedMapId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getSlot(arg0: Int): WrapperSlotAccess {
        return WrapperSlotAccess(getSlotHandle.invoke(handle, arg0))
    }

    val item: WrapperItemStack
        get() = WrapperItemStack(getItemHandle.invoke(handle))

    val placeSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getPlaceSoundHandle.invoke(handle))

    fun interact(arg0: WrapperPlayer, arg1: Any): Any {
        return interactHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    val visualRotationYInDegrees: Float
        get() = getVisualRotationYInDegreesHandle.invoke(handle) as Float

    fun getAddEntityPacket(arg0: WrapperServerEntity): WrapperPacket {
        return WrapperPacket(getAddEntityPacketHandle.invoke(handle, arg0.handle))
    }

    val pickResult: WrapperItemStack
        get() = WrapperItemStack(getPickResultHandle.invoke(handle))

    fun shouldRenderAtSqrDistance(arg0: Double): Boolean {
        return shouldRenderAtSqrDistanceHandle.invoke(handle, arg0) as Boolean
    }

    fun spawnAtLocation(arg0: WrapperItemStack): WrapperItemEntity {
        return WrapperItemEntity(spawnAtLocationHandle.invoke(handle, arg0.handle))
    }

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val removeItemSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getRemoveItemSoundHandle.invoke(handle))

    val analogOutput: Int
        get() = getAnalogOutputHandle.invoke(handle) as Int

    val addItemSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getAddItemSoundHandle.invoke(handle))

    fun getFramedMapId(arg0: WrapperItemStack): WrapperMapId {
        return WrapperMapId(getFramedMapIdHandle.invoke(handle, arg0.handle))
    }

    val breakSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getBreakSoundHandle.invoke(handle))

    val framedMap: Boolean
        get() = hasFramedMapHandle.invoke(handle) as Boolean

    val rotateItemSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getRotateItemSoundHandle.invoke(handle))

    val survives: Boolean
        get() = survivesHandle.invoke(handle) as Boolean

    val rotation: Int
        get() = getRotationHandle.invoke(handle) as Int

    fun setDropChance(value: Float) {
        dropChanceSetterHandle.invoke(handle, value)
    }

    fun setFixed(value: Boolean) {
        fixedSetterHandle.invoke(handle, value)
    }

    fun setCachedMapId(value: WrapperMapId) {
        cachedMapIdSetterHandle.invoke(handle, value.handle)
    }

}
