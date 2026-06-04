package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMonsterSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.dimension.DimensionType\$MonsterSettings") }
        private val lookup = MethodHandles.lookup()

        val piglinSafeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "piglinSafe", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasRaidsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasRaids", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val monsterSpawnLightTestHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "monsterSpawnLightTest", MethodType.methodType(Class.forName("net.minecraft.util.valueproviders.IntProvider")))
        }
        val monsterSpawnBlockLightLimitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "monsterSpawnBlockLightLimit", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.util.valueproviders.IntProvider"), Int::class.javaPrimitiveType!!))
        }
    }

    val piglinSafe: Boolean
        get() = piglinSafeHandle.invoke(handle) as Boolean

    val hasRaids: Boolean
        get() = hasRaidsHandle.invoke(handle) as Boolean

    val monsterSpawnLightTest: WrapperIntProvider
        get() = WrapperIntProvider(monsterSpawnLightTestHandle.invoke(handle))

    val monsterSpawnBlockLightLimit: Int
        get() = monsterSpawnBlockLightLimitHandle.invoke(handle) as Int

    fun copy(piglinSafe: Boolean = this.piglinSafe, hasRaids: Boolean = this.hasRaids, monsterSpawnLightTest: WrapperIntProvider = this.monsterSpawnLightTest, monsterSpawnBlockLightLimit: Int = this.monsterSpawnBlockLightLimit): WrapperMonsterSettings {
        return WrapperMonsterSettings(constructorHandle.invoke(piglinSafe, hasRaids, monsterSpawnLightTest.handle, monsterSpawnBlockLightLimit))
    }

}
