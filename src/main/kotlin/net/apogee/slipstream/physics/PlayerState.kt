package net.apogee.slipstream.physics

import java.util.ArrayDeque

/**
 * Хранит историю перемещений и текущий хитбокс игрока.
 */
class PlayerState {
    
    var currentPos: Vec3d = Vec3d.ZERO
        private set
        
    var boundingBox: AABB = AABB.EMPTY
        private set

    // История координат для лагкомпенсации (реверс-хитбоксы)
    // Храним последние 20 тиков (1 секунда)
    val positionHistory = ArrayDeque<Vec3d>(20)

    fun updatePosition(x: Double, y: Double, z: Double) {
        val newPos = Vec3d(x, y, z)
        currentPos = newPos
        boundingBox = AABB.createPlayerAABB(x, y, z)
        
        if (positionHistory.size >= 20) {
            positionHistory.pollFirst()
        }
        positionHistory.addLast(newPos)
    }
}