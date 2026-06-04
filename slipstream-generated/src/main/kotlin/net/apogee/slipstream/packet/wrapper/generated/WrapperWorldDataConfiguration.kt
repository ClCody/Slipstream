package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWorldDataConfiguration(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.WorldDataConfiguration") }
        private val lookup = MethodHandles.lookup()

        val dataPacksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dataPacks", MethodType.methodType(Class.forName("net.minecraft.world.level.DataPackConfig")))
        }
        val enabledFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enabledFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.DataPackConfig"), Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
    }

    val dataPacks: WrapperDataPackConfig
        get() = WrapperDataPackConfig(dataPacksHandle.invoke(handle))

    val enabledFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(enabledFeaturesHandle.invoke(handle))

    fun copy(dataPacks: WrapperDataPackConfig = this.dataPacks, enabledFeatures: WrapperFeatureFlagSet = this.enabledFeatures): WrapperWorldDataConfiguration {
        return WrapperWorldDataConfiguration(constructorHandle.invoke(dataPacks.handle, enabledFeatures.handle))
    }

}
