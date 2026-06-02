package net.apogee.slipstream.physics

import net.apogee.slipstream.api.PacketListener
import net.apogee.slipstream.packet.wrapper.asMovePacket
import net.apogee.slipstream.packet.wrapper.isMovePacket
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
        // Используем наш Bytecode Bridge для проверки и получения данных
        if (packet.isMovePacket()) {
            val wrapper = packet.asMovePacket()
            
            // Если в пакете передаются координаты (hasPosition == true)
            if (wrapper.hasPos) {
                val state = getState(player)
                state.updatePosition(wrapper.x, wrapper.y, wrapper.z)
            }
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
