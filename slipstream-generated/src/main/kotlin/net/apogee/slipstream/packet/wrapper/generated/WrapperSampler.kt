package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSampler(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.Climate\$Sampler") }
        private val lookup = MethodHandles.lookup()

        val temperatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "temperature", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val humidityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "humidity", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val continentalnessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "continentalness", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val erosionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "erosion", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val depthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "depth", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val weirdnessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "weirdness", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val spawnTargetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spawnTarget", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("java.util.List")))
        }
    }

    val temperature: WrapperDensityFunction
        get() = WrapperDensityFunction(temperatureHandle.invoke(handle))

    val humidity: WrapperDensityFunction
        get() = WrapperDensityFunction(humidityHandle.invoke(handle))

    val continentalness: WrapperDensityFunction
        get() = WrapperDensityFunction(continentalnessHandle.invoke(handle))

    val erosion: WrapperDensityFunction
        get() = WrapperDensityFunction(erosionHandle.invoke(handle))

    val depth: WrapperDensityFunction
        get() = WrapperDensityFunction(depthHandle.invoke(handle))

    val weirdness: WrapperDensityFunction
        get() = WrapperDensityFunction(weirdnessHandle.invoke(handle))

    val spawnTarget: Any
        get() = spawnTargetHandle.invoke(handle) as Any

    fun copy(temperature: WrapperDensityFunction = this.temperature, humidity: WrapperDensityFunction = this.humidity, continentalness: WrapperDensityFunction = this.continentalness, erosion: WrapperDensityFunction = this.erosion, depth: WrapperDensityFunction = this.depth, weirdness: WrapperDensityFunction = this.weirdness, spawnTarget: Any = this.spawnTarget): WrapperSampler {
        return WrapperSampler(constructorHandle.invoke(temperature.handle, humidity.handle, continentalness.handle, erosion.handle, depth.handle, weirdness.handle, spawnTarget))
    }

}
