package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.EntityType") }
        private val lookup = MethodHandles.lookup()

        val toShortStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toShortString", MethodType.methodType(String::class.java))
        }
        val createHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "create", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.Level")))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val getDimensionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDimensions", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityDimensions")))
        }
        val fireImmuneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fireImmune", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val spawnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spawn", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.entity.MobSpawnType"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val tryCastHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryCast", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getWidthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWidth", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canSummonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSummon", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val builtInRegistryHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "builtInRegistryHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference")))
        }
        val canSpawnFarFromPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSpawnFarFromPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDefaultLootTableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultLootTable", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val clientTrackingRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clientTrackingRange", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val canSerializeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSerialize", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val requiredFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requiredFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val updateIntervalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "updateInterval", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCategoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCategory", MethodType.methodType(Class.forName("net.minecraft.world.entity.MobCategory")))
        }
        val isBlockDangerousHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBlockDangerous", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getDescriptionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescriptionId", MethodType.methodType(String::class.java))
        }
        val getDescriptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescription", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val trackDeltasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "trackDeltas", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSpawnAABBHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnAABB", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getBaseClassHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseClass", MethodType.methodType(Class.forName("java.lang.Class")))
        }
        val descriptionIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("descriptionId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val descriptionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("description")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lootTableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lootTable")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val toShortString: String
        get() = toShortStringHandle.invoke(handle) as String

    fun create(arg0: WrapperLevel): WrapperEntity {
        return WrapperEntity(createHandle.invoke(handle, arg0.handle))
    }

    fun `is`(arg0: WrapperTagKey): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    val dimensions: WrapperEntityDimensions
        get() = WrapperEntityDimensions(getDimensionsHandle.invoke(handle))

    val fireImmune: Boolean
        get() = fireImmuneHandle.invoke(handle) as Boolean

    fun spawn(arg0: WrapperServerLevel, arg1: WrapperItemStack, arg2: WrapperPlayer, arg3: WrapperBlockPos, arg4: Any, arg5: Boolean, arg6: Boolean): WrapperEntity {
        return WrapperEntity(spawnHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4, arg5, arg6))
    }

    fun tryCast(arg0: WrapperEntity): WrapperEntity {
        return WrapperEntity(tryCastHandle.invoke(handle, arg0.handle))
    }

    val width: Float
        get() = getWidthHandle.invoke(handle) as Float

    val height: Float
        get() = getHeightHandle.invoke(handle) as Float

    val canSummon: Boolean
        get() = canSummonHandle.invoke(handle) as Boolean

    val builtInRegistryHolder: WrapperReference
        get() = WrapperReference(builtInRegistryHolderHandle.invoke(handle))

    val canSpawnFarFromPlayer: Boolean
        get() = canSpawnFarFromPlayerHandle.invoke(handle) as Boolean

    val defaultLootTable: WrapperResourceKey
        get() = WrapperResourceKey(getDefaultLootTableHandle.invoke(handle))

    val clientTrackingRange: Int
        get() = clientTrackingRangeHandle.invoke(handle) as Int

    val canSerialize: Boolean
        get() = canSerializeHandle.invoke(handle) as Boolean

    val requiredFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(requiredFeaturesHandle.invoke(handle))

    val updateInterval: Int
        get() = updateIntervalHandle.invoke(handle) as Int

    val category: Any
        get() = getCategoryHandle.invoke(handle) as Any

    fun isBlockDangerous(arg0: WrapperBlockState): Boolean {
        return isBlockDangerousHandle.invoke(handle, arg0.handle) as Boolean
    }

    val descriptionId: String
        get() = getDescriptionIdHandle.invoke(handle) as String

    val description: WrapperComponent
        get() = WrapperComponent(getDescriptionHandle.invoke(handle))

    val trackDeltas: Boolean
        get() = trackDeltasHandle.invoke(handle) as Boolean

    fun getSpawnAABB(arg0: Double, arg1: Double, arg2: Double): WrapperAABB {
        return WrapperAABB(getSpawnAABBHandle.invoke(handle, arg0, arg1, arg2))
    }

    val baseClass: Any
        get() = getBaseClassHandle.invoke(handle) as Any

    fun setDescriptionId(value: String) {
        descriptionIdSetterHandle.invoke(handle, value)
    }

    fun setDescription(value: WrapperComponent) {
        descriptionSetterHandle.invoke(handle, value.handle)
    }

    fun setLootTable(value: WrapperResourceKey) {
        lootTableSetterHandle.invoke(handle, value.handle)
    }

}
