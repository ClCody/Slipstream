package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRaids(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.raid.Raids") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raid"), Int::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val createOrExtendRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createOrExtendRaid", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raid"), Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getNearbyRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNearbyRaid", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raid"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val nextAvailableIDSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nextAvailableID")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: Int): WrapperRaid {
        return WrapperRaid(getHandle.invoke(handle, arg0))
    }

    fun save(arg0: WrapperCompoundTag, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun createOrExtendRaid(arg0: WrapperServerPlayer, arg1: WrapperBlockPos): WrapperRaid {
        return WrapperRaid(createOrExtendRaidHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun getNearbyRaid(arg0: WrapperBlockPos, arg1: Int): WrapperRaid {
        return WrapperRaid(getNearbyRaidHandle.invoke(handle, arg0.handle, arg1))
    }

    fun setNextAvailableID(value: Int) {
        nextAvailableIDSetterHandle.invoke(handle, value)
    }

    fun setTick(value: Int) {
        tickSetterHandle.invoke(handle, value)
    }

}
