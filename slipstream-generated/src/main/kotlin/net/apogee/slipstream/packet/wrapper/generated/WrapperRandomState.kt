package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRandomState(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.RandomState") }
        private val lookup = MethodHandles.lookup()

        val samplerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sampler", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.Climate\$Sampler")))
        }
        val routerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "router", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.NoiseRouter")))
        }
        val oreRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "oreRandom", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.PositionalRandomFactory")))
        }
        val aquiferRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "aquiferRandom", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.PositionalRandomFactory")))
        }
        val surfaceSystemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "surfaceSystem", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.SurfaceSystem")))
        }
        val getOrCreateRandomFactoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreateRandomFactory", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.PositionalRandomFactory"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getOrCreateNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreateNoise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.synth.NormalNoise"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
    }

    val sampler: WrapperSampler
        get() = WrapperSampler(samplerHandle.invoke(handle))

    val router: WrapperNoiseRouter
        get() = WrapperNoiseRouter(routerHandle.invoke(handle))

    val oreRandom: WrapperPositionalRandomFactory
        get() = WrapperPositionalRandomFactory(oreRandomHandle.invoke(handle))

    val aquiferRandom: WrapperPositionalRandomFactory
        get() = WrapperPositionalRandomFactory(aquiferRandomHandle.invoke(handle))

    val surfaceSystem: WrapperSurfaceSystem
        get() = WrapperSurfaceSystem(surfaceSystemHandle.invoke(handle))

    fun getOrCreateRandomFactory(arg0: WrapperResourceLocation): WrapperPositionalRandomFactory {
        return WrapperPositionalRandomFactory(getOrCreateRandomFactoryHandle.invoke(handle, arg0.handle))
    }

    fun getOrCreateNoise(arg0: WrapperResourceKey): WrapperNormalNoise {
        return WrapperNormalNoise(getOrCreateNoiseHandle.invoke(handle, arg0.handle))
    }

}
