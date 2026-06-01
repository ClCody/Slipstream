package net.apogee.slipstream.packet

import io.mockk.every
import io.mockk.mockk
import net.apogee.slipstream.packet.wrapper.asMovePacket
import net.apogee.slipstream.packet.wrapper.isMovePacket
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PacketMappersTest {

    @BeforeAll
    fun setup() {
        // Инициализируем мапперы
        PacketMappers.init()
    }

    @Test
    fun `test MovePacketWrapper successfully calls methods without allocation`() {
        // Создаем реальный NMS пакет (или его мок)
        val mockPacket = mockk<ServerboundMovePlayerPacket>(relaxed = true)
        every { mockPacket.getX(any()) } returns 10.5
        every { mockPacket.getY(any()) } returns 20.0
        every { mockPacket.getZ(any()) } returns 30.5
        every { mockPacket.hasPosition() } returns true

        val packetAny: Any = mockPacket

        // Проверяем тип
        assertTrue(packetAny.isMovePacket())

        // Оборачиваем (никаких аллокаций в рантайме)
        val wrapper = packetAny.asMovePacket()

        // Проверяем вызовы
        assertEquals(10.5, wrapper.x)
        assertEquals(20.0, wrapper.y)
        assertEquals(30.5, wrapper.z)
        assertTrue(wrapper.hasPos)
    }
    
    @Test
    fun `test non-move packet returns false for isMovePacket`() {
        val randomObj = Any()
        assertFalse(randomObj.isMovePacket())
    }
}