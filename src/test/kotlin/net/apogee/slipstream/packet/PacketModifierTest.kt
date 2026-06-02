package net.apogee.slipstream.packet

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PacketModifierTest {

    class TestPacket(
        val firstInt: Int,
        val secondInt: Int,
        val someDouble: Double,
        val someString: String,
        val someBool: Boolean
    )

    @Test
    fun `test modifier can read fields by index`() {
        val packet = TestPacket(10, 20, 30.5, "Hello", true)
        val modifier = packet.modifier()

        assertEquals(10, modifier.readInt(0))
        assertEquals(20, modifier.readInt(1))
        assertEquals(30.5, modifier.readDouble(0))
        assertEquals("Hello", modifier.readString(0))
        assertEquals(true, modifier.readBoolean(0))
    }

    @Test
    fun `test packet container mimicry`() {
        class MimicPacket(val count: Int, val name: String)
        val packet = MimicPacket(5, "Slipstream")
        
        val container = packet.asContainer()
        
        assertEquals(5, container.getIntegers().read(0))
        assertEquals("Slipstream", container.getStrings().read(0))
        
        container.getIntegers().write(0, 10)
        assertEquals(10, packet.count)
    }
}
