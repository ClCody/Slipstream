package net.apogee.slipstream.api.compat

import io.mockk.mockk
import net.apogee.slipstream.SlipstreamPlugin
import net.apogee.slipstream.api.SlipstreamManager
import org.bukkit.entity.Player
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.lang.reflect.Field

class ProtocolLibCompatTest {

    private lateinit var manager: SlipstreamManager
    private lateinit var protocolManager: ProtocolManager

    @BeforeEach
    fun setup() {
        manager = SlipstreamManager(mockk(relaxed = true))
        protocolManager = ProtocolManager(manager)
    }

    @Test
    fun `test full mimicry flow`() {
        class TestPacket(var value: Int)
        val packet = TestPacket(42)
        val mockPlayer = mockk<Player>(relaxed = true)

        var intercepted = false
        
        protocolManager.addPacketListener(object : PacketAdapter() {
            override fun onPacketReceiving(event: PacketEvent) {
                intercepted = true
                val container = event.packet
                assertEquals(42, container.getIntegers().read(0))
                container.getIntegers().write(0, 100)
                event.isCancelled = true
            }
        })

        val result = manager.handleInboundSync(mockPlayer, packet)
        
        assertTrue(intercepted)
        assertEquals(100, packet.value)
        assertEquals(false, result) // Cancelled
    }

    @Test
    fun `test packet type filtering`() {
        class PositionPacket(val x: Double)
        class ChatPacket(val msg: String)
        
        val posType = PacketType(PositionPacket::class.java)
        val mockPlayer = mockk<Player>(relaxed = true)
        
        var posIntercepted = 0
        
        protocolManager.addPacketListener(object : PacketAdapter(posType) {
            override fun onPacketReceiving(event: PacketEvent) {
                posIntercepted++
            }
        })

        manager.handleInboundSync(mockPlayer, PositionPacket(10.0))
        manager.handleInboundSync(mockPlayer, ChatPacket("Hello"))

        assertEquals(1, posIntercepted) // Only position should be intercepted
    }
}
