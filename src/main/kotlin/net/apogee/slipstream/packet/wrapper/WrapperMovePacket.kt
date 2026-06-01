package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers

/**
 * Zero-Allocation обертка для пакета перемещения игрока.
 * На этапе компиляции Kotlin вырежет этот класс, превратив все обращения к свойствам
 * в прямые вызовы MethodHandle.invoke(). Это обеспечивает максимальную скорость (на уровне C++)
 * без мусора для GC.
 */
@JvmInline
value class WrapperMovePacket(val handle: Any) {
    
    val x: Double
        get() = PacketMappers.movePacketGetX.invoke(handle, 0.0) as Double
        
    val y: Double
        get() = PacketMappers.movePacketGetY.invoke(handle, 0.0) as Double
        
    val z: Double
        get() = PacketMappers.movePacketGetZ.invoke(handle, 0.0) as Double
        
    val hasPos: Boolean
        get() = PacketMappers.movePacketHasPos.invoke(handle) as Boolean
}

// Удобные экстеншены для проверок без жесткой типизации NMS классов
fun Any.isMovePacket(): Boolean = PacketMappers.serverboundMovePlayerPacketClass.isInstance(this)

fun Any.asMovePacket(): WrapperMovePacket = WrapperMovePacket(this)