package net.apogee.slipstream.network

import io.mockk.*
import io.netty.channel.Channel
import io.netty.channel.ChannelPipeline
import net.apogee.slipstream.SlipstreamPlugin
import net.apogee.slipstream.api.SlipstreamManager
import net.minecraft.server.network.ServerGamePacketListenerImpl
import net.minecraft.server.level.ServerPlayer
import net.minecraft.network.Connection
import org.bukkit.craftbukkit.entity.CraftPlayer
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.logging.Logger

class InjectorTest {

    private lateinit var plugin: SlipstreamPlugin
    private lateinit var manager: SlipstreamManager
    private lateinit var injector: Injector
    private lateinit var mockPlayer: CraftPlayer
    private lateinit var mockServerPlayer: ServerPlayer
    private lateinit var mockListener: ServerGamePacketListenerImpl
    private lateinit var mockConnection: Connection
    private lateinit var mockChannel: Channel
    private lateinit var mockPipeline: ChannelPipeline
    private lateinit var mockLogger: Logger

    @BeforeEach
    fun setup() {
        plugin = mockk(relaxed = true)
        manager = mockk(relaxed = true)
        mockLogger = mockk(relaxed = true)
        every { plugin.logger } returns mockLogger
        
        injector = Injector(plugin, manager)

        mockPlayer = mockk()
        mockServerPlayer = mockk()
        mockListener = mockk()
        mockConnection = mockk()
        mockChannel = mockk()
        mockPipeline = mockk(relaxed = true)

        every { mockPlayer.handle } returns mockServerPlayer
        every { mockServerPlayer.connection } returns mockListener
        every { mockListener.connection } returns mockConnection
        every { mockConnection.channel } returns mockChannel
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