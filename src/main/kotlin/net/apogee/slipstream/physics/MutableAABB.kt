package net.apogee.slipstream.physics

/**
 * Мутабельный Axis-Aligned Bounding Box (AABB).
 * В сочетании с пулом объектов (Ring Buffer) позволяет обновлять координаты хитбоксов
 * без выделения памяти в куче (0 bytes allocation).
 */
class MutableAABB(
    var minX: Double = 0.0, var minY: Double = 0.0, var minZ: Double = 0.0,
    var maxX: Double = 0.0, var maxY: Double = 0.0, var maxZ: Double = 0.0
) {
    fun updatePlayer(x: Double, y: Double, z: Double) {
        minX = x - PLAYER_WIDTH_HALF
        minY = y
        minZ = z - PLAYER_WIDTH_HALF
        maxX = x + PLAYER_WIDTH_HALF
        maxY = y + PLAYER_HEIGHT
        maxZ = z + PLAYER_WIDTH_HALF
    }

    fun intersects(other: MutableAABB): Boolean {
        return this.maxX >= other.minX && this.minX <= other.maxX &&
               this.maxY >= other.minY && this.minY <= other.maxY &&
               this.maxZ >= other.minZ && this.minZ <= other.maxZ
    }

    fun contains(x: Double, y: Double, z: Double): Boolean {
        return x in minX..maxX && y in minY..maxY && z in minZ..maxZ
    }

    companion object {
        const val PLAYER_WIDTH_HALF = 0.3
        const val PLAYER_HEIGHT = 1.8
    }
}