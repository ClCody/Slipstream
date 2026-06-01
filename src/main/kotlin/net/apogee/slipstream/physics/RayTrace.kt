package net.apogee.slipstream.physics

/**
 * Инструментарий для математики рейтрейсинга.
 * Используется алгоритм slab method (алгоритм Смитса) для вычисления пересечений луча и AABB.
 */
object RayTrace {

    /**
     * Вычисляет точку пересечения луча с AABB.
     * @param origin Точка начала луча (например, глаза игрока)
     * @param dir Направление луча (нормализованный вектор)
     * @param box Хитбокс для проверки пересечения
     * @return Ближайшая точка пересечения или null, если пересечения нет
     */
    fun intersect(origin: Vec3d, dir: Vec3d, box: AABB): Vec3d? {
        val invDirX = 1.0 / dir.x
        val invDirY = 1.0 / dir.y
        val invDirZ = 1.0 / dir.z

        var tMinX = (box.minX - origin.x) * invDirX
        var tMaxX = (box.maxX - origin.x) * invDirX
        if (invDirX < 0) {
            val t = tMinX
            tMinX = tMaxX
            tMaxX = t
        }

        var tMinY = (box.minY - origin.y) * invDirY
        var tMaxY = (box.maxY - origin.y) * invDirY
        if (invDirY < 0) {
            val t = tMinY
            tMinY = tMaxY
            tMaxY = t
        }

        if (tMinX > tMaxY || tMinY > tMaxX) return null
        val tMin = if (tMinY > tMinX) tMinY else tMinX
        val tMax = if (tMaxY < tMaxX) tMaxY else tMaxX

        var tMinZ = (box.minZ - origin.z) * invDirZ
        var tMaxZ = (box.maxZ - origin.z) * invDirZ
        if (invDirZ < 0) {
            val t = tMinZ
            tMinZ = tMaxZ
            tMaxZ = t
        }

        if (tMin > tMaxZ || tMinZ > tMax) return null
        val tFinalMin = if (tMinZ > tMin) tMinZ else tMin

        // Если финальное время меньше 0, значит пересечение находится сзади луча
        if (tFinalMin < 0) return null

        return Vec3d(
            origin.x + dir.x * tFinalMin,
            origin.y + dir.y * tFinalMin,
            origin.z + dir.z * tFinalMin
        )
    }
}