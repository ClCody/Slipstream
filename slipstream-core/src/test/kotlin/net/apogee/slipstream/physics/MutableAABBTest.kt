package net.apogee.slipstream.physics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MutableAABBTest {

    @Test
    fun testIntersection() {
        val aabb1 = MutableAABB(-1.0, 0.0, -1.0, 1.0, 2.0, 1.0)
        val aabb2 = MutableAABB(0.0, 0.0, 0.0, 2.0, 2.0, 2.0)
        val aabb3 = MutableAABB(2.0, 0.0, 2.0, 3.0, 2.0, 3.0)

        assertTrue(aabb1.intersects(aabb2))
        assertFalse(aabb1.intersects(aabb3))
    }

    @Test
    fun testContains() {
        val aabb = MutableAABB(-1.0, 0.0, -1.0, 1.0, 2.0, 1.0)
        
        assertTrue(aabb.contains(0.0, 1.0, 0.0))
        assertFalse(aabb.contains(2.0, 1.0, 0.0))
    }

    @Test
    fun testCopyTo() {
        val aabb1 = MutableAABB(-1.0, 1.0, -1.0, 1.0, 2.0, 1.0)
        val aabb2 = MutableAABB()
        
        aabb1.copyTo(aabb2)
        
        assertEquals(-1.0, aabb2.minX, 0.001)
        assertEquals(1.0, aabb2.minY, 0.001)
        assertEquals(1.0, aabb2.maxX, 0.001)
        assertEquals(2.0, aabb2.maxY, 0.001)
    }
}
