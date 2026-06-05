package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.entity.BlockEntity") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntityType")))
        }
        val getOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwner", MethodType.methodType(Class.forName("org.bukkit.inventory.InventoryHolder"), Boolean::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val onlyOpCanSetNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onlyOpCanSetNbt", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val triggerEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "triggerEvent", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isValidBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValidBlockState", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val collectComponentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "collectComponents", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val saveCustomOnlyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveCustomOnly", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val applyComponentsSetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyComponentsSet", MethodType.methodType(Class.forName("java.util.Set"), Class.forName("net.minecraft.core.component.DataComponentMap"), Class.forName("net.minecraft.core.component.DataComponentPatch")))
        }
        val getUpdatePacketHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUpdatePacket", MethodType.methodType(Class.forName("net.minecraft.network.protocol.Packet")))
        }
        val saveWithFullMetadataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveWithFullMetadata", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val saveWithoutMetadataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveWithoutMetadata", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val saveCustomAndMetadataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveCustomAndMetadata", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getUpdateTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUpdateTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val sanitizeSentNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sanitizeSentNbt", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val componentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "components", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val getBlockPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isRemovedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRemoved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val saveWithIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveWithId", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val hasLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLevel", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val tickTimerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickTimer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val persistentDataContainerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("persistentDataContainer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val levelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("level")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val removeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("remove")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blockStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blockState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val componentsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("components")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperBlockEntityType
        get() = WrapperBlockEntityType(getTypeHandle.invoke(handle))

    fun getOwner(arg0: Boolean): Any {
        return getOwnerHandle.invoke(handle, arg0) as Any
    }

    val level: WrapperLevel
        get() = WrapperLevel(getLevelHandle.invoke(handle))

    val onlyOpCanSetNbt: Boolean
        get() = onlyOpCanSetNbtHandle.invoke(handle) as Boolean

    fun triggerEvent(arg0: Int, arg1: Int): Boolean {
        return triggerEventHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun isValidBlockState(arg0: WrapperBlockState): Boolean {
        return isValidBlockStateHandle.invoke(handle, arg0.handle) as Boolean
    }

    val collectComponents: WrapperDataComponentMap
        get() = WrapperDataComponentMap(collectComponentsHandle.invoke(handle))

    fun saveCustomOnly(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveCustomOnlyHandle.invoke(handle, arg0.handle))
    }

    fun applyComponentsSet(arg0: WrapperDataComponentMap, arg1: WrapperDataComponentPatch): Any {
        return applyComponentsSetHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    val updatePacket: WrapperPacket
        get() = WrapperPacket(getUpdatePacketHandle.invoke(handle))

    fun saveWithFullMetadata(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveWithFullMetadataHandle.invoke(handle, arg0.handle))
    }

    fun saveWithoutMetadata(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveWithoutMetadataHandle.invoke(handle, arg0.handle))
    }

    fun saveCustomAndMetadata(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveCustomAndMetadataHandle.invoke(handle, arg0.handle))
    }

    val blockState: WrapperBlockState
        get() = WrapperBlockState(getBlockStateHandle.invoke(handle))

    fun getUpdateTag(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(getUpdateTagHandle.invoke(handle, arg0.handle))
    }

    fun sanitizeSentNbt(arg0: WrapperCompoundTag): WrapperCompoundTag {
        return WrapperCompoundTag(sanitizeSentNbtHandle.invoke(handle, arg0.handle))
    }

    val components: WrapperDataComponentMap
        get() = WrapperDataComponentMap(componentsHandle.invoke(handle))

    val blockPos: WrapperBlockPos
        get() = WrapperBlockPos(getBlockPosHandle.invoke(handle))

    val removed: Boolean
        get() = isRemovedHandle.invoke(handle) as Boolean

    fun saveWithId(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveWithIdHandle.invoke(handle, arg0.handle))
    }

    val hasLevel: Boolean
        get() = hasLevelHandle.invoke(handle) as Boolean

    fun setTickTimer(value: Any) {
        tickTimerSetterHandle.invoke(handle, value)
    }

    fun setPersistentDataContainer(value: Any) {
        persistentDataContainerSetterHandle.invoke(handle, value)
    }

    fun setLevel(value: WrapperLevel) {
        levelSetterHandle.invoke(handle, value.handle)
    }

    fun setRemove(value: Boolean) {
        removeSetterHandle.invoke(handle, value)
    }

    fun setBlockState(value: WrapperBlockState) {
        blockStateSetterHandle.invoke(handle, value.handle)
    }

    fun setComponents(value: WrapperDataComponentMap) {
        componentsSetterHandle.invoke(handle, value.handle)
    }

}
