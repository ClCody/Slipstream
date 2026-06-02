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
    fun `test modifier can write fields by index`() {
        // Поля в Kotlin по умолчанию final, если не var. 
        // Но MethodHandle.unreflectSetter умеет менять даже final поля через магию.
        class MutableTestPacket(
            var someInt: Int,
            var someDouble: Double
        )

        val packet = MutableTestPacket(1, 1.1)
        val modifier = packet.modifier()

        modifier.writeInt(0, 42)
        modifier.writeDouble(0, 1337.0)

        assertEquals(42, packet.someInt)
        assertEquals(1337.0, packet.someDouble)
    }
}
