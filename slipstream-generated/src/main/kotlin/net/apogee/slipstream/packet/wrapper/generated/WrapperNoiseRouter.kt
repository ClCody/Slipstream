package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNoiseRouter(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.NoiseRouter") }
        private val lookup = MethodHandles.lookup()

        val barrierNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "barrierNoise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val fluidLevelFloodednessNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fluidLevelFloodednessNoise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val fluidLevelSpreadNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fluidLevelSpreadNoise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val lavaNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lavaNoise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val temperatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "temperature", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val vegetationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "vegetation", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val continentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "continents", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val erosionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "erosion", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val depthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "depth", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val ridgesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "ridges", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val initialDensityWithoutJaggednessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "initialDensityWithoutJaggedness", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val finalDensityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "finalDensity", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val veinToggleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "veinToggle", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val veinRidgedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "veinRidged", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val veinGapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "veinGap", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
    }

    val barrierNoise: WrapperDensityFunction
        get() = WrapperDensityFunction(barrierNoiseHandle.invoke(handle))

    val fluidLevelFloodednessNoise: WrapperDensityFunction
        get() = WrapperDensityFunction(fluidLevelFloodednessNoiseHandle.invoke(handle))

    val fluidLevelSpreadNoise: WrapperDensityFunction
        get() = WrapperDensityFunction(fluidLevelSpreadNoiseHandle.invoke(handle))

    val lavaNoise: WrapperDensityFunction
        get() = WrapperDensityFunction(lavaNoiseHandle.invoke(handle))

    val temperature: WrapperDensityFunction
        get() = WrapperDensityFunction(temperatureHandle.invoke(handle))

    val vegetation: WrapperDensityFunction
        get() = WrapperDensityFunction(vegetationHandle.invoke(handle))

    val continents: WrapperDensityFunction
        get() = WrapperDensityFunction(continentsHandle.invoke(handle))

    val erosion: WrapperDensityFunction
        get() = WrapperDensityFunction(erosionHandle.invoke(handle))

    val depth: WrapperDensityFunction
        get() = WrapperDensityFunction(depthHandle.invoke(handle))

    val ridges: WrapperDensityFunction
        get() = WrapperDensityFunction(ridgesHandle.invoke(handle))

    val initialDensityWithoutJaggedness: WrapperDensityFunction
        get() = WrapperDensityFunction(initialDensityWithoutJaggednessHandle.invoke(handle))

    val finalDensity: WrapperDensityFunction
        get() = WrapperDensityFunction(finalDensityHandle.invoke(handle))

    val veinToggle: WrapperDensityFunction
        get() = WrapperDensityFunction(veinToggleHandle.invoke(handle))

    val veinRidged: WrapperDensityFunction
        get() = WrapperDensityFunction(veinRidgedHandle.invoke(handle))

    val veinGap: WrapperDensityFunction
        get() = WrapperDensityFunction(veinGapHandle.invoke(handle))

    fun copy(barrierNoise: WrapperDensityFunction = this.barrierNoise, fluidLevelFloodednessNoise: WrapperDensityFunction = this.fluidLevelFloodednessNoise, fluidLevelSpreadNoise: WrapperDensityFunction = this.fluidLevelSpreadNoise, lavaNoise: WrapperDensityFunction = this.lavaNoise, temperature: WrapperDensityFunction = this.temperature, vegetation: WrapperDensityFunction = this.vegetation, continents: WrapperDensityFunction = this.continents, erosion: WrapperDensityFunction = this.erosion, depth: WrapperDensityFunction = this.depth, ridges: WrapperDensityFunction = this.ridges, initialDensityWithoutJaggedness: WrapperDensityFunction = this.initialDensityWithoutJaggedness, finalDensity: WrapperDensityFunction = this.finalDensity, veinToggle: WrapperDensityFunction = this.veinToggle, veinRidged: WrapperDensityFunction = this.veinRidged, veinGap: WrapperDensityFunction = this.veinGap): WrapperNoiseRouter {
        return WrapperNoiseRouter(constructorHandle.invoke(barrierNoise.handle, fluidLevelFloodednessNoise.handle, fluidLevelSpreadNoise.handle, lavaNoise.handle, temperature.handle, vegetation.handle, continents.handle, erosion.handle, depth.handle, ridges.handle, initialDensityWithoutJaggedness.handle, finalDensity.handle, veinToggle.handle, veinRidged.handle, veinGap.handle))
    }

}
