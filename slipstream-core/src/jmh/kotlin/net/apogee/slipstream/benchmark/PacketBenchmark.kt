package net.apogee.slipstream.benchmark

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.modifier
import net.apogee.slipstream.packet.wrapper.asMovePacket
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket
import org.openjdk.jmh.annotations.*
import java.lang.reflect.Field
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
open class PacketBenchmark {

    private lateinit var packet: ServerboundMovePlayerPacket
    private lateinit var reflectionField: Field

    @Setup
    fun setup() {
        // Инициализация маппингов Slipstream
        PacketMappers.init()
        
        // Создаем пакет перемещения
        packet = ServerboundMovePlayerPacket.Pos(10.0, 20.0, 30.0, true)
        
        // Подготавливаем обычную рефлексию для сравнения
        // В 1.21.1 PaperDevBundle использует Mojang Mappings
        reflectionField = ServerboundMovePlayerPacket::class.java.getDeclaredField("x")
        reflectionField.isAccessible = true
    }

    @Benchmark
    fun baselineDirect(): Double {
        // Прямой вызов NMS метода
        return packet.getX(0.0)
    }

    @Benchmark
    fun slipstreamWrapper(): Double {
        // Zero-Allocation обертка Slipstream
        return packet.asMovePacket().x
    }

    @Benchmark
    fun slipstreamModifier(): Double {
        // Гибкий модификатор Slipstream (индексный доступ)
        return packet.modifier().readDouble(0)
    }

    @Benchmark
    fun javaReflection(): Double {
        // Стандартная Java рефлексия
        return reflectionField.get(packet) as Double
    }
}
