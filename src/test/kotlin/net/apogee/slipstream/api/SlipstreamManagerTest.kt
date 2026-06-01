package net.apogee.slipstream.api

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.bukkit.entity.Player
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SlipstreamManagerTest {

    private lateinit var manager: SlipstreamManager
    private lateinit var mockPlayer: Player
    private val mockPacket = Any()

    @BeforeEach
    fun setup() {
        // Создаем фиктивный Scope для тестов
        val pluginScope = CoroutineScope(SupervisorJob() + Dispatchers.Unconfined)
        manager = SlipstreamManager(pluginScope)
        mockPlayer = mockk(relaxed = true)
    }

    @Test
    fun `test single allowing listener`() {
        val listener = object : PacketListener {
            override fun onPacketIn(player: Player, packet: Any) = true
            override fun onPacketOut(player: Player, packet: Any) = true
        }

        manager.registerListener(listener)

        assertTrue(manager.handleInboundSync(mockPlayer, mockPacket))
        assertTrue(manager.handleOutboundSync(mockPlayer, mockPacket))
    }

    @Test
    fun `test cancellation stops packet routing`() {
        val cancelingListener = mockk<PacketListener>()
        every { cancelingListener.onPacketIn(any(), any()) } returns false
        every { cancelingListener.onPacketOut(any(), any()) } returns false

        manager.registerListener(cancelingListener)

        assertFalse(manager.handleInboundSync(mockPlayer, mockPacket))
        assertFalse(manager.handleOutboundSync(mockPlayer, mockPacket))
        
        verify(exactly = 1) { cancelingListener.onPacketIn(mockPlayer, mockPacket) }
        verify(exactly = 1) { cancelingListener.onPacketOut(mockPlayer, mockPacket) }
    }

    @Test
    fun `test listener registration and unregistration`() {
        var callCount = 0
        val listener = object : PacketListener {
            override fun onPacketIn(player: Player, packet: Any): Boolean {
                callCount++
                return true
            }
        }

        manager.registerListener(listener)
        manager.handleInboundSync(mockPlayer, mockPacket)
        assertTrue(callCount == 1)

        manager.unregisterListener(listener)
        manager.handleInboundSync(mockPlayer, mockPacket)
        // Если успешно отписали, колл-каунт больше не вырастет
        assertTrue(callCount == 1)
    }
}