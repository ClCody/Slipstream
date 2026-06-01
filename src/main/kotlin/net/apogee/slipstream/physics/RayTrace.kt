package net.apogee.slipstream.physics

/**
 * Инструментарий для математики рейтрейсинга.
 * Используется алгоритм slab method (алгоритм Смитса).
 */
object RayTrace {

    /**
     * Вычисляет точку пересечения луча с AABB.
     */
    fun intersect(origin: MutableVec3d, dir: MutableVec3d, box: MutableAABB): MutableVec3d? {
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

        if (tFinalMin < 0) return null

        return MutableVec3d(
            origin.x + dir.x * tFinalMin,
            origin.y + dir.y * tFinalMin,
            origin.z + dir.z * tFinalMin
        )
    }
}