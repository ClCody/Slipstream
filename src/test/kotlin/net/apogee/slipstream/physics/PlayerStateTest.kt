package net.apogee.slipstream.physics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PlayerStateTest {

    @Test
    fun testDefaultHitbox() {
        val state = PlayerState()
        state.updatePosition(0.0, 0.0, 0.0)

        // default width is 0.3 * 2 = 0.6, height is 1.8
        assertEquals(MutableAABB.PLAYER_WIDTH_HALF, state.calculateWidthHalf(), 0.001)
        assertEquals(MutableAABB.PLAYER_HEIGHT, state.calculateHeight(), 0.001)
        
        val aabb = state.boundingBox
        assertEquals(-0.3, aabb.minX, 0.001)
        assertEquals(0.0, aabb.minY, 0.001)
        assertEquals(-0.3, aabb.minZ, 0.001)
        assertEquals(0.3, aabb.maxX, 0.001)
        assertEquals(1.8, aabb.maxY, 0.001)
        assertEquals(0.3, aabb.maxZ, 0.001)
    }

    @Test
    fun testSneakingHitbox() {
        val state = PlayerState()
        state.isSneaking = true
        state.updatePosition(0.0, 0.0, 0.0)

        // Sneaking height should be 1.5
        assertEquals(1.5, state.calculateHeight(), 0.001)
        assertEquals(1.5, state.boundingBox.maxY, 0.001)
    }

    @Test
    fun testSwimmingHitbox() {
        val state = PlayerState()
        state.isSwimming = true
        state.updatePosition(0.0, 0.0, 0.0)

        // Swimming/FallFlying height should be 0.6
        assertEquals(0.6, state.calculateHeight(), 0.001)
        assertEquals(0.6, state.boundingBox.maxY, 0.001)
    }

    @Test
    fun testScaleHitbox() {
        val state = PlayerState()
        state.scale = 0.5
        state.updatePosition(0.0, 0.0, 0.0)

        // width = 0.3 * 0.5 = 0.15, height = 1.8 * 0.5 = 0.9
        assertEquals(0.15, state.calculateWidthHalf(), 0.001)
        assertEquals(0.9, state.calculateHeight(), 0.001)
        
        assertEquals(-0.15, state.boundingBox.minX, 0.001)
        assertEquals(0.9, state.boundingBox.maxY, 0.001)
    }

    @Test
    fun testHistoryRingBuffer() {
        val state = PlayerState()
        
        // update 25 times to overflow the 20-element ring buffer
        for (i in 1..25) {
            state.latestTransactionId = i
            state.updatePosition(i.toDouble(), 0.0, 0.0)
        }

        // historyIndex points to the next insertion slot
        assertEquals(5, state.historyIndex)
        
        // Slot 4 should contain the very last update (i=25)
        assertEquals(25, state.history[4].transactionId.toInt())
        assertEquals(25.0, state.history[4].pos.x, 0.001)
    }
}
