package net.apogee.slipstream.network

import io.mockk.*
import io.netty.channel.Channel
import io.netty.channel.ChannelPipeline
import net.apogee.slipstream.SlipstreamPlugin
import net.apogee.slipstream.api.SlipstreamManager
import org.bukkit.entity.Player
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.logging.Logger

class InjectorTest {

    private lateinit var plugin: SlipstreamPlugin
    private lateinit var manager: SlipstreamManager
    private lateinit var injector: Injector
    private lateinit var mockPlayer: Player
    private lateinit var mockChannel: Channel
    private lateinit var mockPipeline: ChannelPipeline
    private lateinit var mockLogger: Logger

    @BeforeEach
    fun setup() {
        plugin = mockk(relaxed = true)
        manager = mockk(relaxed = true)
        mockLogger = mockk(relaxed = true)
        every { plugin.logger } returns mockLogger
        
        // Создаем spyk на Injector, чтобы подменить получение канала
        injector = spyk(Injector(plugin, manager))

        mockPlayer = mockk(relaxed = true)
        mockChannel = mockk(relaxed = true)
        mockPipeline = mockk(relaxed = true)

        // Подменяем метод getChannel, чтобы он не лез в NMS/CraftBukkit
        every { injector.getChannel(any()) } returns mockChannel
        
        every { mockChannel.pipeline() } returns mockPipeline
        every { mockPlayer.name } returns "TestPlayer"
    }

    @Test
    fun `test injectPlayer correctly adds handler to pipeline`() {
        // Given
        every { mockPipeline.get("slipstream_handler") } returns null
        every { mockPipeline.get("packet_handler") } returns mockk()

        // When
        injector.injectPlayer(mockPlayer)

        // Then
        verify(exactly = 1) { 
            mockPipeline.addBefore("packet_handler", "slipstream_handler", any<SlipstreamPacketHandler>()) 
        }
    }
    
    @Test
    fun `test ejectPlayer removes handler`() {
        // Given
        every { mockPipeline.get("slipstream_handler") } returns mockk()
        
        // When
        injector.ejectPlayer(mockPlayer)
        
        // Then
        verify(exactly = 1) {
            mockPipeline.remove("slipstream_handler")
        }
    }
}