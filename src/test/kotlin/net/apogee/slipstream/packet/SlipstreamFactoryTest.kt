package net.apogee.slipstream.packet

import net.minecraft.SharedConstants
import net.minecraft.server.Bootstrap
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SlipstreamFactoryTest {

    @BeforeAll
    fun setup() {
        SharedConstants.tryDetectVersion()
        Bootstrap.bootStrap()
        PacketMappers.init()
    }

    @Test
    fun `test factory creates SystemChatPacket via Unsafe or constructor`() {
        val wrapper = SlipstreamFactory.createSystemChatPacket()
        assertNotNull(wrapper.handle)
        assertNotNull(wrapper.modifier)
    }

    @Test
    fun `test factory creates UpdateAttributesPacket`() {
        val wrapper = SlipstreamFactory.createUpdateAttributesPacket()
        assertNotNull(wrapper.handle)
        assertNotNull(wrapper.modifier)
    }

    @Test
    fun `test generic create method`() {
        val handle = SlipstreamFactory.create(PacketMappers.serverboundPongPacketClass)
        assertNotNull(handle)
        // Ensure it has the correct type
        assert(PacketMappers.serverboundPongPacketClass.isInstance(handle))
    }
}
