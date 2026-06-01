package net.apogee.slipstream.packet

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles

/**
 * Реестр сверхбыстрых указателей на методы NMS пакетов.
 * Инициализируется один раз при старте плагина. 
 * Использует рефлексию только для создания MethodHandle.
 */
object PacketMappers {
    
    // -- ServerboundMovePlayerPacket --
    lateinit var serverboundMovePlayerPacketClass: Class<*>
    
    lateinit var movePacketGetX: MethodHandle
    lateinit var movePacketGetY: MethodHandle
    lateinit var movePacketGetZ: MethodHandle
    lateinit var movePacketHasPos: MethodHandle

    fun init() {
        val lookup = MethodHandles.lookup()
        
        // В будущем тут будет логика определения версии сервера для поддержки старых версий (до 1.20.5 с обфускацией)
        // Для 1.20.5+ Paper использует Mojang Mappings в рантайме.
        
        serverboundMovePlayerPacketClass = Class.forName("net.minecraft.network.protocol.game.ServerboundMovePlayerPacket")
        
        val getX = serverboundMovePlayerPacketClass.methods.first { it.name == "getX" && it.parameterCount == 1 }
        movePacketGetX = lookup.unreflect(getX)
        
        val getY = serverboundMovePlayerPacketClass.methods.first { it.name == "getY" && it.parameterCount == 1 }
        movePacketGetY = lookup.unreflect(getY)
        
        val getZ = serverboundMovePlayerPacketClass.methods.first { it.name == "getZ" && it.parameterCount == 1 }
        movePacketGetZ = lookup.unreflect(getZ)
        
        val hasPosition = serverboundMovePlayerPacketClass.methods.first { it.name == "hasPosition" && it.parameterCount == 0 }
        movePacketHasPos = lookup.unreflect(hasPosition)
    }
}