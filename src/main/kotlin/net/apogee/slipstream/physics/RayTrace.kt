package net.apogee.slipstream.physics

/**
 * Инструментарий для математики рейтрейсинга.
 * Используется алгоритм slab method (алгоритм Смитса).
 */
object RayTrace {

    /**
     * Вычисляет точку пересечения луча с AABB.
     * Обрабатывает случай нулевых компонент направления (луч параллель оси).
     * Опциональный параметр [result] позволяет избежать аллокации нового MutableVec3d.
     */
    fun intersect(
        origin: MutableVec3d,
        dir: MutableVec3d,
        box: MutableAABB,
        result: MutableVec3d? = null
    ): MutableVec3d? {
        var tMin = Double.NEGATIVE_INFINITY
        var tMax = Double.POSITIVE_INFINITY

        // X axis
        if (dir.x != 0.0) {
            val invDirX = 1.0 / dir.x
            var t1 = (box.minX - origin.x) * invDirX
            var t2 = (box.maxX - origin.x) * invDirX
            if (invDirX < 0) {
                val t = t1; t1 = t2; t2 = t
            }
            tMin = maxOf(tMin, t1)
            tMax = minOf(tMax, t2)
            if (tMin > tMax) return null
        } else {
            if (origin.x < box.minX || origin.x > box.maxX) return null
        }

        // Y axis
        if (dir.y != 0.0) {
            val invDirY = 1.0 / dir.y
            var t1 = (box.minY - origin.y) * invDirY
            var t2 = (box.maxY - origin.y) * invDirY
            if (invDirY < 0) {
                val t = t1; t1 = t2; t2 = t
            }
            tMin = maxOf(tMin, t1)
            tMax = minOf(tMax, t2)
            if (tMin > tMax) return null
        } else {
            if (origin.y < box.minY || origin.y > box.maxY) return null
        }

        // Z axis
        if (dir.z != 0.0) {
            val invDirZ = 1.0 / dir.z
            var t1 = (box.minZ - origin.z) * invDirZ
            var t2 = (box.maxZ - origin.z) * invDirZ
            if (invDirZ < 0) {
                val t = t1; t1 = t2; t2 = t
            }
            tMin = maxOf(tMin, t1)
            tMax = minOf(tMax, t2)
            if (tMin > tMax) return null
        } else {
            if (origin.z < box.minZ || origin.z > box.maxZ) return null
        }

        if (tMax < 0) return null
        val tFinal = if (tMin >= 0) tMin else tMax

        val output = result ?: MutableVec3d()
        output.update(
            origin.x + dir.x * tFinal,
            origin.y + dir.y * tFinal,
            origin.z + dir.z * tFinal
        )
        return output
    }
}