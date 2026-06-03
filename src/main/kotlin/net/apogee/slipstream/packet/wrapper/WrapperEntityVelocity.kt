package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для пакета скорости (Entity Velocity).
 * Автоматически адаптируется под изменения в 1.21.4 (Record vs Class).
 */
@JvmInline
value class WrapperEntityVelocity(val handle: Any) {

    val entityId: Int
        get() {
            val mod = handle.modifier()
            return if (PacketMappers.velocityFormat == PacketMappers.VelocityFormat.LEGACY_INTS) {
                // Старый формат (Class): entityId, xa, ya, za (все int)
                mod.readInt(0) 
            } else {
                // Новый формат (Record/Motion): delta (Vec3), id (int)
                // В алфавитном порядке: delta (obj 0), id (int 0)
                mod.readInt(0)
            }
        }

    val x: Double
        get() = getVelocityComponent(0)

    val y: Double
        get() = getVelocityComponent(1)

    val z: Double
        get() = getVelocityComponent(2)

    private fun getVelocityComponent(index: Int): Double {
        val mod = handle.modifier()
        return if (PacketMappers.velocityFormat == PacketMappers.VelocityFormat.LEGACY_INTS) {
            // Старый формат: xa, ya, za (индексы 1, 2, 3) / 8000.0
            mod.readInt(index + 1) / 8000.0
        } else {
            // Новый формат: delta (Vec3 объект по индексу 0)
            val delta = mod.readObject(0) ?: return 0.0
            // Vec3: x (0), y (1), z (2) (все double)
            val deltaMod = delta.modifier()
            deltaMod.readDouble(index)
        }
    }
}

fun Any.isEntityVelocityPacket(): Boolean {
    return try {
        PacketMappers.clientboundSetEntityVelocityPacketClass.isInstance(this)
    } catch (e: Exception) {
        false
    }
}

// Переопределим через проверку обоих имен
fun Any.isAnyEntityVelocityPacket(): Boolean {
    return this.javaClass.name.contains("SetEntityVelocityPacket") || 
           this.javaClass.name.contains("SetEntityMotionPacket")
}
