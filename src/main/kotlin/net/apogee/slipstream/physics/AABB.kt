package net.apogee.slipstream.physics

/**
 * Axis-Aligned Bounding Box (AABB).
 * Независимая от NMS/Bukkit реализация для быстрой математики и расчетов пересечений.
 */
data class AABB(
    val minX: Double, val minY: Double, val minZ: Double,
    val maxX: Double, val maxY: Double, val maxZ: Double
) {
    /**
     * Проверяет пересечение с другим хитбоксом
     */
    fun intersects(other: AABB): Boolean {
        return this.maxX >= other.minX && this.minX <= other.maxX &&
               this.maxY >= other.minY && this.minY <= other.maxY &&
               this.maxZ >= other.minZ && this.minZ <= other.maxZ
    }

    /**
     * Проверяет, находится ли точка внутри хитбокса
     */
    fun contains(x: Double, y: Double, z: Double): Boolean {
        return x in minX..maxX && y in minY..maxY && z in minZ..maxZ
    }

    fun contains(vec: Vec3d): Boolean = contains(vec.x, vec.y, vec.z)

    /**
     * Возвращает новый хитбокс, расширенный на заданные значения во все стороны
     */
    fun expand(x: Double, y: Double, z: Double): AABB {
        return AABB(minX - x, minY - y, minZ - z, maxX + x, maxY + y, maxZ + z)
    }

    /**
     * Возвращает новый хитбокс, смещенный на заданные координаты
     */
    fun offset(x: Double, y: Double, z: Double): AABB {
        return AABB(minX + x, minY + y, minZ + z, maxX + x, maxY + y, maxZ + z)
    }

    /**
     * Создает копию хитбокса с раздутием/сжатием со всех сторон
     */
    fun grow(amount: Double): AABB = expand(amount, amount, amount)

    companion object {
        val EMPTY = AABB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
        
        /**
         * Ширина дефолтного хитбокса игрока (0.6) / 2
         */
        private const val PLAYER_WIDTH_HALF = 0.3
        
        /**
         * Высота дефолтного хитбокса игрока (1.8)
         */
        private const val PLAYER_HEIGHT = 1.8

        /**
         * Создает стандартный хитбокс игрока на основе его координат ног
         */
        fun createPlayerAABB(x: Double, y: Double, z: Double): AABB {
            return AABB(
                x - PLAYER_WIDTH_HALF, y, z - PLAYER_WIDTH_HALF,
                x + PLAYER_WIDTH_HALF, y + PLAYER_HEIGHT, z + PLAYER_WIDTH_HALF
            )
        }
    }
}