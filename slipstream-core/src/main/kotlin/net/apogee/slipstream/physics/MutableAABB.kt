package net.apogee.slipstream.physics

/**
 * Мутабельный Axis-Aligned Bounding Box (AABB).
 * В сочетании с пулом объектов (Ring Buffer) позволяет обновлять координаты хитбоксов
 * без выделения памяти в куче (0 bytes allocation).
 *
 * ## Thread Safety
 *
 * Запись ([updatePlayer]) и чтение ([copyTo]) синхронизированы для предотвращения
 * torn-reads между Netty EventLoop (writer) и Server Thread (reader).
 * Для zero-allocation чтения используйте [copyTo] с переиспользуемым буфером.
 */
class MutableAABB(
    var minX: Double = 0.0,
    var minY: Double = 0.0,
    var minZ: Double = 0.0,
    var maxX: Double = 0.0,
    var maxY: Double = 0.0,
    var maxZ: Double = 0.0
) {
    /**
     * Atomically updates all 6 AABB fields.
     * Synchronized to prevent torn-reads.
     */
    @Synchronized
    fun updatePlayer(x: Double, y: Double, z: Double, widthHalf: Double = PLAYER_WIDTH_HALF, height: Double = PLAYER_HEIGHT) {
        minX = x - widthHalf
        minY = y
        minZ = z - widthHalf
        maxX = x + widthHalf
        maxY = y + height
        maxZ = z + widthHalf
    }

    /**
     * Atomically copies current state to the target AABB.
     * Use with a reusable buffer for zero-allocation reads.
     */
    @Synchronized
    fun copyTo(target: MutableAABB) {
        target.minX = this.minX
        target.minY = this.minY
        target.minZ = this.minZ
        target.maxX = this.maxX
        target.maxY = this.maxY
        target.maxZ = this.maxZ
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