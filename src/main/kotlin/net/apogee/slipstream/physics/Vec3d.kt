package net.apogee.slipstream.physics

import kotlin.math.sqrt

/**
 * Легковесный вектор для математики Slipstream.
 * Не использует NMS или Bukkit классы для максимальной независимости.
 */
data class Vec3d(val x: Double, val y: Double, val z: Double) {
    
    fun add(ox: Double, oy: Double, oz: Double): Vec3d = Vec3d(x + ox, y + oy, z + oz)
    
    fun add(other: Vec3d): Vec3d = Vec3d(x + other.x, y + other.y, z + other.z)
    
    fun subtract(other: Vec3d): Vec3d = Vec3d(x - other.x, y - other.y, z - other.z)
    
    fun multiply(scalar: Double): Vec3d = Vec3d(x * scalar, y * scalar, z * scalar)
    
    fun distanceSquaredTo(other: Vec3d): Double {
        val dx = x - other.x
        val dy = y - other.y
        val dz = z - other.z
        return dx * dx + dy * dy + dz * dz
    }
    
    fun distanceTo(other: Vec3d): Double = sqrt(distanceSquaredTo(other))
    
    fun normalize(): Vec3d {
        val length = sqrt(x * x + y * y + z * z)
        if (length == 0.0) return Vec3d(0.0, 0.0, 0.0)
        return Vec3d(x / length, y / length, z / length)
    }
    
    companion object {
        val ZERO = Vec3d(0.0, 0.0, 0.0)
    }
}