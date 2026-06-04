package net.apogee.slipstream.debug.chronicle

import net.apogee.slipstream.packet.modifier
import org.bukkit.entity.Player

data class PacketSnapshot(
    val className: String,
    val timestamp: Long = System.currentTimeMillis(),
    val isInbound: Boolean,
    val ints: List<Int>,
    val doubles: List<Double>,
    val floats: List<Float>,
    val longs: List<Long>,
    val booleans: List<Boolean>,
    val strings: List<String>,
    val objects: List<String>
) {
    companion object {
        fun from(packet: Any, isInbound: Boolean): PacketSnapshot {
            val mod = packet.modifier()
            val clazz = packet.javaClass
            
            // Мы не знаем количество полей заранее для каждого типа, 
            // поэтому полагаемся на PacketMetadata, который бросит исключение 
            // при выходе за границы. Мы можем узнать размер через PacketMetadata напрямую.
            
            val metadata = net.apogee.slipstream.packet.PacketMetadata.get(clazz)
            
            return PacketSnapshot(
                className = clazz.simpleName,
                isInbound = isInbound,
                ints = (0 until metadata.ints.size).map { mod.readInt(it) },
                doubles = (0 until metadata.doubles.size).map { mod.readDouble(it) },
                floats = (0 until metadata.floats.size).map { mod.readFloat(it) },
                longs = (0 until metadata.longs.size).map { mod.readLong(it) },
                booleans = (0 until metadata.booleans.size).map { mod.readBoolean(it) },
                strings = (0 until metadata.strings.size).map { mod.readString(it) },
                objects = (0 until metadata.objects.size).map { mod.readObject(it)?.toString() ?: "null" }
            )
        }
    }
}
