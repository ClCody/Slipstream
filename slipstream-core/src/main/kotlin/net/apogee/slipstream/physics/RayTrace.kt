package net.apogee.slipstream.physics

/**
 * Ray casting utilities using the slab method (Smits algorithm).
 *
 * ## Performance
 *
 * This implementation avoids per-axis branch checks on `dir != 0` to minimize
 * branch mispredictions in high-throughput scenarios (e.g., anti-cheat or visibility
 * checks with thousands of rays per second). Instead it relies on IEEE 754 arithmetic:
 * `1.0 / 0.0 = +/-Infinity`, which the slab method handles correctly. A final `isNaN`
 * guard catches any edge cases (e.g., `0.0 * Infinity = NaN`).
 *
 * ## Zero-Allocation
 *
 * The optional [result] parameter allows reusing a pre-allocated [MutableVec3d]
 * to avoid heap allocation on hot paths.
 */
object RayTrace {

    /**
     * Computes the intersection point of a ray with an AABB.
     *
     * @param origin Ray origin
     * @param dir    Ray direction (may have 0.0 components — handled via Infinity)
     * @param box    Axis-Aligned Bounding Box to intersect
     * @param result Optional reusable output vector (zero-alloc on hot paths)
     * @return The intersection point, or null if there is no intersection
     */
    fun intersect(
        origin: MutableVec3d,
        dir: MutableVec3d,
        box: MutableAABB,
        result: MutableVec3d? = null
    ): MutableVec3d? {
        var tMin = Double.NEGATIVE_INFINITY
        var tMax = Double.POSITIVE_INFINITY

        // X axis — no branch on dir.x == 0.0; relies on IEEE 754 Infinity
        val invDirX = 1.0 / dir.x
        var t1 = (box.minX - origin.x) * invDirX
        var t2 = (box.maxX - origin.x) * invDirX
        if (invDirX < 0) { val t = t1; t1 = t2; t2 = t }
        tMin = maxOf(tMin, t1)
        tMax = minOf(tMax, t2)
        if (tMin > tMax) return null

        // Y axis
        val invDirY = 1.0 / dir.y
        t1 = (box.minY - origin.y) * invDirY
        t2 = (box.maxY - origin.y) * invDirY
        if (invDirY < 0) { val t = t1; t1 = t2; t2 = t }
        tMin = maxOf(tMin, t1)
        tMax = minOf(tMax, t2)
        if (tMin > tMax) return null

        // Z axis
        val invDirZ = 1.0 / dir.z
        t1 = (box.minZ - origin.z) * invDirZ
        t2 = (box.maxZ - origin.z) * invDirZ
        if (invDirZ < 0) { val t = t1; t1 = t2; t2 = t }
        tMin = maxOf(tMin, t1)
        tMax = minOf(tMax, t2)
        if (tMin > tMax) return null

        if (tMax < 0) return null
        val tFinal = if (tMin >= 0) tMin else tMax

        val output = result ?: MutableVec3d()
        val hitX = origin.x + dir.x * tFinal
        val hitY = origin.y + dir.y * tFinal
        val hitZ = origin.z + dir.z * tFinal

        // Guard against NaN from edge cases (e.g., 0.0 * Infinity)
        if (hitX.isNaN() || hitY.isNaN() || hitZ.isNaN()) return null

        output.update(hitX, hitY, hitZ)
        return output
    }
}
