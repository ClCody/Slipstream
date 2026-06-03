package net.apogee.slipstream.physics

import net.apogee.slipstream.api.PacketListener
import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.modifier
import net.apogee.slipstream.packet.wrapper.asMovePacket
import net.apogee.slipstream.packet.wrapper.isMovePacket
import org.bukkit.attribute.Attribute
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

/**
 * Встроенный трекер состояния игроков.
 * Слушает входящие пакеты и автоматически обновляет координаты и хитбоксы
 * без задержек (еще до того, как пакет дойдет до самого майнкрафта).
 */
class ClientStateTracker : PacketListener, Listener {
    
    // ConcurrentHashMap для обеспечения потокобезопасности между EventLoop Netty и Server Thread
    private val states = ConcurrentHashMap<UUID, PlayerState>()

    fun getState(player: Player): PlayerState {
        return states.computeIfAbsent(player.uniqueId) { PlayerState() }
    }

    override fun onPacketIn(player: Player, packet: Any): Boolean {
        val state = getState(player)
        val clazz = packet.javaClass

        // Используем наш Bytecode Bridge для проверки и получения данных
        if (packet.isMovePacket()) {
            val wrapper = packet.asMovePacket()
            
            // Если в пакете передаются координаты (hasPosition == true)
            if (wrapper.hasPos) {
                // Серверные стейты: масштаб, сидение, плавание, трезубец
                // Они диктуются сервером, поэтому можно безопасно (и быстро) читать их из Player
                try {
                    val scaleAttr = player.getAttribute(Attribute.GENERIC_SCALE)
                    if (scaleAttr != null) {
                        state.scale = scaleAttr.value
                    }
                } catch (e: NoSuchMethodError) {
                    // Fallback for older versions
                } catch (e: NoSuchFieldError) {
                }
                
                state.isSitting = player.isInsideVehicle
                state.isSwimming = player.isSwimming
                
                // Trident riptide state is usually read from living entity
                // but since it's an action we approximate it if possible.

                state.updatePosition(wrapper.x, wrapper.y, wrapper.z)
            }
        } else if (clazz == PacketMappers.serverboundPlayerCommandPacketClass) {
            val modifier = packet.modifier()
            // Action is the only object field (enum), so index 0
            val actionEnum = modifier.readObject(0) as? Enum<*>
            if (actionEnum != null) {
                when (actionEnum.name) {
                    "PRESS_SHIFT_KEY" -> state.isSneaking = true
                    "RELEASE_SHIFT_KEY" -> state.isSneaking = false
                    "START_SPRINTING" -> state.isSprinting = true
                    "STOP_SPRINTING" -> state.isSprinting = false
                    "START_FALL_FLYING" -> state.isFallFlying = true
                }
            }
        } else if (clazz == PacketMappers.serverboundPongPacketClass) {
            // Transaction ID is the only int field (index 0)
            val modifier = packet.modifier()
            state.latestTransactionId = modifier.readInt(0)
        }
        
        return true
    }

    @EventHandler
    fun onPlayerQuit(event: PlayerQuitEvent) {
        // Очищаем память, предотвращая утечки
        states.remove(event.player.uniqueId)
    }

    /**
     * Clears all tracked player states. Called on plugin disable to prevent memory leaks.
     */
    fun cleanup() {
        states.clear()
    }
}
