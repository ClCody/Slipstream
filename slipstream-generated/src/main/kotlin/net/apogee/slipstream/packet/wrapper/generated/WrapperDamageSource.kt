package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDamageSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.damagesource.DamageSource") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageType")))
        }
        val isDirectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDirect", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val sweepHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sweep", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val criticalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "critical", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Boolean::class.javaPrimitiveType!!))
        }
        val directBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "directBlock", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("org.bukkit.block.Block")))
        }
        val customEventDamagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "customEventDamager", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val isCreativePlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCreativePlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWeaponItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWeaponItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getLocalizedDeathMessageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocalizedDeathMessage", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getCustomEventDamagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCustomEventDamager", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val scalesWithDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scalesWithDifficulty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val sourcePositionRawHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sourcePositionRaw", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getDirectEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirectEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getMsgIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMsgId", MethodType.methodType(String::class.java))
        }
        val isMeltingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isMelting", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val poisonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "poison", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val isPoisonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPoison", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isCriticalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCritical", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val meltingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "melting", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val isSweepHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSweep", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val directBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "directBlockState", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("org.bukkit.block.BlockState")))
        }
        val getDirectBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirectBlock", MethodType.methodType(Class.forName("org.bukkit.block.Block")))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val typeHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "typeHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getDirectBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirectBlockState", MethodType.methodType(Class.forName("org.bukkit.block.BlockState")))
        }
        val getSourcePositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSourcePosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getFoodExhaustionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFoodExhaustion", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val directBlockSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("directBlock")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val directBlockStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("directBlockState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sweepSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sweep")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val meltingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("melting")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val poisonSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("poison")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val customEventDamagerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("customEventDamager")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val criticalSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("critical")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperDamageType
        get() = WrapperDamageType(typeHandle.invoke(handle))

    val direct: Boolean
        get() = isDirectHandle.invoke(handle) as Boolean

    fun `is`(arg0: WrapperTagKey): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    val sweep: WrapperDamageSource
        get() = WrapperDamageSource(sweepHandle.invoke(handle))

    fun critical(arg0: Boolean): WrapperDamageSource {
        return WrapperDamageSource(criticalHandle.invoke(handle, arg0))
    }

    fun directBlock(arg0: Any): WrapperDamageSource {
        return WrapperDamageSource(directBlockHandle.invoke(handle, arg0))
    }

    fun customEventDamager(arg0: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(customEventDamagerHandle.invoke(handle, arg0.handle))
    }

    val creativePlayer: Boolean
        get() = isCreativePlayerHandle.invoke(handle) as Boolean

    val weaponItem: WrapperItemStack
        get() = WrapperItemStack(getWeaponItemHandle.invoke(handle))

    fun getLocalizedDeathMessage(arg0: WrapperLivingEntity): WrapperComponent {
        return WrapperComponent(getLocalizedDeathMessageHandle.invoke(handle, arg0.handle))
    }

    val customEventDamager: WrapperEntity
        get() = WrapperEntity(getCustomEventDamagerHandle.invoke(handle))

    val scalesWithDifficulty: Boolean
        get() = scalesWithDifficultyHandle.invoke(handle) as Boolean

    val sourcePositionRaw: WrapperVec3
        get() = WrapperVec3(sourcePositionRawHandle.invoke(handle))

    val directEntity: WrapperEntity
        get() = WrapperEntity(getDirectEntityHandle.invoke(handle))

    val msgId: String
        get() = getMsgIdHandle.invoke(handle) as String

    val isMelting: Boolean
        get() = isMeltingHandle.invoke(handle) as Boolean

    val poison: WrapperDamageSource
        get() = WrapperDamageSource(poisonHandle.invoke(handle))

    val isPoison: Boolean
        get() = isPoisonHandle.invoke(handle) as Boolean

    val critical: Boolean
        get() = isCriticalHandle.invoke(handle) as Boolean

    val melting: WrapperDamageSource
        get() = WrapperDamageSource(meltingHandle.invoke(handle))

    val isSweep: Boolean
        get() = isSweepHandle.invoke(handle) as Boolean

    fun directBlockState(arg0: Any): WrapperDamageSource {
        return WrapperDamageSource(directBlockStateHandle.invoke(handle, arg0))
    }

    val directBlock: Any
        get() = getDirectBlockHandle.invoke(handle) as Any

    val entity: WrapperEntity
        get() = WrapperEntity(getEntityHandle.invoke(handle))

    val typeHolder: WrapperHolder
        get() = WrapperHolder(typeHolderHandle.invoke(handle))

    val directBlockState: Any
        get() = getDirectBlockStateHandle.invoke(handle) as Any

    val sourcePosition: WrapperVec3
        get() = WrapperVec3(getSourcePositionHandle.invoke(handle))

    val foodExhaustion: Float
        get() = getFoodExhaustionHandle.invoke(handle) as Float

    fun setDirectBlock(value: Any) {
        directBlockSetterHandle.invoke(handle, value)
    }

    fun setDirectBlockState(value: Any) {
        directBlockStateSetterHandle.invoke(handle, value)
    }

    fun setSweep(value: Boolean) {
        sweepSetterHandle.invoke(handle, value)
    }

    fun setMelting(value: Boolean) {
        meltingSetterHandle.invoke(handle, value)
    }

    fun setPoison(value: Boolean) {
        poisonSetterHandle.invoke(handle, value)
    }

    fun setCustomEventDamager(value: WrapperEntity) {
        customEventDamagerSetterHandle.invoke(handle, value.handle)
    }

    fun setCritical(value: Boolean) {
        criticalSetterHandle.invoke(handle, value)
    }

}
